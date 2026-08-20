interface DoA{
    void doA();
    default void doB(){
        System.out.println("doB");
    }
}

public class ex01 {
    public static void main(String[] args) {
        DoA doA =new DoA(){
            public void doA() {
                //public void doSomething()
                System.out.println("test111");
            };

        };
        DoA d1 =  () ->{
            System.out.println("test2");
        };
        doA.doA();
        d1.doA();
        d1.doB();
    }
}
