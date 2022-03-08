import java.util.*;
import java.util.Arrays;


public class mising_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Enter the Number");
        for (int i=0;i<number.length;i++){
            number[i] = input.nextInt();
        }
        int temp;
        for (int i= 0;i< number.length; i++){
            for(int j=i; j< number.length; j++){
                if(number[i] > number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println("Missing Number is:" + getMissingNumber(number));
    }

    public static int getMissingNumber(int arr[])
    {
        int i, total;
        int n = arr.length;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        return total;
    }
}
