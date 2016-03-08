import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> res = addOperators("123", 6);

        for (String str : res) {
            System.out.println(str);
        }

    }

    public static List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<String>();

        helpFunc(num, "", target, res, 0, 0, 0);

        return res;
    }

    private static void helpFunc(String num, String combo, int target, List<String> res, long val, int pos, long lastDigit) {
        // base case
        if (pos == num.length()) {
            if (val == target) {
                res.add(combo);
            }
            return;
        }

        // recursive
        for (int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') return;

            String sub_str = num.substring(pos, i+1);

            if (pos == 0) {
                helpFunc(num, sub_str, target, res, Long.valueOf(sub_str), i+1, Long.valueOf(sub_str));
            }
            else {
                helpFunc(num, combo+"+"+sub_str, target, res, val+Long.valueOf(sub_str), i+1, Long.valueOf(sub_str));
                helpFunc(num, combo+"-"+sub_str, target, res, val-Long.valueOf(sub_str), i+1, -Long.valueOf(sub_str));
                helpFunc(num, combo+"*"+sub_str, target, res, val-lastDigit+Long.valueOf(sub_str)*lastDigit, i+1, Long.valueOf(sub_str)*lastDigit);
            }
        }
    }
}
