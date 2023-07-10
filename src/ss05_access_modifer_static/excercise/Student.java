package ss05_access_modifer_static.excercise;

public class Student {

    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.setName("Phước Hưng");
        studentOne.setClasses("C0523G1");
        System.out.println(studentOne.toString());
    }
}

