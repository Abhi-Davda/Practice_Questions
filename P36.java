// Given the principal amount(P),rate of interest per annum(R),and loan tenure in months(N),write a program to calculate the EMI(Equated Monthly Installment)for a loan.
// Input:Enter principal amount(P):500000 
// Enter annual interest rate(R):7.5 
// Enter loan tenure in months(N):60 
// Output:The EMI per month is:10013.05

import java.util.Scanner;

public class P36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount(P):");
        int p = sc.nextInt();
        System.out.println("Enter annual interest rate(R):");
        double r = sc.nextDouble();
        System.out.println("Enter loan tenure in months(N):");
        int t = sc.nextInt();

        r = r / 12 / 100;
        double emi;

        emi = (p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1);
        System.out.println("EMI: " + emi);
        sc.close();
    }
}
