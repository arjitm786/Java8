package lambdas;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;

        //Consumer<Integer> c1 =  (i)/*not allowrd*/ ->{
           // int i=2; // not allowed
            System.out.println("value is : "+ i);
  //      };
    }
}
