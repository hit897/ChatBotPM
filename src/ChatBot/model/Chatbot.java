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
	private ChatbotUser myUser;
	private ArrayList<String> userInputList;

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
		userInputList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
		myUser = new ChatbotUser();
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
	public int getChatCount()
	{
		return chatCount;
	}
	/**
	 * It's a get method for MyUser
	 * @return
	 */
	public ChatbotUser getMyUser()
	{
		return myUser;
	}
	/**
	 * It's a set method for MyUser.  Sets myUser to "myUser".
	 * @param myUser
	 */
	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	/**
	 * This set's Chatbot's name.
	 * "name" is the new name of the ChatBot.
	 * @param name
	 * 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * This fills the Array called MemeList.
	 */
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
		String result = "Things didn't work out the way they should've...IT'S BORKED.";

		if (getChatCount() < 2)
		{
			result = introduceUser(currentInput);
		}
		else if (currentInput != null && currentInput.length() > 0)
		{
			result = randomChatConversation(currentInput);
		}
		else
		{
			result = "Don't just hit ok!";
			chatCount--;
		}
		updateChatCount();
		return result;
	}
	/**
	 * Introducing the user, just talks about what they're saying about themselves.
	 * @param input
	 * @return
	 */
	private String introduceUser(String input)
	{
		String userQuestion = "";

		// ask Questions about all data members
		if (getChatCount() == 0)
		{
			myUser.setUserName(input);
			userQuestion = "Good Name.  How old are you?";

		}

		else if (getChatCount() == 1)
		{
			int userAge = Integer.parseInt(input);
			myUser.setAge(userAge);
			userQuestion = "HOLD THE PHONE.  You're Pretty Old!";
		}

		return userQuestion;
	}

	private String randomChatConversation(String input)
	{
		String conversation = "";

		int randomPosition = (int) (Math.random() * 7);

		if (randomPosition == 0)
		{
			if (lengthChecker(input))
			{
				conversation = "Woot!  YOU KNOW MY SECRETS??";
			}
			else
			{
				conversation = "That's not my secret. :/";
			}
		}
		else if (randomPosition == 1)
		{
			if (contentChecker(input))
			{
				conversation = "Hey!! I love Mistborn!";
			}
			else
			{
				conversation = "different content";
			}
		}
		else if (randomPosition == 2)
		{
			if (contentChecker2(input))
			{
				conversation = "Yes, sir, you are the user...";
			}
			else
			{
				conversation = "I think you meant to say something about being \"The User\" ";
			}
		}
		else if (randomPosition == 3)
		{
			if (memeChecker(input))
			{
				conversation = "WOW! " + input + " IS ONE OF MA FAV MEMES!";
			}
			else
			{
				conversation = "not a meme, try again";
			}
		}
		else if (randomPosition == 4)
		{
			// Add to our list
			userInputList.add(input);
			conversation = "Added to the list...";
		}
		else if (randomPosition == 5)
		{
			if (userInputChecker(input))
			{
				conversation = "That was nice - you REMOVED IT FROM THE LIST.";
			}
			else
			{
				conversation = "Hey, that wasn't in the conversation before...";
			}
		}
		else if (randomPosition == 6)
		{
			if (mashChecker(input))
			{
				conversation = mashingDetected(input);
			}
			else
			{
				conversation = noMashingDetected(input);
			}
		}
		else
		{
			conversation = "not...possible...";
		}
		return conversation;
	}

	private String mashingDetected(String input)
	{
		String mashed = "";

		mashed = input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);
		mashed += input.substring(input.length() / 2);

		return mashed;
	}

	private String noMashingDetected(String input)
	{
		String noMashing = "Thanks for not mashing your keyboard, N00b";

		if (input.length() > 1)
		{
			noMashing += input.substring(input.length() / 3, input.length() / 2);
		}

		return noMashing;
	}

	private String userTopic(String userInput)
	{
		String userBasedResponse = "";

		int randomUserTopic = (int) (Math.random() * 6);

		switch (randomUserTopic)
		{

		case 1:
			userBasedResponse = myUser.getAge() + "";
			break;
		case 0:

			break;
		default:
			break;

		}

		return userBasedResponse;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;

		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
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

		if (input.length() <= 20)
		{
			isfour = true;
		}
		return isfour;
	}

	/**
	 * 
	 * @param input
	 *            This is the input from the textbox.
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

	private boolean contentChecker2(String input)
	{
		boolean isUser = false;

		if (input.equalsIgnoreCase("User"))
		{
			isUser = true;
		}
		return isUser;
	}

	private boolean mashChecker(String input)
	{
		boolean isMashing = false;

		if (input.indexOf("jkl") > -1)
		{
			isMashing = true;
		}

		return isMashing;
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


