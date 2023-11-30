import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int bun = sc.nextInt();
        if(bun >= 45){
            bun = bun-45;
        }else {
            if(si == 0){
                si = 23;
            }else{
                si = si -1;
            }
            bun = 60+ (bun - 45);
        }
        System.out.println(si+" "+bun);
    }
}

