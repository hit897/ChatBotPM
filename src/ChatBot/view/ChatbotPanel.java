package ChatBot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import ChatBot.Controller.ChatBotAppController;
import javax.swing.*;
import ChatBot.model.Chatbot;

public class ChatbotPanel extends JPanel
{
	private ChatBotAppController baseController;

	private JTextField firstTextField;
	private JButton firstButton;
	private JButton saveButton;
	private JButton loadButton;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;

	public ChatbotPanel(ChatBotAppController baseController)
	{
		this.baseController = baseController;

		firstButton = new JButton("Click the Button... It's SO CLICKY.");
		saveButton = new JButton("save");
		loadButton = new JButton("load");
		firstButton.setBackground(new Color(224, 255, 255));
		firstTextField = new JTextField(25);
		firstTextField.setBackground(new Color(224, 255, 255));
		firstTextField.requestFocus();
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5, 5);
		chatPane = new JScrollPane(chatArea);
		chatArea.setBackground(new Color(175, 238, 238));



		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
		chatArea.setWrapStyleWord(true);
	}

	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(400, 400);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(firstTextField);
		this.add(chatPane);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, 197, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, -5, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 0, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 197, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -5, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 92, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -25, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, loadButton);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, loadButton);

	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput = firstTextField.getText();
				String result = baseController.getChatbotDialog(currentInput);
				
				showTextMessage("User: " + currentInput);
				
				showTextMessage("Chatbot: " + result);
				
				firstTextField.setText("");
				
			}
		});

		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chat = chatArea.getText();
				baseController.saveText(chat, true);;
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String savedChat = baseController.readTextFromFile();
				if(savedChat.length()<1)
				{
					chatArea.setText("No Text in the File...");
				}
				else
				{
					chatArea.setText(savedChat);
				}
			}
		});
		
				
	}
	
	public void showTextMessage(String userInput)
	{
		chatArea.append("\n" + userInput);
	}
}
