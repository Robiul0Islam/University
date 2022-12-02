package University;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Course c=new Course("CSE111", "OOP", 3);
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        for(int i=0;;i++){
            System.out.println("0:Exit\n1:Add Student.\n2:Add Faculty.\n3:Drop Student.\n4:Drop Faculty.\n5.All information.");
            int x=a.nextInt();
            if(x==0){
                break;
            }
            else if(x==1){
                System.out.println("Enter the student Information:\nID:");
                int studentID=a.nextInt();
                System.out.println("Name:");
                String studentName=a.next();
                System.out.println("CGPA: ");
                double CGPA=a.nextDouble();
                Student s=new Student(studentID, studentName, CGPA);
                c.addStudent(s);
            }
            else if(x==2){
                System.out.println("Enter the Faculty Information:\nID: ");
                int facultyID=a.nextInt();
                System.out.println("Name: ");
                String facultyName=a.next();
                System.out.println("Position: ");
                String facultyPosition=a.next();
                Faculty f=new Faculty(facultyID, facultyName, facultyPosition);
                c.addFaculty(f);
            }
            else if(x==3){
                System.out.println("Enter Student ID to Drop:");
                int id=a.nextInt();
                c.dropStudent(id);
                System.out.println("Student Dropped.");
            }
            else if(x==4){
                c.dropFaculty();
                System.out.println("Yeah Faculty is dropped!");
            }
            else if(x==5){
                System.out.println("Student Information:");
                System.out.println("-----------------------------");
                c.printStudentList();
                System.out.println("-------------------------------");
                System.out.println("Faculty Information:");
                c.printFacultyInfo();
                System.out.println("-------------------------------");
            }
        }
    }
}
