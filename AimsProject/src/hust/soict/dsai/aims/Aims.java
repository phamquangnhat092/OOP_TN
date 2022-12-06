package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		// thu merge branch 12
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan Movie 25", "Toto Animation", "Gosho Aoyama", 110, 99.99f);
		anOrder.addDigitalVideoDisc(dvd4);

		System.out.println("total cost is: ");
		System.out.println(anOrder.totalCost());

		System.out.println("total cost after remove dvd2 is: ");
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println(anOrder.totalCost());

	}
}
