package eclipse_workspace.cleancode;

import java.util.Scanner;

public class construction {

	public construction() {
		// TODO Auto-generated constructor stub
	}
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the area of house");
        double feet = sc.nextInt();
        System.out.println("If you want a home with Standarad Materials then press 1");
        System.out.println("If you want a home with above Standarad Materials then press 2");
        System.out.println("If you want a home with high Standarad Materials then press 3");
        System.out.println("If you want a home with high Standarad Materials and fully automated home then press 4");

        int op = sc.nextInt();
        materials obj2 = new materials();
        double ans;
        switch(op) {
        case 1: ans = obj2.sm(feet);
           break;
        case 2: ans = obj2.asm(feet);
           break;
        case 3: ans = obj2.hsm(feet);
           break;
        case 4: ans = obj2.hfsm(feet);
           break;
        default:  System.out.printf("Error! Enter correct operator");
           return;
     }
        System.out.println("The total construction cost is "+ans);


	}

}
