package ChatBot.model;

/**
 * The Chatbot is used for checking and manipulating Strings.
 * @author Brandon
 *@version 9/26/14
 */
public class Chatbot
{
	private String name;
	private int chatCount;
	
	/**
	 * The constructor constructs a Chatbot object with the supplied name, and initializes the number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	
	/**
	 * Returns the name of the Chatbot Object.
	 * @return The current name of the Chatbot
	 */
	
	public String getname()
	{
		return name;
	}
	
	/**
	 * It get's the chat count.
	 * @return
	 */
	public int gethatCount()
	{
		return chatCount;
	}
	
	/**
	 * This set's Chatbot's name.
	 * @param name The name Chatbot gets set to.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * This updates the ChatCount, AKA the number of times you've chatted.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}
	/**
	 * This is what checks if it's ok to for the program to quit, by checking the input.
	 * @param input This is the input from the textbox.
	 * @return True or False.  True for "exit" "yes" or "quit".
	 */
	public boolean quitChecker(String input)
	{
		boolean oktoQuit = false;
		
		if(input.equalsIgnoreCase("exit"))
		{
			oktoQuit = true;
		}
		if (input.equalsIgnoreCase("yes"))
		{
			oktoQuit = true;
		}
		if(input.equalsIgnoreCase("quit"))
		{
			oktoQuit = true;
		}
		return oktoQuit;
	}
}
