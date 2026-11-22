import java.util.*;
public class ExceptionHandlingCinemaSeatBooking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] seats = new String[10];
        for(int i = 0; i<3; i++){
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            boolean success = false;
            try{
                System.out.print("Enter Seat Number(1-10): ");
                int seatNumber = sc.nextInt();
                sc.nextLine();
                int arraySeatNumber = seatNumber-1;
                if(seats[arraySeatNumber] == null){
                    seats[arraySeatNumber] = name;
                    success = true;
                }else{
                    System.out.println("Seat" + seatNumber + "is already booked");
                }
            }catch(NumberFormatException e){
                System.out.println("Please enter a valid number!");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter a seat number between 1-10");
            }finally{
                if(success){
                    System.out.println("Seat booked!");
                }else{
                    System.out.println("Booking Failed!");
                }
            }
        }
        for(int i=0; i<seats.length; i++){
            System.out.println("Seat "+ (i+1) + " is booked by " + seats[i]);
        }
    }
}