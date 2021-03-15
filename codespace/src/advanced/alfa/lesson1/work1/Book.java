package advanced.alfa.lesson1.work1;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publish;
    private int year;
    private int countPages;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Book() {
    }

    public Book(int id, String name, String author, String publish, int year, int countPages, double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.countPages = countPages;
        this.cost = cost;
    }

    public Book(int id, String name, String author) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
        this(id,name,author,"test1",5,6,7.7);
    }

    public void viewBook(){
              System.out.println( "ID=" + this.getId()
                      + "\nAuthor=" + this.getAuthor()
                      + "\nName=" + this.getName()
                      + "\nCost=" + this.getCost()
                      + "\nPublish=" + this.getPublish()
                      + "\nYear=" + this.getYear()
                      + "\nPages=" + this.getCountPages()
                      + "\n*********************");
          }
}
