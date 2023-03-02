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

    /* Переопределение библиотечного метода toString */
    @Override
    public String toString(){
        return "Name of book - " + name + "\n" +
                "Author name - " + getAuthor().getName() + "\n" +
                "Author surname - " + getAuthor().getSurname() + "\n" +
                "Publish date - " + publishDate;
    }

    /* Переопределение библиотечного метода equals */
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Book item = (Book) obj; // используем приведение типов
        return publishDate == item.publishDate &&
                (name == item.name || (name != null && name.equals(item.getName()))) &&
                (author == item.author || (author != null && author.equals(item.getAuthor())));
    }

}
