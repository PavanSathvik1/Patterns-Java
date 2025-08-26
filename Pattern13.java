import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        for (int i=0;i<n;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print(j+k +" ");
            }
            k+=i+1;
            System.out.println();
            scan.close();
        }
    }
}
