package nl.novi.classandobjects_auto;

public class Main {
    public static void main(String[] args) {
        Auto ford = new Auto("Mondeo", "Ford", 1901, 19098, true);
        ford.Info();

        ford.stukjeRijden(90);

        ford.Info();

        Auto mazda = new Auto("ding", "Mazda", 1091, 19098.1,false);

        mazda.Info();
    }
}
