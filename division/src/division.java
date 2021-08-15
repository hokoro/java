import java.util.Scanner;
public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("2자리수 정수 입력(10~99)>>");
		int num = scan.nextInt();
		int divide = num/10;
		int division = num%10;
		if(divide == division)
		System.out.println("yes! 10의 자리와 1의 자리가 같습니다 ");
		else
		System.out.println("no! 10자리와 1의 자리가 같지않습니다");
	}

}
