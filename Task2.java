import java.util.Scanner;

class Task2{
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numberOfSubject = sc.nextInt();

        int totalMarks=0;
         for(int i=1; i<= numberOfSubject ;i++){
            System.out.println("Enter the marks of subject" +i+" ");
            totalMarks += sc.nextInt();
         }

         // calcuating the percentage 
         int per = totalMarks/numberOfSubject ;

         gradeCalculator g = new gradeCalculator();
         String grade = g.calculateGrade(per);

         System.out.println("Total marks obtained :- "+totalMarks);
         System.out.println(" percentage obtained :- "+ per+"%");
         System.out.println("Grade obtained :- "+  grade);
            
         sc.close();
        
    }

   public static class gradeCalculator{
        public  String calculateGrade(int per){
            switch (per/10) {
                case 10:
                  return "A+";
                case 9:
                    return "A";
                case 8:
                    return "B+";
                case 7:
                     return "B";
                case 6:
                    return "c";
                case 5:
                       return "D";
                case 4:
                    return "E";
            
                default:
                    return "F";
                
            }
        
    }
}
}