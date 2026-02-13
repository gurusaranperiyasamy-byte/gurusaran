import java.util.*;
class PrimeNumber{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = Sc.nextInt();
        int flag = 0;
        for(int i = 1 ; (num%2)<=i ; i++){
            if(num%i==0){
                flag+=1;
            }
        }
        if(flag>=1){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is a NOT Prime Number");
        }
    }
}