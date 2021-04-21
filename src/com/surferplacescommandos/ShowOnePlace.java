package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;
import java.util.Iterator;

public class ShowOnePlace extends Commando {

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if ("Show".equalsIgnoreCase(input)) { // um Groﬂ/kleinschreibung zu ignorieren
			System.out.println("Please enter a Surferplace you want to get more information about");
			String surferPlaceToShow = scanner.nextLine();

			boolean notFound = true;

			for (Places place : places) {
				String placeToShow = place.name;

				if (placeToShow.equalsIgnoreCase(surferPlaceToShow)) {

					notFound = false;

					String name = place.name;
					String location = place.country;
					System.out.println("The location you are looking for is: " + name);
					System.out.println("The country is: " + location);
					int waveometer = place.getWaveoMeter();
					System.out.println("The WaveoMeter is: " + waveometer); 
					break;

				}
			}
			if (notFound) {
				System.out.println("This location is not in the list!");
			}
		}
	}

}
