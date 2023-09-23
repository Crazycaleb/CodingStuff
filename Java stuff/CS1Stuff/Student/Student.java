package Student;

public class Student{
    
    private String StudentName;
    private int StudentID;

    public Student(){

    }

    public Student(String StudentName,int StudentID){
        this.StudentName = StudentName;
        this.StudentID = StudentID;

    }

    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }

    public void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }

    public String getStudentName(){
        return StudentName;
    }

    public int getStudentID(){
        return StudentID;
    }


}