public class RomulanClient extends AlienClient {
    public RomulanClient() {
        super();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
