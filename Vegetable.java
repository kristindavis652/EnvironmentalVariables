public class Vegetable implements Edible {

    private String name;
    private double calories;

    public Vegetable(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getCalories() {
        return this.calories;
    }
}
