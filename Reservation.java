public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open, boolean confirmed) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation");
        }

        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
        isConfirmed = confirmed;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confim reservation, please contact restaurant");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true, true);
        Reservation partyOfFour = new Reservation(4, 3, false, true);
        Reservation partyOfTwo = new Reservation(2,3, true, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
        partyOfTwo.informUser();
        partyOfTwo.confirmReservation();
    }

}
