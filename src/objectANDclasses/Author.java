package objectANDclasses;

public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
     return this.surname;
    }

    /* Переопределение метода toString */
    @Override
    public  String toString(){
        return "Author Name - " + getName() + "\n" +
                "Author Surname - " + getSurname();
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Author item = (Author) obj;
        return (name == item.name || (name != null && name.equals(item.getName())))
                && (surname == item.surname || (surname != null && surname.equals(item.getSurname())));
    }

}
