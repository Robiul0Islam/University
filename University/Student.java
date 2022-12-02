package University;

public class Student {
    private int studentID;
    private String studentName;
    private double CGPA;
    Student(){

    }
    Student(int studentID,String studentName,double CGPA){
        this.studentID=studentID;
        this.studentName=studentName;
        this.CGPA=CGPA;
    }
    public int getstudentID(){
        return studentID;
    }
    public String getstudentName(){
        return studentName;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void setstudentID(int ID){
        this.studentID=ID;
    }
    public void setstudentname(String name){
        this.studentName=name;
    }
    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public String toString(){
        return "STUDENT :{ ID: "+getstudentID()+",Name: "+getstudentName()+",CGPA: "+getCGPA();
    }
}

