class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1=Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for( int num:arr){
            
            if(num>max1) {
                max2 = max1;
                max1 =num;
            }
            else if(num>max2 && num!=max1)  max2=num;
            //else if(num == max1&&num == max2) return -1;
        }
        if(max2 == Integer.MIN_VALUE) return -1;
        return max2;
    }  
}