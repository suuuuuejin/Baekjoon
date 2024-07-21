import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
    
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            result[i] =Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            System.out.println(result[i]);
        }
    }
}