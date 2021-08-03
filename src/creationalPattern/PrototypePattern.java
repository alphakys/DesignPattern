package creationalPattern;

import java.util.Hashtable;
//Prototype Class
abstract class Product implements Cloneable{
	
	private String sku;
	private String description;
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getsku() {
		return sku;
	}
	
	public void setDescription(String s) {
		 this.description = s;
	}
	
	public void setsku(String s) {
		this.sku = s;
	}	
	
}

//concrete prototype to clone
class Book extends Product{
	private int numberOfPages;
	
	public int getNumberPages() {
		return numberOfPages;
	}
	
	public void setNumberPages(int i) {
		numberOfPages = i;
	}
}


//concrete prototype to clone
class DVD extends Product{
	private int duration;
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int i) {
		duration = i;
	}
	
}



public class PrototypePattern {
	Hashtable<String, Product> productMap = new Hashtable<>();
	
	public Product getProduct(String productCode) {
		Product cacheProduct = (Product)productMap.get(productCode);
		
		return (Product)cacheProduct.clone();
 	}
	
	public void loadCache() {
		//for each product run expensive query and instantiate
		//product productMap.put(productKey, product);
		//for exemplification, we add only two products
		Book b1 = new Book();
		b1.setDescription("Oliver Twist");
		b1.setsku("B1");
		b1.setNumberPages(100);
		productMap.put(b1.getsku(), b1);
		
		DVD d1 = new DVD();
		d1.setDescription("Superman");
		d1.setsku("D1");
		d1.setDuration(180);
		productMap.put(d1.getsku(), d1);
	}
	
	public static void main(String[] args) {
		PrototypePattern pp = new PrototypePattern();
		pp.loadCache();
		Book cloneBook = (Book)pp.getProduct("B1");
		
		
	}
	
}



















