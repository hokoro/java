import java.util.Scanner;
public class PrintAlphabet_20164229 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.print("소문자 알파벳 하나를 입력하시오");
      Scanner scanner  = new Scanner(System.in);      //입력값을 받기
      
      String s = scanner.next();   //문자열을 입력받는 공식
      
      if(s.length()!=1)
      {
         System.out.print("알파벳 하나만 입력해야 합니다");
          scanner.close();      //scanner  닫기
          return;   //문자열 길이는 리턴 값이 존재하지 않음
      }
      char c =s.charAt(0);      //문자열 중에 첫번째 원소 즉 문자의 값을 저장
      if(c<'a'||c>'z')
      {
         System.out.print("소문자 알파벳이 아닙니다");
         scanner.close();
         return;
      }
      
      for(char i =c;'a'<=i;i--)
      {
         for(char j ='a';j<=i;j++)         //문자열   c를 감소하여  c의 범위를 감소
         {
            System.out.print(j);
         }
         System.out.println();//줄바꾸기
      }
   
      scanner.close();
   }
   

}