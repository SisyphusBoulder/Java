package ClassesObjects;

public class Main {

	public static void main(String[] args) {
		
		Product[] product = {new Product(001, "chicken", 5.01f, "poultry", 'B', 10f, true), 
							 new Product(002, "steak", 8.52f, "beef", 'A', 8f, false), 
							 new Product(003, "tuna", 3.27f, "fish", 'A', 15f, true)};
		
		for (Product p : product) {
			
			p.getProductInfo();
		}
		
		Product.getSellerInfo();
		
		//Deprecated
		/*product[0].id = 001;
		
		product[0].name = "chicken";
		
		product[0].price = 5.01f;
		
		product[0].category = "poultry";
		
		product[0].rating = 'B';
		
		product[0].discountPercentage = 10;
		
		product[0].isAvailable = true;
		
		product[1].id = 002;
		
		product[1].name = "steak";
		
		product[1].price = 8.52f;
		
		product[1].category = "beef";
		
		product[1].rating = 'A';
		
		product[1].discountPercentage = 8;
		
		product[1].isAvailable = false;
		
		product[2].id = 003;
		
		product[2].name = "tuna";
		
		product[2].price = 3.27f;
		
		product[2].category = "fish";
		
		product[2].rating = 'A';
		
		product[2].discountPercentage = 15;
		
		product[2].isAvailable = true;*/
		
		
		
		//Deprecated
		/*for (Product p : product) {
			
			System.out.println("ID : " + p.id);
			System.out.println("Item : " + p.name);
			System.out.println("Price : £" + p.price);
			System.out.println("Category : " + p.category);
			System.out.println("Rating : " +p.rating);
			System.out.println("Discount : " + p.discountPercentage + "%");
			System.out.println("Available : " + p.isAvailable);
			System.out.println("Discounted Price : " + p.discountPrice());
			
		}*/
		

	}

}
