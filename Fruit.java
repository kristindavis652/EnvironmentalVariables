public class Fruit implements Edible {

    private String name;
    private double calories;

    public Fruit(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getCalories() {
        return 0;
    }
}
