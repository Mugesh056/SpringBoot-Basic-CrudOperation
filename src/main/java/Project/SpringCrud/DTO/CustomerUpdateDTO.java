package Project.SpringCrud.DTO;

public class CustomerUpdateDTO {
    private int customerid;
    private String customename;
    private String customeaddres;
    private int mobile;

    public CustomerUpdateDTO(int customerid, String customename, String customeaddres, int mobile) {
        this.customerid = customerid;
        this.customename = customename;
        this.customeaddres = customeaddres;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {

    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
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
                "customerid=" + customerid +
                ", customename='" + customename + '\'' +
                ", customeaddres='" + customeaddres + '\'' +
                ", mobile=" + mobile +
                '}';
    }


}
