package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Input your period of use of borrowed funds in months ");
        double periodOfUse = num.nextDouble();
        System.out.print("Input your loan rate ");
        double loanRate = num.nextDouble();
        System.out.print("Input your loan amount ");
        double loanAmount = num.nextDouble();

        CreditPaymentService service = new CreditPaymentService();

        double paymentMounth = service.creditPaymentRatio(periodOfUse, loanRate, loanAmount);

        System.out.println("Your payment mounth " + paymentMounth);
    }
}
