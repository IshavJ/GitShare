package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMethods {
    static Scanner sc = new Scanner(System.in);
    static ArrayList array = new ArrayList();

    public static void userInputs(){
        System.out.println("Enter numbers ");
        if( sc.hasNextInt()){
            array.add(sc.nextInt());
            array.add(sc.nextInt());
        }
        else if(sc.hasNextFloat()){
            array.add(sc.nextInt());
            array.add(sc.nextInt());
        } else if (sc.hasNext()) {
            System.out.println("String");
            return ;
        }
        else if(sc.hasNextDouble()){
            System.out.println("Double");
            return;
        }
    }

    public static void operationMenu(){
        while (true){
            System.out.println("1.Add\n2.Sub\n3.Divide\n4.Multiply\n5.Exit\n");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    if ((array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.add((Integer) array.get(0), (Integer) array.get(1));
                    } else {
                        CalculatorFunctions.add((Float) array.get(0), (Float) array.get(1));
                    }
                    break;
                case 2:
                    if ((array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.sub((Integer) array.get(0), (Integer) array.get(1));
                    } else {
                        CalculatorFunctions.sub((Float) array.get(0), (Float) array.get(1));
                    }
                    break;
                case 3:
                    if ((array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.div((Integer) array.get(0), (Integer) array.get(1));
                    } else {
                        CalculatorFunctions.div((Float) array.get(0), (Float) array.get(1));
                    }
                    break;
                case 4:
                    if ((array.get(0)).getClass().getSimpleName().equals("Integer")) {
                        CalculatorFunctions.multi((Integer) array.get(0), (Integer) array.get(1));

                    } else {
                        CalculatorFunctions.multi((Float) array.get(0), (Float) array.get(1));
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}
