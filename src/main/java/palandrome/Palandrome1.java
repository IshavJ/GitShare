package palandrome;
import java.util.Scanner;
public class Palandrome1
{

    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value :" );
        String str= scan.next();

        StringBuilder stringBuilder;
        System.out.println( new StringBuilder(str).reverse().toString().equals(str) ? "Palindrome" : "Not Palindrome");


    }
}
