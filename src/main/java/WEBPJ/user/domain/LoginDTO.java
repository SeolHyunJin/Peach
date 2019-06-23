package WEBPJ.user.domain;

public class LoginDTO {
    private String userEmail;
    private String userPw;

    public String getUserPw() {
        return userPw;
    }
    public void setUserPw(String userPw){
        this.userPw = userPw;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }

    @Override
    public String toString(){
        return "UserVO [userEmail=" + userEmail + "userPw=" + userPw + "]";
    }
}
