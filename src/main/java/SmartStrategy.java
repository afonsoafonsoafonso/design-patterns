public class SmartStrategy implements OrderingStrategy {
    StringBar bar;
    StringRecipe recipe;
    StringDrink drink;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        this.bar = bar;
        if(bar.isHappyHour()) this.bar.order(this.drink, this.recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.bar.order(this.drink, this.recipe);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
