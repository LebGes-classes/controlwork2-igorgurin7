package kr2;

public class Peoples {
    public String name;
    public String surname;
    public String title;
    public int age;

    public Peoples(String name, int age){
        if(name.isEmpty()){
            System.out.println("Имя должно быть заполнено");
        }else{
            this.name = name;
        }
        if(age<0){
            System.out.println("Возраст не может быть отрицательным");
        }else{
            this.age = age;
        }
    }
    public Peoples(String surname, String title){
        if(surname.isEmpty()){
            System.out.println("Имя должно быть заполнено");
        }else{
            this.surname = surname;
        }
        if(title.isEmpty()){
            System.out.println("Имя должно быть заполнено");
        }else{
            this.title = title;
        }
    }

}
