package in.jam;

public class App {
	public static void main(String[] args) {
		//Car c= new Car(new PetrolEngine());//constr
		Car c =new Car();
		//c.setEng(new DieselEngine());// setter method
		c.eng = new DieselEngine();// field injectin
		c.drive();
	}

}
