package solution;

import calculate.Calculate;

import java.util.List;

public class Solution {
    public static final int MAX_DEEP = 3;
    private static final int TARGET_NUM = 1024;

    public String run(List<Integer> nums, List<Calculate> calculates){
        if(nums.size() < 4 || calculates.size() < 3) return"最少需要4个操作数和3个运算符";
        boolean[] useNum = new boolean[nums.size()];
        boolean[] useCal = new boolean[calculates.size()];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < nums.size(); i++){
            result.append(nums.get(i));
            useNum[i] = true;
            if(dfs(nums.get(i), nums,calculates,useNum,useCal,result,0)){
                return result.toString();
            }
            result.delete(result.length()-String.valueOf(nums.get(i)).length(),result.length());
            useNum[i] = false;
        }
        return "无解";
    }
    private boolean dfs(long beforeNum, List<Integer> nums, List<Calculate> calculates, boolean[] useNums, boolean[] useCalculates, StringBuilder result,int deep){
        if(deep == MAX_DEEP){
            if(beforeNum == TARGET_NUM) return true;
            return false;
        }
        //选择下一个数
        for(int i = 0; i < calculates.size(); i++){
            if(useCalculates[i]) continue;
            useCalculates[i] = true;
            Calculate calculate = calculates.get(i);
            result.append(calculate.getOpe());
            for(int j = 0; j < nums.size(); j++){
                if(useNums[j]) continue;;
                useNums[j] = true;
                result.append(nums.get(j));
                long num = calculate.operation(beforeNum,nums.get(j));
                if(num != Long.MIN_VALUE) {
                    if(dfs(num,nums,calculates,useNums,useCalculates,result,deep+1)){
                        return true;
                    }
                }
                result.delete(result.length()-String.valueOf(nums.get(j)).length(),result.length());
                useNums[j] = false;
            }
            result.delete(result.length()-calculate.getOpe().length(),result.length());
            useCalculates[i] = false;
        }
        return false;
    }
}
