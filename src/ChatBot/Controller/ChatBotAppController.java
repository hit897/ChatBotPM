package ChatBot.Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ChatBot.model.Chatbot;
import ChatBot.view.ChatBotView;
import ChatBot.view.ChatbotFrame;
import ChatBot.view.ChatbotPanel;

/**
 * 
 * @author Brandon
 * @version 1.2 10/2/14
 */
public class ChatBotAppController
{
	private ChatBotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	/**
	 * Reference to the GUI JFrame object for the Application.
	 */
	private ChatbotFrame appFrame;

	/**
	 * Runs the Chatbot Project. Owns the Model and the Views. This just makes
	 * the chatbot.
	 */
	public ChatBotAppController()
	{
		applicationView = new ChatBotView(this);
		appFrame = new ChatbotFrame(this);
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
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}

	public void saveText(String conversation, boolean appendToEnd)
	{
		String fileName = "C:/Saved Chats/Text.txt";
		
		PrintWriter outputWriter;
		
		
		if(appendToEnd)
		{
			try
			{
				outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, appendToEnd)));
				outputWriter.append(conversation);
				outputWriter.close();
			}
			catch(FileNotFoundException noExistingFile)
			{
				JOptionPane.showMessageDialog(appFrame, "There isn't a file there...");
				JOptionPane.showMessageDialog(appFrame, noExistingFile.getMessage());
			}
			catch (IOException inputOutputError)
			{
				JOptionPane.showMessageDialog(appFrame, "There isn't a file there...");
				JOptionPane.showMessageDialog(appFrame, inputOutputError.getMessage());
			}
		}
		else
		{
			try
			{
				outputWriter = new PrintWriter(fileName);
				outputWriter.println(conversation);
				outputWriter.close();
			}
			catch(FileNotFoundException noFileIsThere)
			{
				JOptionPane.showMessageDialog(appFrame, "There isn't a file there...");
			}
		}
	}
	
	public String readTextFromFile()
	{
		String fileText = "";
		String filePath = "C:/Saved Chats/";
		String fileName = "Text.txt";
		File inputFile = new File(fileName);
		
		try
		{
			Scanner fileScanner = new Scanner(inputFile);
			
			while(fileScanner.hasNext())
			{
				fileText += fileScanner.nextLine() + "\n";
			}
			
			fileScanner.close();
		}
		catch(FileNotFoundException fileException)
		{
			JOptionPane.showMessageDialog(appFrame, "IT'S NOT WORKING");
		}
		
		return fileText;
	}
}
