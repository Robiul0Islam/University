package University;

public class Faculty {
    private int facultyID;
    private String facultyName;
    private String facultyPosition;

    Faculty(){

    }
    Faculty(int facultyID,String facultyName,String facultyPosition){
        this.facultyID=facultyID;
        this.facultyName=facultyName;
        this.facultyPosition=facultyPosition;
    }
    public int getfacultyID(){
        return facultyID;
    }
    public String getfacultyName(){
        return facultyName;
    }
    public String getfacultyPosition(){
        return facultyPosition;
    }
    public void setfacultyID(int ID){
        this.facultyID=ID;

    }
    public void setfacultyName(String name){
        this.facultyName=name;
    }
    public void setfacultyPosition(String position){
        this.facultyPosition=position;
    }
    public String toString(){
        return "FACULTY :{ ID: "+getfacultyID()+",Name: "+getfacultyName()+",Position: "+getfacultyPosition()+"}";
    }
}
