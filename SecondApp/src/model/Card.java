package model;

import java.util.Random;
import org.apache.log4j.*;


public class Card
{
	private int	left;
	private int	right;
	private int	result	= 0;
	private static Logger logger = Logger.getLogger("Card.class");

	public Card()
	{
		final Random random = new Random();
		int outer = 0;
		int inner = 0;
		do
		{
			outer = random.nextInt(Constants.TEN);
		} while (outer <= Constants.FOUR);

		do
		{
			inner = random.nextInt(Constants.HUNDERED);
		} while (inner <= Constants.TWENTY);

		left = outer;
		right = inner;
	}

	public String show()
	{
		result = left * right;
		return Constants.SUCCESS;
	}

	public String clear()
	{
		result = 0;
		logger.info("Clear button clicked");
		return "clear";
	}

	public final int getLeft()
	{
		return left;
	}

	public final void setLeft(final int left)
	{
		this.left = left;
	}

	public final int getRight()
	{
		return right;
	}

	public final void setRight(final int right)
	{
		this.right = right;
	}

	public final int getResult()
	{
		return result;
	}

	public final void setResult(final int result)
	{
		this.result = result;
	}

}
