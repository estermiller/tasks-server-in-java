package com.example.webapi.Model;

import jakarta.persistence.*;

@Entity
@Table(name="users_tbl")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;
    private String name;
    private String userName;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private String phone;
    private String website;
    @OneToOne(cascade = CascadeType.ALL)
    private Company company;

    public User(Long id,
                String name,
                String userName,
                String email,
                String street,
                String suite,
                String city,
                String zipcode,
                String lat,
                String lng,
                String phone,
                String website,
                String name1,
                String catchPhrase,
                String bs)
    {
        this.userid = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address=new Address(street,suite,city,zipcode,lat,lng);
        this.phone = phone;
        this.website = website;
        this.company = new Company(name1,catchPhrase,bs);
    }

    public User() {

    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long id) {
        this.userid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userid +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address.toString() +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company.toString() +
                '}';
    }


}
