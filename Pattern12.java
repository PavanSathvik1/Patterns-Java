import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j + " ");
            }
            for(int m=1;m<=((2*(n-i))-2);m++){
                System.out.print("  ");
            }
            for(int o=i+1;o>0;o--){
                System.out.print(o + " ");
            }
        System.out.println();
        scan.close();
        }
    }
}
