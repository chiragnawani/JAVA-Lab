import java.io.*;
import java.util.*;
public class FileHandling{
    public static void main(String[] args) throws FileNotFoundException{

        // try(InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.println("Enter some letters: ");
        //     int letters = isr.read();
        //     while(isr.ready()){
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }
        //     isr.close();

        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }


        // try(FileReader fr = new FileReader("out.txt")){
        //     int letters;
        //     while((letters = fr.read())!=-1){
        //         System.out.println((char) letters);
        //     }

        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("You Typed: " + br.readLine());
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        try(BufferedReader br = new BufferedReader(new FileReader("out.txt"))){
            while(br.readLine());
            System.out.println("You Typed: " + br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        // FileOutputStream f = new FileOutputStream("out.txt");
        // PrintWriter out = new PrintWriter(f);
    }
}