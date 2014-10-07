package ChatBot.Controller;

import javax.swing.JOptionPane;

import ChatBot.model.Chatbot;
import ChatBot.view.ChatBotView;

/**
 * 
 * @author Brandon
 * @version 1.1
 */
public class ChatBotAppController
{
	private ChatBotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	
	
	/**
	 * Runs the Chatbot Project. Owns the Model and the Views.
	 * This just makes the chatbot.
	 * @author BrandonHicken
	 * @version 1.2 10/2/14 - Cleaned the quit method. :/
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getname() + " chatbot. What is your name?";
		quitMessage = "Goodbyes!";
	}
	
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	
	/**
	 * This starts Everything.
	 */
	public void start()
	{
		String result = applicationView.showChatbotDialog(startMessage);
		
		
		while(!mySillyChatbot.quitChecker(result))
		{
			result = mySillyChatbot.processText(result);
			result = applicationView.showChatbotDialog(result);
		}
		
		quit();
	}
	
	/**
	 * This is how the program quits.
	 */
	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
		
	}

}
