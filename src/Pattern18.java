import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {


    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int g = 0;
    int s = n;
    for(int i = 1 ; i<=n ; i++){
        for(int j = 1;j<=g;j++){
            System.out.print("\t");
        }
       for(int j = 1;j<=s;j++){
           if(i>1 && i<=n/2 && j>1 && j<s){
               System.out.print("\t");
           }else {
               System.out.print("*\t");
           }
       }
       if(i<=n/2){
           g++;
           s -=2;
       }
       else{
           g--;
           s+=2;
       }
        System.out.println();
        }
    }
}
