package com.example.helloworld.model;

public class User {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String country;
    private String dob;
    private String avatarURL;

    public User() {
    }

    public User(long id, String name, String email, String phone, String country, String dob, String avatarURL) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.dob = dob;
        this.avatarURL = avatarURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }
}
