package stream.coffee;

import stream.coffee.Coffee;
import stream.coffee.EtiopiaAmericano;
import stream.coffee.KenyaAmericano;
import stream.coffee.Latte;
import stream.coffee.Mocha;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		System.out.println();
		
		Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		kenyaMocha.brewing();
		System.out.println();
		Coffee etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaMocha.brewing();

	}

}
