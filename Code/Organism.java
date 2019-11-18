package Organism;

public class Organism
{	
	const int MAXFEATURES = 10;

	String name;
	String type;
	String notableFeatures[MAXFEATURES];
	int numberOfFeatures;

	Organism(String name, String type)
	{
		this.Name = name;
		this.type = type;
		this.numberOfFeatures = 0;
	}	

	void setName(String name)
	{
		this.Name = name;
		return;
	}

	void setType(String type)
	{
		this.type = type;
		return;
	}

	void addFeature(String feature)
	{
		if(this.numberOfFeatures < MAXFEATURES)
		{
			this.notableFeatures[this.numberOfFeatures] = feature;
			this.numberOfFeatures++;
		}
		else
			System.out.println(this.name, " already has enough features.");
		return;
	}


	String getName()
	{
		return this.name;
	}

	String getType()
	{
		return this.type;
	}


	void print
	{
		System.out.println(this.name, " is a ", this.type, " and features: ");
		this.printFeatures();
		return;
	}

	void printName()
	{
		System.out.println(this.name);
		return;
	}

	void printType()
	{
		System.out.println(this.type);
		return;
	}

	void printFeatures()
	{
		for(int i = 0; i < numberOfFeatures; i++)
		{
			System.out.println("-", this.notableFeatures[i]);
		}
		return;
	}
}