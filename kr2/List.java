package kr2;

public class List {
    public static void main(String[] args){
        Peoples people1 = new Peoples("Иванов","Кассир");
        Peoples people2 = new Peoples("Смирнова","Уборщица");
        Peoples people3 = new Peoples("Петров","Грузчик");
        Peoples people4 = new Peoples("Алексей",18);
        Peoples people5 = new Peoples("Петр",25);
        Peoples people6 = new Peoples("Григорий",35);

        Workers worker1 = new Workers(people1.surname,people1.title);
        Workers worker2 = new Workers(people2.surname,people2.title);
        Workers worker3 = new Workers(people3.surname,people3.title);
        Visitors visitor1 = new Visitors(people4.name,people4.age);
        Visitors visitor2 = new Visitors(people5.name,people5.age);
        Visitors visitor3 = new Visitors(people6.name,people6.age);

        System.out.println(people1.surname +" "+ people1.title);
        System.out.println(people2.surname +" "+ people2.title);
        System.out.println(people3.surname +" "+ people3.title);
        System.out.println(people4.name +" "+ people4.age+" лет");
        System.out.println(people5.name +" "+ people5.age+" лет");
        System.out.println(people6.name +" "+ people6.age+" лет");
    }
}
