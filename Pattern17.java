import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

        for(int i=0;i<n;i++){
            for (int j=1;j<=n-i-1;j++){
                System.out.print("  ");
            }
            char ch='A';
            int num = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch + " ");
                if(j<=num) ch++;
                else  ch--;
            }
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
            scan.close();
        }

    }
}
