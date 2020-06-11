package com.company;

public class CreditPaymentService {

    public double creditPaymentRatio(double periodOfUse, double loanRate, double loanAmount) {
        double c = (loanRate / 100) / 12; //loan interest rate per month
        double annuityRatio = c * (Math.pow((1 + c), periodOfUse)) / (Math.pow((1 + c), periodOfUse) - 1);
        double mounthPayoutInDouble = annuityRatio * loanAmount;
        int mounthPayoutInInt = (int) mounthPayoutInDouble;
        return mounthPayoutInInt;
    }
}
