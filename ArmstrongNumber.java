import java.util.*;
class ArmstrongNumber{
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int Num=num;
        int ctr=0;
        int Anum=0;
        while(num > 0){
            num=num/10;
            ctr++;
        }
        num=Num;
        while(num > 0){
            int digit=num%10;
            Anum=Anum+(int) Math.pow(digit, ctr);
            num=num/10;
        }
        if(Anum==Num){
            System.out.println("The given Number "+ Num +" is a Armstrong Number");
        }
        else{
            System.out.println("The given Number "+ Num +" is NOT a Armstrong Number");
        }
    }
}