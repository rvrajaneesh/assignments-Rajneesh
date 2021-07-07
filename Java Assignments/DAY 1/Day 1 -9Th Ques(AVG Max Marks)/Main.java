import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] student1Marks = new int[3];
        int [] student2Marks = new int[3];
        int [] student3Marks = new int[3];

        float  student1Total = 0.0f, student2Total = 0.0f , student3Total = 0.0f ;
        float  totalInA= 0.0f ,totalInB = 0.0f , totalInC= 0.0f;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 subjects marks for Student 1: ");
        for(int i=0;i<student1Marks.length;i++){
            Integer marks = input.nextInt();
            student1Marks[i] = marks;
        }

        System.out.println("Enter the 3 subjects mark for Student 2: ");
        for(int i=0;i<student2Marks.length;i++){
            Integer marks = input.nextInt();
            student2Marks[i] = marks;
        }
        System.out.println("Enter the 3 subjects marks for Student 3: ");
        for(int i=0;i<student3Marks.length;i++){
            Integer marks = input.nextInt();
            student3Marks[i] = marks;
        }
        totalInA = (student1Marks[0]+ student2Marks[0]+ student3Marks[0]);
        totalInB = (student1Marks[1]+ student2Marks[1]+ student3Marks[1]);
        totalInC = (student1Marks[2]+ student2Marks[2]+ student3Marks[2]);

        for(int i=0; i < 3; i++){
            student1Total += student1Marks[i];
            student2Total += student2Marks[i];
            student3Total += student3Marks[i];
        }
        System.out.println("Total score in Subject A: "+totalInA);
        System.out.println("Total score in Subject B: "+totalInB);
        System.out.println("Total score in Subject C: "+totalInC);

        System.out.println("Average in Subject A: "+totalInA/3);
        System.out.println("Average in Subject B: "+totalInB/3);
        System.out.println("Average in Subject C: "+totalInC/3);

        System.out.println("Total marks of Student 1: "+student1Total);
        System.out.println("Total marks of Student 2: "+student2Total);
        System.out.println("Total marks of Student 3: "+student3Total);

        System.out.println("Average mark of Student 1: "+student1Total/3);
        System.out.println("Average mark of Student 2: "+student2Total/3);
        System.out.println("Average mark of Student 3"+student3Total/3);

input.close();
    }
}