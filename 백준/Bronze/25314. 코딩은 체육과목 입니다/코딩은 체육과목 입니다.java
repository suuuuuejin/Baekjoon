import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = n/4;
        for(int i= 0; i<m; i++){
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
    }
}