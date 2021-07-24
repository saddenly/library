public class Book {
    private String name;
    private StatusEnum status;

    public Book(String name) {
        this.name = name;
        this.status = StatusEnum.AVAILABLE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}