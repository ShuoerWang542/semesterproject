import java.util.*;

public class ListOfStu {
    private ArrayList<Student> studentList;

    public Boolean insertStudent(Student student) {
        if (student == null) return false;
        studentList.add(student);
        return true;
    }

    public Boolean changeInfo(String line){
        int add = studentList.indexOf(line);
        if (add == -1) return false;
        System.out.println(studentList.get(add));
        Student studenthere = studentList.get(add);
        Scanner kb = new Scanner(System.in);
        int s = kb .nextInt();
        studenthere.setsExamScore(s);
    }

    public Student getStudentByAllinfo(String studentInfo) {
        for (Student student : studentList){
            if (student.getByAllInfo(studentInfo) != null) return student;
        }
        return null;
    }

    public String toString(){
        return "The system have " + String.valueOf(studentList.size()) + "totally.";
    }
}