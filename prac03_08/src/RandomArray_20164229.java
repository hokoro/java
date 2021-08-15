import java.util.Scanner;
public class RandomArray_20164229 {
   public static boolean exits(int arrs[],int length,int r)      //기준 배열 현제 배열의 길이 난수의 값
   {
      for(int j=0;j<length;j++)
      {
         if(arrs[j]==r)
         return true;
      }
      return false;
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.print("정수 몇개?");
      Scanner scanner = new Scanner(System.in);
      
      int n = scanner.nextInt();      //정수형 데이터를 받는다
      if(n<1||n>100)
      {
         System.out.print("1~100 사이에 입력하시오");
         scanner.close();
         return;
      }
      int arr[] = new int [n];      //배열의 갯수 ==정수형 데이터의 수
      
      for(int i=0;i<arr.length;i++)
      {
         int r =(int)(Math.random()*100+1); //정수형 난수를 설정 (+1(1부터) *100(100)의 범위까지)
         if(exits(arr,i,r))		//객체들의 특징 초기화되는 배열 비교하는 배열의 갯수 난수 r
         {
            i--;
            continue;
         }
         arr[i]=r;
      }
      
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
         if((i+1)%10==0)
         {
            System.out.println();
         }
      }
      
      scanner.close(); 
      
   }

}