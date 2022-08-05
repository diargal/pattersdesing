package creationals.builder;

import creationals.builder.model.imple.Meal;
import creationals.builder.model.imple.MealBuilder;

/**
 * El patrón Builder construye un objeto complejo usando objetos simples y usando un enfoque paso a paso.
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.withChickenBurger().withCoke().build();
        Meal vegMeal = mealBuilder.clean().withVegBuilder().withPepsi().withCoke().build();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

       /* Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost()); */
    }
}