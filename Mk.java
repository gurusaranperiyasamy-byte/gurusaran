import java.util.*;
class Mk{
    public static void main(String[] args){
        displayResult();
    }
    public static void displayResult(){
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the marks of 3 Subjects : ");
            int m1 = Sc.nextInt();
            int m2 = Sc.nextInt();
            int m3 = Sc.nextInt();
            Mk obj = new Mk();
            int total =obj.calculateTotal(m1,m2,m3);
            float average = obj.calculateAverage(m1,m2,m3);
            System.out.println("Total Marks : "+total);
            System.out.println("Average Marks : "+average);
            if(average>50){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
    }
    public static int calculateTotal(int m1 , int m2 , int m3){
            return m1+m2+m3;
    }
    public static float calculateAverage(float m1 , float m2 , float m3){
        return (m1+m2+m3)/3;
    }
}