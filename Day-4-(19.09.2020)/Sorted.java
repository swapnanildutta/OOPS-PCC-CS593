import java.util.Scanner;

public class Sorted {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int num [] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0 ; i < n ; i++){
            num[i] = input.nextInt();
        }
        for(int i =0; i < n; i++){
            for(int j = 0; j < n-i-1 ; j++){
                if(num [j] > num[j+1]){
                    int temp = num [j];
                    num [j] = num [j+1];
                    num [j+1] = temp;
                }
            }
        }
        System.out.print("The array after sortting: \n");
        for (int i : num)
            System.out.print(i + " ");
        System.out.println();
    }

}