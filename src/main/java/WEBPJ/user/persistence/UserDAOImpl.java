package WEBPJ.user.persistence;

import javax.inject.Inject;

import WEBPJ.user.domain.LoginDTO;
import WEBPJ.user.domain.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{
    private static final String NAMESPACE = "Peach.mappers.user.UserMapper";

    private final SqlSession sqlSession;

    @Inject
    public UserDAOImpl(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    @Override
    public void register(UserVO userVO) throws Exception{
        sqlSession.insert(NAMESPACE + ".register",userVO);
    }

    @Override
    public UserVO login(LoginDTO loginDTO) throws Exception{
        return sqlSession.selectOne(NAMESPACE + ".login", loginDTO);
    }
    /*private static final String NAMESPACE = "Peach.mappers.user.UserMapper";

    @Inject
    SqlSession sqlSession;

    @Override
    public UserVO login(UserVO dto){
        return sqlSession.selectOne(NAMESPACE + ".login", dto);
    }*/

}
