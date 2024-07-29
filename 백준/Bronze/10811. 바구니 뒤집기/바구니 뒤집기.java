import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int range = Integer.parseInt(st.nextToken()); 
        int line = Integer.parseInt(st.nextToken()); 
        List<Integer> num_list = new ArrayList<>();
        for(int i =1; i<=range; i++){
            num_list.add(i);
        }
		for(int i=0; i<line; i++){
            st = new StringTokenizer(br.readLine());
            int n1= Integer.parseInt(st.nextToken());
            int n2= Integer.parseInt(st.nextToken());
            Collections.reverse(num_list.subList(n1-1,n2));
        }
        for(int i: num_list){
            System.out.print(i+" ");
        }
	}
} 