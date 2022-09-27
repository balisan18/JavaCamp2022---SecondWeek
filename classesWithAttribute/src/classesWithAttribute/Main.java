package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",10000,3,"Siyah");
		/*product.setName("Laptop");
		product.setId(1);
		product.setPrice(10000);  //paramerresiz constructor olarak kullanılmak istenirse böyle de kullanılabilir.
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);*/
		


		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());



	}

}
