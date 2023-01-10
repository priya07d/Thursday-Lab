package shoppingkartusingarraylist;

import java.util.Scanner;

//java bean
//product class to store product details
public class ProductLab {
	//public static Object getproductId;

	private int id;
	
    private String name;
    private String brand;
	private double price;
	private int stock;
	
	
	
	public ProductLab(int id, String name, String brand, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stock= stock;
	}


	public ProductLab() {
		super();
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setstock(int stock) {
		this.stock= stock;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=").append(name).append(", brand=").append(brand)
				.append(", price=").append(price).append(", stock=").append(stock).append("]");
		return builder.toString();
	}


	
}