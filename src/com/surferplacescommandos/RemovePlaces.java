package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;
import java.util.Iterator;

public class RemovePlaces extends Commando {

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if ("Remove".equalsIgnoreCase(input)) { // um Groﬂ/kleinschreibung zu ignorieren
			System.out.println("Please enter a Surferplace to remove");
			String surferPlacesToRemove = scanner.nextLine();
			int index = 0;

			for (Places place : places) {
				String deletedPlace = place.name;

				if (deletedPlace.equalsIgnoreCase(surferPlacesToRemove)) {
					index = places.indexOf(place);
			
					/*
					 * Iterator<Places> it = places.iterator(); while (it.hasNext()) { Places value
					 * = it.next(); if (value.equals(surferPlacesToRemove)) { it.remove();
					 */

				}

			}
			places.remove(index);
			System.out.println("The new list is:");

			for (Places place : places) {
				System.out.println(place.name);
			}
		}
	}
}
