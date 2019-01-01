package Observer;

public class StaffObserver implements Observer, DisplayInformation {
    private String location;
    private String date;
    private String bride;
    private String groom;
    private String guest;
    private Subject marriageEvent;

    public StaffObserver(String name) {
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
        System.out.println("===================== Marriage Work ============================");
        System.out.println("    There is marriage event of " + this.bride + " and " + this.groom);
        System.out.println("    at " + this.location);
        System.out.println("    on " + this.date);
        System.out.println("    Let them know you got $50/hour and it supposed to be paid before the end of the event.");
        System.out.println();
    }
}
