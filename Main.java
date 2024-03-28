
public class Main {
    static void test(Gen<? extends A> obj) {

        // Метод test принимает объекты типа Gen<? extends A>, что означает, 
        // что он может принимать Gen с типами, которые являются наследниками A. 
        // Все наследники A в коде (B, C, D) должны корректно заменять собой объекты типа A.

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> genA = new Gen<>(a);
        Gen<B> genB = new Gen<>(b);
        Gen<C> genC = new Gen<>(c);
        Gen<D> genD = new Gen<>(d);

        test(genA);
        test(genB);
        test(genC);

        // Недопустимый вызов метода test (genD не соответствует ограничению)
        test(genD); // Ошибка компиляции

        // В коде нет явной зависимости от конкретных классов A, B, C, D в классе Main, что говорит о том, 
        // что принцип инверсии зависимостей соблюдается. 
        // Однако, можно было бы использовать интерфейсы или абстрактные классы для уменьшения связанности.
        
    }
}