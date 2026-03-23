import java.util.Scanner;
class div_sum_diff {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                num2 += i;
            }
            else{
                num1 += i;
            }
        }
        return num1 - num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of m: ");
        int m = sc.nextInt();
        div_sum_diff obj = new div_sum_diff();
        int result = obj.differenceOfSums(n, m);
        System.out.println("Difference = " + result);
        sc.close();
    }
}