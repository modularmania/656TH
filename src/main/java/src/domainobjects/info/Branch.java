package src.domainobjects.info;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "branches")
public class Branch {

    @Id
    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "bio", nullable = true, length = 5000)
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
