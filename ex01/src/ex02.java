import java.util.Optional;

public class ex02 {
    public static void main(String[] args) {
        Optional<String> strhello = Optional.of("hello");
        System.out.println(strhello.get());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("빈값"));

        System.out.println(Optional.ofNullable(null).orElse("기본값"));

        Optional<String> drink = Optional.ofNullable(null);
        System.out.println(drink.orElse("주스"));
    }
}
