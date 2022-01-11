package edu.estu;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Location extends CarWasher {

    static Double[] distance = new Double[12];
    static double x_coordinates = (Math.random() * 100);
    static double y_coordinates = (Math.random() * 100);
    static ArrayList list = new ArrayList();
    static LinkedHashMap information = new LinkedHashMap();

    public static void calculateDistance() {
        //will take input from Carwasher coordinates
        for (int i = 0; i < 12; i++) {
            distance[i] = Math.pow((Math.pow(carwasherXCoordinates[i] - x_coordinates, 2) +
                    Math.pow(carwasherYCoordinates[i] - y_coordinates, 2)), 0.5);
            list.add(distance[i]);
            information.put(distance[i], "Name: " + names[i] + " - Price: " + prices[i] + " - Address: " + addresses[i] +
                    " - Phone Number: " + phoneNumbers[i] + " - Working Hours: " + workingHours[i]);
        }
    }
}