 class Bank{
    String bname;
    String bloc;
    double breg_no;
   public void Bank(String bname , String bloc , double breg_no)
 {
    this.bname = bname;
    this.bloc = bloc;
    this.breg_no = breg_no;
 }
public static void main(String[] args)
{
    Bank b = new Bank();
    b.Bank ("canara bank" , "bangalore" , 123555.56);
    System.out.println("about bank name: " + b.bname);
    System.out.println("about bank location: " + b.bloc);
    System.out.println("about bank reg: " + b.breg_no); 
}
 }



