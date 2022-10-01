package com.onpayment.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueDate;
    private Double amount;

    public Installment(final Date dueDate, final Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(final Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate) +
                "-" + String.format("%.2f",amount);
    }
}
