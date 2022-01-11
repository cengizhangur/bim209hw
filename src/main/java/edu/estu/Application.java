package edu.estu;
public class Application {
    static String login = "Carez@hotmail.com";
    static String loginPhone = "5424861578";
    static String CAREZ = "        \t\tCAREZ \n" + "  \t\tCar Washer Reservation";
    static String closing_line = "Program closed";


    public static void open() {
        System.out.println("\n" + CAREZ);
    }

    public static void close() {
        System.out.println("\n" + closing_line);
    }

    public static void process() {
        System.out.println("You can log in with your phone number or e-mail:");
        System.out.println(login); //User can log in with phone number or e-mail
        System.out.println("WELCOME :)");

        String buttons =
                "1. 'Find the closest' button (reservation from the top 3 closest car washes)\n" +
                        "2. 'Car washer search by name' button\n" +
                        "3. 'Car washer search by area' button\n" +
                        "4. 'Make a reservation' button\n" +
                        "5. 'Lists all the car washers' button\n" +
                        "6. 'exit' button";

        System.out.println("************BUTTONS****************");
        System.out.println(buttons);


        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                System.out.println("\n-User clicks the “Find the closest” button.");
                CarWasher.listClosests();
                System.out.println("\n-User chooses and clicks the name one of the listed car washes.");
                Reservation.reservation();
                System.out.println("-----------------------------");
            } else if (i == 2) {
                System.out.print("\n-User clicks the “Car washer search by name” button and enter a name.\n");
                Search.search_name("Anadolu Car Wash");
                System.out.println("-----------------------------");
            } else if (i == 3) {
                System.out.print("\n-User clicks the “Car washer search by area” button and enter an area.\n");
                Search.search_area("Ankara");
                System.out.println("-----------------------------");
            } else if (i == 4) {
                System.out.print("\n-User clicks the “Make Reservation” button.\n");
                Reservation.make_reservation();
                System.out.println("-----------------------------");
            } else if (i == 5) {
                System.out.print("\n-User clicks the “List All” button.\n");
                CarWasher.list();
                System.out.println("-----------------------------");
            } else if (i == 6) {
                System.out.println("\n-User clicks the “exit” button and program says Have a good day.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        open();
        process();
        close();
    }
}
