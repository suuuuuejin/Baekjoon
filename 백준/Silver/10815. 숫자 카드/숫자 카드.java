//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> card = new ArrayList<>();
            for(int i = 0; i<n; i++){
                Integer a = Integer.parseInt(st.nextToken());
                card.add(a);

            }

            int m = Integer.parseInt(br.readLine());
            int[] arr = new int[m];
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j<m; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Collections.sort(card);

            for(int k=0; k<m; k++) {
                int result = Collections.binarySearch(card, arr[k]);
                if (result >= 0) System.out.print("1 ");
                else System.out.print("0 ");
            }

        }
    }

