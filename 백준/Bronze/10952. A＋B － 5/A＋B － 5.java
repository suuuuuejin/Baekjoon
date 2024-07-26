import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            if(sum == 0){
                break;
            }else{
                sb.append(sum+"\n");
            }
            }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}