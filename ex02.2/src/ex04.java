interface BB{
    String doA(int a);
}
class AAAA{}
public class ex04 {
    public static void method1(BB bb,AAAA aaaa) {
        String test = bb.doA(100);
        System.out.println(test);
    }
    public static void main(String[] args) {
        method1(
                (num)-> String.valueOf(num),
                new AAAA()
        );
    }
}
