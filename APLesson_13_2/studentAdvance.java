public class studentAdvance extends advance
{
	public studentAdvance()
	{
		super();
	}
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
}