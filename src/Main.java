import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) throws Excaption {

        Student student1 = new Student("ASEMA",21);
        Student student2 = new Student("SEZIM",16);
        Student student3 = new Student("KATYA",19);
        Student student4 = new Student("AYANA",-2);
        Student student5 = new Student("KAGEYAMA",15);
        ArrayList<Student>arrayList=new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }











    }
}