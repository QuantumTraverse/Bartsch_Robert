import java.util.ArrayList;
import java.util.Scanner;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	public ToyStore()
	{
		system.out.println("Why would you even do this?")
	}
	public ToyStore(String list)
	{
		this.loadToys(list)
	}
	public void loadToys(String list)
	{
		ArrayList<Toy> toys
		
		for(int i =0; i < toys.size; i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			if(.equals("null")
				toyList.add(name)
			else count++;
		}
	}
	public void getThatToy(String name)
	{
		for(toyList : toy)
		{
			if(toy.equals(name))
				return toy;
			else
				return "null";
		}
	}
	public getMostFrequentToy()
	{
		String name;
		int max = 0;
		for(toyList : Toy)
		{
			if(max < Toy.length())
			{
				max = Toy.length();
				name = Toy.getName();
			}
		}
	}
	public getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(toyList : Toy)
		{
			if(Toy.getType().equals("Car"))
				cars++;
			if(Toy.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(cars < figures)
			return "Action Figures";
		else
			return "Equal amounts";
	}
	public toString()
	{
		return toyList;
	}
}