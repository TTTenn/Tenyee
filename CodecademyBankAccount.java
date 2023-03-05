public class CodecademyBankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance / 3;
      boolean canPurchaseTicket = amountForEachFriend > 250;
      System.out.println(canPurchaseTicket);

      System.out.println("I gave each friend "+amountForEachFriend+ "..." );
      /* Learn Java: Manipulating Variables
         第二大章第四小课完成
         基本符号大致理解。 
         3/5/2023                          */
                                            
    }       
}
