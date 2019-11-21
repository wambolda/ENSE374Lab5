import Organism.Organism;

public class Animals extends Organism
{
	private static final int MAXPREY = 10;
	String[] eats = new String[MAXPREY];
	int numberOfPrey;
	String foodType;
		
	Animals(String name, String type, String foodType)
	{
		super(name, type);
		numberOfPrey = 0;
		this.foodType = foodType;
	}
		
	void addFood(String food)
	{
		if(this.numberOfPrey < MAXPREY)
		{
			this.eats[this.numberOfPrey] = food;
			this.numberOfPrey++;
		}
		else
			System.out.println(this.name + " has too many prey.");
		return;
	}
	
	void setFoodType(String typeOfFood)
	{
		this.foodType = typeOfFood;
		return;
	}
	/*
	void print()
	{
		System.out.println(this.name + " is a " + this.type + " and has ");
		for(int i = 0; i < numberOfFeatures; i++)
		{
			System.out.println("-" + this.notableFeatures[i]);
		}
		this.printEats();
		return;
		
	}
	*/
	void printEats()
	{
		System.out.println("This animal eats:");
		for(int i = 0; i < numberOfPrey; i++)
		{
			System.out.println("-" + this.eats[i]);
		}
		return;
	}
	
	void printFoodType()
	{
		System.out.print(this.foodType);
		return;
	}
	
}