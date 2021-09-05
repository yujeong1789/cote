import java.util.Scanner;

public class baekjoon8393 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int j=0;
        for(int i=1; i<=n; i++){
            j+=i;
        }
        System.out.println(j);
        sc.close();
    }    
}
