package armstrong;

import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, num;
        System.out.println("Enter number");

        int number = scan.nextInt();
        num = number;

        while (num != 0) {
            sum = (int) (sum + Math.pow(num % 10, String.valueOf(number).length()));
            num /= 10;
        }
        System.out.println(number == sum ? "armstrong" : "not armstrong");
    }
    }
