package src.enums.info;

public enum EnumExtraCareers {

    MEDIC("Medic", "Medics are on constant standby, ready to heal those who have fallen in the heat of battle or on difficult missions. Their jobs warrant them respect. They may not outrank you, but life and death is in their hands."),
    HANDLER("Handler","These units are sepcial, because they can form a partnership with an MWD. Being a handler is a sub-career, meaning you may be a handler and still pick another career corresponding to your branch.");

    private String name;
    private String bio;

    EnumExtraCareers(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

}
