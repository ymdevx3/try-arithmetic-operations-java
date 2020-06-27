import jp.hishidama.eval.*;

public class Calculator {
    
    /**
     * ŒvZ
     * @param expression ”®•¶š—ñ
     */
    public static double calculate(String expression) {

        Rule rule = ExpRuleFactory.getDefaultRule();
        Expression exp = rule.parse(expression); //‰ğÍ
        double result = exp.evalDouble(); //ŒvZÀ{

        return result;
    }
}