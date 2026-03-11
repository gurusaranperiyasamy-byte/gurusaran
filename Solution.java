import java.util.Scanner;

class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        else{
            return 1 + (num - 1) % 9;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();  
        int num = sc.nextInt();
        int result = obj.addDigits(num); 
        System.out.println(result);      
    }
}