/**
 * Represente une lampe caracterisee par sa puissance et si elle est allumee ou
 * non
 * 
 * @author weissene
 * 
 */
public class Bulb
{
	/**
	 * Puissance par defaut de la lampe
	 */
	public final static int DEFAULT_POWER = 100;

	/**
	 * Puissance de la lampe
	 */
	private final int power;

	/**
	 * Le fait qu'elle soit allumee ou non
	 */
	private boolean isLit;

	/**
	 * Construit une lampe par defaut eteinte
	 */
	public Bulb()
	{
		this.power = DEFAULT_POWER;
		this.isLit = false;
	}

	/**
	 * Construit une lampe eteinte et avec
	 * 
	 * @param initialPower
	 *            comme puissance
	 */
	public Bulb(int initialPower)
	{
		this.power = initialPower;
		this.isLit = false;
	}

	/**
	 * Allume la lampe
	 */
	public void switchOn()
	{
		this.isLit = true;
	}

	/**
	 * Eteint la lampe
	 */
	public void switchOff()
	{
		this.isLit = false;
	}

	/**
	 * Renvoi la puissance de la lampe
	 */
	public int getpower()
	{
		return this.power;
	}

	/**
	 * Renvoi l'etat de la lampe
	 */
	public boolean isLit()
	{
		return this.isLit;
	}
}
