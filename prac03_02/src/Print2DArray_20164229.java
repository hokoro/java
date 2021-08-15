public class Print2DArray_20164229 {

   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};		//배열의 초기화
      for(int i=0;i<n.length;i++)			
      {
         for(int j=0;j<n[i].length;j++)		//기준행에 열에 길이를 계산 = n[i].length
         {
            System.out.print(n[i][j] +"\t");
         }
         System.out.println();		//줄바꾸기

      }
      
      
   }

}