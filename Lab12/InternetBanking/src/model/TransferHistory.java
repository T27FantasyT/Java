package model;

import java.time.LocalDate;

public class TransferHistory {
    private long transferAmount = 0;
    private LocalDate date;
    private long beneficiaryAccount;
    private String transferNote;

    public TransferHistory() {
    }

    public TransferHistory(long transferAmount, LocalDate date, long beneficiaryAccount, String transferNote) {
        this.transferAmount = transferAmount;
        this.date = date;
        this.beneficiaryAccount = beneficiaryAccount;
        this.transferNote = transferNote;


    }

    public long getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(long transferAmount) {
        this.transferAmount = transferAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(long beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public String getTransferNote() {
        return transferNote;
    }

    public void setTransferNote(String transferNote) {
        this.transferNote = transferNote;
    }

    @Override
    public String toString() {
        return date + " - " + transferNote + " - " + beneficiaryAccount + " - " + transferAmount;
    }
}