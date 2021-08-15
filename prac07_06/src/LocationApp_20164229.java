import java.util.*;
class Location
{
	private String city;
	private double longitude,latitude;
	Location(String city,double longitude,double latitude)
	{
		this.city=city;
		this.latitude=latitude;
		this.longitude = longitude;
	}
	void printLocation()
	{
		System.out.println(city+"\t"+longitude+"\t"+latitude);
	}
}
class LocationManger
{
	Scanner scanner = new Scanner(System.in);
	HashMap<String ,Location> dept = new HashMap<String,Location>();
	private void read()
	{
		System.out.println("도시 경도 위도 를 입력하시오.");
		for(int i=0;i<4;i++)
		{
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String city = st.nextToken().trim();
			String log= st.nextToken().trim();
			String lat= st.nextToken().trim();
			double logittude = Double .parseDouble(log);
			double latitude = Double.parseDouble(lat);
			Location loc = new Location(city,logittude,latitude);
			dept.put(city, loc);
		}
	}
	private void printAll()
	{
		Set<String>keys = dept.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("---------------------------");
		while(it.hasNext())
		{
			String city =  it.next();
			Location loc = dept.get(city);
			loc.printLocation();
		}
		System.out.println("---------------------------");
	}
	private void processQuery()
	{
		while(true)
		{
			System.out.print("도시이름 >> ");
			String city = scanner.nextLine();
			if(city.equals("그만"))
			{
				return;
			}
			
				Location loc = dept.get(city);
				if(loc==null)
				{
					System.out.println(city + "없습니다");
				}
				else
				{
					loc.printLocation();
				}
			
		}
	}
	void run()
	{
		read();
		printAll();
		processQuery();
	}
}
public class LocationApp_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocationManger man = new LocationManger();
		man.run();

	}

}
