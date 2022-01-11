package edu.estu;

public class Reservation extends CarWasher {
    public static int numOfReservation = 0;

    public static void reservation() {
        System.out.println("A button appeared to confirm the reservation.");
        System.out.println("\n-User click the confirm button.");
        numOfReservation++;

        if (numOfReservation % 3 == 0) {
            System.out.println("\nCONGRATULATIONS\n" +
                    "You've won a one-time free coupon. " +
                    "We give you a free coupon for every three reservations.");
            Coupon.addCoupon();
        }

        System.out.println("\nThe user is asked whether to enter a coupon or not.");

        if(true){

            System.out.println("\n-User clicks the Use Coupon button");
            Coupon.deleteCoupon(); //Coupon deleted
            Coupon.useCoupon();


        }else{
            System.out.println("-User clicks the Don't Use Coupon button");
        }



        System.out.println("\n-User clicks “complete” button.\n"+ "\nProgram says “Your reservation is done succesfully.\n" +
                "The application sends the reservation information to the user as a message on an email.\n" +
                "User clicks exit button, program says “Have a good day.");


    }


    public static void make_reservation() {
        System.out.println("\n******************************* Name Of The Car Washes ****************************************************");
        CarWasher.list();
        System.out.println("************************************************************************************************************");
        System.out.println("\nUser chooses and click the name one of the listed car washes.");
        Search.search_name("Anadolu Car Wash");

    }

}
