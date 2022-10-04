import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = (n/2)+1;
        int g = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=s;j++){
                System.out.print("*\t");
            }
            for (int k = 1;k<=g;k++){
                System.out.print("\t");
            }
            for(int j = 1;j<=s;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                s--;
                g+=2;
            }
            else{
                s++;
                g-=2;
            }
            System.out.println();

        }
    }
}
