package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        new Thread(runnable).start();

        /**
         * java 8 lambda
         */

        //Syntax = () -> {}

        Runnable runnableLambda = () ->{
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        //Single line statement doesn't need curly braces.
        Runnable runnableLambda1 = () -> System.out.println("Inside runnable 3");

        new Thread(runnableLambda1).start();

        //we can do this inline also

        new Thread(() -> System.out.println("Inside runnable 4")).start();
    }
}
