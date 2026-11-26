import java.util.*;
class A extends Thread{
    int n = 0;
    A(int n){
        this.n = n;
    }
    public void run(){
        if(n<=1){
            System.out.println("Not prime!");
            return;
        }
        boolean prime = true;
        for(int i=2; i<n; i++){
            if(n%i== 0){
                prime = false;
            }
        }
        if(prime){
            System.out.println("Prime!");
        }else{
            System.out.println("Not prime!");
        }
    }
}
public class ThreadBasic{
    public static void main(String[] args){
        new A(7).start();
    }
}