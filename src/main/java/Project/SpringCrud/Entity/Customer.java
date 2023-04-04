package Project.SpringCrud.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name="customer_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;

    @Column(name="customer_name", length = 50)
    private String customename;

    @Column(name = "customer_addres", length = 60)
    private String customeaddres;

    @Column(name="customer_mobile",length = 12)
    private int mobile;


    public Customer() {
    }

    public Customer(String customename, String customeaddres, int mobile) {
        this.customename = customename;
        this.customeaddres = customeaddres;
        this.mobile = mobile;
    }

    public Customer(int customerid, String customename, String customeaddres, int mobile) {
        this.customerid = customerid;
        this.customename = customename;
        this.customeaddres = customeaddres;
        this.mobile = mobile;
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
        return "Customer{" +
                "customerid=" + customerid +
                ", customename='" + customename + '\'' +
                ", customeaddres='" + customeaddres + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
