import java.util.*;
public class StringSentenceAnalyser{
    public static String toTitleCase(String s){
        String result = "";
        boolean capitalizeNext = true;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                result = result + ch;
                capitalizeNext = true;
            }else if(capitalizeNext){
                result = result + String.valueOf(ch).toUpperCase();
                capitalizeNext = false;
            }else{
                result = result + String.valueOf(ch).toLowerCase();    
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String s = "Scnner is the worst";
        s = s.trim();
        System.out.println("Total Length: "+s.length());
        String arr[] = s.split("\\s+");
        System.out.println("Total length with characters only: "+ arr.length);
        System.out.println("s.toUpperCase: "+ s.toUpperCase());
        int countVowels = 0;
        int countConsonants = 0;
        String lower = s.toLowerCase();
        for(int i = 0; i < lower.length(); i++){
            char ch = lower.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowels++;
            }else if(ch>= 'a' && ch<='z'){
                countConsonants++;
            }
        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);
        System.out.println("Title Case: "+toTitleCase(s));
    }
}



