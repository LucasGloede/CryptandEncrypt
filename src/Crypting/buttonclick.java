package Crypting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
;

public class buttonclick implements ActionListener {

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String input = Windows.WD_MESSAGE_BOX.text.getText();
		int chooser = ThreadLocalRandom.current().nextInt(1, 3 +1);
		System.out.println(chooser);
		switch (chooser) {
		case 1:
			Keys.cryptone.crypting(input);
			break;
		case 2:
			Keys.cryptone.crpytingtwo(input);
			break;
		case 3:
			Keys.cryptone.crpytingtwo(input);
			break;
		}
		
		
	}

}
