import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> string_transformers;

    public StringTransformerGroup(List<StringTransformer> list) {
        this.string_transformers = list;
    }

    public void add(StringTransformer transformer) {
        this.string_transformers.add(transformer);
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer transformer: this.string_transformers) {
            transformer.execute(drink);
        }
    }
}
