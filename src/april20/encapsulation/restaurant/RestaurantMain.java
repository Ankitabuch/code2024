package april20.encapsulation.restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Pizza pizza", false, "pizza" ,"Toronto");
        System.out.println(restaurant);

        restaurant.printRestaurantDetails();

    }
}

