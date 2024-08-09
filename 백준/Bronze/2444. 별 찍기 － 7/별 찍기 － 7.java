import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        for(int k=0; k<count; k++){
            for(int i=count-k-1; i>0; i--){
                sb.append(" ");
            }
            
            for(int j=0; j<(2*k)+1; j++){ 

                sb.append("*");
            }
            
            sb.append("\n");
        } 
        for(int k=count-2; k>=0; k--){
            for(int i=count-k-1; i>0; i--){
                sb.append(" ");
            }
            for(int j=0; j<(2*k)+1; j++){

                sb.append("*");
            }
            sb.append("\n");
            
        } 
        System.out.println(sb);
    }
} 