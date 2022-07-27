public class OrderOfExecution {
    {
        System.out.println("Empty Block of code :)");
    }
    static {
        System.out.println("Static Block :)");
    }
    OrderOfExecution(){
        System.out.println("Constructor Block :(");
    }
    public void function(){
        System.out.println("Function Block :(");
    }

    public static void main(String[] args) {
        System.out.println("Main Function called :)");
        new OrderOfExecution().function();
    }
}
