package Encrypting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonclick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String output = Windows.WD_MESSAGE_BOX.textField.getText();
		Encrypting.Uncrypt.uncrypt(output);
		

	}

}
