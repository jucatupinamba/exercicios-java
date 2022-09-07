package com.servico.service;

public class ContractService implements OnlinePaymentService{
    @Override
    public Double paymentFee(Double amount) {
        return null;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return null;
    }
}
