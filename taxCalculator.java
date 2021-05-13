//Design and implement a simple tax calculator application

import java.util.*;

class TaxCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income: ");
        int income = sc.nextInt();

        double totalTax = calculateAndPrintTax(income);

        if(totalTax != 0.0)
        System.out.println("Your taxes are: Rs " + totalTax);
        else
        System.out.println("Your income should be in the range Rs 45282 to Rs 200000");

        sc.close();
    }

    static double calculateAndPrintTax(int income)
    {
        double tax;
        double difftax1;
        double difftax2;
        double difftax3;
        double difftax4;
        double totalTax;

        if ((income >= 45282) && (income <= 200000))
        {
            if(income<=45282)
            {
                tax = 45282 * 0.15;
                totalTax = tax;
            }
            else if (income > 45282 && income <= 90653)
            {
                tax = 45282 * 0.15;
                difftax1 = (income - 45282)* .205;
                totalTax = tax + difftax1;
            }
            else if ((income >90563) && (income <= 140388))
            {
                tax = 45282 * 0.15;
                difftax1 = (income - 45282) * .205;
                difftax2 = (income - 90563) * 0.26;
                totalTax = tax + difftax1 + difftax2;
            }
            else if ((income > 140388) && (income <= 200000))
            {
                tax = 45282 * 0.15;
                difftax1 = (income - 45282) * .205;
                difftax2 = (income - 90563) * 0.26;
                difftax3 = (income - 140388) * 0.29;
                totalTax = tax + difftax1 + difftax2 + difftax3;
            }
            else
            {    
                tax = 45282 * 0.15;
                difftax1 = (income - 45282) * .205;
                difftax2 = (income - 90563) * 0.26;
                difftax3 = (income - 140388) * 0.29;
                difftax4 = (income - 200000) * 0.33;
                totalTax = tax + difftax1 + difftax2 + difftax3 + difftax4;
            }
        }
        else
        {
            totalTax = 0.0;
        }
        return totalTax;
    }
}

/*
Output:
Enter your Income: 
56000
Your taxes are: Rs 8989.49
*/
