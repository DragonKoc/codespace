package advanced.alfa.lesson12.work2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static advanced.alfa.lesson12.work2.Person.Gender.FEMALE;
import static advanced.alfa.lesson12.work2.Person.Gender.MALE;

public class Runner {
    public void run(){
        List<Integer> list = Stream.iterate(10, n -> n + 10)
                .limit(10)
                .map(n -> n / 2)
                .collect(Collectors.toList());
        System.out.println(list);
       Stream.of("qwerty","abdc","brand","zxczxc","bond","","")
               .filter(s -> s.toLowerCase().startsWith("b"))
               .sorted()
               .forEach(System.out :: println);

       //6-8 пункты практическая работа 1-4

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setName("Nino");
        person1.setAge(26);
        person1.setGender(FEMALE);
        Person person2 = new Person();
        person2.setName("Goga");
        person2.setAge(24);
        person2.setGender(MALE);
        Person person3 = new Person();
        person3.setName("Grisha");
        person3.setAge(23);
        person3.setGender(MALE);
        Person person4 = new Person();
        person4.setName("Boris");
        person4.setAge(50);
        person4.setGender(MALE);
        Person person5 = new Person();
        person5.setName("Angela");
        person5.setAge(20);
        person5.setGender(FEMALE);
        Person person6 = new Person();
        person6.setName("Natasha");
        person6.setAge(18);
        person6.setGender(FEMALE);
        Person person7 = new Person();
        person7.setName("Buba");
        person7.setAge(29);
        person7.setGender(MALE);
        Person person8 = new Person();
        person8.setName("Sergej");
        person8.setAge(21);
        person8.setGender(MALE);
        Person person9 = new Person();
        person9.setName("Nadegda");
        person9.setAge(34);
        person9.setGender(FEMALE);
        Person person10 = new Person();
        person10.setName("Ivan");
        person10.setAge(27);
        person10.setGender(MALE);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        //отображения в консоль тех мужчин, чей возраст находится в диапазоне от 18 и по 27 лет.
        personList.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 27)
                .filter(person -> person.getGender().equals(MALE))
                .forEach(System.out::println);

        //код определения среднего возраста женщин
        OptionalDouble average = personList.stream()
                .filter(person -> person.getGender().equals(FEMALE))
//                .mapToInt(person -> person.getAge())
                .mapToInt(Person::getAge)
                .average();

        System.out.println("Средний возвраст женщин: " + average.getAsDouble());
    }
}
