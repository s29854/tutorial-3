import java.util.ArrayList;

public class Student {
    public Student (String fname, String lname, String indexNumber,
                    String email, String address)
    {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    public String fname;
    public String lname;
    public String indexNumber;
    public ArrayList<Double> grades;
    public String email;
    public String address;

    public double calculateAverage(){
        if (grades.isEmpty()){
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }
        double average = 0;
        for(int i = 1; i < grades.size();i++ ){
            average+=grades.get(i);
        }
        average /=grades.size();
        return roundToNearestValidGrade(average);}

    public void addGrade (double grade){
        if (grades == null){
            grades = new ArrayList<Double>();
        }
        if (grades.size() >= 20 ){
            throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");
        }
        grades.add(grade);
    }
    private double roundToNearestValidGrade(double average){
        double[] validGrades = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double closestGrade = validGrades[0];
        double minDifference = Math.abs(average - closestGrade);
        for (int i = 1; i < validGrades.length; i++){
            double currentDifference = validGrades[i];
            if(currentDifference < minDifference){
                minDifference = currentDifference;
                closestGrade = validGrades[i];

            }
        }

    return closestGrade;}

}
