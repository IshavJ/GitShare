import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class MonthswithClass {

    public static void output(String month) {
        String o = month.substring(0, 1);
        String p = month.substring(1);
        System.out.println(o + p.toLowerCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        System.out.println("Pass Month name ");
        Month mon = Month.valueOf(new Scanner(System.in).next().toUpperCase(Locale.ROOT));
        System.out.println("Enter number of month(s) for addition ");
        int addition = mon.getValue() + new Scanner(System.in).nextInt();

        //System.out.println((addition <= 12) ?  Month.of(addition).name() : Month.of(addition - 12).name());

        if(addition <= 12)
            output(Month.of(addition).name());
        else
            output(Month.of(addition - 12).name());
    }
}
