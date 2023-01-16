import oop_laba3.*;

public class Main {
    public static void checkOperation(Operation operation){
        operation.printName();
        operation.printSign();

        System.out.printf("0 %s 0 = %s\n", operation.getSignStr(), operation.perform(false, false) ? "1" : "0");
        System.out.printf("0 %s 1 = %s\n", operation.getSignStr(), operation.perform(false, true)  ? "1" : "0");
        System.out.printf("1 %s 0 = %s\n", operation.getSignStr(), operation.perform(true, false)  ? "1" : "0");
        System.out.printf("1 %s 1 = %s\n", operation.getSignStr(), operation.perform(true, true)   ? "1" : "0");
    }

    public static void main(String[] args) {
        checkOperation(new Xor());
        System.out.println();

        checkOperation(new Or());
        System.out.println();

        checkOperation(new And());
    }
}