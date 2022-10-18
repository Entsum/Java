package Practice;

public class repl88 {

    String breed, name, color;
    public static void main(String[] args) {
        repl88 b = new repl88();
        b.breed = "Bulldog";
        repl88 l = new repl88();
        l.breed = "Labrador";
        repl88 h = new repl88();
        h.breed = "Husky";
        h.bark();
        h.run();
        h.play();
        b.bark();
        b.run();
        b.play();
        l.bark();
        l.run();
        l.play();
    }
    void bark() {
        System.out.println(breed + " can bark");
    }
    void run() {
        System.out.println(breed + " can run");
    }
    void play() {
        System.out.println(breed + " can play");
    }
}
