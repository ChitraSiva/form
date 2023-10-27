package com.example.demo1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class studentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="gender")
    private String gender;
    @Column(name="school")
    private String school;
    @Column(name="sslcMark")
    private Long sslcMark;
    @Column(name="hscMark")
    private Long hscMark;
    @Column(name="cutoff")
    private Long cutoff;
    @Column(name="preferredDepartment")
    private String preferredDepartment;

    public studentEntity() {
    }


    public studentEntity(Long id, String name, String email, String gender, String school, Long sslcMark, Long hscMark, Long cutoff, String preferredDepartment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.school= school;
        this.sslcMark = sslcMark;
        this.hscMark= hscMark;
        this.cutoff = cutoff;
        this.preferredDepartment = preferredDepartment;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Long getSslcMark() {
        return sslcMark;
    }

    public void setSslcMark(Long sslcMark) {
        this.sslcMark = sslcMark;
    }

    public Long getHscMark() {
        return hscMark;
    }

    public void setHscMark(Long hscMark) {
        this.hscMark = hscMark;
    }

    public Long getCutoff() {
        return cutoff;
    }

    public void setCutoff(Long cutoff) {
        this.cutoff = cutoff;
    }

    public String getPreferredDepartment() {
        return preferredDepartment;
    }

    public void setPreferredDepartment(String preferredDepartment) {
        this.preferredDepartment = preferredDepartment;
    }
}
