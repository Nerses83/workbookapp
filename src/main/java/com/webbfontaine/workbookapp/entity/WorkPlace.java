package com.webbfontaine.workbookapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 11:16 AM.
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class WorkPlace {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "company")
    String company;

    @Column(name = "country")
    String country;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "startDate")
    private Date startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "isCurrent")
    private boolean isCurrent;

    @ManyToOne
    @JoinColumn(name="workbook_id", nullable=false)
    @JsonBackReference
    private WorkBook workBook;

    public WorkBook getWorkBook() {
        return workBook;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setWorkBook(WorkBook workBook) {
        this.workBook = workBook;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    public WorkPlace() {
    }

    public WorkPlace(String company, String country, Date startDate, Date endDate, boolean isCurrent) {
        this.company = company;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isCurrent = isCurrent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkPlace workPlace = (WorkPlace) o;
        return id == workPlace.id &&
                isCurrent == workPlace.isCurrent &&
                Objects.equals(company, workPlace.company) &&
                Objects.equals(country, workPlace.country) &&
                Objects.equals(startDate, workPlace.startDate) &&
                Objects.equals(endDate, workPlace.endDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, company, country, startDate, endDate, isCurrent);
    }
}
