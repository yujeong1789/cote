import java.io.*;

public class baekjoon11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            String str=br.readLine();
            String[]arr=str.split(" ");
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);

            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }

        br.close();
        bw.close();
    }
}
