package daily_qus;

public class car_salse {
	public static void main(String[]args) {
	int carID1=1;
	int carID2=2;
	int carID3=3;
	//String cartype1="small car";
	//String cartype2="van";
	//String cartype3="suv";
	float rent1=800f;
	float rent2=1000f;
	float rent3=1500f;
	
	Rent.getrent();
	
	}
}
 
class car_ID{
	public void getcar_ID() {
		int carID1=1;
		int carID2=2;
		int carID3=3;
	}
}

class car extends car_ID {
	public static void getcar() {
		String cartype1="small car";
		String cartype2="van";
		String cartype3="suv";
		System.out.println("Small car");
		System.out.println("van");
		System.out.println("suv");
	}
	
class Rent extends car{
	public static void getrent() {
		float rent1=800f;
		float rent2=1000f;
		float rent3=1500f;
	System.out.println("rent was"+rent1);
	System.out.println("rent was"+rent2);
	System.out.println("rent was"+rent3);
}
}

class choesr_your_car{
	public void Showcar(){
		
	}
}
}


