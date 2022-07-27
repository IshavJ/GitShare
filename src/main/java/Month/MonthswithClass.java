import java.time.Month;
import java.util.Scanner;

public class MonthswithClass {
    public static void main(String[] args) {
        System.out.println("Pass Caps Month name");
        Month mon = Month.valueOf(new Scanner(System.in).next());
        int addition = mon.getValue() + new Scanner(System.in).nextInt();
        System.out.println((addition <=12)?Month.of(addition).name():Month.of(addition - 12).name());
    }
}
