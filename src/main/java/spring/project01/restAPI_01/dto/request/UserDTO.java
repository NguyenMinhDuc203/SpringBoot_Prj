package spring.project01.restAPI_01.dto.request;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private long userID;
    private String userName;
    private String email;
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
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

    public UserDTO(long userID, String userName, String email, boolean state) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.state = state;
    }

    public UserDTO(String userName, String email, boolean state) {
        this.userName = "userName";
        this.email = "email";
        this.state = false;
    }
    public UserDTO() {

    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}
