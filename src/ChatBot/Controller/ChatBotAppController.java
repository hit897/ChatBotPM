package ChatBot.Controller;

import javax.swing.JOptionPane;

import ChatBot.view.ChatBotView;

public class ChatBotAppController
{
	private ChatBotView applicationView;
	
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
	}

	public void start()
	{
		String result = applicationView.showChatbot("Nerd");
				
				if (result.equalsIgnoreCase("exit"))
				{
					quit();
				}
				
				if (result.equalsIgnoreCase("yes"))
				{
					quit();
				}
				
				if (result.equalsIgnoreCase("Quit"))
				{
					quit();
				}
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null,  "Good bye.");
		System.exit(0);
	}

}
