package WEBPJ.company.persistence;

import WEBPJ.company.domain.CompanyDTO;
import WEBPJ.company.domain.CompanyVO;

public interface CompanyDAO {
    void register_co(CompanyVO companyVO) throws Exception;
    CompanyVO login_co(CompanyDTO companyDTO) throws Exception;
}
