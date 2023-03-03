package objectANDclasses;

public class Author {
    final String name;
    final String surname;
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

    @Override
    public int hashCode(){
        final int total = 31;
        int result = 1;
        result = total * result + ((name == null) ? 0 : name.hashCode());
        result = total * result + ((surname == null) ? 0: surname.hashCode());
        return result;
    }
}
