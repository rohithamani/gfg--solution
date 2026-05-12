import java.util.*;
public class Binary {
    public static int search(int []arr,int target ){
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<=right){
         mid=left+right/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.print("Enter the size:");
        //int size=sc.nextInt();
        int arr[]={1,3,4,5,6,7,8,9};
        
        int target=5;
       // search([]arr,target);
        System.out.println("The mid value is "+search( arr, target ));

    }
}
