package Observer;

public class GuestObserver implements Observer, DisplayInformation {
    private String location;
    private String date;
    private String bride;
    private String groom;
    private String guest;
    Subject marriageEvent;
    private int numGuest;


    public GuestObserver(String name) {
        this.guest = name;
    }

    public void GetCurrentMarriageEvent(Subject marriageEvent) {
        this.marriageEvent = marriageEvent;
        this.marriageEvent.RegisterObserver(this);
    }
    @Override
    public void update(String location, String date, String bride, String groom, int numGuest) {
        this.location = location;
        this.date = date;
        this.bride = bride;
        this.groom = groom;
        this.numGuest = numGuest;
        this.ShowInformation();
    }

    public void ShowInformation() {
        System.out.println("===================== Marriage Invitation ============================");
        System.out.println("    To " + this.guest);
        System.out.println("    You are invited from " + this.bride + " and " + this.groom);
        System.out.println("    at " + this.location);
        System.out.println("    on " + this.date);
        System.out.println("    There will be " + this.numGuest + " guests so you can hook up anyone if you can.");
        System.out.println();
    }
}
