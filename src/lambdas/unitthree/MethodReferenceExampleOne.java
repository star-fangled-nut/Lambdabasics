package lambdas.unitthree;

public class MethodReferenceExampleOne {
    public static void main(String[] args) {

        Thread t = new Thread(MethodReferenceExampleOne::printMessage);
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
