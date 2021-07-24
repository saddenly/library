public class Main {
    public static void main(String[] args) {
        Book lordOfRings = new Book("Властелин колец");
        System.out.println(lordOfRings.getStatus());

        BookMover fromAvailableBookMover = new FromAvailableStatusMover();
        fromAvailableBookMover.moveToStatus(lordOfRings, StatusEnum.OVERDUED);
        fromAvailableBookMover.moveToStatus(lordOfRings, StatusEnum.ARCHIVED);
        System.out.println(lordOfRings.getStatus());
        BookMover fromArchivedBookMover = new FromArchivedStatusMover();
        fromArchivedBookMover.moveToStatus(lordOfRings, StatusEnum.AVAILABLE);
        System.out.println(lordOfRings.getStatus());
    }
}