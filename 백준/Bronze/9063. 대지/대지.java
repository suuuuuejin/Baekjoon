import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        int x_max = -100000;
        int x_min = 100000;
        int y_max = -100000;
        int y_min = 100000;
        for(int i= 0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x>x_max) x_max = x;
            if(x<x_min) x_min = x;
            if(y>y_max) y_max = y;
            if(y<y_min)y_min = y;
        }
        int result = (x_max - x_min) * (y_max - y_min);
        System.out.println(result);
	}
}

