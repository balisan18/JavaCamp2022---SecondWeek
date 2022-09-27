package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		System.out.println(dortislem.topla(5, 5));
		dortislem.topla(5, 5, 5); // bu şekilde method overloading oluyor.

	}

}
