import java.util.ArrayList;

public class Student {
    String name;
    int group;
    int[] marks;

    Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }
    public  void prStudent(ArrayList list){
        System.out.println("Фамилия: "+name.toString() +"; Группа:"+ group+"; ");
        for (int i=0;i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public void prGoogStudent(ArrayList list){
        for (int i=0;i< list.size();i++){
            int min=0;
            for (int j=0;j< marks.length; j++){
                if(marks[j]<9){
                    min=marks[j];
                }
            }
            if(min>=9){
                System.out.println(list.get(i));
            }
        }

    }
}
