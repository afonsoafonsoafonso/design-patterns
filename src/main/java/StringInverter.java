public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        String drink_text = drink.getText();
        String reversed = new StringBuilder(drink_text).reverse().toString();
        drink.setText(reversed);
    }
}
