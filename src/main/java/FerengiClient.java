public class FerengiClient extends AlienClient {
    public FerengiClient() {
        super();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
