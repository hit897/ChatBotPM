package ChatBot.model;

public class Chatbot
{
	private String name;
	private int chatCount;
	
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	public String getname()
	{
		return name;
	}
	
	public int gethatCount()
	{
		return chatCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
}
