package ba.unsa.etf.rpr;

/**
 * Provjera unosa i pozivanje funkcije!
 * @author Safa
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String expression = args[0];
        try{
            char temp1;
            char temp2;
            /**
             * Provjera unosa
             * @author Safa
             */
            for(int i = 1; i < expression.length() ; i++){
                    temp1 = expression.charAt(i-1);
                    temp2 = expression.charAt(i);
                    if(!(temp1 == ' ' ||temp2 == ' ')){
                        throw new RuntimeException("Input error!");
                    }
                }
                double number;
                number = ExpressionEvaluator.evaluate(expression);
                System.out.println("-------> "+ number);
        }catch(RuntimeException r){
            System.out.println("Input error code: " + r.getMessage());
        }
    }

}
