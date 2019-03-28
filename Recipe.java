import java.util.ArrayList;

public class Recipe {

    private ArrayList<Edible> ingredients;

    public Recipe() {
        ingredients = new ArrayList<Edible>();
    }

    public void addIngredient(Edible ingredient) {
        ingredients.add(ingredient);

    }

    public double totalCalories() {
        double sum = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            Edible ingredient = ingredients.get(i);

            sum += ingredient.getCalories();

        }
        return sum;


    }

    public static void main(String[] args) {

        Recipe salad = new Recipe();
        Vegetable spinach = new Vegetable("spinach", 90);
        Fruit strawberries = new Fruit("strawberries", 45);

        salad.addIngredient(spinach);
        salad.addIngredient(strawberries);

        System.out.println(salad.totalCalories());

    }
}
