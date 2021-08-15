
public class for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int [5];
		for(int k :n)		//for(증감 인덱스 : 배열레퍼런스)
		{
		
			n[k] = k;
			
			System.out.println(n[k]);
			
		}

	}

}
