package spring.project01.restAPI_01.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import spring.project01.restAPI_01.util.EmailValid;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private long userID;
    @NotBlank(message = "userName invalid")
    private String userName;
    @Pattern(regexp = "^(039|098|081|093|097)\\d{7}$", message = "phond ivalid")

    private String phone;
    @EmailValid
    private String email;
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDTO(long userID, String userName, String phone, String email, boolean state) {
        this.userID = userID;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.state = state;
    }
    public UserDTO() {

    }
    public UserDTO(String userName, String phone, String email, boolean state) {
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}
