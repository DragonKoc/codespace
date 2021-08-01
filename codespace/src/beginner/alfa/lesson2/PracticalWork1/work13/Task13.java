package beginner.alfa.lesson2.PracticalWork1.work13;

import java.util.Scanner;

public class Task13 {
    public static void main(String [] args){
        Scanner scan  = new Scanner ( System.in );
        System.out.print ( "Введите символ: " );
        String sb = scan.nextLine ();



        //J
        System.out.println ( "  "+sb+' '+sb+' '+sb);
        System.out.println ( "      "+sb);
        System.out.println ( "      "+sb);
        System.out.println ( sb+"     "+sb);
        System.out.println ( " "+sb+' '+sb+' '+sb);
        System.out.println ( );

        //A
        System.out.println ( "   "+sb);
        System.out.println (" "+sb+"   "+sb);
        System.out.println (sb+"     "+sb);
        System.out.println (sb+" "+sb+" "+sb+" "+sb);
        System.out.println (sb+"     "+sb);
        System.out.println ( );

        //V
        System.out.println (sb+"       "+sb);
        System.out.println (" "+sb+"     "+sb);
        System.out.println ("  "+sb+"   "+sb);
        System.out.println ("   "+sb+" "+sb);
        System.out.println ("    "+sb);
        System.out.println ( );

        //A
        System.out.println ( "   "+sb);
        System.out.println (" "+sb+"   "+sb);
        System.out.println (sb+"     "+sb);
        System.out.println (sb+" "+sb+" "+sb+" "+sb);
        System.out.println (sb+"     "+sb);
        System.out.println ( );


        System.out.println ();
        //JAVA
        System.out.println ("  "+sb+" "+sb+" "+sb+"       "+sb+"       "+sb+"       "+sb+"       "+sb+"\n"+
                            "      "+sb+ "     "+sb+"   "+sb+"      "+sb+"     "+sb+"      "+sb+"   "+sb+"\n"+
                            "      "+sb+ "    "+sb+"     "+sb+"      "+sb+"   "+sb+"      "+sb+"     "+sb+"\n"+
                            sb+"     "+sb+"    "+sb+" "+sb+" "+sb+" "+sb+"       "+sb+" "+sb+"       "+sb+" "+sb+" "+sb+" "+sb+"\n"+
                            " "+sb+" "+sb+" "+sb+"     "+sb+"     "+sb+"        "+sb+"        "+sb+"     "+sb
        );



        String j = ("  + + + \n" +
                    "      + \n" +
                    "      + \n" +
                    "+     + \n" +
                    " + + +  \n");

        String a = ("   +    \n" +
                    " +   +  \n" +
                    "+     + \n" +
                    "+ + + + \n" +
                    "+     + \n");

        String v = ("+       + \n" +
                    " +     +  \n" +
                    "  +   +   \n" +
                    "   + +    \n" +
                    "    +     \n");

        System.out.print ( j+a+v+a);
    }
}
