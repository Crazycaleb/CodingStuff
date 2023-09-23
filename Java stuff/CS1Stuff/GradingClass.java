    /**
     * This class gets and sets each assignment or test to a specific grade based on user input.
     * @author Caleb Carlton (group 4)
     */
public class GradingClass {

    private double[] quiz;
    private double[] lab;
    private double project;
    private double exam1;
    private double exam2;
    private double attendance;
    private double finalGrade;

    /**
     * @param quiz Grades for all 5 quizzes
     * @param lab Grades for all 5 labs
     * @param project Grade for project
     * @param exam1 Grade for first exam
     * @param exam2 Grade for second exam
     * @param attendace Grade for attendance
     * @param finalGrade Total grade for all assignments and tests
     */

    // --------------------------------------------------------------------------------------------

    /**
     * create new object 'GradingClass'
     */

    public GradingClass(){

    }

    /** 
     * Initialize all instance variables. Array variables are initialized in the same way as all the others.
     */

    public GradingClass(double[] quiz, double[] lab, double project, double exam1, double exam2, double attendance, double finalGrade){
        this.quiz = quiz;
        this.lab = lab;
        this.project = project;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.attendance = attendance;
        this.finalGrade = finalGrade;
    }


    
    /** 
     * Create the setters and getters for each instance variable.
     */

    public void setQuiz(double[] quiz){
        this.quiz = quiz;
    }

    public double[] getQuiz(){
        return quiz;
    } 
    
    // --------------------------------------------------------------------------------------------

    public void setLab(double[] lab){
        this.lab = lab;
    }

    public double[] getLab(){
        return lab;
    }
    // --------------------------------------------------------------------------------------------

    public void setProject(double project){
        this.project = project;
    }
    public double getProject() {
        return project;
    }
    // --------------------------------------------------------------------------------------------

    public void setExam1(double exam1) {
        this.exam1 = exam1;
    }
    public double getExam1() {
        return exam1;
    }
    // --------------------------------------------------------------------------------------------

    public void setExam2(double exam2) {
        this.exam2 = exam2;
    }
    public double getExam2() {
        return exam2;
    }
    // --------------------------------------------------------------------------------------------

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
    public double getAttendance() {
        return attendance;
    }
    // --------------------------------------------------------------------------------------------

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    public double getFinalGrade() {
        return finalGrade;
    }
    // --------------------------------------------------------------------------------------------

}
