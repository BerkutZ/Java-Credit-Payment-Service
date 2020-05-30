package com.company;

public class Main {

    public static void main(String[] args) {
    double PeriodOfUse = 36, LoanRate = 9.99, LoanAmount = 1_000_000;
	CreditPaymentService service1 = new CreditPaymentService();
	CreditPaymentMounth service2 = new CreditPaymentMounth();
	CreditPaymentTotal service3 = new CreditPaymentTotal();

	int PaymentMounth = service2.CreditPaymentMounth(LoanAmount);
	int totalPayment = service3.CreditPaymentTotal(PeriodOfUse);
	int RatioPayment = service1.CreditPaymentRatio(PeriodOfUse, LoanRate, LoanAmount);
	System.out.println("Your payment mounth " + PaymentMounth);
	System.out.println("Your total payment " + totalPayment);
	System.out.println("Your credit ratio " + RatioPayment);
    }
}
