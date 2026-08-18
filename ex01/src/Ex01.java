import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        //Optinal 생성 방법 3가지
        int a = 10;
        Optional<Integer> intopt = Optional.of(10);
        //opNullable 은 null 일수도 있고 값일 수도 있다
        Optional<String> stropt = Optional.ofNullable(null);
        // empty는 null
        Optional<String> stropt1 = Optional.empty();
        // empty는 null
        //Optinal get orElse ifpresent
        System.out.println(intopt.get());
        System.out.println(stropt.orElse("기본값"));
        if (stropt.isPresent()) {
            System.out.println(stropt1.get());
        }
    }
}
