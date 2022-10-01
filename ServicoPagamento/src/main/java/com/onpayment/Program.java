package com.onpayment;

import com.onpayment.entity.Contract;
import com.onpayment.entity.Installment;
import com.onpayment.service.ContractService;
import com.onpayment.service.OnlinePaymentService;
import com.onpayment.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date parseDate = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double value = sc.nextDouble();
        System.out.print("Enter a number of installments: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, parseDate, value);

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, installments);

        System.out.println("Instalment");
        for(Installment it : contract.getInstallments()){
            System.out.println(it);
        }
        sc.close();
    }
}
