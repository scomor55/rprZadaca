package ba.unsa.etf.rpr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ExpressionEvaluator {
    public static double evaluate(String s){
        double number ;

        String[] str = s.split("\\s+");
        Queue<String> q = new LinkedList<>();

        Collections.addAll(q, str);

        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

        while(!q.isEmpty()){
            String temporary = q.poll();
            if(temporary.equals("(")){}
            else if (temporary.equals("+")) {
                operators.push(temporary);
            }else if (temporary.equals("-")) {
                operators.push(temporary);
            }else if (temporary.equals("*")) {
                operators.push(temporary);
            }else if (temporary.equals("/")) {
                operators.push(temporary);
            }else if (temporary.equals("sqrt")) {
                operators.push(temporary);
            }else if (temporary.equals(")"))
                {
                    String ops = operators.pop();
                    double val = values.pop();
                    if(ops.equals("+")){
                        val = values.pop() + val;
                       // q.add(ops);
                    }else if (ops.equals("-")) {
                        val = values.pop() - val;
                      //  q.add(ops);
                    }else if (ops.equals("*")) {
                        val = values.pop() * val;
                      //  q.add(ops);
                    }else if (ops.equals("/")) {
                        val = values.pop() / val;
                       // q.add(ops);
                    }else if (ops.equals("sqrt")) {
                        val = Math.sqrt(val);
                      //  q.add(ops);
                    }
                    values.push(val);
                }else{
                values.push(Double.parseDouble(temporary));
            }
        }

        /*
        for(String temp: operators){
            System.out.println(temp);
        }
        for(double temp: values){
            System.out.println(temp);
        }*/
       /* number = values.pop();
        for(String sign:operators){
            double temp = values.pop();
            if(sign.equals('+')) {
                number = number + temp;
            } else if (sign.equals('-')) {
                number = number - temp;
            } else if (sign.equals('*')) {
                number = number * temp;
            }else if (sign.equals('/')) {
                number = number / temp;
            }
        }*/
        number = values.pop();

        return number;
    }
}
