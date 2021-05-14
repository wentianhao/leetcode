package leetcode;

import java.util.HashMap;
import java.util.Map;

public class intToRoman_12 {
    public String intToRoman(int num) {
        int[]values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        for(int i=0;i<13;i++){
            while(num>=values[i]){
                num-=values[i];
                res = res + roman[i];
            }
        }
        return res;
    }

}
