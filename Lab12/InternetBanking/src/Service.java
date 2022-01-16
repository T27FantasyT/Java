import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Account account = new Account("tien", "0972942909", "1111", "123456", 5000000L);


    public long checkAccountBalance(Account account){
        return account.getBalance();
    }

    public long newBalance(Account account, long tranferMoney){
        return account.getBalance() - tranferMoney;
    }

    public long tranferAmount(Account account,long tranferMoney){
        boolean istrue = true;
        while(istrue){
            try {
                if (tranferMoney <= 50000 && tranferMoney >= (account.getBalance() - 50000))
                    throw new TransferException("Số tiền không khả dụng:");

            } catch (TransferException e) {
                System.out.println("Nhập lại số tiền cần chuyển: ");
            } catch (NumberFormatException e){
                System.out.println("Không thể nhập số tiền bằng chữ: ");
            }
        }
        return tranferMoney;
    }
    public ArrayList<TransferHistory> transferHistories(ArrayList<TransferHistory> transferHistoryArrayList,Account account, long transferMoney){
        transferHistoryArrayList.add(new TransferHistory("Vietcombank",tranferAmount(account,transferMoney), LocalDate.now()));
        return transferHistoryArrayList;
    }



}
