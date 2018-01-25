public class Wheel {


    private String position;
    private FruitType fruit;

    public Wheel(String position, FruitType fruit) {
        this.position = position;
        this.fruit = fruit;
    }

    public String getPosition() {
        return this.position;
    }

    public FruitType getFruit() {
        return this.fruit;
    }
}
