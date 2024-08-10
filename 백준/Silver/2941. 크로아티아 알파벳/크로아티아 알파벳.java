import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = br.readLine();
        int count =0;
        for(String s : str_arr){
            while(word.contains(s)) {
                count++;
                word = word.replaceFirst(s, "*");
            }
        }
        count += word.replace("*","").length();
        System.out.println(count);
    }
} 