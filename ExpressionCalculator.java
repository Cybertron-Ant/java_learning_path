import java.util.Scanner;

// calculates the result of a mathematical expression and prints the result as an integer
public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();

        try {
            int result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int evaluateExpression(String expression) {
        try {
            expression = expression.replaceAll("\\s", "");
            int result = eval(expression);
            return result;
        } catch (Exception e) {
            throw new ArithmeticException("Invalid expression");
        }
    }

    public static int eval(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            int parse() {
                nextChar();
                int x = parseExpression();
                if (pos < expression.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }

            int parseExpression() {
                int x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            int parseTerm() {
                int x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            int parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                int x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if (ch >= '0' && ch <= '9') {
                    while (ch >= '0' && ch <= '9') nextChar();
                    x = Integer.parseInt(expression.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('%')) x %= parseFactor();

                return x;
            }
        }.parse();
    }
}
