package factory;

import calculate.Calculate;
import calculate.impl.*;
import enums.Operator;

import java.util.ArrayList;
import java.util.List;

public class CalculateFactory {
    public static Calculate getCalculate(Operator ope){
        switch (ope){
            case Add:return new Add();
            case Sub:return new Sub();
            case Mul:return new Mul();
            case Div:return new Div();
            case And:return new And();
            case Or:return new Or();
            case LM:return new LeftMove();
            default:return new RightMove();
        }
    }
    public static List<Calculate> getCalculates(Operator ... opes){
        List<Calculate> result = new ArrayList<>();
        for(Operator ope: opes){
            result.add(getCalculate(ope));
        }
        return result;
    }
}
