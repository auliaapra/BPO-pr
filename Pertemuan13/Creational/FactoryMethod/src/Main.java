public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation(); // Output: Using Product A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation(); // Output: Using Product B
    }
}