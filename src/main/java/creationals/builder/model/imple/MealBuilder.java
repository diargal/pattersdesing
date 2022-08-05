package creationals.builder.model.imple;

public class MealBuilder {
    private Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public MealBuilder withVegBuilder() {
        meal.addItem(new VegBurger());
        return this;
    }

    public MealBuilder withCoke() {
        meal.addItem(new Coke());
        return this;
    }

    public MealBuilder withChickenBurger() {
        meal.addItem(new ChickenBurger());
        return this;
    }

    public MealBuilder withPepsi() {
        meal.addItem(new Pepsi());
        return this;
    }

    public Meal build() {
        return meal;
    }

    public MealBuilder clean() {
        meal = new Meal();
        return this;
    }

 /*   public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    } */
}