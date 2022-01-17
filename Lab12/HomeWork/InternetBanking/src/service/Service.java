package service;

import exception.TransferException;
import model.Account;
import model.TransferHistory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    TransferHistory transferHistory = new TransferHistory();
    ArrayList<TransferHistory> transferHistoryArrayList = new ArrayList<>();

    public void newBalance(Account account) {
        account.setBalance(account.getBalance() - transferHistory.getTransferAmount());
    }

    public void transferAmount(Account account) {
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.println("Nhập số tiền cần chuyển");
                transferHistory.setTransferAmount(Long.parseLong(sc.nextLine()));
                if (transferHistory.getTransferAmount() <= 50000 || transferHistory.getTransferAmount() >= (account.getBalance() - 50000))
                    throw new TransferException("Số tiền không khả dụng (Trong tài khoản phải còn dư 50000 và số tiền chuyển phải lớn hơn 50000):");
                isTrue = false;
            } catch (TransferException e) {
                System.out.println("Nhập lại số tiền cần chuyển: ");
            } catch (NumberFormatException e) {
                System.out.println("Không thể nhập số tiền bằng chữ: ");
            }
        }
    }

    public void beneficiaryAccount() {
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.println("Nhập số tài khoản thụ hưởng");
                transferHistory.setBeneficiaryAccount(Long.parseLong(sc.nextLine()));
                isTrue = false;
            } catch (NumberFormatException e) {
                System.out.println("Không thể nhập chữ vào số tài khoản thụ hưởng");
            }
        }
    }

    public ArrayList<TransferHistory> transfer(Account account) {
        beneficiaryAccount();
        transferAmount(account);
        System.out.println("Nhập mô tả");
        String transferNote = sc.nextLine();
        transferHistoryArrayList.add(new TransferHistory(transferHistory.getTransferAmount(), LocalDate.now(), transferHistory.getBeneficiaryAccount(), transferNote));
        return transferHistoryArrayList;
    }

    public boolean login(Account account, String tel, String password) {
        if (tel.equals(account.getTel())) {
            if (password.equals(account.getPassword())) {
                return true;
            } else {
                System.out.println("Nhập sai password");
                return false;
            }
        } else System.out.println("Nhập sai số điện thoại");
        return false;
    }


    public void printTransferHistory() {
        for (TransferHistory h : transferHistoryArrayList) {
            System.out.println(h);
        }
    }


}
