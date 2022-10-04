import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;

        int g = 2*n - 3;
        for (int i = 1 ; i<=n;i++){
            int v = 1;
            for(int j = 1;j<=st;j++){
                System.out.print(v + "\t");
                v++;
            }
            for(int k = 1;k<=g;k++){
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                v--;
            }
            for(int j = 1;j<=st;j++){
                v--;
                System.out.print(v + "\t");
            }
            st++;
            g-=2;
            System.out.println();
        }
    }
}
