package Encrypting;

public class Uncrypt {
	
	public static void uncrypt(String output) {
		
		
		if(output.contains("-")) {
			
			String finished = output.replace(Keys.cryptone.a, 'a');
			finished = finished.replace(Keys.cryptone.b, 'b');
			finished = finished.replace(Keys.cryptone.c, 'c');
			finished = finished.replace(Keys.cryptone.d, 'd');
			finished = finished.replace(Keys.cryptone.e, 'e');
			finished = finished.replace(Keys.cryptone.f, 'f');
			finished = finished.replace(Keys.cryptone.g, 'g');
			finished = finished.replace(Keys.cryptone.h, 'h');
			finished = finished.replace(Keys.cryptone.i, 'i');
			finished = finished.replace(Keys.cryptone.j, 'j');
			finished = finished.replace(Keys.cryptone.k, 'k');
			finished = finished.replace(Keys.cryptone.l, 'l');
			finished = finished.replace(Keys.cryptone.m, 'm');
			finished = finished.replace(Keys.cryptone.n, 'n');
			finished = finished.replace(Keys.cryptone.o, 'o');
			finished = finished.replace(Keys.cryptone.p, 'p');
			finished = finished.replace(Keys.cryptone.q, 'q');
			finished = finished.replace(Keys.cryptone.r, 'r');
			finished = finished.replace(Keys.cryptone.s, 's');
			finished = finished.replace(Keys.cryptone.t, 't');
			finished = finished.replace(Keys.cryptone.u, 'u');
			finished = finished.replace(Keys.cryptone.v, 'v');
			finished = finished.replace(Keys.cryptone.w, 'w');
			finished = finished.replace(Keys.cryptone.x, 'x');
			finished = finished.replace(Keys.cryptone.y, 'y');
			finished = finished.replace(Keys.cryptone.z, 'z');
			finished = finished.replace(Keys.cryptone.space, ' ');
			finished = finished.replace('-', ' ');
			
			Windows.WD_MESSAGE_BOX.textField.setText(finished);
		} else if(output.contains("4")) {
			
			String finished = output.replace(Keys.cryptone.a2, 'a');
			finished = finished.replace(Keys.cryptone.b2, 'b');
			finished = finished.replace(Keys.cryptone.c2, 'c');
			finished = finished.replace(Keys.cryptone.d2, 'd');
			finished = finished.replace(Keys.cryptone.e2, 'e');
			finished = finished.replace(Keys.cryptone.f2, 'f');
			finished = finished.replace(Keys.cryptone.g2, 'g');
			finished = finished.replace(Keys.cryptone.h2, 'h');
			finished = finished.replace(Keys.cryptone.i2, 'i');
			finished = finished.replace(Keys.cryptone.j2, 'j');
			finished = finished.replace(Keys.cryptone.k2, 'k');
			finished = finished.replace(Keys.cryptone.l2, 'l');
			finished = finished.replace(Keys.cryptone.m2, 'm');
			finished = finished.replace(Keys.cryptone.n2, 'n');
			finished = finished.replace(Keys.cryptone.o2, 'o');
			finished = finished.replace(Keys.cryptone.p2, 'p');
			finished = finished.replace(Keys.cryptone.q2, 'q');
			finished = finished.replace(Keys.cryptone.r2, 'r');
			finished = finished.replace(Keys.cryptone.s2, 's');
			finished = finished.replace(Keys.cryptone.t2, 't');
			finished = finished.replace(Keys.cryptone.u2, 'u');
			finished = finished.replace(Keys.cryptone.v2, 'v');
			finished = finished.replace(Keys.cryptone.w2, 'w');
			finished = finished.replace(Keys.cryptone.x2, 'x');
			finished = finished.replace(Keys.cryptone.y2, 'y');
			finished = finished.replace(Keys.cryptone.z2, 'z');
			finished = finished.replace(Keys.cryptone.space2, ' ');
			finished = finished.replace('4', ' ');
			Windows.WD_MESSAGE_BOX.textField.setText(finished);
		}
		
		
	}

}
