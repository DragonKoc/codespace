package advanced.alfa.lesson5.work4;

public class Runner {
    public void run(){
//        Integer i1 = 127;
//        Integer i2 = new Integer(127);
//        Integer i3 = new Integer("127");
//        Integer i4 = Integer.valueOf(127);
//        Integer i5 = Integer.valueOf("127");
//        int ii = 127;
//        Integer i6 = ii;
//
//        System.out.println(i1 == i2);
//        System.out.println(i1 == i3);
//        System.out.println(i1 == i4);
//        System.out.println(i1 == i5);
//        System.out.println(i1 == i6);
//
//        System.out.println(i2 == i3);
//        System.out.println(i2 == i4);
//        System.out.println(i2 == i5);
//        System.out.println(i2 == i6);
//
//        System.out.println(i3 == i4);
//        System.out.println(i3 == i5);
//        System.out.println(i3 == i6);

        // не входит в диапазон поэтому используется в конструктор
        Integer i1 = 128;
        Integer i2 = new Integer(128);
        Integer i3 = new Integer("128");
        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf("128");
        int ii = 128;
        Integer i6 = ii;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i1 == i4);
        System.out.println(i1 == i5);
        System.out.println(i1 == i6);

        System.out.println(i2 == i3);
        System.out.println(i2 == i4);
        System.out.println(i2 == i5);
        System.out.println(i2 == i6);

        System.out.println(i3 == i4);
        System.out.println(i3 == i5);
        System.out.println(i3 == i6);
        
        System.out.println(i4 == i5);
        System.out.println(i4 == i6);

        System.out.println(i5 == i6);


    }
}
