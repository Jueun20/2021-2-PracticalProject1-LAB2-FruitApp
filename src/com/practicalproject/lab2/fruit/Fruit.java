package com.practicalproject.lab2.fruit;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit (int num, String nm, int pr){
		this.no = num;
		this.name = nm;
		this.price = pr;
	}
	
	static class FruitComparator implements Comparator<Fruit> {
		public int compare(Fruit f1, Fruit f2){
			return f1.name.compareTo(f2.name);
		}
	}
	
	static class FruitComparatorDesc implements Comparator<Fruit> {
		public int compare(Fruit f1, Fruit f2){
			return f2.name.compareTo(f1.name);
		}
	}
	
	public String toString(){
		return "Fruit [no = " + no + ", name = " + name + ", price = " + price + "]";
	}
}
