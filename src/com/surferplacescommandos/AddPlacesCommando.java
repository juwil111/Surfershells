package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;

public class AddPlacesCommando extends Commando {

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if ("Add".equalsIgnoreCase(input)) { // um Groﬂ/kleinschreibung zu ignorieren
			System.out.println("Please enter a Surferplace");
			String surferPlaces = scanner.nextLine();

		boolean notFound= true;
		
			for (Places place : places) {
				String newlyAddedPlace = place.name;

				if (newlyAddedPlace.equalsIgnoreCase(surferPlaces)) {
					notFound= false;
					System.out.println("Location already exists in the list");
					break;
				}
			}
			if(notFound) {
				System.out.println("Please enter a country:");
				String country = scanner.nextLine();
				Places place = new Places(surferPlaces, country);
		places.add(place);
		System.out.println("The new list is:");
		for(Places place1: places) {
			System.out.println(place1.name);
		}
			}
	
			
		}
	}
}
			

