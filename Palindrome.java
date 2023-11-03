class Palindrome{
   public static void main(String[] args){
          int num = 234432;
          int reverse = 0;
          int temp = num;
          while(num>0) {
              reverse = (reverse*10) + (num%10);
              num=num/10;
           }
       if(temp == reverse) {
            System.out.println("The number is a palindrome.");
          } else{
               System.out.println("The number is not a palindrome.");
            }
     }
}
