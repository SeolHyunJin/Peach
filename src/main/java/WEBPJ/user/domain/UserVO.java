package WEBPJ.user.domain;

public class UserVO {
    private String userEmail;
    private String userPw;
    private String userNickName;
    private Integer category;

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

    public String getUserNickName() {
        return userNickName;
    }
    public void setUserNickName(String userNickName){
        this.userNickName = userNickName;
    }

    public int getUserCategory() {
        return category;
    }
    public void setUserCategory(int category){
        this.category = category;

    }


    @Override
    public String toString(){
        return "UserVO [userEmail=" + userEmail + "userPw=" + userPw + ", userNickName=" + userNickName +
                ", category=" + category + "]";
    }
}
