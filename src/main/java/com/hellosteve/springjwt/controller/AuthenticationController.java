package com.hellosteve.springjwt.controller;

import com.hellosteve.springjwt.dto.UserDashboardDTO;
import com.hellosteve.springjwt.model.AuthenticationResponse;
import com.hellosteve.springjwt.model.Role;
import com.hellosteve.springjwt.model.User;
import com.hellosteve.springjwt.repository.UserRepository;
import com.hellosteve.springjwt.service.AuthenticationService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private final UserRepository userRepository;
    private final AuthenticationService authService;

    public AuthenticationController(UserRepository userRepository, AuthenticationService authService) {
        this.userRepository = userRepository;
        this.authService = authService;
    }
    @PostMapping(value = "/register", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> register(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam int age,
            @RequestParam(required = false) MultipartFile profileImage,
            @RequestParam String username,
            @RequestParam String password
    ) throws IOException {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(Role.USER);

        if (profileImage != null && !profileImage.isEmpty()) {
            user.setProfileImage(profileImage.getBytes());

        }


        return ResponseEntity.ok(authService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login( @RequestBody User request){
        return ResponseEntity.ok(authService.authenticate(request));

    }

    @GetMapping("/dashboard")
    public ResponseEntity<UserDashboardDTO> getUserDashboard(@AuthenticationPrincipal User user) {
        String profileImageBase64 = null;
        if (user.getProfileImage() != null) {
            profileImageBase64 = Base64.getEncoder().encodeToString(user.getProfileImage());
        }

        UserDashboardDTO dashboardDTO = new UserDashboardDTO(
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                profileImageBase64
        );

        return ResponseEntity.ok(dashboardDTO);
    }
}
