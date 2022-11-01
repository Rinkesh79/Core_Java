package GroceryShop;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public interface Methods {
	

	
	public boolean AddProduct(ProductDTO dto);
	
	 public String removeProductByCompanyName(String nameOfProduct ,String companyname);
	 
	 
	 public TreeSet<Object> getAllProductByCompanyName(String companyname);
	 
	 
	 public HashSet<Object> getAllProductBynameofproduct(String nameOfProduct);
	 
	 public int totalNumberOfProduct();
	 
	 public List getAllVegProduct();
	 
	 public LinkedList getAllNonVegProduct();
	 
	 public void showAllProduct();
}
