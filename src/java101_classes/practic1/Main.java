package java101_classes.practic1;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mert", "90550000000", "MAT");
        Teacher t2 = new Teacher("Sabri", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("x", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addVivaExamNote(60,100,55);
        s1.isPass();

        Student s2 = new Student("y", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);

        s1.addVivaExamNote(60,60,55);
        s2.isPass();

        Student s3 = new Student("z", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);

        s1.addVivaExamNote(90,100,10);
        s3.isPass();
    }
}
