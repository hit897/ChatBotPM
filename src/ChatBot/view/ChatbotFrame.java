package ChatBot.view;

import javax.swing.JFrame;
import ChatBot.Controller.ChatBotAppController;

/**
 * GUI Frame Class framework for our chatbot.  It's a great example for the framework, minus the size part.
 * @author Brandon Hicken
 * @version 1.1
 */
public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatBotAppController baseController)
	{
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}

}
