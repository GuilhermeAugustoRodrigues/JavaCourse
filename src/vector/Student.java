package vector;

public class Student {
    int age, room;
    String name;

    public Student(String name, int age, int room) {
        this.name = name;
        this.age = age;
        this.room = room;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student:" +
               "\nName: " + name +
               "\nAge: " + age +
               "\nRoom: " + room;
    }
}
