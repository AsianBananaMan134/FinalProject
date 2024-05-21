import java.util.Scanner;

/**
 * This is the main method of the overall project.
 * This project would create a seating chart with the
 * students that are attending the class(aka present).
 *
 * @author Allen Ukigai
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the teacher name?: ");
        String teacherName = input.nextLine();

        System.out.println("How wide do you want the classroom to be?: ");
        int width = input.nextInt();

        System.out.println("How long do you want the classroom to be?: ");
        int length = input.nextInt();

        Classroom classroom = new Classroom(teacherName, width, length);
        classroom.assignSeats();
        classroom.setAttendance();
        classroom.updateStudents();
        classroom.getAttendance();
        classroom.introductions();
        classroom.getStudentList();

    }
}
