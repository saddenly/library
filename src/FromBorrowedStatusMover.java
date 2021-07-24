public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        String errorMsg = "Перевод книги из статуса \"X\" в статус \"Y\" невозможен";
        if (book.getStatus() != StatusEnum.BORROWED) {
            System.out.println(errorMsg);
        }
        switch (requestedStatus) {
            case AVAILABLE -> {
                System.out.println("Перевод выполнен");
                book.setStatus(StatusEnum.AVAILABLE);
            }
            case ARCHIVED -> {
                System.out.println("Перевод выполнен");
                book.setStatus(StatusEnum.ARCHIVED);
            }
            case OVERDUED -> {
                System.out.println("Перевод выполнен");
                book.setStatus(StatusEnum.OVERDUED);
            }
        }
    }
}