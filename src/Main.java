public class Main {
    public static void main(String[] args) {
        Author martin = new Author("Роберт", "Мартин,");
        Author ekkel = new Author("Брюс", "Эккель,");

        Book cleanCode = new Book("Чистый Код,", martin, 2017);
        Book javaPhilosophy = new Book("Философия Java,", ekkel, 2017);

        System.out.println(cleanCode);
        System.out.println(javaPhilosophy);

        cleanCode.setYear(2019);

        System.out.println(cleanCode);
    }
}