package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sign_workday")
public class SignWorkDayEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "WORK_DATE")
    private Date workDate;

    @Column(name = "WORK_CODE")
    private String workCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getWorkCode() {
        return workCode;
    }

    public void setWorkCode(String workCode) {
        this.workCode = workCode;
    }
}