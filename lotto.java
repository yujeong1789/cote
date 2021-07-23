import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class lotto {
   public static void main(String[] args) {
      System.out.print("로또번호 추출 개수 : ");
      Scanner sc = new Scanner(System.in);
      int userNum = sc.nextInt();

      for (int i = 1; i <= userNum; i++) {
         System.out.println(i + "번째 :" + lottoNumbers());
      }

      sc.close();
   }

   static String lottoNumbers() {
      Set<Integer>set = new HashSet<Integer>();

      while(set.size() != 6){
         set.add((int)(Math.random() * 45 + 1));
      }

      List<Integer> list = new ArrayList<Integer>(set);
      Collections.sort(list);

      return list.toString();
   }
}