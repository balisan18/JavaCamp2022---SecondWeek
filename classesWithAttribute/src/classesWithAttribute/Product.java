package classesWithAttribute;

public class Product {
	public Product(int id,String name,String discription,double price,int stockAmount,String renk) {
		System.out.println("Yapıcı blog çalıştı.");
		this.id=id;
		this.renk=renk;
		this.price =price;
		this.name=name;
		this.stockAmount=stockAmount;
		this.description=description;
		this.kod=kod;
		
	}
	public Product() {
		// parametresiz constructor olarak kullanılabilir.
	}

	// başlarında public var her yerden erişilebilinir.
	// attribute veya field denir.
	private int id; // başlarına private eklenince sadece tanımlandığı blogda geçerli demek oluyor.
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter denir.
	public int getId() {
		return id;
	}

	// setter denir.
	public void setId(int id) {
		this.id = id;// bu idi ile diğeri karışmasın diye diğerlerinin başına _ koyuyorum.
		// içinde buluduğun classın id si demektir.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
