import Organism.Organism;

public class Plants extends Organism
{
	int rootLength;

	Plants(String name, String type, int rootLength)
	{
		super(name, type);
		this.rootLength = rootLength;
	}
	
	void setRootLength(int length)
	{
		this.rootLength = length;
		return;
	}

	int getRootLength()
	{
		return this.rootLength;
	}

	void printRootLength()
	{
		System.out.print(this.rootLength);
	}

}