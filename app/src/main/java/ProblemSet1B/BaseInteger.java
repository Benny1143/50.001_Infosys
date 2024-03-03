package ProblemSet1B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaseInteger {
    public static void main(String[] args) {
//        BaseInteger a = new BaseInteger("22,43,5", 60);
//        System.out.println(a.getDecimalValue());

        BaseInteger baseInteger1 = new BaseInteger( "1,1", 17);
        System.out.println(baseInteger1.getDecimalValue());
        System.out.println(baseInteger1.getDigitsString());
        System.out.println(baseInteger1);

        BaseInteger baseInteger2 = new BaseInteger( "1,1", 60);
        BaseInteger baseInteger3 = baseInteger1.add( baseInteger2 , 16);
        System.out.println(baseInteger3.getDigitsString()); // [4, 15]
        System.out.println(baseInteger3.getDecimalValue()); // 79
    }

    private String representation;
    private int base;

    private int[] digits;
    private int decimalValue;

    BaseInteger(String representation, int base){
        this.representation = deleteSpaces(representation);
        this.base = base;
        convertRepresentationToArray();
        setDecimalValue();
    }


    private void convertRepresentationToArray(){
        String[] s = representation.split(",");
        digits = new int[s.length];
        for(int i = 0; i< s.length;i++) {
            digits[i] = Integer.parseInt(s[i]);
        }
    }

    private void setDecimalValue(){
        decimalValue = 0;
        for(int i = 0; i < digits.length; i ++){
            int power = digits.length - i - 1;
            decimalValue += digits[i]*Math.pow(base, power);
        }
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public String getDigitsString(){
        return Arrays.toString(digits);
    }


    public BaseInteger add(BaseInteger other, int base){
        return new BaseInteger(convertBase(decimalValue + other.decimalValue, base), base);
    }

    private String convertBase(int decimalValue, int base){
        String returnString = "";
        do {
            int a = decimalValue;
            decimalValue = a/base;
            int remainder = a - base*decimalValue;
            returnString = remainder + "," + returnString;
            if(decimalValue == 0) {
                break;
            }
        } while(true);
        return returnString.substring(0, returnString.length() - 1);
    }

    private String deleteSpaces( String representation){
        return representation.replaceAll("\\s+","");
    }

    @Override
    public String toString() {
        return representation + " Base " + base;
    }
}
