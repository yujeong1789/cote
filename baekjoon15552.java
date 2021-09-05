import java.io.*;

public class baekjoon15552 {
    //Scanner, Sysout 사용x
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String ab=br.readLine();
            String[]arr=ab.split(" "); //공백을 기준으로 나눔
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);

            bw.write(a+b+"\n");
        }

        br.close();
        bw.close();
    }
}
