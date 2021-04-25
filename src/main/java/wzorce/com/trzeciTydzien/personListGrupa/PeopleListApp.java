package wzorce.com.trzeciTydzien.personListGrupa;


public class PeopleListApp {
    public static void main(String[] args) {
        PeopleList person = new PeopleList();
        person.addPeople("jan", "kowalski");
        person.addPeople("jan", "zawisza");
        person.addPeople("antoni", "zawiasa");
        System.out.println(person);
    }
}

