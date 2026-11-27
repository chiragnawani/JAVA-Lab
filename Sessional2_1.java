import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class InvalidDistanceException extends Exception{
    public InvalidDistanceException(String message){
        super(message);
    }
}

interface Deliverable{
    final int fuelCharge = 40;
    void deliveryCost();
}
abstract class Parcel{
    void checkValidDistance(int deliveryDistance) throws InvalidDistanceException{
        if(deliveryDistance<=0 || deliveryDistance>5000){
            throw new InvalidDistanceException("Invalid Distance");
        }
    }
    String receiverName;
    String parcelType;
    int deliveryDistance;
    static int totalTrackingIDs = 1;
    String trackingID;
    int deliveryCost = 0;
    Parcel(String receiverName, int deliveryDistance, String parcelType){
    try{
            checkValidDistance(deliveryDistance);
            this.receiverName = receiverName;
            this.deliveryDistance = deliveryDistance;
            trackingID = "PKG"+totalTrackingIDs;
            this.parcelType = parcelType;
            totalTrackingIDs++;
    }catch(InvalidDistanceException e){
        System.out.println(e.getMessage());
    }
    }
    abstract void ratePerKm();
}
class DeliveryManagement extends Parcel implements Deliverable{
    DeliveryManagement(String receiverName, int deliveryDistance, String parcelType){
        super(receiverName, deliveryDistance, parcelType);
    }
    int insuranceAmount = 1000;
    @Override
    public void ratePerKm(){
        deliveryCost = 12*deliveryDistance + insuranceAmount;
    }
    @Override
    public void deliveryCost(){
        deliveryCost = 25*deliveryDistance + insuranceAmount;
    }
}
public class Sessional2_1{
    public static void main(String args[]){
        JFrame frame = new JFrame("Delivery MAnagement System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);

        JPanel panel = new JPanel(new GridLayout(5,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JLabel receiverLabel = new JLabel("Enter name: ");
        JTextField receiverField = new JTextField();

        JLabel deliveryDistanceLabel = new JLabel("Enter Delivery Distance: ");
        JTextField deliveryDistanceField = new JTextField();

        JLabel parcelTypeLabel = new JLabel("Select Parcel Type: ");
        JRadioButton stadardDeliveryRadio = new JRadioButton("Standard");
        JRadioButton expressDeliveryRadio = new JRadioButton("Express");

        ButtonGroup deliveryTypeGroup = new ButtonGroup();
        deliveryTypeGroup.add(stadardDeliveryRadio);
        deliveryTypeGroup.add(expressDeliveryRadio);

        JPanel deliveryTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        deliveryTypePanel.add(stadardDeliveryRadio);
        deliveryTypePanel.add(expressDeliveryRadio);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String receiverName = receiverField.getText();
                int deliveryDistance = Integer.parseInt(deliveryDistanceField.getText()); 
                String parcelType;

                if(stadardDeliveryRadio.isSelected()){
                    parcelType = "Standard";
                }else{
                    parcelType = "Express";
                }
                DeliveryManagement obj =new DeliveryManagement(receiverName,deliveryDistance,parcelType);
                if (parcelType.equals("Standard")) {
                    obj.ratePerKm();
                    }
                else {
                        obj.deliveryCost();
                }
                JOptionPane.showMessageDialog(
                        frame,
                        "Receiver Name: " + obj.receiverName +
                        "\nParcel Type: " + obj.parcelType +
                        "\nDelivery Distance: " + obj.deliveryDistance +
                        "\nTracking ID: " + obj.trackingID +
                        "\nDelivery Cost: Rs. " + obj.deliveryCost
                );
            }
        });

        panel.add(receiverLabel);
        panel.add(receiverField);
        panel.add(deliveryDistanceLabel);
        panel.add(deliveryDistanceField);
        panel.add(parcelTypeLabel);
        panel.add(deliveryTypePanel);
        panel.add(new JLabel());
        panel.add(submitButton);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}