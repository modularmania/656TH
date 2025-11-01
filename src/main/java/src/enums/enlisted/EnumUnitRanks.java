package src.enums.enlisted;

public enum EnumUnitRanks {

    AIRMAN_BASIC("Airman Basic", "AB", "Starting rank, this is where everyone starts out."),
    AIRMAN("Airman", "Amn", "Only having authority over E-1 Ranks, usually still getting a hold of and gaining confidence in operation."),
    AIRMAN_FIRST_CLASS("Airman First Class", "A1C", "Experienced. Having attended multiple events and participated actively."),
    SENIOR_AIRMAN("Senior Airman", "SrA", "Some of the hardest working, highest trained enlisted! A rank to be proud of achieving."),

    CORPORAL_IN_TRAINING("Corporal in Training", "CIT","NCOs in training. Former enlisted who really proved themselves and got selected to climb the ranks!"),
    TECHNICAL_SERGEANT("Technical Sergeant", "TSgt", "An important new addition to the NCO team. Specifically focused on helping out in small places and hosting."),
    MASTER_SERGEANT("Master Sergeant", "MSgt", "Is able to do a few more important things than the lower ranking NCOs. Still focused on hosting and helping out."),
    CHIEF_MASTER_SPECIALIST("Chief Master Specialist", "CMS", "Better at hosting and typically just being introduced to the more serious sides of the regiment."),
    SERGEANT_MAJOR("Sergeant Major", "MajSgt", "A very experienced NCO that helps keep the others in check along with working alongside low ranking COs."),

    FIRST_LIEUTENANT("First Lieutenant", "1stLt", "Much grander duties await fresh COs. Learning how to deal with the more serious issues in the regiment."),
    CAPTAIN("Captain", "Capt", "Getting used to everything they've learned and wandering closer to deeper server work as they go on."),
    MAJOR("Major", "Maj", "Normally seen as the teachers to lower ranks, demonstrating confident hosting techniques and controlled problem solving abilities."),
    MAJOR_GENERAL("Major General", "MajGen", "Highest CO rank, typically overseeing situations, and organizing issues / concerns up or down the Chain of Command."),

    LIEUTENANT_GENERAL("Lieutenant General", "Lt. Gen", "Third in Command, listens to concerns and deals with most of them, or they are handed back to the lower rank."),
    GENERAL("General", "Gen", "Second in Command, typically the one who uptakes similar though lesser responsibility to the leader while they are not present."),
    LRAM("Leading Remm of Acknowledgements and Mastery", "LRAM", "Highest in Command, they run the majority of the operations and make final decisions.");


    private String full;
    private String abbreviation;
    private String bio;

    EnumUnitRanks(String full, String abbreviation, String bio) {
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
