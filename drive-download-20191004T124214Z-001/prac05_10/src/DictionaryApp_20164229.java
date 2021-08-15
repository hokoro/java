
abstract class PairMap{					//추상 클래스 선언
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key,String value);
	
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap
{
	private int count =0;		//배열의 갯수 
	private int Catch =0;		//제가할 배열의 인덱스
	public Dictionary(int capacity)
	{
		keyArray = new String [capacity];				//키값과 값에 을 동적할당으로 받음
		valueArray = new String[capacity];
		
	}
	public String get(String key)			
	{
		for(int i=0;i<count;i++) {
			if(key.equals(keyArray[i]))										
			{
				return valueArray[i];
			}
			
		}
	 return null;
		
	}
	public void put(String key,String value)
	{
		int i =0;
		for(i=0;i<count;i++)
		{
			if(key.equals(keyArray[i]))
			{
				
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
			
		}
		keyArray[count] = key;
		valueArray[count] = value;
		count++;
	}
	public String delete(String key)
	{
		int i;
		String value = null;	//삭제할 채널의 String 변수
		for(i=0;i<keyArray.length;i++)
		{
			if(key.equals(keyArray[i]))
			{
				 Catch=i;				//삭제할데이터의 타겟을 catch 인덱스에 저장
				break;
			}
			
		}
		
		for(i=0;i<keyArray.length;i++)					//데이터의 삭제 작업
		{
			 value = valueArray[count];					//삭제할 데이터 저장
			keyArray[Catch] = null;						//기존에 삭제될 데이터의 원소를 null로 초기화
			valueArray[Catch] = null;
			return value;								//삭제한 데이터 반환
		}
		for(int j=count;j>-1;j--)				//배열의 원소 이동
		{
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		return value;	
	
	
		
		
		
	}
	public int length()
	{
		return count;
	}
}
public class DictionaryApp_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		//System.out.println(dic.length());
	}

}
