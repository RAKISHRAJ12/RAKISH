/* MEMBERS: SHAMNI A/P THANIARASU (BI19110165)
            LEVANNYAH A/P RAJASEGARAN (BI19160337)
            HARUL NARTH RAJ A/L SELWAR RAJU (BI19110105)
            RAKISH RAJ A/L SUBRAMANIAM (BI19110076)
            
   PROJECT TITLE: COURSE GRADE FOR HC00
  
   COURSE: KK14203 OBJECT ORIENTED PROGRAMMING (SEMESTER 2, 2019/2020)
           
   LECTURER : DR MOHD SHAMRIE SAININ */
  
import java.util.Scanner;

 class Student{
     private String name, matric_no, gender, email;
     private int age;
     private double prev_CGPA;
     
     Student(){
       name = " ";
       matric_no = " ";
       gender = " ";
       email = " ";
       age = 0;
       prev_CGPA = 0.00;
     }
     
     Student(String n, String m, String g, String e, int a, double p){
       name = n; 
       matric_no = m;
       gender = g;
       email = e;
       age = a;
       prev_CGPA = p;
     }
          
     String getName(){
       return name;
     }
     
     String getMatricNo(){
       return matric_no;
     }
     
     String getGender(){
       return gender;
     }
     
     String getEmail(){
       return email;
     }
     
     int getAge(){
       return age;
     }
     
     double getPrevCGPA(){
       return prev_CGPA;
     }
     
     void setName(String name){
        this.name = name;
     }
     
     void setMatricNo(String matric_no){
        this.matric_no = matric_no;
     }
     
     void setGender(String gender){
        this.gender = gender;
     }
     
     void setEmail(String email){
        this.email = email;
     }
     
     void setAge(int age){
        this.age = age;
     }
     
     void setPrevCGPA(double Prev_CGPA){
        this.prev_CGPA = prev_CGPA;
     }
     
     Scanner scan = new Scanner(System.in);
     
     void StudentInfo(){
       System.out.print("Student: ");
       name = scan.nextLine();
       
       System.out.print("Matric No.: ");
       matric_no = scan.next();
        
       System.out.print("Age: ");
       age = scan.nextInt();
        
       System.out.print("Gender: ");
       gender = scan.next();
        
       System.out.print("Email: ");
       email = scan.next();
     }
     
     void StudentPrevCGPA(){
       System.out.print("Previous CGPA: ");
       prev_CGPA = scan.nextDouble();
     }
 }
    
public class Project_11{
    public static void main(String[] args){
               
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tFaculty of Computing and Informatics");
        System.out.println("\t\t\t\t\t\tHC00 - Bachelor of Computer Science (Hons.) (Software Engineering)");
        
        Student student1 = new Student();
        student1.StudentInfo();
        student1.StudentPrevCGPA();
    }
}

            
class StudentGPA {
public static void main (String args[]){

  String grade1 = "";
  String grade2 = "";
  String grade3 = "";
  String grade4 = "";
  String grade5 = "";
  
 
  double credit1;
  double credit2;
  double credit3;
  double credit4;
  double credit5;
  double gradeValue=0;
  double totPtsClass1=0;
  double totPtsClass2=0;
  double totPtsClass3=0;
  double totPtsClass4=0;
  double totPtsClass5=0;
  double totPts=0;
  double totalCredits= 0;
  double gpa;
  int sem;
  double prvgpa;
  double prvttlcredit;
  double c;
  double q;

  Scanner console = new Scanner (System.in);
   System.out.println("\t\t\t\t\t\t\t\t\t\t\tFaculty of Computing and Informatics");
   System.out.println("\t\t\t\t\t\tHC00 - Bachelor of Computer Science (Hons.) (Software Engineering)");  
   System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGRADE MODULE");
   System.out.print("Semester: ");
   sem = console.nextInt();
   System.out.print("Previous Semester GPA: ");
   prvgpa = console.nextDouble();
   System.out.print("Previous Semester Total Credit: ");
   prvttlcredit = console.nextDouble();
   
   

  System.out.print("Please enter the number of credits for KK14203 OBJECT ORIENTED PROGRAMMING(THIS SEMESTER): ");
  credit1 = console.nextDouble();
  System.out.println("Please enter your grades for the class (Capital letters such as A,B+, C-)");
  grade1 = console.next();

  if (grade1.equals ("A"))
    gradeValue= 4.00;  
  else if (grade1.equals("A-"))
    gradeValue= 3.67;
  else if (grade1.equals("B+"))
    gradeValue = 3.33;
  else if (grade1.equals("B"))
    gradeValue = 3.00;
  else if (grade1.equals ("B-"))
    gradeValue = 2.67;
  else if (grade1.equals("C+"))
    gradeValue = 2.33;
  else if (grade1.equals("C"))
    gradeValue = 2.00;
  else if (grade1.equals ("D+"))
  gradeValue = 1.33;
  else if (grade1.equals ("D"))
    gradeValue = 1.00;
  else if (grade1.equals ("F"))
    gradeValue = 0;
  else if (grade1.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");

  totPtsClass1 = gradeValue * credit1;

  System.out.print("Please enter the number of credits of KT14203 COMPUTER ARCHITECTURE AND ORGANIZATION(THIS SEMESTER):");
  credit2 = console.nextDouble();
  System.out.println("Please enter your grades for the class (Capital letters such as A,B+, C-)");
  grade2 = console.next();

  if (grade2.equals ("A"))
    gradeValue= 4.00;
  else if (grade2.equals("A-"))
    gradeValue= 3.67;
  else if (grade2.equals("B+"))
    gradeValue = 3.33;
  else if (grade2.equals("B"))
    gradeValue = 3.00;
  else if (grade2.equals ("B-"))
    gradeValue = 2.67;
  else if (grade2.equals("C+"))
    gradeValue = 2.33;
  else if (grade2.equals("C"))
    gradeValue = 2.00;
  else if (grade2.equals ("D+"))
  gradeValue = 1.33;
  else if (grade2.equals ("D"))
    gradeValue = 1.00;
  else if (grade2.equals ("F"))
    gradeValue = 0;
  else if (grade2.equals ("FX"))
    gradeValue = 0;
  else
  System.out.println ("Invalid Grade");

  totPtsClass2 = gradeValue * credit2;

  System.out.print("Please enter the number of credits of KT14403 DISCRETE STRUCTURES(THIS SEMESTER): ");
  credit3 = console.nextDouble();
  System.out.println("Please enter your grades for the class (Capital letters such as A,B+, C-)");
  grade3 = console.next();

  if (grade3.equals ("A"))
    gradeValue= 4.00;
  else if (grade3.equals("A-"))
    gradeValue= 3.67;
  else if (grade3.equals("B+"))
    gradeValue = 3.33;
  else if (grade3.equals("B"))
    gradeValue = 3.00;
  else if (grade3.equals ("B-"))
    gradeValue = 2.67;
  else if (grade3.equals("C+"))
    gradeValue = 2.33;
  else if (grade3.equals("C"))
    gradeValue = 2.00;
  else if (grade3.equals ("D+"))
  gradeValue = 1.33;
  else if (grade3.equals ("D"))
    gradeValue = 1.00;
  else if (grade3.equals ("F"))
    gradeValue = 0;
  else if (grade3.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");

    totPtsClass3 = gradeValue * credit3;

  System.out.print("Please enter the number of credits of the UB01002 ESSENTIAL COMMUNICATION SKILLS(THIS SEMESTER):");
  credit4 = console.nextDouble();
  System.out.println("Please enter your grades for the class (Capital letters such as A,B+, C-)");
  grade4 = console.next();

  if (grade4.equals ("A"))
    gradeValue= 4.00;
  else if (grade4.equals("A-"))
    gradeValue= 3.67;
  else if (grade4.equals("B+"))
    gradeValue = 3.33;
  else if (grade4.equals("B"))
    gradeValue = 3.00;
  else if (grade4.equals ("B-"))
    gradeValue = 2.67;
  else if (grade4.equals("C+"))
    gradeValue = 2.33;
  else if (grade4.equals("C"))
    gradeValue = 2.00;
  else if (grade4.equals ("D+"))
  gradeValue = 1.33;
  else if (grade4.equals ("D"))
    gradeValue = 1.00;
  else if (grade4.equals ("F"))
    gradeValue = 0;
  else if (grade4.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");
  totPtsClass4 = gradeValue * credit4;
  
  System.out.print("Please enter the number of credits of the UC01002 CORPORATE COMMUNICATIONS(THIS SEMESTER): ");
  credit5 = console.nextDouble();
  System.out.println("Please enter your grades for the class (Capital letters such as A,B+, C-)");
  grade5 = console.next();

  if (grade5.equals ("A"))
    gradeValue= 4.00;
  else if (grade5.equals("A-"))
    gradeValue= 3.67;
  else if (grade5.equals("B+"))
    gradeValue = 3.33;
  else if (grade5.equals("B"))
    gradeValue = 3.00;
  else if (grade5.equals ("B-"))
    gradeValue = 2.67;
  else if (grade5.equals("C+"))
    gradeValue = 2.33;
  else if (grade5.equals("C"))
    gradeValue = 2.00;
  else if (grade5.equals ("D+"))
  gradeValue = 1.33;
  else if (grade5.equals ("D"))
    gradeValue = 1.00;
  else if (grade5.equals ("F"))
    gradeValue = 0;
  else if (grade5.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");
  totPtsClass5 = gradeValue * credit5;


  totPts= totPtsClass1+totPtsClass2+totPtsClass3+totPtsClass4+totPtsClass5;
  totalCredits = credit1+credit2+credit3+credit4+credit5;
  gpa= totPts / totalCredits;
  q =  prvttlcredit + totalCredits;
  c = q/((gpa*totalCredits)+(prvgpa*prvttlcredit));
  
  
       System.out.println("KK14203 OBJECT ORIENTED PROGRAMMING: " +grade1);
       
       System.out.println("KT14203 COMPUTER ARCHITECTURE AND ORGANIZATION: " +grade2);
        
       System.out.println("KT14403 DISCRETE STRUCTURES: "+grade3);
               
       System.out.println("UB01002 ESSENTIAL COMMUNICATION SKILLS: "+grade4);
        
       System.out.println("UC01002 CORPORATE COMMUNICATIONS: "+grade5);

  System.out.println("YOUR TOTAL POINT IS =" +totPts);
  System.out.println("YOUR TOTAL CREDIT IS =" +totalCredits);
  System.out.printf("Your GPA is: %.2f\n", + gpa);
 
  
  
    }
}