package advanced.alfa.lesson7_9.theory;

public class Test {

        public static void main(String[] args) {
            Season season = Season.SUMMER;
            System.out.println(season);
            System.out.println(Season.valueOf("WINTER")); //if not java.lang.IllegalArgumentException
            System.out.println(Season.values());

            for (Season seas: Season.values()){
                System.out.println(seas.name() +" "+seas.ordinal());
            }

            System.out.println("equals=" + season.equals(Season.SUMMER));

            switch (season){
                case WINTER:
                case SPRING:
                case AUTUMN:
                    System.out.println("work");
                    break;
                case SUMMER:
                    System.out.println("LETO!");
                    break;
            }
        }
}

