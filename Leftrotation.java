import java.util.*;
public class Leftrotation {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int rotate=2;
        rotate=rotate%arr.length;
        for(int i=0;i<rotate;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
}
}