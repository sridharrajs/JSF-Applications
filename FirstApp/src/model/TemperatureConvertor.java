package model;

public class TemperatureConvertor
{
	private double	celsius;
	private double	fahrenheit;
	private boolean	initial	= true;
	private static final  double THIRTY_TW0=32;
	private static final  double FIVE_BAR_NINE=1.8;

	public final String reset()
	{
		initial=true;
		fahrenheit=0;
		celsius=0;
		return "reset";
	}

	public final String celsiusToFrah()
	{
	initial=false;
	fahrenheit=(celsius*FIVE_BAR_NINE)+THIRTY_TW0;
	return "calculated";
	}
	
	public final double getCelsius()
	{
		return celsius;
	}

	public final void setCelsius(final double celsius)
	{
		this.celsius = celsius;
	}

	public double getFahrenheit()
	{
		return fahrenheit;
	}

	public final void setFahrenheit(final double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
	}

	public boolean isInitial()
	{
		return initial;
	}

	public final void setInitial(final boolean initial)
	{
		this.initial = initial;
	}

}
