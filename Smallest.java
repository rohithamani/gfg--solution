import java.util.*;
public class Smallest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int min=arr[0];
        int index=0;
          for (int idx = 1; idx < arr.length; idx++) {
            arr[idx]=sc.nextInt();
              if(arr[idx]<arr[0]){
                min=arr[idx];
                index=idx;
              }
          }
          System.out.println(min+index);
        }
    }
