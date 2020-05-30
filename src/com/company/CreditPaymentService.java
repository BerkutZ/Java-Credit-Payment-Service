package com.company;

import java.util.Scanner;
import java.math.BigDecimal;


public class CreditPaymentService {

    public int CreditPaymentRatio(double PeriodOfUse, double LoanRate, double LoanAmount) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input your period of use of borrowed funds in months ");
        double PeriodOfUse = num.nextDouble();
        System.out.print("Input your loan rate ");
        double LoanRate = num.nextDouble();
        System.out.print("Input your loan amount ");
        double LoanAmount = num.nextDouble();
        double C = LoanRate / 12;
        double AnnuityRatio = C * (Math.pow((1 + C), PeriodOfUse)) / (Math.pow((1 + C), PeriodOfUse) - 1);
        int result_of_CreditPaymentRatio = (int) Math.round(AnnuityRatio);
        return result_of_CreditPaymentRatio;
    }

}
