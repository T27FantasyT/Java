import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    //Hang so
    public static final double Pi = 3.14;

    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);
        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfYear());
        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());
        System.out.println(toDay.getYear());

        //Cong them ngay

        System.out.println("Ngay mai " +toDay.plusDays(1));
        System.out.println("Hom qua" +toDay.minusDays(1));


        LocalDate date = LocalDate.of(2004,12,23);
        System.out.println(date);

        LocalDate currentDate= LocalDate.of(2004, Month.FEBRUARY,23);
        System.out.println(currentDate);

        //Local Time

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = LocalTime.of(3,4);
        System.out.println(time2);

        System.out.println(time.getMinute());
        System.out.println(time.plusHours(20));

        System.out.println(time.minusHours(9));

        //Lay ca ngay va gio

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(),LocalTime.now());

        //Format date time

        DateTimeFormatter dayformat = DateTimeFormatter.ofPattern("hh:mm,dd/MM/yyyy");
        System.out.println(dateTime2.format(dayformat));

        System.out.println("\"xin \nchao\"");

        System.out.println(div(9,4));

//        ScannerEx.usingScanner();

        //can le

        //System.out.printf("%s%d%s", "ngoc","8","hagiang");

        double a = Math.pow(2,5);
        System.out.println(a);

        ScannerEx.usingScanner();
    }

    public static double div(int a, int b){
    return a/b;
    }
}
