class ArithmeticOperations {
    public static void main(final String args[]) {

        String expressions[] = {
            "10+20*30+40-50*2/4 * 2",
            "23+31",
            "43-4+45*23",
            "32+54*27*4/13",
            " 1",
            "- 2",
            "* 2",
            "10 + 2",
            "10 * 2",
            "-10 - 2",
            "-10 / 2",
            "10 + 4 + 3",
            "10 + 4 - 3",
            "10 + 4 * 3",
            "10 + 4 / 3",
            "12+ -3",
            "1 + 2 / 0",
            "1 + a"
        };

        for (String expression: expressions) {
            try {
                double result = Calculator.calculate(expression);
                System.out.println(expression + " = " + result);
            } catch (Exception ex) {
                System.out.println("[Error] : " + expression + " -> " + ex.getMessage());
            }
        }
    }
}