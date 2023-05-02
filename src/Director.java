public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        this.myBuilder = builder;
        this.myBuilder.buildBody();
        this.myBuilder.insertWheels();
        this.myBuilder.addHeadlights();
    }
}
