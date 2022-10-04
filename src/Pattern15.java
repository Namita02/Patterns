import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int g = n/2;
        int v = 1;
        int val = 1;
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=g;j++){
                System.out.print("\t");
            }
            int cval = val;
            for(int k = 1;k<=v;k++){
                System.out.print(cval + "\t");
                if(k<=v/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<=n/2){
                g--;
                val++;
                v+=2;
            }
            else{
                g++;
                val--;
                v-=2;
            }
            System.out.println();
        }
    }
}
