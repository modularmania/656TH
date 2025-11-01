package src.enums.info;

public enum EnumBranches {

    ALPHA("Alpha", "Alpha is the Main Front of the Regiment, having to either do with extreme defense or extreme offense. This Branch is full of the strongest units that the 656TH has enlisted."),
    BRAVO("Bravo", "Mainly focusing on the technical side of the regiment, Bravo relies on large scale connection systems and are always the most informed during missions or patrols. They’re the brains behind the operation."),
    DELTA("Delta", "In Delta, our Units focus on Bio-Enhancement and improving our enlistees' limits with special perks. Delta is very selective; meaning you have to be a certain rank to join. This is the only other Branch that MWDs can take part in, aside from Golf. "),
    GOLF("Golf", "Golf, the MWD Branch. In this branch, every career corresponds to a pre-existing one, still including Delta. MWDs are important Units just like everyone else, and must be treated like such. Your dog will always outrank you."),
    UNBRANCHED("Unbranched", "New units who have not yet chosen a branch remain Unbranched.");

    private String name;
    private String bio;

    EnumBranches(String name, String bio) {
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
