package WEBPJ.user.service;
import WEBPJ.user.domain.LoginDTO;
import WEBPJ.user.domain.UserVO;

public interface UserService {
    void register(UserVO userVO) throws Exception;
    UserVO login(LoginDTO loginDTO) throws Exception;
    //public UserVO login(UserVO dto);
}
