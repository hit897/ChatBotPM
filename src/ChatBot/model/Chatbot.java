package ChatBot.model;

import java.util.ArrayList;

/**
 * The Chatbot is used for checking and manipulating Strings.
 * 
 * @author Brandon
 * @version 9/26/14
 */
public class Chatbot
{
	// <> Means Data Types
	// Private means only Chatbot can access it.
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;

	/**
	 * The constructor constructs a Chatbot object with the supplied name, and
	 * initializes the number of chats to zero.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 */
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
	}

	/**
	 * Returns the name of the Chatbot Object.
	 * 
	 * @return The current name of the Chatbot
	 */

	public String getname()
	{
		return name;
	}

	/**
	 * It get's the chat count.
	 * 
	 * @return
	 */
	public int gethatCount()
	{
		return chatCount;
	}

	/**
	 * This set's Chatbot's name.
	 * 
	 * @param name
	 *            The name Chatbot gets set to. The new name of the ChatBot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	private void fillTheMemeList()
	{
		memeList.add("Kitties");
		memeList.add("Doge");
		memeList.add("Anti-Joke Chicken");
		memeList.add("Joseph Ducreux");
		memeList.add("Good Guy Greg");
		memeList.add("Never Alone");
		memeList.add("Forever Alone");
	}

	/**
	 * Processes input from the user against the checker methods. Returns the
	 * next output for the view.
	 * 
	 * @param currentInput
	 *            The supplied text.
	 * @return The processed text based on checker.
	 */
	public String processText(String currentInput)
	{
		String result = "";

		int randomPosition = (int) (Math.random() * 3);

		if (currentInput != null && currentInput.length() > 0)
		{
			if (randomPosition == 0)
			{
				if (lengthChecker(currentInput))
				{
					result = "Woot!  YOU KNOW MY SECRETS??";
				}
				else
				{
					result = "That's not my secret. :/";
				}
			}
			else if (randomPosition == 1)
			{
				if (contentChecker(currentInput))
				{
					result = "Hey!! I love Mistborn!";
				}
				else
				{
					result = "different content";
				}
			}
			else
			{
				if (memeChecker(currentInput))
				{
					result = "WOW! " + currentInput + " IS ONE OF MA FAV MEMES!";
				}
				else
				{
					result = "not a meme, try again";
				}
			}
		}
		else
		{
			result = "Don't just hit ok!";
		}
		return result;
	}

	/**
	 * This updates the ChatCount, AKA the number of times you've chatted.
	 */
	private void updateChatCount()
	{
		chatCount++;
	}

	private boolean memeChecker(String input)
	{
		boolean isaMeme = false;

		for (String currentMeme : memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isaMeme = true;
			}
			return isaMeme;

		}
		return isaMeme;
	}

	private boolean lengthChecker(String input)
	{
		boolean isfour = false;

		if (input.length() >= 20)
		{
			isfour = true;
		}
		return isfour;
	}
	/**
	 * 
	 * @param input This is the input from the textbox.
	 * @return It returns True if it contains what we said it did.
	 */
	private boolean contentChecker(String input)
	{
		boolean doescontain = false;

		if (input.contains("Mistborn"))
		{
			doescontain = true;
		}
		return doescontain;
	}

	/**
	 * This is what checks if it's ok to for the program to quit, by checking
	 * the input.
	 * 
	 * @param input
	 *            This is the input from the textbox.
	 * @return True or False. True for "exit" "yes" or "quit".
	 */

	public boolean quitChecker(String input)
	{
		boolean oktoQuit = false;

		if (input.equalsIgnoreCase("exit"))
		{
			oktoQuit = true;
		}
		if (input.equalsIgnoreCase("yes"))
		{
			oktoQuit = true;
		}
		if (input.equalsIgnoreCase("quit"))
		{
			oktoQuit = true;
		}
		return oktoQuit;
	}
}
