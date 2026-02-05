class Engine {
    private double hp;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    // constructor
    Engine() {

    }

    Engine(double hp) {
        this.hp = hp;
    }
}

class car {
    private String modelName;
    private Engine engine;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    car() {

    }

    car(String modelName) {
        this.modelName = modelName;
    }

    // Achieve Has a relationship
    Engine e = new Engine(1200);
}

public class hasarel {
    public static void main(String[] args) {
        car c = new car();
        c.setModelName("BMW");
        System.out.println(c.getModelName());
        System.out.println(c.e.getHp());
    }
}
