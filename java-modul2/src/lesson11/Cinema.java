package lesson11;

public class Cinema {
    private String title;
    private Address address;

    public Cinema(String title) {
        this.title = title;
    }

    public Cinema(String title, Address address) {
        this.title = title;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "title='" + title + '\'' +
                ", address=" + address +
                '}';
    }
}
