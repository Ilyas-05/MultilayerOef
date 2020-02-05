package sample;

public class programmeur extends Werknemer{
    private String programmeertaal;

    public programmeur(String naam, int leeftijd, double salaris, String programmeertaal) {
        super(naam, leeftijd, salaris);
        this.programmeertaal = programmeertaal;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\n taal: " + programmeertaal;
    }

    public String programmeer(){
        return "ik schrijf code in " + programmeertaal;
    }
}
