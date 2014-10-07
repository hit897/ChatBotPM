package ChatBot.view;

import javax.swing.JOptionPane;

import ChatBot.Controller.ChatBotAppController;

public class ChatBotView
{
	private ChatBotAppController baseController;
	
	public ChatBotView(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}
	/**
	 * Shows a String from Chatbot with the availability of a user input.
	 * @param currentInput The supplied String.
	 * @return The users typed response.
	 */
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
	
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getname() + " says: " + currentInput);
		
		return result;
	}
	
	/**
	 * Shows the String from the Chatbot as a popup window.
	 * @param currentInput The String from the Chatbot.
	 */
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showMessageDialog(null, currentInput);
	}
}
