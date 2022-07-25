package MonthCalc;

import java.util.Scanner;

public class Monthfx
{
    public static void monthFx1(int no)
    {
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
    }


    public static void monthFx(int no)
    {
        switch (no) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
        }
    }
}
