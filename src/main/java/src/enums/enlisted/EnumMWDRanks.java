package src.enums.enlisted;

public enum EnumMWDRanks {

    PUP("Pup", "Pup", "Starting rank, this is where everyone starts out."),
    OMEGA("Omega", "Ome", "Only having authority over E-1 Ranks, usually still getting a hold of and gaining confidence in operation."),
    CHI("Chi", "Chi", "Experienced. Having attended multiple events and participated actively."),
    WARRIOR("Warrior", "War", "Some of the hardest working, highest trained enlisted! A rank to be proud of achieving."),

    CANINE_IN_TRAINING("Canine in Training", "CIT","NCOs in training. Former enlisted who really proved themselves and got selected to climb the ranks!"),
    LEAD_WARRIOR("Lead Warrior", "LWar", "An important new addition to the NCO team. Specifically focused on helping out in small places and hosting."),
    DELTA("Delta", "Del", "Is able to do a few more important things than the lower ranking NCOs. Still focused on hosting and helping out."),
    EPSILON("Epsilon", "Eps", "Better at hosting and typically just being introduced to the more serious sides of the regiment."),
    GAMMA("Gamma", "Gam", "A very experienced NCO that helps keep the others in check along with working alongside low ranking COs."),

    LEAD_GAMMA("Lead Gamma", "LGam", "Much grander duties await fresh COs. Learning how to deal with the more serious issues in the regiment."),
    OMNICRON("Omnicron", "Omni", "Getting used to everything they've learned and wandering closer to deeper server work as they go on."),
    BETA("Beta", "Bet", "Normally seen as the teachers to lower ranks, demonstrating confident hosting techniques and controlled problem solving abilities."),
    SUB_ALPHA("Sub-Alpha", "SAlp", "Highest CO rank, typically overseeing situations, and organizing issues / concerns up or down the Chain of Command."),

    ALPHA("Alpha", "Alp", "Third in Command, listens to concerns and deals with most of them, or they are handed back to the lower rank."),
    ELDER("Elder", "Eld", "Second in Command, typically the one who uptakes similar though lesser responsibility to the leader while they are not present."),
    LRAM("Leading Remm of Acknowledgements and Mastery", "LRAM", "Highest in Command, they run the majority of the operations and make final decisions.");


    private String full;
    private String abbreviation;
    private String bio;

    EnumMWDRanks(String full, String abbreviation, String bio) {
        this.full = full;
        this.abbreviation = abbreviation;
        this.bio = bio;
    }

    public String getFull() {
        return full;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getBio() {
        return bio;
    }
}
