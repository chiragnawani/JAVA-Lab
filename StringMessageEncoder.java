import java.util.*;
public class StringMessageEncoder{
    public static String StringMessageEncoder(String s){
        int shiftKey = 3;
        StringBuffer sb = new StringBuffer(s);
        StringBuffer encodedMessage = new StringBuffer();
        for(int i = 0; i<n; i++){
            char ch = sb.charAt(i);
            if(ch<= 'z' && ch>='a'){
                ch = (char) ('a' + (ch - 'a' + key)%26);
            }else if(ch)
        }
    }
    public static void main(String[] args){
        
    }
}