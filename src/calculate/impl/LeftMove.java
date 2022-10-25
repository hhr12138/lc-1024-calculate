package calculate.impl;

import calculate.Calculate;

public class LeftMove implements Calculate {
    @Override
    public long operation(long num1, long num2) {
        if(num1 == 0) return 0;
        if(num2 >= 32) return Long.MIN_VALUE;
        long tran = Integer.MAX_VALUE/num1;
        //判断num1*(1<<num2)即(num1<<num2)是否超过int最大值, 粗略判断下就行
        if(tran < (1 << num2)) return Long.MIN_VALUE;
        return num1 << num2;
    }

    @Override
    public String getOpe() {
        return "<<";
    }
}
