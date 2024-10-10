import java.io.*;
import java.util.*; 
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch(command){
                case "push": stack.push(num);
                    break;
                case "pop" : System.out.println(stack.empty()?-1:stack.pop());
                    break;
                case "size": System.out.println(stack.size());
                    break;
                case "empty": System.out.println(stack.empty()?1:0);
                    break;
                case "top": System.out.println(stack.empty()?-1:stack.peek());
                    break;
            }
        }
    }
}

