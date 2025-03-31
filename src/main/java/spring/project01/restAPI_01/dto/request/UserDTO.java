package spring.project01.restAPI_01.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import spring.project01.restAPI_01.util.*;

import java.io.Serializable;

import static spring.project01.restAPI_01.util.enumGender.*;

public class UserDTO implements Serializable {

    private long userID;
    @NotBlank(message = "userName invalid")
    private String userName;
    @Pattern(regexp = "^(039|098|081|093|097)\\d{7}$", message = "phond ivalid")

    private String phone;
    @EmailValid
    private String email;
    @statusValid (name ="status", regexp="ACTIVE|INACTIVE|NONE")
    private enumStatus status;

    @genderValid(anyOf = {MALE,FEMALE,OTHER})
    private enumGender gender;

    @roleValid(name="role", enumClass = enumRole.class)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public enumGender getGender() {
        return gender;
    }

    public void setGender(enumGender gender) {
        this.gender = gender;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(enumStatus status) {
        this.status = status;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public enumStatus getStatus() {
        return status;
    }


    public UserDTO() {

    }

    public UserDTO(long userID, String userName, String phone, String email, enumStatus status, enumGender gender, String role) {
        this.userID = userID;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", gender=" + gender +
                ", role='" + role + '\'' +
                '}';
    }
}
