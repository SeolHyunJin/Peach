package WEBPJ.user.persistence;
import WEBPJ.user.domain.LoginDTO;
import WEBPJ.user.domain.UserVO;

import java.util.Map;

public interface UserDAO {
    void register(UserVO userVO) throws Exception;
    UserVO login(LoginDTO loginDTO) throws Exception;

   // public UserVO login(UserVO dto);
}
