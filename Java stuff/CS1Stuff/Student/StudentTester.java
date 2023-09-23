package Student;
public class StudentTester {
    
    public static void main (String [] args){
        Student student1 = new Student();
        student1.setStudentName("Caleb Carlton");
        student1.setStudentID(384278);
        System.out.println("Your name is " + student1.getStudentName());        
        System.out.println("Your ID number is " + student1.getStudentID());
    }
}