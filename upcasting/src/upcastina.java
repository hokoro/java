class Person
{
	String name;
	String id;
	
	public Person(String name)
	{
		this.name =name;
		
	}
	
}

class Student extends Person
{

	String grade;
	String department;
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
public class upcastina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Person p = new Person("사후");		//객체 선언 아직 할당전
		 Student s = new Student("이재문");
		 
		 p=s;		//슈퍼 클래스를 서브클래스로 업캐스팅
		
		// s=(Student) p; 	//다운캐스팅
		 p.name="하루";			//업캐스팅한 p는 
		 s.grade = "김수은";
		 s.name = "김민걸";		//p의 string 을 사용가능
		 s.id ="ad";
		// p.grade ="60";
	}

}
