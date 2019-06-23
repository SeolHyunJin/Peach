package WEBPJ.company.persistence;

import WEBPJ.company.domain.CompanyDTO;
import WEBPJ.company.domain.CompanyVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class CompanyDAOImpl implements CompanyDAO {
    private static final String NAMESPACE = "Peach.mappers.user.CompanyMapper";
    private final SqlSession sqlSession;

    @Inject
    public CompanyDAOImpl(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    @Override
    public void register_co(CompanyVO companyVO) throws Exception{
        sqlSession.insert(NAMESPACE+".register_co", companyVO);
    }

    @Override
    public CompanyVO login_co(CompanyDTO companyDTO) throws Exception{
        return sqlSession.selectOne(NAMESPACE+".login_co", companyDTO);
    }
}
