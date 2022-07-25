package Swap;
import java.util.Scanner;
public class SwapMain
{
    public static void main(String[] args)
    {
        System.out.println("enter first no");
        int a=new Scanner(System.in).nextInt();

        System.out.println("enter second no");
        int b=new Scanner(System.in).nextInt();

        System.out.println("no 1 is : "+a+"\n" +"no 2 is :"+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);

        System.out.println("no 1 is : "+a+"\n" +"no 2 is :"+b);



    }
}
