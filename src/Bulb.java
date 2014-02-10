public class Bulb
{
	public final static int DEFAULT_POWER = 100;

	private final int power;

	private boolean isLit;

	public Bulb()
	{
		this.power = DEFAULT_POWER;
		this.isLit = false;
	}

	public Bulb(int initialPower)
	{
		this.power = initialPower;
		this.isLit = false;
	}

	public void switchOn()
	{
		this.isLit = true;
	}

	public void switchOff()
	{
		this.isLit = false;
	}

	public int getpower()
	{
		return this.power;
	}

	public boolean isLit()
	{
		return this.isLit;
	}
}
