/**
 * The Student class is the superclass of the
 * StudentClass class. This class creates a basic student.
 *
 * @author Allen Ukigai
 */
public class Student{
    private String name;
    private int gradeLevel;
    /**
     * @param name the name of the student.
     * @param gradeLevel the grade level of the student.
     */
    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    /**
     * @return the student's name.
     */
    public String getName(){
        return name;
    }
    /**
     * @return the student's grade level.
     */
    public int getGrade(){
        return gradeLevel;
    }
    /**
     * Changes the student's name.
     * @param name that will replace the student's current name.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Changes the students gradeLevel
     * @param gradeLevel the grade level that will replace the student's current grade level.
     */
    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    /**
     * @return an introduction of the student's name and grade.
     */
    public String introduce(){
        return "Hello, my name is " + name + " and I am in " + gradeLevel + "th grade";
    }
}
