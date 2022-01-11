package edu.estu;

public class Coupon {
    //Each new member is given one coupon when they sign up.
    public static String[] coupons = {"coupon"};

    static int i = coupons.length - 1;

    public static void addCoupon() {

        coupons[i] = "coupon";
    }

    public static void deleteCoupon() {

        coupons[i] = null;
    }

    public static void useCoupon() {


        if (coupons != null){
            System.out.println("\n5% discount applied.");
        } else {
            System.out.println("\nNo such coupon found.");
        }


    }
}












