import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=n;i>=1;i--){
            for(int g = 1;g<=n-i;g++){
                System.out.print("\t");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

}
