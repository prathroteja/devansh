package in.jam;

//public class Car extends Engine{

public class Car {
	IEngine eng; // field injection
	
	//private IEngine eng;
	
//	public Car(IEngine eng) { //constructor
//		this.eng=eng;
//	}
//	
//	public void setEng(IEngine eng) { // setter onjection
//		this.eng=eng;
//	}
//	
	public void drive() {
		
		
		
		int status=eng.start();
		
		if(status>= 1) {
			System.out.println("journey started");
		}else {
			{
				System.out.println("journey not started");
			}
		}
	}

	

}
