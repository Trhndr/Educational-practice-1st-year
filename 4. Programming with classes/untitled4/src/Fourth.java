import java.util.ArrayList;

public class Fourth {
    public static void main(String[] args) {
        //Простейшие классы и объекты
        System.out.println("Простейшие классы и объекты");
        //4.1.1
        //4.1.2
        System.out.println("\nExamples 4.1.1 || 4.1.2");
        Test1 first = new Test1();
        first.printclass();
        System.out.println("Summa= "+ first.summa());
        System.out.println("Max= "+ first.max());
        Test1 second = new Test1(2,8);
        second.printclass();
        System.out.println("Summa= "+ second.summa());
        System.out.println("Max= "+ second.max());

        //4.1.3
        System.out.println("\nStudents");
        ArrayList list = new ArrayList<>();
        //Student[] students = new Student[3];
        Student students = new Student("Trukhan", 12, new int[]{8,9,10,9});
        Student students2 = new Student("Miroslavskiy", 15, new int[]{4,8,9,6});
        Student students3 = new Student("Ireev", 1, new int[]{10,7,8,9});
        list.add(students);
        list.add(students2);
        list.add(students3);
        students2.prStudent(list);
        students.prGoogStudent(list);


        //System.out.println(students[0]);


        //4.1.7
        System.out.println("\nTriangle");
        Triangle tr=new Triangle(5,3,4);
        System.out.println("Perimetr= "+ tr.Perimetr());
        System.out.println("Square= "+ tr.Square());

        //4.1.9
        System.out.println("\nBook List");
        Library shafa = new Library("Книжный шкафчик", new ArrayList<>());
        shafa.newBook("Хоббит. Нежданое путешествие.", "Джон Р. Р. Толкин",
                "HarperCollins Canada", 2008, 432, 15);
        shafa.newBook("Жизнь неизвестна", "Alvaro Mutis", "New York Review of Books",
                2002, 720, 5.5);
        Book book = new Book("Хоббит. Нежданое путешествие.", "-",
                "HarperCollins Canada", 2008, 432, 15);
        System.out.println(book.getName());
        System.out.println(shafa.getShopName());
        shafa.showLibary();




        System.out.println("\nАгрегация и композиция");

        //4.2.1
        System.out.println("\nSentence");
        Word heading = new Word("State Lines");
        String line1 = "I drink coffee in the morning";
        Sentence sentence = new Sentence(line1);
        Text text = new Text(heading, sentence);
        text.printText();

        //4.2.2
        System.out.println("\n\nCar");
        Car car= new Car("Maserati");
        System.out.println("Name model: "+ car.getName());
        Engine engine=new Engine(250);
        //car.setEn(engine);
        System.out.println("Name model: "+ car.getName()+"; Power: "+ engine.getPower());



    }

}
class Car{
    String name;
    Engine en;
    Car(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setEn(Engine en) {
        this.en = en;
    }
}
class Engine{
    int power;
    Engine(int power){
        this.power=power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
class Text{
    Word word;
    ArrayList <Sentence> arr;
    Text(Word word, ArrayList <Sentence> arr){
        this.word=word;
        this.arr=arr;
    }
    Text(Word word, Sentence set){
        this.word = word;
        this.arr = new ArrayList<>();
        this.arr.add(set);
    }
    void printText() {
        for (Sentence sentence : this.arr) {
            System.out.print(sentence.toString());
        }
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Word getWord() {
        return word;
    }
}
class Word{
    String word;
    Word(String word){
        this.word=word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
class Sentence{
    String sent;
    Sentence(String sent){
        this.sent=sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getSent() {
        return sent;
    }
}
class Book{
    static int first_id=0;
    int id;
    String name;
    String author;
    String publishing_house;
    int year;
    int pages;
    double cost;
    Book (String name, String author, String publishing_house, int year, int pages, double cost){
        this.name=name;
        this.author=author;
        this.publishing_house=publishing_house;
        this.year=year;
        this.pages=pages;
        this.cost=cost;
        this.id= ++first_id;
    }
    @Override
    public String toString(){
        //return String.format(String.valueOf(id), name, author, publishing_house, year, pages, cost);
        return "Книга: "+name+"; Автор: "+author+"; Издательство: "+publishing_house
                +"; Год: "+year+"; Странаницы: "+pages+"; Стоимость: "+cost+"; ";
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }
    public String getPublishing_house() {
        return publishing_house;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
class Library{
    String shopName;
    ArrayList<Book> bookList;
    Book book;
    Library(String shopName, ArrayList<Book> bookList){
        this.shopName=shopName;
        //this.bookList=bookList;
        this.bookList=new ArrayList<>();
    }
    public void showLibary(){
        for (int i=0; i< bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
    }
    public void findAuthor(String str){
        for (int i=0; i< bookList.size(); i++){
            if (book.getAuthor()==str){
            System.out.println(bookList.get(i));
            }
        }
    }
   void newBook(String name, String author, String publishing_house, int year, int pages, double cost ){
        bookList.add(new Book(name, author, publishing_house, year, pages, cost));
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }
}
class Triangle {
    int A;
    int B;
    int C;

    Triangle() {
        A = 5;
        B = 3;
        C = 4;

    }

    Triangle(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    int Perimetr() {
        return A + B + C;
    }

    double Square() {
        double p = Perimetr() / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}


