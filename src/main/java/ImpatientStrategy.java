public class ImpatientStrategy implements OrderingStrategy {
    StringBar bar;
    StringRecipe recipe;
    StringDrink drink;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        this.bar = bar;
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
