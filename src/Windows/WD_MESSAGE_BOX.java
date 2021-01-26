package Windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class WD_MESSAGE_BOX {
	
	
	//create the variables needet to CREATE WINDOW
	static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();

	public static JTextField text = new JTextField("put your text to be crypted here");
	public static JTextField textField = new JTextField("here will your crypted text be ready to copy and send");
	static JButton crypt = new JButton("Crypt");
	static JButton encrypt = new JButton("Encrypt");
	
	
	
	//getting and initalizing the screensize
	static Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	static int Y_size_screen = screensize.height;
	static int X_size_screen = screensize.width;
	
	//Images
	
	
	//Important Variables
	static int frame_size_X = X_size_screen/2;
	static int frame_size_Y = Y_size_screen/2;
	
	
	public static void createWindow() {
		
		panel.setLayout(null);
		
		//setting up the FRAME
		frame.setSize(X_size_screen/2, Y_size_screen/2);
		frame.setLocation(X_size_screen/4, Y_size_screen/4);
		
		
		
		//TextArea
		text.setBounds(frame_size_X/4, 0, frame_size_X/2, frame_size_Y/20);
		text.setBorder(BorderFactory.createLineBorder(Color.black));
		text.setBackground(Color.LIGHT_GRAY);
		text.setForeground(Color.blue);
		panel.add(text);
		
		
		//CrypButton
		
		crypt.addActionListener(new Crypting.buttonclick());
		crypt.setBounds(0, frame_size_Y/8, frame_size_X, frame_size_Y/25);
		panel.add(crypt);
		
		
		//EncryptButtom
		encrypt.addActionListener(new Encrypting.buttonclick());
		encrypt.setBounds(0, frame_size_Y/3, frame_size_X, frame_size_Y/25);
		panel.add(encrypt);
		

		
		//Textfield for encyption
		textField.setBounds(frame_size_X/4, frame_size_Y/4, frame_size_X/2, frame_size_Y/20);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.BLUE);
		panel.add(textField);
		
		
		
		
		frame.add(panel);
		frame.setVisible(true);
		
		
		
	}

	
	
	
	

}
