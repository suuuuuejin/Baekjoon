import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;

        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());
            sum += price * amount; 
        }
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}