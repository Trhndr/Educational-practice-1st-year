import java.util.ArrayList;

public class Calendar {
    int year;
    Calendar cal;
    public ArrayList list;
    Calendar(int year){
        this.year=year;
        this.list=new ArrayList<>();
    }
    void addHoliday(int day,int month, String name){
        list.add(new Holiday(day, month, name));
    }

    public int getYear() {
        return year;
    }

    public void showHoliday(){
        for (int i=0; i< list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}

class Holiday{
    int day;
    int month;
    String name;
    Holiday(int day, int month, String name){
        this.day=day;
        this.month = month;
        this.name=name;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }
    @Override
    public String toString(){
        return "Holiday: <"+name+">; Date:  "+ day+"."+month;
    }
}
