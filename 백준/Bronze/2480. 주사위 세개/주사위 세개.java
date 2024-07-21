import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());
        int result;
        if(num[0] == num[1] && num[1] == num[2]){
            result = 10000 +(num[0] * 1000);
        }else if(num[0] != num[1] && num[1] != num[2] && num[0] != num[2]){
            int max = 0;
            for(int i=0; i<3; i++){
                if(num[i] > max) max = num[i];
            }
            result = max * 100;
        }else{
            int n;
            if(num[0]==num[1]) n = num[0];
            else if(num[1]==num[2]) n = num[1];
            else n=num[2];
            result = 1000+(n*100);
        }
        System.out.println(result);
    }
}
