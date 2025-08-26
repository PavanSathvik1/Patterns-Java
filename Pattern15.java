import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n;i>0;i--){
            for(char ch='A';ch<='A'+i-1;ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
            scan.close();
        }
    }
}
