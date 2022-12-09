package University;

public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private int numberOfStudent;
    private Student[] studentList=new Student[10];
    private Faculty faculty;
    

    Course(){

    }
    Course(String courseID,String courseTitle,double credit){
        this.courseID=courseID;
        this.courseTitle=courseTitle;
        this.credit=credit;
    }
    public String toString(){
        return "COURSE: { ID: "+courseID+",Title: "+courseTitle+",Credit: "+credit+"}";
    }
    public void addStudent(Student s){
        studentList[numberOfStudent++]=s;
    }
    public void addFaculty(Faculty f){
        this.faculty=f;
    }
    public void dropStudent(int studentID){
     for(int i=0;i<numberOfStudent;i++){
        if(studentID==studentList[i].getstudentID()){
            for(int j=i+1;j<numberOfStudent;j++){
                studentList[i]=studentList[j];
            }
            numberOfStudent--;
        }
     }   
    }
    public void search(int studentID){
        for(int i=0;i<numberOfStudent;i++){
            if(studentID==studentList[i].getstudentID()){
                System.out.println("-----------------------------");
                System.out.println(studentList[i].toString());
                System.out.println("-----------------------------");
            }
        }
    }
    public void dropFaculty(){
        faculty=null;
    }
    public void printStudentList(){
        for(int i=0;i<numberOfStudent;i++){
            System.out.println(studentList[i].toString());
        }
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    
    public void printFacultyInfo(){
        System.out.println(faculty.toString());
    }
    
}
