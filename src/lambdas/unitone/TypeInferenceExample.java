package lambdas.unitone;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
