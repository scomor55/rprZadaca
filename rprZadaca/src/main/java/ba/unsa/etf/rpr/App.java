package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       /* System.out.println( "Unesite izraz!" );
        Scanner in = new Scanner(System.in);*/
       /* String expression = in.nextLine();*/

        String expression = "( 1 + 2 ) * 3";
        char[] str = expression.toCharArray();


        try{
          /*  char temp1='\0',temp2;
                for(char temp : str){
                    temp2 = temp1;
                    temp1 = temp;
                    if(!(temp1==' '||temp2 ==' ')){
                        throw new RuntimeException("Input error!");
                    }
                }*/

                double number;
                number = ExpressionEvaluator.evaluate(expression);
            System.out.println("-------> "+ number);

        }catch(RuntimeException r){
            System.out.println("Input error code: " + r.getMessage());
        }
    }
}
