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
	
	/**
	 * This just makes the chatbot.
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		mySillyChatbot = new Chatbot("Derf");
	}
	
	/**
	 * This starts Everything.
	 */
	public void start()
	{
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
	{
		JOptionPane.showMessageDialog(null,  "Good bye.");
		System.exit(0);
	}

}
