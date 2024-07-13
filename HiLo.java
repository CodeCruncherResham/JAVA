// //multiple object


import java.util.*;

class Student {
    private int rollno;
    private String name;
    private int marks;

    public void setrnm(int r, String n, int m) {
        rollno = r;
        name = n;
        marks = m;
    }

    public int getrollno() {
        return rollno;
    }

    public String getname() {
        return name;
    }

    public int getmarks() {
        return marks;
    }
}

class HiLo {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            Student s1 = new Student();

            System.out.println("Enter rollno, name, and marks of Student " + i + ": ");
            s1.setrnm(sc.nextInt(), sc.next(), sc.nextInt());
            l.add(s1);
        }

        int max = 0, min = l.get(0).getmarks();
        for (Student v : l) {
            if (v.getmarks() > max) {
                max = v.getmarks();
            }
            if (v.getmarks() < min) {
                min = v.getmarks();
            }
        }

        System.out.println("Highest score Student Details: ");
        for (Student v : l) {
            if (v.getmarks() == max) {
                System.out.println("Name: " + v.getname());
                System.out.println("Roll No: " + v.getrollno());
                System.out.println("Marks: " + v.getmarks());
            }
        }

        System.out.println("Lowest score Student Details: ");
        for (Student v : l) {
            if (v.getmarks() == min) {
                System.out.println("Name: " + v.getname());
                System.out.println("Roll No: " + v.getrollno());
                System.out.println("Marks: " + v.getmarks());
            }
        }
    }
}

