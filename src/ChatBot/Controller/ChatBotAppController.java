package ChatBot.Controller;

import javax.swing.JOptionPane;

import ChatBot.model.Chatbot;
import ChatBot.view.ChatBotView;
import ChatBot.view.ChatbotFrame;
import ChatBot.view.ChatbotPanel;

/**
 * 
 * @author Brandon
 * @version 1.1
 */
public class ChatBotAppController
{
	private ChatBotView applicationView;
	private Chatbot mySillyChatbot;
<<<<<<< HEAD
	private String startMessage;
	private String quitMessage;
	/**
	 * Reference to the GUI JFrame object for the Application.
	 */
	private ChatbotFrame appFrame;

	/**
	 * Runs the Chatbot Project. Owns the Model and the Views. This just makes
	 * the chatbot.
	 * 
	 * @author BrandonHicken
	 * @version 1.2 10/2/14 - Cleaned the quit method. :/
=======
	
	/**
	 * This just makes the chatbot.
>>>>>>> origin/master
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
<<<<<<< HEAD
		appFrame = new ChatbotFrame(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getname() + " chatbot. What is your name?";
		quitMessage = "Goodbyes!";
	}

	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}

=======
		mySillyChatbot = new Chatbot("Derf");
	}
	
>>>>>>> origin/master
	/**
	 * This starts Everything.
	 */
	public void start()
	{
<<<<<<< HEAD
		((ChatbotPanel) appFrame.getContentPane()).showTextMessage(startMessage);

		// ChatbotPanel testPanel = (ChatbotPanel) appFrame.getContentPane();

	}

	public String getChatbotDialog(String input)
	{
		String result = "";
		if(mySillyChatbot.quitChecker(input))
		{
			quit();
		}
		result = mySillyChatbot.processText(input);
		return result;
	}

	/**
	 * This is how the program quits.
	 */
	public void quit()
=======
		String result = applicationView.showChatbot("Nerd");
				
				if (mySillyChatbot.quitChecker(result))
				{
					quit();
				}
	}
	
	/**
	 * This is how the program quits.
	 */
	private void quit()
>>>>>>> origin/master
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}

}
