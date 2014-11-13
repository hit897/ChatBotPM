package ChatBot.model;

public class ChatbotUser
{
	// Four Data Memebers
	// At least two different types. (String, int, boolean, double...)
	private String userName;
	private int age;
	private boolean hasTattoos;
	private boolean needsCorrectiveLenses;

	/**
	 * Initializes the Values for the Data Members
	 */
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -999;
		this.hasTattoos = false;
		this.needsCorrectiveLenses = false;
	}
	
	
	public String getUserName()
	{
		return userName;
	}

	public int getAge()
	{
		return age;
	}

	public boolean getHasTattoos()
	{
		return hasTattoos;
	}

	public boolean getNeedsCorrectiveLenses()
	{
		return needsCorrectiveLenses;
	}

	public void setNeedsCorrectiveLenses(boolean needsCorrectiveLenses)
	{
		this.needsCorrectiveLenses = needsCorrectiveLenses;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	public void setHasTattoos(boolean hasTattoos)
	{
		this.hasTattoos = hasTattoos;
	}

}