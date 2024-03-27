import java.util.ArrayList;

public class Student {
    public Student (String fname, String lname, int indexNumber, ArrayList<Double> grades,
                    String email, String address)
    {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.grades = grades;
        this.email = email;
        this.address = address;
    }
    public String fname;
    public String lname;
    public int indexNumber;
    public ArrayList<Double> grades = new ArrayList<Double>();
    public String email;
    public String address;

    public double average(){
        double avg = 0;
        for(int i = 1; i < grades.size();i++ ){
            avg+=grades.get(i);
        }
        avg /=grades.size();
        return Math.round(avg);}

}
