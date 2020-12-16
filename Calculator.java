import java.util.Scanner;

import java.util.*;
class Calculator {

    static double sum(double x,double y)
    {
        double c = x+y;
        return c;
    }
    static double sub(double x,double y)
    {
        double c = x-y;
        return c;
    }
    static double mul(double x,double y)
    {
        double c = x*y;
        return c;
    }
    static double div(double x,double y)
    {
        double c = x/y;
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter Value of x: ");
        x = sc.nextDouble();
        System.out.println("Enter Value of y: ");
        y = sc.nextDouble();
        System.out.println("Sum is "+sum(x,y)+"\nSubstraction is: "+sub(x,y)+"\nMultiplaction is: "+mul(x,y)+"\nDivision is: "+div(x,y));
    }
}
