public class MathChecks {

    public static Boolean isPrime(int number){
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(number + " is a prime number.");
            return true;
        }
        else{
            System.out.println(number + " is not a prime number.");
            return false;
        }
    }

    public static Boolean isPalindrome(int number){
        int r,sum=0,temp;
        int originalNumber = number;

        temp=number;
        while(number>0){
            r=number%10;  //getting remainder
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum){
            System.out.println(originalNumber + " is palindrome number ");
            return true;
        }

        else
        {
            System.out.println(originalNumber + " is not palindrome");
            return false;
        }
    }
}
