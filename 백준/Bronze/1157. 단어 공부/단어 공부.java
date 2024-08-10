import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];
        for(char c: str.toCharArray()){
            arr[c-65] += 1;
        }
        int max = -1;
        char result = '?';
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max) {
                result = '?';
            }
            else if(arr[i]>max) {
                max = arr[i];
                result = (char)(i+65);
            }
        }
        System.out.println(result);
    }
} 