package Project.SpringCrud.DTO;

public class CustomerSaveDTO {

    private String customename;
    private String customeaddres;
    private int mobile;

    public CustomerSaveDTO(String customename, String customeaddres, int mobile) {

        this.customename = customename;
        this.customeaddres = customeaddres;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {

    }



    public String getCustomename() {
        return customename;
    }

    public void setCustomename(String customename) {
        this.customename = customename;
    }

    public String getCustomeaddres() {
        return customeaddres;
    }

    public void setCustomeaddres(String customeaddres) {
        this.customeaddres = customeaddres;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                ", customename='" + customename + '\'' +
                ", customeaddres='" + customeaddres + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
