import java.util.Scanner;

/*try catch finally 를 통해 예외 처리문을  바꿔보쟈*/

public class try_catch_fin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		

		while(true)
		{
			System.out.print("나누는 수를 입력하시오");
			int dividend = s.nextInt();
			System.out.print("나눌수를 입력하시오");
			int divisor = s.nextInt();
			try		//try -catch 문은 무조건 중괄호가 들어가야합니다
			{
				System.out.println(dividend/divisor);
					break;			//정상적인 완료 면 break; 로 탈출
			}
			
			catch(ArithmeticException e)		//수리적 오류
			{
				System.out.println("0으로 나눌수 없습니다 다시 입력하세요");
				
			}
			
			
			
		}
		s.close();

	}

}
