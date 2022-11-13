package ba.unsa.etf.rpr;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) ";



        try{
            String temp1="\0",temp2 = "\0";
                for(int i = 1; i < args.length ; i++){
                    temp1 = args[i-1];
                    temp2 = args[i];
                    if(!(temp1==" "||temp2 ==" ")){
                        throw new RuntimeException("Input error!");
                    }
                }

                double number;

                //number = ExpressionEvaluator.evaluate(String.valueOf(args));
            number = ExpressionEvaluator.evaluate(expression);
            System.out.println("-------> "+ number);

        }catch(RuntimeException r){
            System.out.println("Input error code: " + r.getMessage());
        }
    }

}
