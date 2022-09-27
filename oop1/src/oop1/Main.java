package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setDiscount(7500);
		product1.setUnitPrice(3);
		product1.setImageUrl("image.jpg");


		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setDiscount(7500);
		product2.setUnitPrice(3);
		product2.setImageUrl("image2.jpg");


		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setDiscount(7500);
		product3.setUnitPrice(3);
		product3.setImageUrl("image3.jpg");


		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>"); 
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("05222222222");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporetCustomer  corporateCustomer  = new CorporetCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0555555555");
		corporateCustomer.setTaxtNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
			
		}
		


	}

}
