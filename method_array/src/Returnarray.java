/*메소드는 배열을 리턴하는 경우도 있다*/
public class Returnarray {

	static int[] makearray()
	{
		int temp[]= new int [4];
		for(int i=0;i<4;i++)
		{
			temp[i] =i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intarray[];
		intarray = makearray();		//배열의 시작주소가 배열을 리턴하는 메소드 함수를 가르킴
		for(int i=0;i<intarray.length;i++)
		{
			System.out.print(intarray[i]+" ");
			
		}
		
	}

}
