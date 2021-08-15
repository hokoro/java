import java.util.Scanner;
public class dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("원화를 입력하시오 >>(단워 원)");
		int won = scan.nextInt();
		double dollor = won/1100;
		System.out.println(won+"원은"+'$'+dollor +"입니다");
	}

}
