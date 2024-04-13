import java.util.ArrayList;

public class StudentGroup {
    public ArrayList<Student> group;

    public StudentGroup() {
        this.group = new ArrayList<Student>();
    }


    public void addStudent(Student student) {
        if (group.size() >= 15) {
            throw new IllegalArgumentException("Maksymalna ilość studentów w grupie to 15!");
        }

        if (group.contains(student)) {
            throw new IllegalArgumentException("Ten student należy już do tej grupy!");

        }
        group.add(student);
    }
}
