package WEBPJ.company.domain;

public class CompanyVO {
    private String companyEmail;
    private String companyPw;
    private String companyName;

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

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    @Override
    public String toString(){
        return "CompanyVO [companyEmail=" + companyEmail + "companyPw=" + companyPw + ", companyName=" + companyName + "]";
    }
}
