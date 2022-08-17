import java.util.Scanner;

class assignment1 {

    public static void main(String[] args) {
        //create object to scan user input
        Scanner objScanner = new Scanner(System.in);
        //say user to input
        System.out.print("Enter Input: ");
        //get input to string
        String s = objScanner.nextLine();

        //check input legnt between 1 to 10000
        if(s.length()>=1 && s.length()<=10000) {
            
            //array index for s legnth
            for (int i = 0; i < s.length(); i++) {
                
                //input string to char array
                char[] c = s.toCharArray();
                
                //check input characters = (,),[,],{,}
                if ( (c[i]=='(')  || (c[i]==')') || (c[i]=='[') || (c[i]==']') || (c[i]=='{') || (c[i]=='}') ) {
            
                    //check open brackerts same to close brackerts
                    if ( ( ( c[i]=='(' ) && ( c[i+1]==')' ) ) || ( ( c[i]=='[' ) && ( c[i+1]==']' ) ) || ( ( c[i]=='{' ) && ( c[i+1]=='}') ) ) {
                        System.out.println(true);
                        break;
                    }
                    else {
                        System.out.println(false);
                        break;
                    }
                }
                else {
                    System.out.println(false);
                    break;
                }
            }
        }
        else{
            System.out.println(false);
        }
        objScanner.close();
        System.out.println("");
    }
}
