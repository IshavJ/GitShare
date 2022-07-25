package MonthCalc;

import java.util.Scanner;

public class MonthMain {
    static int no = 0;

    public static void main(String[] args) {
        System.out.println("Enter month");
        switch ( new Scanner(System.in).next().toLowerCase()) {
            case "jan":
                no = 1;
                break;
            case "feb":
                no = 2;
                break;
            case "march":
                no = 3;
                break;
            case "april":
                no = 4;
                break;
            case "may":
                no = 5;
                break;
            case "june":
                no = 6;
                break;
            case "july":
                no = 7;
                break;
            case "aug":
                no = 8;
                break;
            case "sep":
                no = 9;
                break;
            case "oct":
                no = 10;
                break;
            case "nov":
                no = 11;
                break;
            case "dec":
                no = 12;
                break;
            default :
                System.out.println("invalid month");
                System.exit(0);



        }
        System.out.println("enter no between 1 to 24");
        int a = new Scanner(System.in).nextInt() + no;

        if (a <= 12) {
            Monthfx.monthFx(a);
        } else if (a >= 13 && a <= 24) {
            int b = a - 12;
            Monthfx.monthFx(b);
        } else if (a>=25 && a<=36) {
            int c=a-24;
            Monthfx.monthFx(c);

        }
    }
}

