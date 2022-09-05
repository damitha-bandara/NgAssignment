import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class mainApp{
    public static void main(String[] args) {
        try {
            File filePath = new File("index.txt");
            FileWriter outputFile = new FileWriter("output.txt");
            int countA=0,countB=0,countC=0,countD=0,countE=0,countF=0,countG=0,countH=0,countI=0,countJ=0;
            Scanner fileReader = new Scanner(filePath);
            String countSizeOfStudents = fileReader.nextLine();
            StringBuilder englishStudentArray = new StringBuilder();
            StringBuilder scienceStudentArray = new StringBuilder();
            StringBuilder mathStudentArray = new StringBuilder();

            while (fileReader.hasNextLine()) {
                String fileData = fileReader.nextLine();    //read the data of file
                String[] row = fileData.split(",");     //split for get lastname and firstnme
                String lastName = row[0];                      //get lastname
                String firstName = row[1];                     //grt firstname

                String getSubjectLineData = fileReader.nextLine();  //read next line (subject line)

                String[] subjectRow = getSubjectLineData.split(" ");    //split " "
                String subject = subjectRow[0];                     //get subject

                String marks = subjectRow[1];                   //assign marks
                String[]marksRow = marks.split(",");

                if (subject.equals("English")) {

                    int termPaper = Integer.parseInt(marksRow[0]);
                    int midTerm = Integer.parseInt(marksRow[1]);
                    int finalExam = Integer.parseInt(marksRow[2]);
                    
                    englishStudent newStudent = new englishStudent(firstName,lastName,subject,termPaper,midTerm,finalExam);
                    
                    englishStudentArray.append(newStudent.getFirstName() + "\t\t"
                    + newStudent.getLastName() + "\t\t"
                    + String.format("%.2f",newStudent.getFinalGradeMark())+ "\t\t\t\t"
                    + finalGrade(newStudent.getFinalGradeMark()) + "\n\n");

                    if (finalGrade(newStudent.getFinalGradeMark())=='A') {
                        countA++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='B') {
                        countB++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='C') {
                        countC++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='D') {
                        countD++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='E') {
                        countE++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='F') {
                        countF++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='G') {
                        countG++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='H') {
                        countH++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='I') {
                        countI++;
                    } else {
                        countJ++;
                    }
                }
                else if (subject.equals("Science")) {
                
                    int attendantce = Integer.parseInt(marksRow[0]);
                    int project = Integer.parseInt(marksRow[1]);
                    int midTerm = Integer.parseInt(marksRow[2]);
                    int finalExam = Integer.parseInt(marksRow[3]);
                    
                    scienceStudent newStudent = new scienceStudent(firstName,lastName,subject,attendantce,project,midTerm,finalExam);
                    
                    scienceStudentArray.append(newStudent.getFirstName() + "\t\t"
                    + newStudent.getLastName() + "\t\t"
                    + String.format("%.2f",newStudent.getFinalGradeMark()) + "\t\t\t\t"
                    + finalGrade(newStudent.getFinalGradeMark()) + "\n\n");
                    
                    if (finalGrade(newStudent.getFinalGradeMark())=='A') {
                        countA++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='B') {
                        countB++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='C') {
                        countC++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='D') {
                        countD++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='E') {
                        countE++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='F') {
                        countF++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='G') {
                        countG++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='H') {
                        countH++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='I') {
                        countI++;
                    } else {
                        countJ++;
                    }

                }
                else if (subject.equals("Math")) {
                
                    int quiz1 = Integer.parseInt(marksRow[0]);
                    int quiz2 = Integer.parseInt(marksRow[1]);
                    int quiz3 = Integer.parseInt(marksRow[2]);
                    int quiz4 = Integer.parseInt(marksRow[3]);
                    int quiz5 = Integer.parseInt(marksRow[4]);
                    int test1 = Integer.parseInt(marksRow[5]);
                    int test2 = Integer.parseInt(marksRow[6]);
                    int finalExam = Integer.parseInt(marksRow[7]);
                    
                    mathStudent newStudent = new mathStudent(firstName,lastName,subject,quiz1,quiz2,quiz3,quiz4,quiz5,test1,test2,finalExam);

                    mathStudentArray.append(newStudent.getFirstName() + "\t\t"
                    + newStudent.getLastName() + "\t\t"
                    + String.format("%.2f",newStudent.getFinalGradeMark()) + "\t\t\t\t"
                    + finalGrade(newStudent.getFinalGradeMark()) + "\n\n");
                    
                    if (finalGrade(newStudent.getFinalGradeMark())=='A') {
                        countA++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='B') {
                        countB++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='C') {
                        countC++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='D') {
                        countD++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='E') {
                        countE++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='F') {
                        countF++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='G') {
                        countG++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='H') {
                        countH++;
                    } else if (finalGrade(newStudent.getFinalGradeMark())=='I') {
                        countI++;
                    } else {
                        countJ++;
                    }
                }
                else{
                    System.out.println("No Subject");
                }
            }
            //print lines on terminal       if don't want to show thermial print commnet theses
            System.out.println("\nEnglish Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + englishStudentArray.toString());
            System.out.println("\nScience Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + scienceStudentArray.toString());
            System.out.println("\nMath Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + mathStudentArray.toString());
            System.out.println("\nGrade Distribution of " + countSizeOfStudents +" Students"
                +"\nA : "+countA +"\nB : "+countB +"\nC : "+countC +"\nD : "+countD +"\nE : "+countE 
                +"\nF : "+countF +"\nG : "+countG +"\nH : "+countH +"\nI : "+countI +"\nJ : "+countJ);

            //write on output.txt file
            outputFile.write("\nEnglish Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + englishStudentArray.toString());
            outputFile.write("\nScience Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + scienceStudentArray.toString());
            outputFile.write("\nMath Students\n\nFirst Name\tLast Name\tFinal Grade Mark\tfinalGrade\n-------------------------------------------------------------------\n" 
            + mathStudentArray.toString());
            outputFile.write("\nGrade Distribution of " + countSizeOfStudents +" Students"
            +"\nA : "+countA +"\nB : "+countB +"\nC : "+countC +"\nD : "+countD +"\nE : "+countE 
            +"\nF : "+countF +"\nG : "+countG +"\nH : "+countH +"\nI : "+countI +"\nJ : "+countJ);
                    
            fileReader.close();
            outputFile.close();
            System.out.println("Successfully Completed.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static char finalGrade(double finalGradeMark) {
        int finalGradeMarkI = (int)finalGradeMark;
        if (finalGradeMarkI<=100 && finalGradeMarkI>=90) {
            return 'A';
        }
        else if (finalGradeMarkI<=89 && finalGradeMarkI>=80) {
            return 'B';
        }
        else if (finalGradeMarkI<=79 && finalGradeMarkI>=70) {
            return 'C';
        }
        else if (finalGradeMarkI<=69 && finalGradeMarkI>=60) {
            return 'D';
        }
        else if (finalGradeMarkI<=59 && finalGradeMarkI>=50) {
            return 'E';
        }
        else if (finalGradeMarkI<=49 && finalGradeMarkI>=40) {
            return 'F';
        }
        else if (finalGradeMarkI<=39 && finalGradeMarkI>=30) {
            return 'G';
        }
        else if (finalGradeMarkI<=29 && finalGradeMarkI>=20) {
            return 'H';
        }
        else if (finalGradeMarkI<=19 && finalGradeMarkI>=10) {
            return 'I';
        }
        else if (finalGradeMarkI<=10 && finalGradeMarkI>0) {
            return 'J';
        }
        else{
            return 0;
        }
    }
}