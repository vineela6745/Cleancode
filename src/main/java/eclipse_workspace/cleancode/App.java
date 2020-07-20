package eclipse_workspace.cleancode;

import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double p,t,r;
        System.out.println("Enter the amount");
        p = sc.nextDouble();
        System.out.println("Enter the time");
        t = sc.nextDouble();
        System.out.println("Enter the intrest");
        r = sc.nextDouble();
        intrest obj = new intrest();
        double si = obj.simpleIntrest(p,t,r);
        double ci = obj.compoundIntrest(p,t,r);
        System.out.println("Simple Intrest is "+si);
        System.out.println("Compound Intrest is "+ci);
        
        
        
        
            }
}
