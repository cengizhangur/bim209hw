package edu.estu;

import java.util.LinkedHashMap;

public class Search extends CarWasher {

    public static void search_name(String name) {

        LinkedHashMap name_info = new LinkedHashMap();

        for (int i = 0; i < 12; i++) {
            name_info.put(names[i], "Name: " + names[i] + " - Price: " + prices[i] + " - Address: " + addresses[i] +
                    " - Phone Number: " + phoneNumbers[i] + " - Working Hours: " + workingHours[i]);

        }

        if (name_info.containsKey(name)) {
            System.out.println("\nCar washes with wanted name found: \n\t" + name_info.get(name) + "\n");
            Reservation.reservation();
        } else {
            System.out.println("\tCar washes with name " + name + " is not found. ");
        }

    }

    public static void search_area(String area) {

        int k = 0;

        System.out.println("\nCar washes in the area that you searched is/are: ");

        for (int i = 0; i < 12; i++) {
            if (addresses[i].contains(area)) {
                k++;

                System.out.println("\tName: " + names[i] + " - Price: " + prices[i] + " - Address: " + addresses[i] +
                        " - Phone Number: " + phoneNumbers[i] + " - Working Hours: " + workingHours[i]);
            }
        }

        if (k == 0) {
            System.out.println("There isn't any Car washes in the area that you searched :(");
        }
    }
}