public class StringReplacer implements StringTransformer {
    char ch1;
    char ch2;

    public StringReplacer(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    @Override
    public void execute(StringDrink drink) {
        char arr[] = new char[drink.getText().length()];
        int i = 0;
        for (char ch: drink.getText().toCharArray()) {
            if(ch == this.ch1) arr[i] = this.ch2;
            else arr[i] = ch;
            i++;
        }
        drink.setText(new String(arr));
    }
}
