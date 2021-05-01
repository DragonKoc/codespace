package advanced.alfa.lesson3_4.theory;
//слайды_block-2_3.pdf

public class CustomClass {
    //java.lang.Object - superclass
    public static class Demo5 {
        public static void main(String[] args) {
            CustomClass myClass = new CustomClass();

            //public String toString()
            //информация о обьекте
            //выводит строку из имени +@ + шестнадцатеричное представление хеш кода
            //getClass().getName() + @ + Integer.toHexString(hashCode())
            System.out.println(myClass.toString());

            //public boolean equals(Object obj)
            //сравнивает значения ссылок
            CustomClass myClass2 = new CustomClass();
            System.out.println(myClass.equals(myClass2));
            //свойства еквивалентности
            //x.equals(x) - true
            //x.equals(y) =true= x.equals(z) then y.equals(z) true



        }
    }

}

