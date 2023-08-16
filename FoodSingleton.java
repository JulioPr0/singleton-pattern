public class FoodSingleton {
    private static FoodSingleton instance;
    private String favoriteFood;

    private FoodSingleton() {
    }

    public static FoodSingleton getInstance() {
        if (instance == null) {
            instance = new FoodSingleton();
        }
        return instance;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String food) {
        favoriteFood = food;
    }

    public static void main(String[] args) {
        FoodSingleton myFood = FoodSingleton.getInstance();
        myFood.setFavoriteFood("Nasi Goreng");

        FoodSingleton anotherFood = FoodSingleton.getInstance();
        System.out.println("Makanan Favorit Kelompok-2: " + anotherFood.getFavoriteFood()); 
    }
}
