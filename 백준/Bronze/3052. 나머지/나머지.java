import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
        //set에 나머지값 넣고 갯수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++){
            int value = Integer.parseInt(br.readLine());
            set.add(value%42);
        }
        System.out.println(set.size());
		
	}
}