import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String firstname;
    private String lastname;
    private String HKID;
    private String studentID;
    private int examScore;

    public Student(String f, String l, String h, String s, int e){
        firstname = f;
        lastname = l;
        HKID = h;
        studentID = s;
        examScore = e;
    }

    public String getFirstname(){
        return firstname;
    }

    public boolean setFisrtname(String firstname){
        if(firstname == null) return false;
        this.firstname = firstname;
        return true;
    }

    public String getLastname(){
        return lastname;
    }

    public boolean setLastname(String lastname){
        if(lastname == null) return false;
        this.lastname = lastname;
        return true;
    }

    public String getFullName(){
        return firstname + " " + lastname;
    }

    public String getHKID(){
        return HKID;
    }

    public boolean setHKID(String HKID){
        if(HKID == null) return false;
        this.HKID = HKID;
        return  true;
    }

    public String getStudentID(){
        return studentID;
    }

    public boolean setStudentID(String studentID){
        if(studentID == null) return false;
        this.studentID = studentID;
        return true;
    }

    public int getExamScore(){
        return examScore;
    }

    public boolean setsExamScore(int examScore){
        this.examScore = examScore;
        return true;
    }

    public Student getByAllInfo(String searchInfo) {
        if (getFullName().equals(searchInfo)) return this;
        if (getFirstname().equals(searchInfo)) return this;
        if (getLastname().equals(searchInfo)) return this;
        if (getHKID().equals(searchInfo)) return this;
        if (getStudentID().equals(searchInfo)) return this;
        return null;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("First name:" + firstname);
        builder.append("\nLast name: " + lastname);
        builder.append("\nHKID: " + HKID);
        builder.append("\nStudent ID: " + studentID);
        builder.append("\nScore: "+ examScore);
        return builder.toString();
    }

    @Override
    public int compare(Student a, Student b) {
        return a.examScore - b.examScore;
    }

}
