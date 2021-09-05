import java.io.*;

public class baekjoon11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            String nums=br.readLine();
            String[]arr=nums.split(" ");
            int x=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
            bw.write("Case #"+i+": "+x+"\n");

            /*int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            bw.write("Case #"+i+": "+(a+b)+"\n");*/
        }

        br.close();
        bw.close();
    }
}
