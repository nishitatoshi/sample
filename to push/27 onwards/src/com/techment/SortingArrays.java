package com.techment;
public class SortingArrays{
	
	int id;
	String name;
	double price;
	
	public SortingArrays(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	static class SortingArrays{
		
		public void main(String[] args) {
			
			
			Product product1 = new Product(101,"Mobile",30000.0);
			Product product2 = new Product(104,"Notebook",120.0);
			Product product3 = new Product(102,"Soap",50.0);
			Product product4 = new Product(103,"Toothpaste",100.0);
			Product product = new Product(105,"Coldrinks",80.0);
			
			
			
		}
		
	}
}