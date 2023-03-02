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
    }
}
