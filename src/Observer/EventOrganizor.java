package Observer;

public class EventOrganizor {
    public static void main(String[] args) {
        MarriageEvent event = new MarriageEvent("Somewhere in Downtown Chicago IL", "Next Sunday", "Biqian Dong", "Youngjo Kim", 100);

        GuestObserver jack = new GuestObserver("Jack Chai");
        GuestObserver harsh = new GuestObserver("Harsh Patel");
        GuestObserver matt = new GuestObserver("Mattew Feingold");

        FamilyObserver peter = new FamilyObserver("Peter Dong");
        FamilyObserver vera = new FamilyObserver("vera Zhang");
        FamilyObserver jocelyn = new FamilyObserver("Jocelyn Shun");

        StaffObserver staff1 = new StaffObserver("Staff 1");
        StaffObserver staff2 = new StaffObserver("Staff 2");
        StaffObserver staff3 = new StaffObserver("Staff 3");

        event.RegisterObserver(jack);
        event.RegisterObserver(harsh);
        event.RegisterObserver(matt);
        event.RegisterObserver(peter);
        event.RegisterObserver(vera);
        event.RegisterObserver(jocelyn);
        event.RegisterObserver(staff1);
        event.RegisterObserver(staff2);
        event.RegisterObserver(staff3);


        event.setDate("Next Next Monday");
        event.setNumGuest(3000);
        event.setGroom("Super Rich Asian");

    }
}
