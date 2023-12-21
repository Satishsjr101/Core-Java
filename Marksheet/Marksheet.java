import java.util.Scanner;

class MarksCalc {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    static int allSemExam(String subject[], int marks[], boolean atkt[], int count_atkt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW + "Enter Marks of Semester : " + RESET);
        for (int i = 0; i < subject.length; i++) {
            if (i < 5) {
                System.out.println(YELLOW + "Enter " + subject[i] + " Marks : " + RESET);
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                    i--;
                    continue;
                }
                if (marks[i] < 33) {
                    count_atkt++;
                    atkt[i] = true;
                }
            } else {
                System.out.println(YELLOW + "Enter " + subject[i] + " marks : " + RESET);
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 25) {
                    System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                    i--;
                    continue;
                }
                if (marks[i] < 13) {
                    count_atkt++;
                    atkt[i] = true;
                }
            }
        }
        return count_atkt;
    }

    static int atktExam(String subject[], int marks[], boolean atkt[], int count_atkt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < atkt.length; i++) {
            if (atkt[i]) {
                if (i < 5) {
                    System.out.println(YELLOW + "Enter " + subject[i] + " atkt marks : " + RESET);
                    marks[i] = sc.nextInt();
                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 33) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 33)
                        atkt[i] = true;
                } else {
                    System.out.println(YELLOW + "Enter " + subject[i] + " atkt marks : " + RESET);
                    marks[i] = sc.nextInt();
                    if (marks[i] < 0 || marks[i] > 25) {
                        System.out.println(RED + "--Invalid marks-Please Re-Enter--" + YELLOW);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 13) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 13)
                        atkt[i] = true;
                }
            }
        }
        return count_atkt;

    }

    static void marksheet(String[] subject, int[] marks, boolean[] atkt, int sem, float cgpa) {

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        float sgpa = sum / 550f * 10;
        // float cgpa = (sum * 10) / (sem * 550);
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                      DEVI AHILYA VISHWAVIDHYALAYA (DAVV),BHOPAL                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                     GRADE SHEET                                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m" + "                 BCA SEMESTER " + sem
                + " MAIN EXAMINATION, JUNE-JULY   2023                " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                                                                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  Institute Name : MAHARAJA RANJIT SIGHN COLLEGE                            " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                                                                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  ROLL No        : 12001314                             ENROLLMENT.No  : DX2121211 " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  Name           : SATISH VISHWAKRMA                    STATUS : REGULAR           " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  Father's Name  : RAM VISHWAKRMA                       EXAM   : JUNE--2023        " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  Degree         : BCA                                                            " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                                                                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "  SUBJECT        SUBJECT NAME                   TOTAL   OBTAINED    GRADE         " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        String total, grade;
        for (int i = 0; i < 7; i++) {
            if (i <= 4)
                total = "100";
            else
                total = "25 ";
            if (atkt[i] == true)
                grade = "ATKT";
            else
                grade = "PASS";
            System.out.println("\t\t\t\u001B[30m" + "\u001B[47m" + "   " + (i + 1) + "              " + subject[i]
                    + "                       " + total + "       " + marks[i] + "       " + grade + "         "
                    + "\u001B[0m");
        }

        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                                                                  " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        System.out.println(
                "\t\t\t\u001B[30m" + "\u001B[47m" + "                  TOTAL                         550       " + sum
                        + "                     " + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "----------------------------------------------------------------------------------" + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m" + "  Issue Date : 16/03/2023                  SGPA  :  "
                + String.format("%.2f", sgpa) + " CGPA  :  " + String.format("%.2f", cgpa) + "            "
                + "\u001B[0m");
        System.out.println("\t\t\t\u001B[30m" + "\u001B[47m"
                + "                                                                                  " + "\u001B[0m");
        System.out.println(
                "\t\t\t\033[0;30m\033[47m___________________________________________________________________________________\033[0m");
        System.out.println(
                "\t\t\t\033[0;30m\033[47m\033[1;30m         Mr. Pawan Sahu          Mr. Praveen Sharma     Mr. Anil Verma   \033[0m");
        System.out.println(
                "\t\t\t\033[0;30m\033[47m\033[1;30m           Register               Vice Chancellor        Chancellor      \033[0m");
        System.out.println(
                "\t\t\t\033[0;30m\033[47m___________________________________________________________________________________\033[0m");
        System.out.println(
                "\t\t\t\033[0;30m\033[47m                                                                                   \033[0m");

        /* Result of 1st Semester Ends */

    }

    public static void main(String args[]) {

        String sem1subjects[] = { "C        ", "Php      ", "HTML     ", "JAVA    ", "ELECTIVE ", "Prac ",
                "PHP_Prac " };
        String sem2subjects[] = { "AD C     ", "Php2     ", "HTML5    ", "JAVA2   ", "ELECTIVE ", "Prac2",
                "PHP_Prac2" };
        String sem3subjects[] = { "CPP      ", "Php3     ", "AD HTML  ", "JAVA3   ", "ELECTIVE ", "Prac3",
                "PHP_Prac3" };
        String sem4subjects[] = { "AD CPP   ", "Php4     ", "AD HTML5 ", "JAVA4   ", "ELECTIVE ", "Prac4",
                "PHP_Prac4" };
        String sem5subjects[] = { "Python1  ", "Php5     ", "DHTML    ", "JAVA5   ", "ELECTIVE ", "Prac5",
                "PHP_Prac5" };
        String sem6subjects[] = { "Python2  ", "Php6     ", "DHTMLK5  ", "JAVA6   ", "ELECTIVE ", "Prac6",
                "PHP_Prac6" };

        int sem1marks[] = new int[7];
        int sem2marks[] = new int[7];
        int sem3marks[] = new int[7];
        int sem4marks[] = new int[7];
        int sem5marks[] = new int[7];
        int sem6marks[] = new int[7];

        int count_sem1atkt = 0, count_sem2atkt = 0, count_sem3atkt = 0, count_sem4atkt = 0, count_sem5atkt = 0,
                count_sem6atkt = 0;
        boolean sem1atkt[] = new boolean[7];
        boolean sem2atkt[] = new boolean[7];
        boolean sem3atkt[] = new boolean[7];
        boolean sem4atkt[] = new boolean[7];
        boolean sem5atkt[] = new boolean[7];
        boolean sem6atkt[] = new boolean[7];
        Scanner sc = new Scanner(System.in);
        // Markssheetsfunc obj = new Markssheetsfunc();

        do {
            sem1atkt = new boolean[7];
            sem2atkt = new boolean[7];
            count_sem1atkt = 0;
            count_sem2atkt = 0;
            /* First semester starts */
            System.out.println(BLUE + "First Semster Exam Start" + RESET);
            count_sem1atkt = allSemExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
            System.out.println(RED + "You have " + count_sem1atkt + " ATKT in 1st Semester" + RESET);
            /* First semester end */
            /* First semester atkt start */
            if (count_sem1atkt > 0) {
                System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
            } /* First semester atkt end */
            /* Second Semester exam starts */
            System.out.println(BLUE + "second semster exam start" + RESET);
            count_sem2atkt = allSemExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
            System.out.println(RED + "After 2nd semester You have  \n" + count_sem1atkt + "  ATKT in 1st Semester\n"
                    + count_sem2atkt + " ATKT in 2nd Semester" + RESET);
            /* second semester end */
            if (count_sem1atkt + count_sem2atkt > 4) {
                System.out.println(RED + "\n===Your Year Is Back===\n" + RESET);
                continue;
            } else {
                /* First semester atkt starts before 3rd semster */
                if (count_sem1atkt > 0) {
                    System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                    count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
                } /* First semester atkt ends before 3rd semster */
                /* second semester atkt starts before 3rd semster */
                if (count_sem2atkt > 0) {
                    System.out.println(YELLOW + "\nEnter marks of 2st ATKT semester : " + RESET);
                    count_sem2atkt = atktExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
                } /* second semester atkt ends before 3rd semster */
                /* Third semester starts */
                System.out.println(BLUE + "Promoted to 3rd Semester" + RESET);
                do {
                    sem4atkt = new boolean[7];
                    sem3atkt = new boolean[7];
                    count_sem3atkt = 0;
                    count_sem4atkt = 0;
                    /* third semester starts */
                    System.out.println(BLUE + "third semster exam start" + RESET);
                    count_sem3atkt = allSemExam(sem3subjects, sem3marks, sem3atkt, count_sem3atkt);
                    System.out.println(RED + "\nAfter 3rd Semester You have \n" + count_sem1atkt
                            + " ATKT in 1st Semester\n" + count_sem2atkt + " ATKT in 2nd Semester\n" + count_sem3atkt
                            + " in 3rd Semester" + RESET);
                    /* third semester end */
                    /* First semester atkt start */
                    if (count_sem1atkt > 0) {
                        System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                        count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
                    } /* First semester atkt end */
                    /* second semester atkt start */
                    if (count_sem2atkt > 0) {
                        System.out.println(YELLOW + "\nEnter marks of 2st ATKT semester : " + RESET);
                        count_sem2atkt = atktExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
                    } /* second semester atkt end */
                    /* third semester atkt start */
                    if (count_sem3atkt > 0) {
                        System.out.println(YELLOW + "\nEnter marks of 3st ATKT semester : " + RESET);
                        count_sem3atkt = atktExam(sem3subjects, sem3marks, sem3atkt, count_sem3atkt);
                    } /* third semester atkt end */
                    /* fourth semester starts */
                    System.out.println(BLUE + "Promoted to 4rd Semester" + RESET);
                    /* fourth semester starts */
                    System.out.println(BLUE + "fourth semster exam start" + RESET);
                    count_sem4atkt = allSemExam(sem4subjects, sem4marks, sem4atkt, count_sem4atkt);
                    System.out.println(RED + "\nAfter 4th Semester You have  \n" + count_sem1atkt
                            + "  ATKT in 1st Semester\n" + count_sem2atkt + "  ATKT in 2nd Semester\n" + count_sem3atkt
                            + "  in 3rd Semester\n" + count_sem4atkt + "  in 4th Semester" + RESET);
                    /* fourth semester end */
                    if (count_sem3atkt + count_sem4atkt > 4) {
                        System.out.println(RED + "\n===Your Year Is Back===\n" + RESET);
                        continue;
                    } else {
                        /* First semester atkt start */
                        if (count_sem1atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                            count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
                        } /* First semester atkt end */
                        /* second semester atkt start */
                        if (count_sem2atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 2st ATKT semester : " + RESET);
                            count_sem2atkt = atktExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
                        } /* second semester atkt end */
                        /* third semester atkt start */
                        if (count_sem3atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 3st ATKT semester : " + RESET);
                            count_sem3atkt = atktExam(sem3subjects, sem3marks, sem3atkt, count_sem3atkt);
                        } /* third semester atkt end */
                        /* fourth semester atkt start */
                        if (count_sem4atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 4st ATKT semester : " + RESET);
                            count_sem4atkt = atktExam(sem4subjects, sem4marks, sem4atkt, count_sem4atkt);
                        } /* fourth semester atkt end */
                        System.out.println(BLUE + "promoted to 5th semster" + RESET);
                        /* fifth semester starts */
                    }
                    do {
                        sem5atkt = new boolean[7];
                        sem6atkt = new boolean[7];
                        count_sem5atkt = 0;
                        count_sem6atkt = 0;
                        /* fivth semester starts */
                        System.out.println(BLUE + "fifth semster exam start" + RESET);
                        count_sem5atkt = allSemExam(sem5subjects, sem5marks, sem5atkt, count_sem5atkt);
                        System.out.println(RED + "\nAfter 5th Semester You have  \n" + count_sem1atkt
                                + "  ATKT in 1st Semester\n" + count_sem2atkt + "  ATKT in 2nd Semester\n"
                                + count_sem3atkt + " ATKT in 3rd Semester\n" + count_sem4atkt
                                + " ATKT in 4th Semester\n" + count_sem5atkt + " ATKT in 5th Semester" + RESET);
                        /* fivth semester end */
                        /* First semester atkt start */
                        if (count_sem1atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                            count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
                        } /* First semester atkt end */
                        /* second semester atkt start */
                        if (count_sem2atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 2st ATKT semester : " + RESET);
                            count_sem2atkt = atktExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
                        } /* second semester atkt end */
                        /* third semester atkt start */
                        if (count_sem3atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 3st ATKT semester : " + RESET);
                            count_sem3atkt = atktExam(sem3subjects, sem3marks, sem3atkt, count_sem3atkt);
                        } /* third semester atkt end */
                        /* fourth semester atkt start */
                        if (count_sem4atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 4st ATKT semester : " + RESET);
                            count_sem4atkt = atktExam(sem4subjects, sem4marks, sem4atkt, count_sem4atkt);
                        } /* fourth semester atkt end */
                        /* fivth semester atkt start */
                        if (count_sem5atkt > 0) {
                            System.out.println(YELLOW + "\nEnter marks of 5st ATKT semester : " + RESET);
                            count_sem5atkt = atktExam(sem5subjects, sem5marks, sem5atkt, count_sem5atkt);
                        } /* fivth semester atkt end */
                        System.out.println(BLUE + "promoted to 6th semster" + RESET);
                        /* six semester starts */
                        System.out.println(BLUE + "six semster exam start" + RESET);
                        count_sem6atkt = allSemExam(sem6subjects, sem6marks, sem6atkt, count_sem6atkt);
                        System.out.println(RED + "\nAfter 5th Semester You have  \n" + count_sem1atkt
                                + "  ATKT in 1st Semester\n" + count_sem2atkt + "  ATKT in 2nd Semester\n"
                                + count_sem3atkt + " ATKT in 3rd Semester\n" + count_sem4atkt
                                + " ATKT in 4th Semester\n" + count_sem5atkt + " ATKT in 5th Semester\n"
                                + count_sem6atkt + " ATKT in 6th Semester" + RESET);
                        /* six semester end */

                        if ((count_sem5atkt + count_sem6atkt) > 4) {
                            System.out.println(RED + "\n===Your Year Is Back===\n" + RESET);
                            continue;
                        } else if (count_sem1atkt > 0 || count_sem2atkt > 0 || count_sem3atkt > 0 || count_sem4atkt > 0
                                || count_sem5atkt > 0 || count_sem6atkt > 0) {
                            System.out.println(BLUE + "Please clear your all ATKT for Degree" + RESET);
                            /*
                             * after final year exam
                             * give the atkt
                             */
                            /* First semester atkt start */
                            if (count_sem1atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 1st ATKT semester : " + RESET);
                                count_sem1atkt = atktExam(sem1subjects, sem1marks, sem1atkt, count_sem1atkt);
                            } /* First semester atkt end */
                            /* second semester atkt start */
                            if (count_sem2atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 2st ATKT semester : " + RESET);
                                count_sem2atkt = atktExam(sem2subjects, sem2marks, sem2atkt, count_sem2atkt);
                            } /* second semester atkt end */
                            /* third semester atkt start */
                            if (count_sem3atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 3st ATKT semester : " + RESET);
                                count_sem3atkt = atktExam(sem3subjects, sem3marks, sem3atkt, count_sem3atkt);
                            } /* third semester atkt end */
                            /* fourth semester atkt start */
                            if (count_sem4atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 4st ATKT semester : " + RESET);
                                count_sem4atkt = atktExam(sem4subjects, sem4marks, sem4atkt, count_sem4atkt);
                            } /* fourth semester atkt end */
                            /* fivth semester atkt start */
                            if (count_sem5atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 5st ATKT semester : " + RESET);
                                count_sem5atkt = atktExam(sem5subjects, sem5marks, sem5atkt, count_sem5atkt);
                            } /* fivth semester atkt end */
                            /* six semester atkt start */
                            if (count_sem6atkt > 0) {
                                System.out.println(YELLOW + "\nEnter marks of 6st ATKT semester : " + RESET);
                                count_sem6atkt = atktExam(sem6subjects, sem6marks, sem6atkt, count_sem6atkt);
                            } /* six semester atkt end */
                            /* Final ATKT exams Ends */
                            /* Third year end */
                        }

                    } while ((count_sem5atkt + count_sem6atkt) > 4);

                } while ((count_sem3atkt + count_sem4atkt) > 4);

            }

        } while ((count_sem1atkt + count_sem2atkt) > 4);

        System.out.println(BLUE + "\nDo You Want To See Marksheet If Yes Press (y/n)" + RESET);
        char another = sc.next().charAt(0);
        do {
            System.out.println("\033[H\033[2J");
            int sem = 0;
            do {
                System.out.println(YELLOW + "\nEnter Semester Of Result You Want  " + RESET);
                sem = sc.nextInt();
                if (sem <= 0 || sem > 6) {
                    System.out.println(RED + "--Invalid Semester Entered--\n Please Re-Enter Semester" + RESET);
                }
            } while (sem <= 0 || sem > 6);
            // /* Result of 1st Semester Starts */

            float total_sum = 0.0f;
            int k = 1;// counter var
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem1marks[j];
                }
                k++;
            }
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem2marks[j];
                }
                k++;
            }
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem3marks[j];
                }
                k++;
            }
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem4marks[j];
                }
                k++;
            }
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem5marks[j];
                }
                k++;
            }
            if (k <= sem) {
                for (int j = 0; j < 7; j++) {
                    total_sum += sem6marks[j];
                }
                k++;
            }

            float cgpa = (total_sum * (10) / (550 * sem));

            if (sem == 1)
                marksheet(sem1subjects, sem1marks, sem1atkt, sem, cgpa);
            else if (sem == 2)
                marksheet(sem2subjects, sem2marks, sem2atkt, sem, cgpa);
            else if (sem == 3)
                marksheet(sem3subjects, sem3marks, sem3atkt, sem, cgpa);
            else if (sem == 4)
                marksheet(sem4subjects, sem4marks, sem4atkt, sem, cgpa);
            else if (sem == 5)
                marksheet(sem5subjects, sem5marks, sem5atkt, sem, cgpa);
            else
                marksheet(sem6subjects, sem6marks, sem6atkt, sem, cgpa);
            /* Result of 1st Semester Ends */
            System.out.println(BLUE + "Do You Want See Other Semster Marksheet If Yes Press (y/n)" + RESET);
            another = sc.next().charAt(0);
        } while (another == 'y' || another == 'Y');
        if ((count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt + count_sem5atkt
                + count_sem6atkt) == 0) {
            System.out.println(BLUE + "Do You Want Your Degree If Yes (y/n)  " + RESET);
            char degree = sc.next().charAt(0);
            if (degree == 'y' || degree == 'Y') {

                // RESET("\033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m=====================================================================================\033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m\033[1;30m                   DEVI   AHILYA   VISHWAVIDYALAYA   UNIVERSITY                      \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m----------------------------------MADHYA PRADESH-------------------------------------\033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                   On Recommendation of The Academic Council                         \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                            has Conferred Upon                                       \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m\033[1;30m                               SATISH VISHWAKRMA                                       \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                THE DEGREE OF                                        \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m\033[1;30m                        BACHELOR OF COMPUTER APPLICATIONS                            \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                     having passed the examination of 2023                           \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                in first Division with all its right and privileges                  \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m         in witness where of the seal of the university is here unto affixed.        \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                     given on this 17th Day of JUNE . 2023.                          \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m_____________________________________________________________________________________\033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m\033[1;30m           Mr. H.C Tiwari          Mr. Alok Dave         Mr. Ashish Mishra           \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m\033[1;30m            Register               Vice Chancellor        Chancellor                 \033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m_____________________________________________________________________________________\033[0m");
                System.out.println(
                        "\t\t\t\033[0;30m\033[47m                                                                                     \033[0m");
            } else
                System.out
                        .println(BLUE + "Thank You For Coming In Our College & Being Student Of Our College." + RESET);
        } else
            System.out.println(RED + "You Are Not Eligible For Your Degree." + RESET);
    }
}