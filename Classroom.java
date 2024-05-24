import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Classroom class represents a seating chart
 * concept that a teacher can use to take attendance
 * and create an attendance sheet.
 *
 * @author Allen Ukigai
 */
public class Classroom {
    public String name;
    public int totalSeats;
    public ArrayList<String> students;
    public StudentClass[][] attendanceSheet;

    /**
     * @param name the name of the teacher.
     * @param width the width of the classroom in seats.
     * @param length the length of the classroom in seats.
     */
    public Classroom(String name, int width, int length){
        this.name = name;
        attendanceSheet = new StudentClass[width][length];
        students = new ArrayList<String>();
        int totalSeats = width*length;
        System.out.println(name + "'s Classroom is " + width + " seats by " + length + " seats, with " + totalSeats + " seats total!");
    }
    /**
     * Assigns a student to a seat if the seat is not empty.
     * @param student a student object.
     * @param i the row of attendanceSheet.
     * @param j the column of the attendanceSheet.
     * @return what position the student object was assigned to in the classroom.
     */
    public String assignIndividualSeat(StudentClass student, int i, int j){
        if(attendanceSheet[i][j] != null)
        {
            return "Seat taken!";
        }
        attendanceSheet[i][j] = student;
        return student + " was assigned to [" + i + "][" + j + "]";
    }

    /**
     * Assigns the seats, loop through attendanceSheet, and takes input from
     * the teacher (name and gradeLevel) to initialize student objects.
     */
    public void assignSeats(){
        for(int row = 0; row < attendanceSheet.length; row++){
            for(int column = 0; column < attendanceSheet[row].length; column++){
                Scanner input = new Scanner(System.in);
                System.out.println("What is the name of the student?:");
                String studentName = input.nextLine();
                if(studentName != null) {
                    System.out.println("What is the grade level of the student?:");
                    int studentGradeLevel = input.nextInt();
                    attendanceSheet[row][column] = new StudentClass(studentName, studentGradeLevel);
                }

            }
        }
    }
    /**
     * @param i the row of attendanceSheet.
     * @param j the column of the attendanceSheet.
     * @return the empty attendanceSheet.
     */
    public String remove(int i, int j){
        attendanceSheet[i][j] = null;
        return  "[" + i + "][" + j + "] is now empty";
    }
    /**
     * Clears the attendanceSheet by setting them all to null.
     */
    public void clearSheet(){
        for(int row = 0; row < attendanceSheet.length; row++){
            for(int column = 0; column < attendanceSheet[row].length; column++){
                attendanceSheet[row][column] = null;
            }
        }
    }
    /**
     * Sets the attendance in the class, whether
     * they here (true) or not (false) by asking the teacher with Scanner.
     * Preconditions: Chart is initialized with student objects.
     */
    public void setAttendance(){
        for(int row = 0; row < attendanceSheet.length; row++){
            for(int column = 0; column < attendanceSheet[row].length; column++){
                Scanner input = new Scanner(System.in);
                System.out.println("Is " + attendanceSheet[row][column].getName() + " here today?(true/false)");
                attendanceSheet[row][column].setHere(input.nextBoolean());
            }
        }
    }
    /**
     * Prints out an attendance sheet with who is here and who is absent.
     * Preconditions: Chart is initialized with student objects and setAttendance()
     * has been called at least once.
     */
    public void getAttendance(){
        System.out.println("Attendance Sheet: ");
        for (StudentClass[] row : attendanceSheet) {
            for (StudentClass column : row) {
                if(column.getIsHere()) {
                    System.out.println(column.getName() + ": Here");
                }
                else{
                    System.out.println(column.getName() + ": Absent");
                }
            }
        }
        System.out.println("End of Attendance Sheet: ");
    }
    /**
     * Updates students(the arrayList not the object) with the all the student's names.
     * Preconditions: attendanceSheet has been initialized with student objects.
     */
    public void updateStudents(){
        students.clear();
        for (StudentClass[] row : attendanceSheet) {
            for (StudentClass column : row) {
                students.add(column.getName());
            }
        }
        System.out.println("The arrayList students is updated!");
    }
    /**
     * Prints out a list of all the student's names that are in the classroom.
     * Preconditions: updateStudents() has been called at least once and attendanceSheet is
     * initialized with student objects.
     */
    public void getStudentList(){
        if(students.size() > 0) {
            System.out.println("Start of List: ");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
            System.out.println("End of List: ");
        }
        else
        {
            System.out.println("No students or list have been updated!");
        }
    }
    /**
     * Prints out a list of the students introduction
     * include their name and gradeLevel.
     */
    public void introductions(){
        for (StudentClass[] row : attendanceSheet) {
            for (StudentClass column : row) {
                System.out.println(column.introduce());
            }
        }
    }
}
