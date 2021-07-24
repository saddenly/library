public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        String errorMsg = "Перевод книги из статуса \"X\" в статус \"Y\" невозможен";
        if (book.getStatus() != StatusEnum.AVAILABLE) {
            System.out.println(errorMsg);
        }
        switch (requestedStatus) {
            case BORROWED -> {
                System.out.println("Перевод выполнен");
                book.setStatus(StatusEnum.BORROWED);
            }
            case ARCHIVED -> {
                System.out.println("Перевод выполнен");
                book.setStatus(StatusEnum.ARCHIVED);
            }
            default -> System.out.println(errorMsg);
        }
    }
}