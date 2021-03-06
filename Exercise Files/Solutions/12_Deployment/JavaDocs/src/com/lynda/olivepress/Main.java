package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Kalamata;
import com.lynda.olivepress.olives.Ligurian;
import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.press.OlivePress;

/**
 * This is the main class for my app
 * @author David
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		
		Olive olive;
		
		olive = new Kalamata();
		olives.add(olive);

		olive = new Ligurian();
		olives.add(olive);

		olive = new Kalamata();
		olives.add(olive);
	
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
		System.out.println("You have " + press.getTotalOil() + 
				" units of oil");
		
		press.getOil(olives);
		
		System.out.println("Now you have " + press.getTotalOil() + 
				" units of oil");
		
		Kalamata olive1 = (Kalamata)olives.get(0);
		System.out.println("Olive 1 is from " + olive1.getOrigin());
	}

}
