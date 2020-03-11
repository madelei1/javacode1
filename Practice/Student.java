package Practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String class1;
    double c;

    public Student() {
    }

    public Student(String name, String class1, double c) {
        this.name = name;
        this.class1 = class1;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                ", c=" + c +
                '}';
    }
}
class Student_score {
    public static List<Student> print() {
        List<Student> stu = new ArrayList<>(10);
        Student s = new Student();
        s.name = "ZhangSan";
        s.class1 = "1班";
        s.c = 90;
        stu.add(s);

        return stu;

    }

    public static void main(String[] args) {

        System.out.println(print());
    }
}
