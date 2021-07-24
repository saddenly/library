public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        String errorMsg = "Перевод книги из статуса \"X\" в статус \"Y\" невозможен";
        if (book.getStatus() != StatusEnum.ARCHIVED) {
            System.out.println(errorMsg);
        }
        if (requestedStatus == StatusEnum.AVAILABLE) {
            System.out.println("Перевод выполнен");
            book.setStatus(StatusEnum.AVAILABLE);
        } else {
            System.out.println(errorMsg);
        }
    }
}