package Observer;

public class EventOrganizor {
    public static void main(String[] args) {
        MarriageEvent event = new MarriageEvent("Downtown somewhere in Chicago IL", "Next Sunday", "Biqian Dong", "Youngjo Kim", 100);

        GuestObserver jack = new GuestObserver("Jack Chai");
        GuestObserver harsh = new GuestObserver("Harsh Patel");
        GuestObserver matt = new GuestObserver("Mattew Feingold");
        GuestObserver derek = new GuestObserver("Derek Kim");
        GuestObserver joyce = new GuestObserver("Joyce Dong");
        GuestObserver chloe = new GuestObserver("Chloe Kim");

        event.RegisterObserver(jack);
        event.RegisterObserver(harsh);
        event.RegisterObserver(matt);
        event.RegisterObserver(derek);
        event.RegisterObserver(joyce);
        event.RegisterObserver(chloe);

        event.setDate("Next Next Monday");
        event.setNumGuest(3000);
        event.setGroom("Super Rich Asian");

    }
}
