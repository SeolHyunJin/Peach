package WEBPJ.user.service;

import WEBPJ.user.domain.LoginDTO;
import WEBPJ.user.persistence.UserDAO;
import WEBPJ.user.domain.UserVO;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Inject
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public void register(UserVO userVO) throws Exception{
        userDAO.register(userVO);
    }

    @Override
    public UserVO login(LoginDTO loginDTO) throws Exception{
        return userDAO.login(loginDTO);
    }

    /*
    @Inject
    UserDAO dao;

    public UserVO login(UserVO dto){
        return dao.login(dto);
    }*/
}
