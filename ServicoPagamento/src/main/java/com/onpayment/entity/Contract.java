package com.onpayment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;

    List<Installment> installments = new ArrayList<Installment>();

    public Contract(){}

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(final Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(final Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return this.installments;
    }

}

