package WEBPJ.company.domain;

public class CompanyDTO {
    private String companyEmail;
    private String companyPw;

    public String getCompanyPw() {
        return companyPw;
    }
    public void setCompanyPw(String companyPw){
        this.companyPw = companyPw;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }
    public void setCompanyEmail(String companyEmail){
        this.companyEmail = companyEmail;
    }

    @Override
    public String toString() {
        return "CompanyVO [companyEmail=" + companyEmail + "companyPw=" + companyPw + "]";
    }
}
