import java.util.List;

public class StringRecipe {
    List<StringTransformer> string_transformers;

    public StringRecipe(List<StringTransformer> list) {
        this.string_transformers = list;
    }

    public void add(StringTransformer transformer) {
        this.string_transformers.add(transformer);
    }

    public void mix(StringDrink drink) {
        for(StringTransformer transformer: this.string_transformers) {
            transformer.execute(drink);
        }
    }
}
