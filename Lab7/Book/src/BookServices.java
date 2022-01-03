public class BookServices {
    public static Book[] getAllBook() {
        Book[] book = new Book[4];
        book[0] = new Book(1, "Cuon theo chieu gio", new String[]{"Tinh cam", "Phieu luu"}, "to hoai", 1998, "Kim dong");
        book[1] = new Book(2, "Cuon theo chieu gio1", new String[]{"Tinh cam", "Phieu luu1"}, "to hoai1", 1998, "Kim dong1");
        book[2] = new Book(2, "Cuon theo chieu gio2", new String[]{"Tinh cam", "Phieu luu1", "ASDF"}, "to hoai1", 1998, "Kim dong1");
        book[3] = new Book(2, "ddddddd", new String[]{"Tinh cam", "Phieu luu1", "ASDF"}, "to hoai1", 1998, "Kim dong1");

        return book;
    }

    // Lọc 2 phần tử, kiểm tra xem mảng nọ có nằm trong mảng kia hay không?
    public static void printBook() {
        for (Book book : getAllBook()) {
            if (book.getTitle().contains("Cuon theo")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
