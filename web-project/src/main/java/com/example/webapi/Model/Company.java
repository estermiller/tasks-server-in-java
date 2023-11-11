package com.example.webapi.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long i= Long.valueOf(1000);
    private  String name;
    private  String catchPhrase;
    private  String bs;

    public Company() {
    }

    public Company(String name1, String catchPhrase, String bs) {
        this.id=i+=1000;
        this.name = name1;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
