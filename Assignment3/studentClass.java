public class studentClass {
    private String firstName;
    private String lastName;
    private String subject;
    
    public studentClass(String firstName, String lastName, String subject) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSubject(subject);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName.length()<=30 && firstName.length()>0) {
            this.firstName = firstName;
        }
        else{
            this.firstName = ("Invalid FirstName");
        }
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName.length()<=20 && lastName.length()>0) {
            this.lastName = lastName;
        }
        else{
            this.firstName = ("Invalid LastName");
        }
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class englishStudent extends studentClass{
    private double finalGradeMark;
    public englishStudent(String firstName, String lastName, String subject, int termPaper, int midTerm, int finalExam) {
        super(firstName, lastName, subject);

        finalGradeMark = termPaper*0.3 + midTerm*0.3 + finalExam*0.4 ;

    }
    public double getFinalGradeMark() {
        return finalGradeMark;
    }
    public void setFinalGradeMark(double finalGradeMark) {
        this.finalGradeMark = finalGradeMark;//= (termPaper*0.3 + midTerm*0.3 + finalExam*0.4);
    }
}

class scienceStudent extends studentClass{
    private double finalGradeMark;
    public scienceStudent(String firstName, String lastName, String subject, int attendantce, int project, int midTerm, int finalExam) {
        super(firstName, lastName, subject);

        finalGradeMark = attendantce*0.1 + project*0.3 + midTerm*0.3 + finalExam*0.4 ;

    }
    public double getFinalGradeMark() {
        return finalGradeMark;
    }
    public void setFinalGradeMark(double finalGradeMark) {
        this.finalGradeMark = finalGradeMark;
    }
}

class mathStudent extends studentClass{
    private double finalGradeMark;
    public mathStudent(String firstName, String lastName, String subject, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5, int test1, int test2, int finalExam) {
        super(firstName, lastName, subject);

        finalGradeMark = ( quiz1 + quiz2 + quiz3 + quiz4 + quiz5 )*0.15 + test1*0.3 + test2*0.2 + finalExam*0.35 ;
    }
    public double getFinalGradeMark() {
        return finalGradeMark;
    }
    public void setFinalGradeMark(double finalGradeMark) {
        this.finalGradeMark = finalGradeMark;
    }
}