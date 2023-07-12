import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array, int search){
        int size= array.length;
        int count =0;
        for(int i=0;i<size;i++){
           if(array[i]==search){
               count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int search= sc.nextInt();
        System.out.println(linearSearch(array, search));

    }
}
