import java.util.*;

public class SysUser {
    public static void main(String [] args) {
        ListOfStu studentList = new ListOfStu();
        Scanner kb = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want?(reply by number)");
            System.out.println("1.input student information.");
            System.out.println("2.upgrade student's scores.");
            System.out.println("3.search the student");
            System.out.println("4.modify the information");
            System.out.println("5.get ranking.");
            int value = kb.nextInt();
            switch (value) {
                case 1 :
                    while(true) {
                        System.out.println("first name?");
                        String firstName = kb.nextLine();
                        System.out.println("last name?");
                        String lastName = kb.nextLine();
                        System.out.println("HKID?");
                        String HKID = kb.nextLine();
                        System.out.println("student id?");
                        String studentID = kb.nextLine();
                        System.out.println(firstName + lastName + HKID + studentID + " confirm?( Y or N)");
                        String asw = kb.nextLine();
                        if (asw.equalsIgnoreCase("Y")) {
                            Student thisStudent = new Student(firstName, lastName, HKID, studentID, 0);
                            if (!studentList.insertStudent(thisStudent)){
                                System.out.println("System encounter some problems during insertion.");
                            }
                            break;
                        } else continue;
                    }
                    continue;

                case 2:
                    System.out.println("Student information:(you can search by name or HKID or student ID.)");
                    String line1 = kb.nextLine();
                    Student resultStudent = studentList.getStudentByAllinfo(line1);
                    if (resultStudent == null) continue;
                    System.out.println(resultStudent);
                    System.out.println("Input new score:");
                    line1 = kb.nextLine();
                    if (!line1.matches("-?\\d+")){
                        System.out.println("Wrong input.");
                        continue;
                    }
                    resultStudent.setsExamScore(Integer.parseInt(line1));
                    continue;

                case 3:
                    System.out.println("Student information:(you can search by name or HKID or student ID.)");
                    String line2 = kb.nextLine();
                    Student resultStudent = studentList.getStudentByAllinfo(line2);

                    continue;

                case 4:
                    System.out.println("Student information:(you can search by name or HKID or student ID.)");








            }



        }
    }
}



