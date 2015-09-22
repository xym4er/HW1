package Var1;

/**
 * Created by ChornyiUA on 22.09.2015.
 */
public class Double {
    double value;
    String stringValue;

    Double (){}

    Double (double value){
        this.value=value;
        this.stringValue=value+"";
    }

    int beforePoint(){
        for (int i = 0; i <stringValue.length() ; i++) {
            if (stringValue.charAt(i)=='.')return i;
        }
        return stringValue.length();
    }
    int afterPoint(){
        for (int i = 0; i <stringValue.length() ; i++) {
            if (stringValue.charAt(i)=='.')return stringValue.length()-i-1;
        }
        return stringValue.length();
    }


}
