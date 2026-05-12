public class ZigZag {
    public static boolean compare(int []arr) {
   if(arr.length<=2){
    return false;
   }
   for(int i=1;i<arr.length-1;i++){
    if(!(arr[i-1]<arr[i]&&arr[i]>arr[i+1]||arr[i-1]>arr[i]&&arr[i]<arr[i+1])){
        return false;
    }
   }
   return true;
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,2,5,4};
        boolean ans=compare(arr);
        System.out.println(ans);
    }
}
