package com.company;

public class CreditPaymentMounth {
    CreditPaymentService service = new CreditPaymentService();
    double PaymentRatio = service.CreditPaymentRatio();

    public int CreditPaymentMounth(double LoanAmount) {
        double MounthPayout = PaymentRatio * LoanAmount;
        int result_of_CreditPaymentMounth = (int) Math.round(MounthPayout);
        return result_of_CreditPaymentMounth;
    }
}
