package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Cow());
		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Duck());
		farm.add(new Duck());
		farm.add(new Sheep());
		
		for(Animal animal : farm) {
			animal.makeNoise();
			animal.walk();
		}
	}
}
