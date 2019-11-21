//package Organism;
import java.util.Scanner;
import Organism.Organism;
import java.util.Random; 


public class World
{

	static public int numAnimals = 10;
	static public Animals[] allAnimals = new Animals[numAnimals];
	static public int numPlants = 2;
	static public Plants[] allPlants = new Plants[numPlants];
	static public int worldDimension = 50;
	static public Organism[][] world = new Organism[worldDimension][worldDimension];
	
	
	public static void main(String[] args)
	{
		initAnimals();
		initPlants();
		initWorld(numAnimals, numPlants);
		printWorld();
	}
	
	//Animals(String name, String type, foodType)
	static void initAnimals()
	{
		allAnimals[0] = new Animals("caterpillar", "Insect", "Herbivore");
		allAnimals[1] = new Animals("Bluejay", "Aves", "Omnivore");
		allAnimals[2] = new Animals("GrassHopper", "Insect", "Herbivore");
		allAnimals[3] = new Animals("Mouse", "Mammal", "Omnivore");
		allAnimals[4] = new Animals("Rabbit", "Mammal", "Herbivore");
		allAnimals[5] = new Animals("Deer", "Mammal", "Herbivore");
		allAnimals[6] = new Animals("Squirrel", "Mammal", "Herbivore");
		allAnimals[7] = new Animals("Fox", "Mammal", "Omnivore");
		allAnimals[8] = new Animals("Wolf", "Mammal", "Carnivore");
		allAnimals[9] = new Animals("Hawk", "Aves", "Carnivore");
	}
	
	//Plants(String name, String type, int rootLength)
	static void initPlants()
	{
		allPlants[0] = new Plants("Trees/ Shrubs","Perennial",60);
		allPlants[1] = new Plants("Grass","Herbaceous", 3);
	}
	
	static void initWorld(int numberOfAnimals, int numberOfPlants)
	{
		Random rand = new Random();
		int randomType = 0;
		int randomOrg = 0;
		int totalOrganisms = numberOfAnimals + numberOfPlants;
		System.out.println("Number of Organisms = " + totalOrganisms);
		for(int i = 0; i < worldDimension;i++)
		{
			for(int j = 0; j < worldDimension; j++)
			{	
				randomType = rand.nextInt(1);
				if(randomType > 0) // Plant
				{
					randomOrg = rand.nextInt(1);
					world[i][j] = allPlants[randomOrg];
				}
				else // Animal
				{
					randomOrg = rand.nextInt(9);
					world[i][j] = allAnimals[randomOrg];
				}
				
			}
		}
	}
	
	static void printWorld()
	{
		for(int i = 0; i < worldDimension;i++)
		{
			for(int j = 0; j < worldDimension; j++)
			{	
				System.out.print("At " + i + ", " + j + " there is a " );
				world[i][j].printName();
				System.out.print("which is a ");
				world[i][j].printType();
				System.out.println();
				
			}
		}
	}
	

	
}