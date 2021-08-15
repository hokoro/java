
public class squr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char [5][5];
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j] = 'a';
			}
			
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}

		//자바에서는 불규칙한 이차원 배열을 만들수 있고 자유롭게 초기화 항수 있다 
		int intarray[][] = new int [4][];
		intarray[0]= new int [4];
		intarray[1]= new int [1];
		intarray[2]= new int [1];
		intarray[3]= new int [4];
		int k=0;
		for(int i=0;i<intarray.length;i++)
		{
			for(int j=0;j<intarray[i].length;j++,k++)
			{    
				intarray[i][j] = k;
			}
		}
		for(int i=0;i<intarray.length;i++)
		{
			for(int j=0;j<intarray[i].length;j++)
			{
				System.out.print(intarray[i][j]+" "); 
			}
			System.out.println();
		}
	}
	

}
