public class HumanClient implements Client {
    StringDrink drink;
    StringRecipe recipe;
    StringBar bar;
    OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        this.bar = bar;
        this.strategy.wants(drink, recipe, bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        this.strategy.happyHourEnded((StringBar) bar);
    }
}
