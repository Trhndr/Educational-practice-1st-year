public class Main {
    public static void main(String[] args) {
        int year=2022;
        Calendar cal=new Calendar(year);
        cal.addHoliday(1,1,"New Year");
        cal.addHoliday(7, 1,"Old New Year");
        cal.showHoliday();
    }
}
