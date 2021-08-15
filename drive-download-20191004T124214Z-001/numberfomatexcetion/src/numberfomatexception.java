
public class numberfomatexception {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] number= {"23","59","3.141592","456"};
		int i=0;
		
		try
		{
			for(i=0;i<number.length;i++) {
				int j = Integer.parseInt(number[i]);
				System.out.println("정수로 변환되는 값은  " + j);
			}
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(number[i]+" 는 정수로 변환될수 없습니다");
			
		}
		
		
	}

}
