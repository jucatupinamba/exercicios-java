package com.servico.entity;

import java.util.Date;

public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;
    private Parcelas parcelas;

    public Contract(){}

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

}
