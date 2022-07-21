package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static ArrayList array = new ArrayList();

    public static void inputs(){
        System.out.println("Enter numbers ");
        for(int i =0;i<=1;i++){
            if(sc.hasNextInt()){
                array.add(sc.nextInt());
                array.add(sc.nextInt());
                System.out.println("Integer");
                break;
            }
            else {
                array.add(sc.nextFloat());
                array.add(sc.nextFloat());
                System.out.println("Float");
                break;
            }
        }
        System.out.println(array);
    }

    public static void Switch(){
        while (true){
            System.out.println("1.Add\n2.Sub\n3.Divide\n4.Multiply\n5.Exit\n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (((Object) array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.add((Integer) array.get(0), (Integer) array.get(1));
                        break;
                    } else {
                        CalculatorFunctions.add((Float) array.get(0), (Float) array.get(1));
                        break;
                    }
                case 2:
                    if (((Object) array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.sub((Integer) array.get(0), (Integer) array.get(1));
                        break;
                    } else {
                        CalculatorFunctions.sub((Float) array.get(0), (Float) array.get(1));
                        break;
                    }
                case 3:
                    if (((Object) array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.div((Integer) array.get(0), (Integer) array.get(1));
                        break;
                    } else {
                        CalculatorFunctions.div((Float) array.get(0), (Float) array.get(1));
                        break;
                    }
                case 4:
                    if (((Object) array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.multi((Integer) array.get(0), (Integer) array.get(1));
                        break;
                    } else {
                        CalculatorFunctions.multi((Float) array.get(0), (Float) array.get(1));
                        break;
                    }
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        inputs();
        Switch();
    }
}
