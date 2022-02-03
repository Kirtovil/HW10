package homeWork;

public class homeWork {

    public static void main(String[] args) {
        Author zelazny = new Author("Роджер","Желязны");
        Book amber = new Book("Хроники Амбера", zelazny, 2014);

        Author pratchett = new Author("Терри", "Пратчетт");
        Book smallGods = new Book("Мелкие боги", pratchett, 2020);

        smallGods.setPublishingYear(1990);

        System.out.println(amber);
        System.out.println(smallGods);

        Book amberA = new Book("Хроники Амбера", zelazny, 2014);
        System.out.println(amber.equals(amberA));

        Author pratchettA = new Author("Терри", "Пратчетт");
        System.out.println(pratchett.equals(pratchettA));
    }
}
