import com.google.common.base.Joiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello Maven");

        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println(joiner.join("Harry", null, "Ron", "Hermione"));
    }
}
