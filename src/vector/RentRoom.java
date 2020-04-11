package vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentRoom {
    public static void main(String[] args) {

        List<Student> rooms = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("How many students are you receiving?");
        int numberOfStudents = in.nextInt();
        in.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("What is the name of the "+ (i+1) +" student?");
            String name = in.nextLine();
            System.out.println("What is the age of this student?");
            int age = in.nextInt();
            in.nextLine();
            System.out.println("In which room is this student staying?");
            int room = in.nextInt();
            in.nextLine();
            System.out.println("Student:" +
                               "\nName: " + name +
                               "\nAge: " + age +
                               "\nRoom: " + room +
                               "\nConfirm?" +
                               "\nY - Yes" +
                               "\nN - No");
            String choice = String.valueOf(in.nextLine().charAt(0));
            if (choice.toUpperCase().equals("Y")){
                rooms.add(new Student(name, age, room));
            } else {
                i--;
            }
        }

        System.out.println("Type the name of the student who will change room:");
        String studentToChangeRoom = in.nextLine();
        Student studentToChangeRoomExist = rooms.stream().filter(student -> student.getName().equals(studentToChangeRoom)).findFirst().orElse(null);
        if (studentToChangeRoomExist != null) {
            System.out.println("To which room is "+ studentToChangeRoom +" moving?");
            int newRoom = in.nextInt();
            studentToChangeRoomExist.setRoom(newRoom);
        } else {
            System.out.println("There is no registry of: " + studentToChangeRoom);
        }

        System.out.println("Rooms occupants:");
        for (final Student student:rooms) {
            if (student != null){
                System.out.println();
                System.out.println(student.toString());
            }
        }
        in.close();
    }
}
