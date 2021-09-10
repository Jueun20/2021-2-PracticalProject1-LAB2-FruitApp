package com.practicalproject.lab2.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.practicalproject.lab2.fruit.Fruit.FruitComparator;
import com.practicalproject.lab2.fruit.Fruit.FruitComparatorDesc;

public class Main {
	public static void main(String args[]){
		List<Fruit> arryFr = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit f1 = new Fruit(101, "Kiwi", 2000);
		arryFr.add(f1);
		Fruit f2 = new Fruit(102, "Apple", 1000);
		arryFr.add(f2);
		Fruit f3 = new Fruit(103, "Orange", 1500);
		arryFr.add(f3);
		Fruit f4 = new Fruit(104, "Tomato", 1800);
		arryFr.add(f4);
		Fruit f5 = new Fruit(105, "Grape", 5000);
		arryFr.add(f5);
		Fruit f6 = new Fruit(106, "Melon", 8000);
		arryFr.add(f6);
		Fruit f7 = new Fruit(107, "Banana", 4500);
		arryFr.add(f7);
		Fruit f8 = new Fruit(108, "Lemon", 3200);
		arryFr.add(f8);
		Fruit f9 = new Fruit(109, "Durio", 13000);
		arryFr.add(f9);
		arryFr.add(new Fruit(110, "Litchi", 31999));
		
		Collections.sort(arryFr, new FruitComparator());
		for (Fruit x : arryFr){
			System.out.println(x.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(arryFr, new FruitComparatorDesc());
		for (int i = 0; i < arryFr.size(); i ++){
			System.out.println(arryFr.get(i).toString());
		}
	}
}
