/*
 * 강제 형변환의 특징
 * 1.변수에 타입이 변수에 데이터보다 작으면 큰타입으로 변환 (자동형변환)
 * 2.데이터 앞에 (datatype)data 강제 형변환
 * */
public class changetype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =127;
		int i =100;
		
		System.out.println(b+i);			//byte -> int 로 변환
		System.out.println(10/4);			//정수 나누기 이므로 2
		System.out.println(10.0/4);			//4->4.0으로 타입변환 결과는 2.5
		System.out.println((char)0x12340041);	//유니코드 -> char 형으로 변환
		System.out.println((int)2.9+1.8);		//2+1.8
		System.out.println((int)(2.9+1.8));		//4.7 -> 4
		System.out.println((int)2.9+(int)1.8);	// 2+1 3
		
		
		
		

	}

}
