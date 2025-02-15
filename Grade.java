import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        // Enter total no of subjects to calculate their marks
        System.out.println("Enter total numer of subjects: ");
        int numSub = scan.nextInt();

        int totalMarks = 0;

        for (int i = 0; i <=numSub; i++) {
           System.out.println("Enter marks for subject" +i+"(outof 100)");
           int marks = scan.nextInt(); 

           while(marks <0 || marks >100){
            System.out.println("Invalid marks. Please enter marks");
            System.out.println("Enter marks for subjects "+i+"out of 100");
            marks = scan.nextInt();
           }

           totalMarks += marks; 
        }

        System.out.println("Student Result: ");
        System.out.println("Total marks obtained in all subjects: "+ totalMarks);


        // Calculate ave percentage: Divide total marks by total number of
        // subjects to get the average percentage.

        int AvePercentage = totalMarks / numSub;
        System.out.println("Average percentage: "+ AvePercentage);

        // Grade calc: Assign grades based on percentage;

        if(AvePercentage>=90){
            System.out.println("Your grade: A+");
        }
        else if(AvePercentage>=80){
            System.out.println("Your grade: B+");
        }
        else if(AvePercentage>=70){
            System.out.println("Your grade: C+");
        }
        else if(AvePercentage>=60){
            System.out.println("Your grade: D+");
        }
        else if(AvePercentage>=50){
            System.out.println("Your grade: E+");
        }
        else if(AvePercentage>=40){
            System.out.println("Your grade: E+");
        }
        else{
            System.out.println("Your are failed.");
        }


        // PRovide feedback based on grade
        if(AvePercentage<50){
            System.out.println("You need to work harder and improve your grades.");
        } else {
            System.out.println("Good job! Keep up the good work.");
        }

        scan.close();

    }
}
