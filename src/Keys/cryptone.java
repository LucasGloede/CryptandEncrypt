package Keys;

public class cryptone {
	
	
	//forone
	public static char a = '&';
	public static char b = 'K';
	public static char c = 'E';
	public static char d = '%';
	public static char e = '2';
	public static char f = '1';
	public static char g = 'T';
	public static char h = 'I';
	public static char i = '.';
	public static char j = '!';
	public static char k = '*';
	public static char l = '`';
	public static char m = '§';
	public static char n = 'V';
	public static char o = '<';
	public static char p = '>';
	public static char q = ')';
	public static char r = '(';
	public static char s = '°';
	public static char t = '^';
	public static char u = 'Ü';
	public static char v = 'Ö';
	public static char w = 'Ä';
	public static char x = 'Q';
	public static char y = '/';
	public static char z = '_';
	public static char space = '|';
	
	//fortwo
	public static char a2 = '3';
	public static char b2 = ')';
	public static char c2 = '(';
	public static char d2 = '°';
	public static char e2 = '^';
	public static char f2 = '[';
	public static char g2 = ']';
	public static char h2 = '&';
	public static char i2 = '?';
	public static char j2 = '§';
	public static char k2 = '+';
	public static char l2 = '#';
	public static char m2 = '!';
	public static char n2 = '0';
	public static char o2 = '1';
	public static char p2 = '{';
	public static char q2 = '*';
	public static char r2 = ';';
	public static char s2 = '`';
	public static char t2 = '8';
	public static char u2 = '6';
	public static char v2 = '7';
	public static char w2 = ':';
	public static char x2 = ',';
	public static char y2 = '.';
	public static char z2 = '~';
	public static char space2 = '"';
	
	

	public static void crypting(String input) {
		
		String crypting = input.replace('a', a);
		crypting = crypting.replace('b', b);
		crypting = crypting.replace('c', c);
		crypting = crypting.replace('d', d);
		crypting = crypting.replace('e', e);
		crypting = crypting.replace('f', f);
		crypting = crypting.replace('g', g);
		crypting = crypting.replace('h', h);
		crypting = crypting.replace('i', i);
		crypting = crypting.replace('j', j);
		crypting = crypting.replace('k', k);
		crypting = crypting.replace('l', l);
		crypting = crypting.replace('m', m);
		crypting = crypting.replace('n', n);
		crypting = crypting.replace('o', o);
		crypting = crypting.replace('p', p);
		crypting = crypting.replace('q', q);
		crypting = crypting.replace('r', r);
		crypting = crypting.replace('s', s);
		crypting = crypting.replace('t', t);
		crypting = crypting.replace('u', u);
		crypting = crypting.replace('v', v);
		crypting = crypting.replace('w', w);
		crypting = crypting.replace('x', x);
		crypting = crypting.replace('y', y);
		crypting = crypting.replace('z', z);
		crypting = crypting.replace(' ', space);
		crypting = crypting + '-';
		
		
		
		
		System.out.println(crypting);
		Windows.WD_MESSAGE_BOX.text.setText(crypting);
		
		
	}


	public static void crpytingtwo(String input) {
		String crypting = input.replace('a', a2);
		crypting = crypting.replace('b', b2);
		crypting = crypting.replace('c', c2);
		crypting = crypting.replace('d', d2);
		crypting = crypting.replace('e', e2);
		crypting = crypting.replace('f', f2);
		crypting = crypting.replace('g', g2);
		crypting = crypting.replace('h', h2);
		crypting = crypting.replace('i', i2);
		crypting = crypting.replace('j', j2);
		crypting = crypting.replace('k', k2);
		crypting = crypting.replace('l', l2);
		crypting = crypting.replace('m', m2);
		crypting = crypting.replace('n', n2);
		crypting = crypting.replace('o', o2);
		crypting = crypting.replace('p', p2);
		crypting = crypting.replace('q', q2);
		crypting = crypting.replace('r', r2);
		crypting = crypting.replace('s', s2);
		crypting = crypting.replace('t', t2);
		crypting = crypting.replace('u', u2);
		crypting = crypting.replace('v', v2);
		crypting = crypting.replace('w', w2);
		crypting = crypting.replace('x', x2);
		crypting = crypting.replace('y', y2);
		crypting = crypting.replace('z', z2);
		crypting = crypting.replace(' ', space2);
		crypting = crypting + '4';
		System.out.println(crypting);
		Windows.WD_MESSAGE_BOX.text.setText(crypting);
	}

}
