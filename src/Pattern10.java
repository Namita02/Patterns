import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int g=n/2;
        int sp = -1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=g;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int k = 1;k<=sp;k++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            if(i<=n/2){
                g--;
                sp+=2;
            }
            else {
                g++;
                sp-=2;
            }
            System.out.println();
        }

    }
}
