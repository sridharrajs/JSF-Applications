package model;


public class User
{
	private String	name;
	private String	password;

	public String login()
	{
		String returnVal = Constants.FAILURE;

		if (name.equalsIgnoreCase(Constants.USER_NAME)
				&& password.equalsIgnoreCase(Constants.PASSWORD))
		{
			returnVal = Constants.SUCCESS;
		}

		return returnVal;
	}

	public final String getName()
	{
		return name;
	}

	public final void setName(final String name)
	{
		this.name = name;
	}

	public final String getPassword()
	{
		return password;
	}

	public final void setPassword(final String password)
	{
		this.password = password;
	}

}
