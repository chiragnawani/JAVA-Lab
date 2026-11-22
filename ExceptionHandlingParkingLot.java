import java.util.*;
class ParkingFullException extends Exception{
    ParkingFullException(String message){
        super(message);
    }
}
class VehicleNotFoundException extends Exception{
    VehicleNotFoundException(String message){
        super(message);
    }
}
public class ExceptionHandlingParkingLot{
    private String[] slots = new int[3];
    static int count = 0;

    void parkVehicle(String number) throws ParkingFullException{
        if(Parking.count<3){
            slots[count] = number;
            count++;
        }else{
            throw new ParkingFullException("Parking full!");
        }finally{
            System.out.println("Total Slots in use: "+count);
        }
    }
    void removeVehicle(String number) throws VehicleNotFoundException{
        boolean found = false;
        for(String a : slots){
            if(a.equals(number)){
                found = true;
            }
        }
        if(found){
            System.out.println("Removed!");
            count--;
        }else{
            throw new VehicleNotFoundException("Not Found;");
        }finally{
            System.out.println("Total Slots in use: "+count);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            parkVehicle("101");
            removeVehicle("101");
            parkVehicle("102");
            parkVehicle("103");
            parkVehicle("104");
            removeVehicle("106");
            removeVehicle("104");
        }catch{}    
    }
}