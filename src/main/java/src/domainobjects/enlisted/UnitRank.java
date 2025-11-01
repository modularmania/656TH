package src.domainobjects.enlisted;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit_ranks")
public class UnitRank {

    @Id
    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "abbreviation", nullable = false, length = 10)
    private String abbreviation;

    @Column(name = "bio", nullable = true, length = 5000)
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
