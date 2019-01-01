package Observer;

public class FamilyObserver implements Observer, DisplayInformation {
    private String location;
    private String date;
    private String bride;
    private String groom;
    private String guest;
    private Subject marriageEvent;

    public FamilyObserver(String name) {
        this.guest = name;
    }

    public void GetCurrentMarriageEvent(Subject marriageEvent) {
        this.marriageEvent = marriageEvent;
        this.marriageEvent.RegisterObserver(this);
    }

    public void update(String location, String date, String bride, String groom, int numGuest) {
        this.location = location;
        this.date = date;
        this.bride = bride;
        this.groom = groom;
        this.ShowInformation();
    }

    public void ShowInformation() {
        System.out.println("===================== Marriage Invitation ============================");
        System.out.println("    To my family " + this.guest);
        System.out.println("    You are invitded to marry event of " + this.bride + " and " + this.groom);
        System.out.println("    at " + this.location);
        System.out.println("    on " + this.date);
        System.out.println();
    }
}
