import java.util.*;
public class cal_Percentage {
    public static int validate_Marks(Scanner sc , String message ){
        int marks;
        System.out.println(message);
        marks = sc.nextInt();

        if(marks > 100 || marks <0){
            System.out.println("please input valid number ");
            return validate_Marks(sc, message);
        }
        return marks;
    }
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        


        System.out.println("Enter total/maximum  marks of  subjects ");
        float totalSubjects_Marks = sc.nextInt();

        System.out.println("please input the marks");
        int marks1 = validate_Marks(sc , "Enter marks 1 :- ;");
        int marks2 = validate_Marks(sc , "Enter marks 2 :- ;");
        int marks3 = validate_Marks(sc , "Enter marks 3 :- ;");
        int marks4 = validate_Marks(sc , "Enter marks 4 :- ;");
        int marks5 = validate_Marks(sc , "Enter marks 5 :- ;");
        
        int total_obtained = marks1 + marks2 + marks3 +marks4 +marks5;
         
        double percentage = (total_obtained/totalSubjects_Marks)*100;

        System.out.println("percentage of  the subjects is " + percentage + "%");
        sc.close();
    }
}
