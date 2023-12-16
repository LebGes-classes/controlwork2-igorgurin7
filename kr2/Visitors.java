package kr2;

public class Visitors {
    private String name;
    private int age;

    public Visitors(String name, int age){
        if(name.isEmpty()){
            System.out.println("Имя должно быть заполнено");
        }else{
            this.name = name;
        }
        if(age>0){
            this.age = age;
        }else{
            System.out.println("Возраст не может быть отрицательным");
        }
    }
}
