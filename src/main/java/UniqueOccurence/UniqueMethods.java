package UniqueOccurence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueMethods {
    static ArrayList<Integer> array;
    public static ArrayList<Integer> inputToArrayList(){
        array = new ArrayList<>();
        System.out.println("Enter number");
        int number = new Scanner(System.in).nextInt();
        for(int i = 0;i<=number-1;i++){
            array.add(new Scanner(System.in).nextInt());
        }
        System.out.println("ArrayList Elements");
        for(int x:array){
            System.out.print(x+"\t");
        }
        return array;
    }
    public static void listToSet(){
        inputToArrayList();
        Set<Integer> set = new HashSet<>(array);
        System.out.println("\nUnique Elements");
        for(int x:set){
            System.out.print(x+"\t");
        }
    }
}
