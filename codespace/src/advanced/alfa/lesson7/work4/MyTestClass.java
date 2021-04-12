package advanced.alfa.lesson7.work4;

public class MyTestClass {
//    Опишите в пакете task4 класс MyTestClass с методом test(), статическим классом MyStaticNested,
//    внутренним классом MyInner и методом с локальным классом MyLocal. В каждом классе создайте поле с доступом
//    private и методами, которые используют закрытые члены других классов. 3. Добавьте в метод run() класса Runner
//    пакета task4 код демонстрирующий использование внешним классом закрытых элементов вложенных классов и вложенными
//    классами использование закрытых элементов внешнего
//    класса.

    private static String myTestClassString = "myTestClassString";

    void test(){
        System.out.println(myTestClassString +" test MyTestClass");
        new MyStaticNested().method();
        System.out.println(new MyInner().myInner);
        new MyInner().method();
    }

    static class MyStaticNested{
        private String myStaticNested = "myStaticNested";
        void method(){ System.out.println (myTestClassString + " " + myStaticNested );
        }
    }

    class MyInner{
        private String myInner = "myInner";
        public void method(){
            class MyLocal{
                private String myLocal = "myLocal";
            }
            MyLocal myLocal = new MyLocal();
            System.out.println (MyTestClass.myTestClassString + " " + myLocal.myLocal);
        }
    }
}