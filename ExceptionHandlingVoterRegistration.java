import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class ExceptionHandlingVoterRegistration{
    static void register(String name, int age) throws InvalidAgeException{
        if(age>120){
            throw new InvalidAgeException("Impossible Age!");
        }
        else if(age<18){
            throw new InvalidAgeException("Under Age!");
        }else{
            System.out.println("Success!");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        String s = "fgh";
        try{
            register(s,age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}