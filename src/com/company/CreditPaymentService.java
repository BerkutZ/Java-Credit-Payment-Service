package com.company;
import java.math.BigDecimal;

public class CreditPaymentService {

    public double creditPaymentRatio(double periodOfUse, double loanRate) {
        double C = loanRate / 12;
        double annuityRatio = C * (Math.pow((1 + C), periodOfUse)) / (Math.pow((1 + C), periodOfUse) - 1);
//        int resultOfCreditPaymentRatio = (int) Math.round(annuityRatio);
        return annuityRatio; //resultOfCreditPaymentRatio;
    }

    public double creditPaymentMounth(double creditPaymentRatio, double loanAmount) { ;
        double mounthPayout = creditPaymentRatio * loanAmount;
//        int resultOfCreditPaymentMounth = (int) Math.round(mounthPayout);
        return mounthPayout;
    }

    public double creditPaymentTotal(double creditPaymentMounth, double periodOfUse) {
        double totalPayout = creditPaymentMounth * periodOfUse;
//        int resultOfCreditPaymentTotal = (int) Math.round(totalPayout);
        return totalPayout;
    }

}
