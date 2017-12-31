package lambdas.unittwo;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int keyInteger = 0;

        process(someNumbers, keyInteger,wrapperLambda((value, key) -> System.out.println(value / key)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (value, key) -> {
            try {
                consumer.accept(value, key);
            } catch (ArithmeticException exception) {
                System.out.println("Exception encountered: " + exception.getMessage());
            }
        };
    }
}
