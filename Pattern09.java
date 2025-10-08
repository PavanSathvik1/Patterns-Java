import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String k = " ";
        String s = "*";
        for (int i=1;i<=n;i++){
            System.out.print(k.repeat(n-i)+s.repeat(i+i-1));
        System.out.println();
        }
        for(int i=n;i>0;i--){
            System.out.print(k.repeat(n-i)+s.repeat(i+i-1));
        System.out.println();
        scan.close();
        }

    }
}
