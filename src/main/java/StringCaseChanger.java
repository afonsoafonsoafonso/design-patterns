public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        char arr[] = new char[drink.getText().length()];
        int i = 0;
        for (char ch: drink.getText().toCharArray()) {
            if (Character.isLowerCase(ch)) {
                arr[i] = Character.toUpperCase(ch);
            } else {
                arr[i] = Character.toLowerCase(ch);
            }
            i++;
        }
        drink.setText(new String(arr));
    }
}
