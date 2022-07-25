package MonthCalc;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class Monthcalc2
{
    static String[] s = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December","InvalidNumber"};

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,new Scanner(System.in).nextInt());
        cal.add(Calendar.MONTH,new Scanner(System.in).nextInt());

        System.out.println(s[ cal.get(Calendar.MONTH)-1]);
    }
}


