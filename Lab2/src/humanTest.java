public class humanTest {
    public static void main(String[] args) {
        human h1 = new human(44,32,22);
        human h2 = new human(77,345,22);
        human h3 = new human(87,23,45);
        System.out.println(h1);
        h1.intoHuman();
        h2.intoHuman();
        h3.intoHuman();
    }
}
