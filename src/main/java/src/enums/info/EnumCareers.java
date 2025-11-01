package src.enums.info;

public enum EnumCareers {

    SNIPER("Sniper", "The most strictly trained units in Alpha, Snipers are skilled combat sharpshooters who rarely miss a target. These units are very well versed in combat.", "Alpha"),
    TANK("Tank", "The most resilient soldiers of the 656TH. Tanks have the heftiest armor out of all the other units, making them some of the best defensive units we have.", "Alpha"),

    PILOT("Pilot", "Pilots are the skilled fliers of the 656TH, often reaching top speeds while keeping their eyes peeled for potentially harmful behavior. Due to their intelligence and pattern recognition, they're able to point out conflict before it even begins.", "Bravo"),
    ENCODER("Encoder", "Encoders are likely to be some of the most dedicated units you'll ever meet. Training hard to use their extreme coding skills for good, they can hack any database and easily bypass the difficulties of any task.", "Bravo"),

    CYBOT("CyBot", "The bulk of 656TH, Radio-botics pushing the bounds of reality and proving useful in warfare. Despite being fully equipped with tools and machinery, they aren't very good at defending themselves. These units are still very vital, as their fighting style usually uses speed and confusion to gain the upper hand in combat.", "Delta"),
    BIOWEAPON("Bioweapon", "With carefully tailored, radioactivity proof uniforms, Bioweapons are specialized MWD units that are always up for a fight. More chaotic than the rest, these MWDs are very good in combat.", "Delta"),

    BOMB_DOG("Bomb Dog", "Trained specifically to sniff out and identify explosives. Bomb Dogs sniff anywhere we go for Bombs, Weaponry, or Dangerous Machinery.", "Golf"),
    SKY_PUP("Sky Pup", "The quickest air units you will ever meet, these pups are trained to be keen and explosive, perfect of searching units and sending missiles on command during combat.", "Golf"),
    WOLF_HOUND("Wolf-Hounds", "Strictly trained hunting dogs who are specifically trained in tracking, detection, and recovery, meaning they can easily clear the lockdown, and are primarily tasked with supporting our units by detecting ailments and resolving them by notifying medics or their handlers.", "Golf");

    private String name;
    private String bio;
    private String branch;

    EnumCareers(String name, String bio, String branch) {
        this.name = name;
        this.bio = bio;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getBranch() {
        return branch;
    }

}
