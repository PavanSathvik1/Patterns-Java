import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            for (int j=n-i;j<=n;j++){
                System.out.print((char)(int)('A'+j-1) + " ");
            }
            System.out.println();
            scan.close();
        }
    }
}
