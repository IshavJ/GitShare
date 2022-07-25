package armstrong;

import java.util.Scanner;

public class ArmstrongMethods {
    public void armStrong(){
        int sum = 0, num;
        System.out.println("Enter number");
        int number = new Scanner(System.in).nextInt();
        num =number;

        while(num !=0) {
            sum += Math.pow(num % 10, String.valueOf(number).length());
            num /= 10;
        }

        System.out.println(number == sum ?"armstrong":"not armstrong");
    }
}
