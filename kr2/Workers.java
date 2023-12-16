package kr2;

public class Workers {
    private String surname;
    private String title;

    public Workers(String surname, String title){
        if(surname.isEmpty()){
            System.out.println("Фамилия должна быть заполнена");
        }else{
            this.surname = surname;
        }
        if(title.isEmpty()){
            System.out.println("Должность должна быть заполнена");
        }else{
            this.title = title;
        }
    }
}
