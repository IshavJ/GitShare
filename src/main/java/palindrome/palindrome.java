package palindrome;
import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter value :");
        System.out.println(new palindromeMethods().palindrome(new Scanner(System.in).next()));
    }
}
