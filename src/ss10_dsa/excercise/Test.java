package ss10_dsa.excercise;

import java.util.Arrays;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

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

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            MyList<Student> myList = new MyList<>(10);
            myList.ensureCapacity(5);
            myList.add(new Student(1, "Ironman"));
            myList.add(new Student(2, "Batman"));
            myList.add(new Student(3, "Superman"));
            myList.add(new Student(4, "Spiderman"), 1);
            myList.remove(1);
            MyList<Student> copyList = myList.clone();
            System.out.println(copyList.size);
            Student student = new Student(3, "SuperMan");
            int index = copyList.indexOf(copyList.get(1));
            System.out.println("index= " + index);
            for (int i = 0; i < myList.size; i++) {
                System.out.println(myList.get(i).toString());
            }
            System.out.println();
            System.out.println("Copy list from myList: ");
            for (int i = 0; i < copyList.size; i++) {
                System.out.println(myList.get(i).toString());
            }
        }
    }
}
