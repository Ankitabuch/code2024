package april27.food;

public class MainFood {
    public static void main(String[] args) {
        IndianFoodImpl butterChicken = new IndianFoodImpl("Butter Chicken", 10.99);
        ChineseFoodImpl friedRice = new ChineseFoodImpl("Fried Rice", 7.99);

        IndianChineseFood fusionDish = new IndianChineseFood(butterChicken, friedRice);

        fusionDish.display();
    }
}

