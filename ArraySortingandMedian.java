import java.util.Scanner;
public class ArraySortingandMedian{
    static void sort(int a[]){
        for(int i = 0; i<a.length; i++){
            for(int j = i + 1; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("Enter number "+ i + ": ");
            a[i] = sc.nextInt();
        }
        sort(a);
        System.out.print("Sorted Array: ");
        for(int b: a){
            System.out.print(b +", ");
        }
    }
}