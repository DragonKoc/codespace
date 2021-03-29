package advanced.alfa.lesson2.theory;


class StaticDemo {
    static int a =22;
    static int b =49;
    static int cnt; //if static then for all

    StaticDemo(){
        cnt++;
    }

    public int getCnt() {
              return cnt;
    }

    static void callme(){
        System.out.println("up");
    }
}

class Demo{
    public static void main(String[] args) {
        StaticDemo.callme();
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        StaticDemo staticDemo3 = new StaticDemo();
        System.out.println(staticDemo3.getCnt());
    }
}
