package WEBPJ.company.service;

import WEBPJ.company.domain.CompanyDTO;
import WEBPJ.company.domain.CompanyVO;
import WEBPJ.company.persistence.CompanyDAO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
@Repository
public class CompanyServiceImpl implements CompanyService{
    private final CompanyDAO companyDAO;

    @Inject
    public CompanyServiceImpl(CompanyDAO companyDAO){
        this.companyDAO = companyDAO;
    }

    @Override
    public void register_co(CompanyVO companyVO) throws Exception{
        companyDAO.register_co(companyVO);
    }

    @Override
    public CompanyVO login_co(CompanyDTO companyDTO) throws Exception{
        return companyDAO.login_co(companyDTO);
    }
}
