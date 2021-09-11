package leetcode.string;

public class myAtoi {

    public int myAtoi(String s){
        //正数
        int sign = 1;
        int ans = 0;
        //正负号出现次数
        int flag=0;
        for (char c:s.toCharArray())
        {
            if(c==' ' && flag==0) {
                continue;
            }
            if(c==' ' && flag>0) {
                break;
            }
            if(c=='-') {
                if(flag>0) {
                    break;
                }
                sign=-sign;
                flag++;
                continue;
            }
            if(c=='+'&& flag==0){
                if(flag>0) break;
                flag++;
                continue;
            }
            if(c<'0'||c>'9') break;
            else
            {
                if((sign==-1 && ans==Integer.MAX_VALUE/10 && c-'0'> 8) || (sign==-1 && ans>Integer.MAX_VALUE/10)){
                    ans=Integer.MAX_VALUE+1;
                    break;
                }
                if((sign == 1 && ans==Integer.MAX_VALUE/10 && c-'0'>7) || ans>Integer.MAX_VALUE/10){
                    ans=Integer.MAX_VALUE;
                    break;
                }
                ans=ans*10+(c-'0');
                flag++;
            }
        }
        return sign*ans;
    }
}
