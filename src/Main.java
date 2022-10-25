import enums.Operator;
import factory.CalculateFactory;
import solution.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.run(Arrays.asList(2, 6, 10, 9, 32, 2, 25, 21, 16, 9, 14, 2, 31), CalculateFactory.getCalculates(Operator.Or, Operator.Sub, Operator.RM, Operator.And, Operator.LM)));
    }
}
