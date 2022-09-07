package com.servico.entity;

import java.util.Date;

public class Parcelas {

    private Date dueDate;
    private Double amount;

    public Parcelas(final Date dueDate, final Double amount) {
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
}
