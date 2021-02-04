package lbmsDesktop.util;

import java.math.BigDecimal;

public class NumberUtil {


    public static BigDecimal parseBigdecimal(Object txt){
        try {
            return new BigDecimal(txt+"");

        } catch (Exception ex){
            return null;
        }
    }

    public static Integer agePositiv(Object txt){
        try {
            if (txt instanceof Integer){
                Integer age = (Integer) txt;
                return Math.abs(age);
            } else {
                return Integer.parseInt(txt+"");
            }
        } catch (Exception ex){
            return null;
        }
    }
}
