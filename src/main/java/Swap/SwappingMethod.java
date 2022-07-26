package Swap;

import java.util.*;

public class SwappingMethod {
    public static void swapping(){
        ArrayList list = new ArrayList();
        for(int i=0;i<=1;i++){
            list.add(new Scanner(System.in).nextInt());
        }
        System.out.println("List before swapping: "+list);
        Collections.swap(list, 0, 1);
        System.out.println("List after swapping: "+list);
    }

    public static void Swapping(){
        System.out.println("enter numbers");
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();

        System.out.println("no 1 is : "+a+"\n" +"no 2 is :"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("no 1 is : "+a+"\n" +"no 2 is :"+b);
    }
}

