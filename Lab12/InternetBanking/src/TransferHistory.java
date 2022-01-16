import java.time.LocalDate;

public class TransferHistory extends Account{
    private String bankName;
    private long tranferAmount;
    private LocalDate date;

    public TransferHistory(String bankName, long tranferAmount, LocalDate date) {
        super("tien", "0972942909", "1111", "123456", 5000000L);
        this.bankName = bankName;
        this.tranferAmount = tranferAmount;
        this.date = date;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getTranferAmount() {
        return tranferAmount;
    }

    public void setTranferAmount(long tranferAmount) {
        this.tranferAmount = tranferAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrasnferlHistory{" +
                "bankName='" + bankName + '\'' +
                ", tranferAmount=" + tranferAmount +
                ", date=" + date +
                '}';
    }
}
