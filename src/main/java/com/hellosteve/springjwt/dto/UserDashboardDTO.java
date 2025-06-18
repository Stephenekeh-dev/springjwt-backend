package com.hellosteve.springjwt.dto;

public class UserDashboardDTO {
    private String firstName;
    private String lastName;
    private Integer age;
    private String profileImageBase64;

    public UserDashboardDTO(String firstName, String lastName, Integer age, String profileImageBase64) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profileImageBase64 = profileImageBase64;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfileImageBase64() {
        return profileImageBase64;
    }

    public void setProfileImageBase64(String profileImageBase64) {
        this.profileImageBase64 = profileImageBase64;
    }
}
