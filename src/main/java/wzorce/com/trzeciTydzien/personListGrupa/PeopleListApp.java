package wzorce.com.trzeciTydzien.personListGrupa;


public class PeopleListApp {
    public static void main(String[] args) {
        PeopleList person = new PeopleList();
        person.addPeople("jan", "kowalski");
        person.addPeople("adam", "kowalski");
        person.addPeople("kamil", "kowalski");
        person.addPeople("pawel", "kowalski");
        person.addPeople("pawel", "kowalski");
        person.addPeople("jan", "zawisza");
        person.addPeople("antoni", "zawiasa");
        System.out.println(person);

        //print z metody
        System.out.println(person.listOfNames("Kowalski"));

        //print ze streama
        System.out.println(person.listOfNamesStream("kowalski"));


    }
}

