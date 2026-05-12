import java.util.Stack;
public class Increasing {
    public static void main(String[] args) {
        int arr[]={1,4,5,2,6};
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
          while(!st.isEmpty() && arr[i] < st.peek())
            { 
                st.pop();
            }
          st.push(arr[i]);
           
    }
    System.out.println(st);
}
}
