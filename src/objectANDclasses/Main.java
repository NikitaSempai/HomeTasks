package objectANDclasses;

public class Main {
    public static void main(String[] args){
        Author firstAuthor = new Author("Nikita", "Afanasev");
        Author secondAuthor = new Author("Vadim", "Goroshenko");
        Book firstBook = new Book("Выйду в поле", firstAuthor, 10_09_1980);
        Book secondBook = new Book("Лунное путешествие", secondAuthor, 22_01_2022);
        System.out.println("First Book: " + "\n" + firstBook + "\n\n" + "Second Book:" + "\n" + secondBook);
        secondBook.setPublishDate(21_02_2022);
        System.out.println("\nSecond book with new date" + "\n" + secondBook);
        System.out.println("\nFirst Author:\n" + firstAuthor);
        System.out.println("\nSecond Author:\n" + secondAuthor);

        Book Book1 = new Book("Тест", firstAuthor, 10_09_1910);
        Book Book2 = new Book("Тест", firstAuthor, 10_09_1910);
        System.out.println("\nСравнение объектов книг (значений а не ссылок):\n" + Book1.equals(Book2));

        Author Author1 = new Author("Anton", "Maslixov");
        Author Author2 = new Author("Anton", "Maslixov");
        System.out.println("\nСравнение объектов авторов (значений а не ссылок):\n" + Author1.equals(Author2));

    }
}
