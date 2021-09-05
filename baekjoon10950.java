import java.util.Scanner;

public class baekjoon10950 {
    /*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0; i<t; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }
}
