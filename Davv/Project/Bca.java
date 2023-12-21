import java.io.IOException;
import java.util.Scanner;
public class Bca{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int sem=1;
        Semester1 sem1=new Semester1();
        Semester2 sem2=new Semester2();
        // Semester3 sem3=new Semester3();
        
        while(sem<=1){
            System.out.println("Enter "+sem+" Semester Marks");

            switch(sem){
                case 1:
                    sem1=takeSemester1Marks(sem1);
                    int c = atkt_pass_fail(sem1);
                    if(c>2){
                        System.out.println("You are fail in this semester please Repeat this semester :");
                        continue;
                    }else if(c>=1&&c<=2){
                        int attempt=0;
                        while(attempt<2){
                            display(sem1);
                            sem1=giveAtktExamForSem1(sem1);
                            c=atkt_pass_fail(sem1);
                            if(c==0){
                                break;
                            }
                            attempt++;
                        }
                        if(attempt>=2){
                            System.out.println("You have completed your atttempt please repeat your semester :");
                            continue;
                        }
                    }
                    // Runtime.getRuntime().exec("clear");
                     display(sem1);
                    System.out.println("You cleaared Your First Semester : ");
                   
                    sem++;
                    System.out.println("sem   "+ sem);
                    // break;

                case 2:
                      sem2=takeSemester1Marks(sem2);
                     c = atkt_pass_fail(sem2);
                    if(c>2){
                        System.out.println("You are fail in this semester please Repeat this semester :");
                        continue;
                    }else if(c>=1&&c<=2){
                        int attempt=0;
                        while(attempt<2){
                            display(sem2);
                            sem2=giveAtktExamForSem2(sem2);
                            c=atkt_pass_fail(sem2);
                            if(c==0){
                                break;
                            }
                            attempt++;
                        }
                        if(attempt>=2){
                            System.out.println("You have completed your atttempt please repeat your semester :");
                            continue;
                        }
                    }
                     display(sem2);
                    System.out.println("You cleaared Your Second Semester : ");
                    sem++;
                    break;

                case 3:
                    break;
            }
        }

        // sem=0;
        while(true){
            System.out.println("1.To See First Semester Marksheet");
            System.out.println("2.To See Second Semester Marksheet");
            System.out.println("3.To See Third Semester Marksheet");
            System.out.println("4.To See Fourth Semester Marksheet");
            System.out.println("5.To See Fifth Semester Marksheet");
            System.out.println("6.To See Sixth Semester Marksheet");
            System.out.println("7.To See First Semester ATKT Marksheet");
            System.out.println("8.To See First Semester ATKT Marksheet");
            System.out.println("9.To See First Semester ATKT Marksheet");
            System.out.println("10.To See First Semester ATKT Marksheet");
            System.out.println("11.To See First Semester ATKT Marksheet");
            System.out.println("12.To See First Semester ATKT Marksheet");
            System.out.println("13.EXIT");

            sem=sc.nextInt();

            switch(sem){
                case 1:
                    display(sem1);
                    break;
                case 2:
                    display(sem2);
                    break;    
                case 7:
                    displayAtkt(sem1);
                    break;
                 case 8:
                    display(sem2);
                    break;    
                case 13:
                    System.exit(0);
            }
        }
    }

    public static void displayAtkt(Semester1 sem) {
        System.out.println("Subject         Internal        Practical       Theory");
        for (int i=0;i<sem.getSubjects().length;i++) {
            System.out.print(sem.getMarks()[i].getSubject()+"           ");
            if(sem.getMarks()[i].getInternalExam()==0)
            {
                if(sem.getMarks()[i].getAtktClearInternal()==1){
                    String s = "\u001B[31m";
                    System.out.print(s+"ATKT            ");
                }
                else
                    System.out.print(sem.getMarks()[i].getInternal()+"              ");
            }
            else
                System.out.print("NO_EXAM             ");
            
            if(sem.getMarks()[i].getPracticalExam()==0)
            {
                if(sem.getMarks()[i].getAtktClearPractical()==1){
                  String s = "\u001B[31m";
                    System.out.print(s+"ATKT            ");
                }
                else
                    System.out.print(sem.getMarks()[i].getPractical()+"             ");
            }
            else
                System.out.print("NO_EXAM             ");
                    
            if(sem.getMarks()[i].getTheoryExam()==0)
            {
                if(sem.getMarks()[i].getAtktClearTheory()==1){
                  String s = "\u001B[31m";
                    System.out.print(s+"ATKT            ");                }
                else
                    System.out.print(sem.getMarks()[i].getTheory()+"              ");
            }else
                System.out.print("NO_EXAM             ");

            System.out.println("\n\n");
        }
    }

    public static Semester1 giveAtktExamForSem1(Semester1 sem) {
        System.out.println("Give ATKT EXAM : ");
        System.out.println("============================================================================");
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1){
                    while(true){
                        System.out.println("Enter Internal Marks For "+sem.getMarks()[i].getSubject()+" out of 20 :");
                        sem.getMarks()[i].setInternal(sc.nextDouble());
                        if(sem.getMarks()[i].getInternal()>20 || sem.getMarks()[i].getInternal()<0)
                            System.out.println("You entered Wrong Marks Please Enter Again : ");
                        else
                            break;
                    }
                    if(sem.getMarks()[i].getInternal()>=8)
                        sem.getMarks()[i].setInternalAtkt(0);
                }
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Practical Marks For "+sem.getMarks()[i].getSubject()+" out of 25 :");
                    sem.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem.getMarks()[i].getPractical()>25 || sem.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getPractical()>=10)
                    sem.getMarks()[i].setPracticalAtkt(0);
                }
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Theory Marks For "+sem.getMarks()[i].getSubject()+" out of 50 :");
                    sem.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem.getMarks()[i].getTheory()>50 || sem.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getTheory()>=18)
                    sem.getMarks()[i].setTheoryAtkt(0);
                }
            }
        }

        return sem;
    }

    public static int atkt_pass_fail(Semester1 sem) {
        int c=0;
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    c++;
            }
        }
        return c;
    }

    public static void display(Semester1 sem){
        System.out.println("Subject                 Internal              Practical             Theory");
        for (int i=0;i<sem.getSubjects().length;i++) {
            System.out.print(sem.getMarks()[i].getSubject()+"             ");
            if(sem.getMarks()[i].getInternalExam()==0)
            {
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getInternal()+"                ");
            }
            else
                System.out.print("NO_EXAM               ");
            
            if(sem.getMarks()[i].getPracticalExam()==0)
            {
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getPractical()+"               ");
            }
            else
                System.out.print("NO_EXAM               ");
                    
            if(sem.getMarks()[i].getTheoryExam()==0)
            {
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getTheory()+"                ");
            }else
                System.out.print("NO_EXAM               ");

            System.out.println("\n\n");
        }
    }

    public static Semester1 takeSemester1Marks(Semester1 sem1){
        for(int i=0;i<sem1.getSubjects().length;i++){
            if(sem1.getMarks()[i].getInternalExam()==0){
                while(true){
                    System.out.println("Enter Internal Marks For "+sem1.getMarks()[i].getSubject()+" out of 20 :");
                    sem1.getMarks()[i].setInternal(sc.nextDouble());
                    if(sem1.getMarks()[i].getInternal()>20 || sem1.getMarks()[i].getInternal()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem1.getMarks()[i].getInternal()<8){
                    sem1.getMarks()[i].setInternalAtkt(1);
                    sem1.getMarks()[i].setAtktClearInternal(1);
                }
            }
            
            if(sem1.getMarks()[i].getPracticalExam()==0){
                while(true){
                    System.out.println("Enter Practical Marks For "+sem1.getMarks()[i].getSubject()+" out of 25 :");
                    sem1.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem1.getMarks()[i].getPractical()>25 || sem1.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem1.getMarks()[i].getPractical()<10){
                    sem1.getMarks()[i].setPracticalAtkt(1);
                    sem1.getMarks()[i].setAtktClearPractical(1);
                }
            }

            if(sem1.getMarks()[i].getTheoryExam()==0){ 
                while(true){
                    System.out.println("Enter Theory Marks For "+sem1.getMarks()[i].getSubject()+" out of 50 :");
                    sem1.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem1.getMarks()[i].getTheory()>50 || sem1.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem1.getMarks()[i].getTheory()<18){
                    sem1.getMarks()[i].setTheoryAtkt(1);
                    sem1.getMarks()[i].setAtktClearTheory(1);
                }
            }
        }
        return sem1;

    }
// Semester 1st End =============================================================== SEmester 1st


// Semester 2nd Start ========================================================
  public static Semester2 takeSemester1Marks(Semester2 sem2){
    System.out.println("Enter Your Second Semester Marks");
        for(int i=0;i<sem2.getSubjects().length;i++){
            if(sem2.getMarks()[i].getInternalExam()==0){
                while(true){
                    System.out.println("Enter Internal Marks For "+sem2.getMarks()[i].getSubject()+" out of 20 :");
                    sem2.getMarks()[i].setInternal(sc.nextDouble());
                    if(sem2.getMarks()[i].getInternal()>20 || sem2.getMarks()[i].getInternal()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem2.getMarks()[i].getInternal()<8){
                    sem2.getMarks()[i].setInternalAtkt(1);
                    sem2.getMarks()[i].setAtktClearInternal(1);
                }
            }
            
            if(sem2.getMarks()[i].getPracticalExam()==0){
                while(true){
                    System.out.println("Enter Practical Marks For "+sem2.getMarks()[i].getSubject()+" out of 25 :");
                    sem2.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem2.getMarks()[i].getPractical()>25 || sem2.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem2.getMarks()[i].getPractical()<10){
                    sem2.getMarks()[i].setPracticalAtkt(1);
                    sem2.getMarks()[i].setAtktClearPractical(1);
                }
            }

            if(sem2.getMarks()[i].getTheoryExam()==0){ 
                while(true){
                    System.out.println("Enter Theory Marks For "+sem2.getMarks()[i].getSubject()+" out of 50 :");
                    sem2.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem2.getMarks()[i].getTheory()>50 || sem2.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem2.getMarks()[i].getTheory()<18){
                    sem2.getMarks()[i].setTheoryAtkt(1);
                    sem2.getMarks()[i].setAtktClearTheory(1);
                }
            }
        }
        return sem2;

    }
// Semester 2nd =======================================
    public static void display(Semester2 sem){
        System.out.println("Subject                 Internal              Practical             Theory");
        for (int i=0;i<sem.getSubjects().length;i++) {
            System.out.print(sem.getMarks()[i].getSubject()+"             ");
            if(sem.getMarks()[i].getInternalExam()==0)
            {
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getInternal()+"                ");
            }
            else
                System.out.print("NO_EXAM               ");
            
            if(sem.getMarks()[i].getPracticalExam()==0)
            {
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getPractical()+"               ");
            }
            else
                System.out.print("NO_EXAM               ");
                    
            if(sem.getMarks()[i].getTheoryExam()==0)
            {
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getTheory()+"                ");
            }else
                System.out.print("NO_EXAM               ");

            System.out.println("\n\n");
        }
    }

    // Semester 2nd ==============================

     public static int atkt_pass_fail(Semester2 sem) {
        int c=0;
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    c++;
            }
        }
        return c;
    }
// Semester 2nd ========================================

 public static Semester2 giveAtktExamForSem2(Semester2 sem) {
        System.out.println("Give ATKT EXAM : ");
        System.out.println("============================================================================");
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1){
                    while(true){
                        System.out.println("Enter Internal Marks For "+sem.getMarks()[i].getSubject()+" out of 20 :");
                        sem.getMarks()[i].setInternal(sc.nextDouble());
                        if(sem.getMarks()[i].getInternal()>20 || sem.getMarks()[i].getInternal()<0)
                            System.out.println("You entered Wrong Marks Please Enter Again : ");
                        else
                            break;
                    }
                    if(sem.getMarks()[i].getInternal()>=8)
                        sem.getMarks()[i].setInternalAtkt(0);
                }
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Practical Marks For "+sem.getMarks()[i].getSubject()+" out of 25 :");
                    sem.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem.getMarks()[i].getPractical()>25 || sem.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getPractical()>=10)
                    sem.getMarks()[i].setPracticalAtkt(0);
                }
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Theory Marks For "+sem.getMarks()[i].getSubject()+" out of 50 :");
                    sem.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem.getMarks()[i].getTheory()>50 || sem.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getTheory()>=18)
                    sem.getMarks()[i].setTheoryAtkt(0);
                }
            }
        }

        return sem;
    }
    // Semester 2nd ========================================================= Semester 2nd End 


    // Semester 3rd ======================================================== Semester 3rd Strart 



    public static Semester3 takeSemester3Marks(Semester3 sem3){
    System.out.println("Enter Your Second Semester Marks");
        for(int i=0;i<sem3.getSubjects().length;i++){
            if(sem3.getMarks()[i].getInternalExam()==0){
                while(true){
                    System.out.println("Enter Internal Marks For "+sem3.getMarks()[i].getSubject()+" out of 20 :");
                    sem3.getMarks()[i].setInternal(sc.nextDouble());
                    if(sem3.getMarks()[i].getInternal()>20 || sem3.getMarks()[i].getInternal()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem3.getMarks()[i].getInternal()<8){
                    sem3.getMarks()[i].setInternalAtkt(1);
                    sem3.getMarks()[i].setAtktClearInternal(1);
                }
            }
            
            if(sem3.getMarks()[i].getPracticalExam()==0){
                while(true){
                    System.out.println("Enter Practical Marks For "+sem3.getMarks()[i].getSubject()+" out of 25 :");
                    sem3.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem3.getMarks()[i].getPractical()>25 || sem3.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem3.getMarks()[i].getPractical()<10){
                    sem3.getMarks()[i].setPracticalAtkt(1);
                    sem3.getMarks()[i].setAtktClearPractical(1);
                }
            }

            if(sem3.getMarks()[i].getTheoryExam()==0){ 
                while(true){
                    System.out.println("Enter Theory Marks For "+sem3.getMarks()[i].getSubject()+" out of 50 :");
                    sem3.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem3.getMarks()[i].getTheory()>50 || sem3.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem3.getMarks()[i].getTheory()<18){
                    sem3.getMarks()[i].setTheoryAtkt(1);
                    sem3.getMarks()[i].setAtktClearTheory(1);
                }
            }
        }
        return sem3;

    }
// Semester 3rd =======================================
    public static void display(Semester3 sem){
        System.out.println("Subject                 Internal              Practical             Theory");
        for (int i=0;i<sem.getSubjects().length;i++) {
            System.out.print(sem.getMarks()[i].getSubject()+"             ");
            if(sem.getMarks()[i].getInternalExam()==0)
            {
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getInternal()+"                ");
            }
            else
                System.out.print("NO_EXAM               ");
            
            if(sem.getMarks()[i].getPracticalExam()==0)
            {
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getPractical()+"               ");
            }
            else
                System.out.print("NO_EXAM               ");
                    
            if(sem.getMarks()[i].getTheoryExam()==0)
            {
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    System.out.print("ATKT              ");
                else
                    System.out.print(sem.getMarks()[i].getTheory()+"                ");
            }else
                System.out.print("NO_EXAM               ");

            System.out.println("\n\n");
        }
    }

    // Semester 3rd ==============================

     public static int atkt_pass_fail(Semester3 sem) {
        int c=0;
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                    c++;
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                    c++;
            }
        }
        return c;
    }
// Semester 3nd ========================================

 public static Semester3 giveAtktExamForSem2(Semester3 sem) {
        System.out.println("Give ATKT EXAM : ");
        System.out.println("============================================================================");
        for (int i=0;i<sem.getSubjects().length;i++) {
            if(sem.getMarks()[i].getInternalExam()==0){
                if(sem.getMarks()[i].getInternalAtkt()==1){
                    while(true){
                        System.out.println("Enter Internal Marks For "+sem.getMarks()[i].getSubject()+" out of 20 :");
                        sem.getMarks()[i].setInternal(sc.nextDouble());
                        if(sem.getMarks()[i].getInternal()>20 || sem.getMarks()[i].getInternal()<0)
                            System.out.println("You entered Wrong Marks Please Enter Again : ");
                        else
                            break;
                    }
                    if(sem.getMarks()[i].getInternal()>=8)
                        sem.getMarks()[i].setInternalAtkt(0);
                }
            }if(sem.getMarks()[i].getPracticalExam()==0){
                if(sem.getMarks()[i].getPracticalAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Practical Marks For "+sem.getMarks()[i].getSubject()+" out of 25 :");
                    sem.getMarks()[i].setPractical(sc.nextDouble());
                    if(sem.getMarks()[i].getPractical()>25 || sem.getMarks()[i].getPractical()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getPractical()>=10)
                    sem.getMarks()[i].setPracticalAtkt(0);
                }
            }if(sem.getMarks()[i].getTheoryExam()==0){
                if(sem.getMarks()[i].getTheoryAtkt()==1)
                {
                    while(true){
                    System.out.println("Enter Theory Marks For "+sem.getMarks()[i].getSubject()+" out of 50 :");
                    sem.getMarks()[i].setTheory(sc.nextDouble());
                    if(sem.getMarks()[i].getTheory()>50 || sem.getMarks()[i].getTheory()<0)
                        System.out.println("You entered Wrong Marks Please Enter Again : ");
                    else
                        break;
                }
                if(sem.getMarks()[i].getTheory()>=18)
                    sem.getMarks()[i].setTheoryAtkt(0);
                }
            }
        }

        return sem;
    }
}

class MarksContainer{
    private int atktClearInternal = 0;
    public int getAtktClearInternal() {
        return atktClearInternal;
    }
    public void setAtktClearInternal(int atktClearInternal) {
        this.atktClearInternal = atktClearInternal;
    }
    public int getAtktClearPractical() {
        return atktClearPractical;
    }
    public void setAtktClearPractical(int atktClearPractical) {
        this.atktClearPractical = atktClearPractical;
    }
    public int getAtktClearTheory() {
        return atktClearTheory;
    }
    public void setAtktClearTheory(int atktClearTheory) {
        this.atktClearTheory = atktClearTheory;
    }
    private int atktClearPractical=0;
    private int atktClearTheory=0;
    private int practicalAtkt=0;
    private int internalAtkt=0;
    private int theoryAtkt=0;
    private double practical=0;
    private double internal=0;
    private double theory=0;
    public double getPractical() {
        return practical;
    }
    public int getPracticalAtkt() {
        return practicalAtkt;
    }
    public void setPracticalAtkt(int practicalAtkt) {
        this.practicalAtkt = practicalAtkt;
    }
    public int getInternalAtkt() {
        return internalAtkt;
    }
    public void setInternalAtkt(int internalAtkt) {
        this.internalAtkt = internalAtkt;
    }
    public int getTheoryAtkt() {
        return theoryAtkt;
    }
    public void setTheoryAtkt(int theoryAtkt) {
        this.theoryAtkt = theoryAtkt;
    }
    public void setPractical(double practical) {
        this.practical = practical;
    }
    public double getInternal() {
        return internal;
    }
    public void setInternal(double internal) {
        this.internal = internal;
    }
    public double getTheory() {
        return theory;
    }
    public void setTheory(double theory) {
        this.theory = theory;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    private String subject;
    private int practicalExam=0;
    public int getPracticalExam() {
        return practicalExam;
    }
    public void setPracticalExam(int practicalExam) {
        this.practicalExam = practicalExam;
    }
    public int getTheoryExam() {
        return theoryExam;
    }
    public void setTheoryExam(int theoryExam) {
        this.theoryExam = theoryExam;
    }
    public int getInternalExam() {
        return internalExam;
    }
    public void setInternalExam(int internalExam) {
        this.internalExam = internalExam;
    }
    private int theoryExam=0;
    private int internalExam=0;
}

class Semester1{
    private String[] subjects={"maths","cs","it","Hindi"};
    private MarksContainer[] marks=new MarksContainer[subjects.length];

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public MarksContainer[] getMarks() {
        return marks;
    }

    public void setMarks(MarksContainer[] marks) {
        this.marks = marks;
    }

    public Semester1(){
        for(int i=0;i<subjects.length;i++){
            marks[i]=new MarksContainer();
            marks[i].setSubject(subjects[i]);
            if(marks[i].getSubject().equals("maths")){
                marks[i].setPracticalExam(1);
            }else if(marks[i].getSubject().equals("hindi")){
                marks[i].setPracticalExam(1);
                marks[i].setInternalExam(1);
            }
        }
    }
}

class Semester2{
    private String[] subjects={"os","foc","c##","english","evs"};
    private MarksContainer[] marks=new MarksContainer[subjects.length];
    public String[] getSubjects() {
        return subjects;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public MarksContainer[] getMarks() {
        return marks;
    }
    public void setMarks(MarksContainer[] marks) {
        this.marks = marks;
    }

     public Semester2(){
        for(int i=0;i<subjects.length;i++){
            marks[i]=new MarksContainer();
            marks[i].setSubject(subjects[i]);
            if(marks[i].getSubject().equals("english")){
                marks[i].setPracticalExam(1);
            }else if(marks[i].getSubject().equals("evs")){
                marks[i].setPracticalExam(1);
                // marks[i].setInternalExam(1);
            }
        }
    }

}

class Semester3{
    private String[] subjects={"cn","java","ot","yoga","evs"};
    private MarksContainer[] marks=new MarksContainer[subjects.length];
    public String[] getSubjects() {
        return subjects;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public MarksContainer[] getMarks() {
        return marks;
    }
    public void setMarks(MarksContainer[] marks) {
        this.marks = marks;
    }

      public Semester3(){
        for(int i=0;i<subjects.length;i++){
            marks[i]=new MarksContainer();
            marks[i].setSubject(subjects[i]);
            if(marks[i].getSubject().equals("ot")){
                marks[i].setPracticalExam(1);
            }else if(marks[i].getSubject().equals("yoga")){
                marks[i].setPracticalExam(1);
                marks[i].setInternalExam(1);
            }
            else if(marks[i].getSubject().equals("evs")){
                marks[i].setPracticalExam(1);
                marks[i].setInternalExam(1);
            }
        }
    }
}
