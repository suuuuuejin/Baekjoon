import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int bucket = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[bucket+1];
        for(int i=0; i<bucket+1; i++){
            arr[i] = i;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int temp = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = temp;
        }
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
	}
} 