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

	double ratioPayment = service.creditPaymentRatio(periodOfUse, loanRate);
	double paymentMounth = service.creditPaymentMounth(ratioPayment, loanAmount);
	double totalPayment = service.creditPaymentTotal(paymentMounth, periodOfUse);

	System.out.println("Your payment mounth " + paymentMounth);
	System.out.println("Your total payment " + totalPayment);
	System.out.println("Your credit ratio " + ratioPayment);
    }
}
