public class BookMover {
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        System.out.println("Moving to status: " + requestedStatus);
    }
}