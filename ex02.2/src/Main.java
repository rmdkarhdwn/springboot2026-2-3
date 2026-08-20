import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> java = Optional.of("java");
        System.out.println(java);

        String temp = java.orElse("값이 없다");
        System.out.println(temp);
    }
}