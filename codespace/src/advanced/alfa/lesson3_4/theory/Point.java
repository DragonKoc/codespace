package advanced.alfa.lesson3_4.theory;
//слайды_block-2_3.pdf

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (this.x != other.x)
            return false;
        return (this.y == other.y);
    }

        public static void main(String[] args) {
            Point point1 = new Point(1, 5);
            Point point2 = new Point(1, 5);
            System.out.println(point1.equals(point2));
            //  
            Point point_1 = new Point(5,-5);
            Point point_2 = point_1;
            Point point_3 = new Point(5,-5);
            Point point_4 = new Point(5,5);
            System.out.println(point_3.equals(point_2));
            System.out.println(point_2.equals(point_1));
            //hashcode
            System.out.println(point_1.hashCode());
            System.out.println(point_2.hashCode());
            System.out.println(point_3.hashCode());
            System.out.println(point_4.hashCode());
            //boolean (f ? 1 : 0)
            //byte, char, shot, int (int)f;
            //long (int)(f^(f>>>32));
//             long f=33242342342345345234;
//             int ff=0;
//             ff = (int)(f^(f>>>32));
//            System.out.println(f);


        }

}

