package objectANDclasses;

public class Book {
    private String name;
    private Author author;
    private int publishDate;
    public Book(String name, Author author, int publishDate){
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublishDate(){
        return this.publishDate;
    }

    public void setPublishDate(int publishDate){
        this.publishDate = publishDate;
    }

    @Override
    public String toString(){
        return "Name of book - " + name + "\n" +
                "Author name - " + getAuthor().getName() + "\n" +
                "Author surname - " + getAuthor().getSurname() + "\n" +
                "Publish date - " + publishDate;
    }

}
