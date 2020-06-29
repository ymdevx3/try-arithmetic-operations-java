import java.util.regex.Pattern;
import jp.hishidama.eval.*;

public class Calculator {
    
    /**
     * 計算
     * @param expression 数式文字列
     */
    public static double calculate(String expression) throws IllegalArgumentException {

        // 正規表現チェック（数値と演算子[+, -, *, /]のみ使用かの場合s）
        expression = expression.replace(" ", "");
        // ^[\+|-]?[\d|\+|\-|\*|\/]*[\d]+$
        String pattern = "^[\\+|\\-]?[\\d|\\+|\\-|\\*|/]*[\\d]+$";
        Pattern p = Pattern.compile(pattern);
        if (!p.matcher(expression).find()) {
            throw new IllegalArgumentException("式が不正です。");
        }

        Rule rule = ExpRuleFactory.getDefaultRule();
        Expression exp = rule.parse(expression); //解析
        double result = exp.evalDouble(); //計算実施

        return result;
    }
}