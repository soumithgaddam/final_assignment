import java.util.Scanner;

public class ReceiveAmount implements CreditStrategy{
    Scanner input=new Scanner(System.in);

    @Override
    public int creditAmount() {
        System.out.print("Enter amount request : ");
        int receiveAmount = input.nextInt();
        return receiveAmount;
    }
}
