import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> res = diffWaysToCompute("2*3-4*5");
        for (int val : res) {
            System.out.println(val);
        }
    }

    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();

        // corner cases
        if (input.length() == 0) return res;

        if (input.indexOf('+') == -1 && input.indexOf('-') == -1 && input.indexOf('*') == -1) {
            res.add(Integer.valueOf(input));
            return res;
        }

        // divide the input string based on operators
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                char operator = input.charAt(i);
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));

                // combine numbers in left and right
                for (int l : left) {
                    for (int r : right) {
                        res.add(cal(operator, l, r));
                    }
                }
            }
        }

        return res;
    }

    private static int cal(char operator, int a, int b) {
        if (operator == '+') return a + b;
        else if (operator == '-') return a - b;
        else if (operator == '*') return a * b;
        return 0;
    }
}
