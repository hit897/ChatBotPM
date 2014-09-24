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
	
	public String showChatbot(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null,  "'Sup, " + currentInput + ".");
		result = JOptionPane.showInputDialog(null, "Are you done?");
		return result;
	}

}
