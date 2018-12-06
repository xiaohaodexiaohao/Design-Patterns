package design;

public class Client {
    public static void main(String[] args) {
        Mom mom = new Mom();
        mom.narrate(new Book());
        mom.narrate(new Newspaper());
    }
}
