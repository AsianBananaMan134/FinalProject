/**
 * The StudentClass class is the subclass of the Student class.
 * This class will check if the student is attending class.
 *
 * @author Allen Ukigai
 */
public class StudentClass extends Student{
    private boolean isHere;
    /**
     * @param gradeLevel the grade level the student is in.
     * @param name the students name.
     */
    public StudentClass(String name, int gradeLevel){
        super(name, gradeLevel);
        this.isHere = false;
    }
    /**
     * @param isHere sets the students attendance.
     */
    public void setHere(boolean isHere){
        this.isHere = isHere;
    }
    /**
     * @return if the student is here or not.
     */
    public boolean getIsHere(){
        return isHere;
    }
}
