package src.domainobjects.info;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "careers")
public class Career {

    @Id
    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "bio", nullable = true, length = 5000)
    private String bio;

    @OneToOne
    @JoinColumn(name = "branch", nullable = false)
    private Branch branch;

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

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
