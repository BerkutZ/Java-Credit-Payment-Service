package com.company;

public class CreditPaymentTotal {
    CreditPaymentMounth service = new CreditPaymentMounth();
    double PaymentMounth = service.CreditPaymentMounth();

    public int CreditPaymentTotal(double PeriodOfUse) {
        double TotalPayout = PaymentMounth * PeriodOfUse;
        int result_of_CreditPaymentTotal = (int) Math.round(TotalPayout);
        return result_of_CreditPaymentTotal;
    }

}
