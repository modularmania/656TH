package src.domainobjects.enlisted;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import src.domainobjects.info.Branch;
import src.domainobjects.info.Career;

@Entity
@Table(name = "units")
public class Unit {

    @Id
    @Column(name = "unit_id", nullable = false, length = 4)
    private String id;

    @Column(name = "first_name", nullable = true, length = 255)
    private String firstName;

    @Column(name = "middle_name", nullable = true, length = 255)
    private String middleName;

    @Column(name = "last_name", nullable = true, length = 255)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "branch", nullable = false)
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "rank", nullable = false)
    private UnitRank rank;

    @OneToOne
    @JoinColumn(name = "career", nullable = false)
    private Career career;

    @Column(name = "is_medic", nullable = false, length = 1)
    private boolean isMedic;

    @Column(name = "is_staff", nullable = false, length = 1)
    private boolean isStaff;

    @Column(name = "date_recruited", nullable = true, length = 30)
    private Date dateRecruited;

    @Column(name = "last_training_date", nullable = true, length = 30)
    private Date lastTrainingDate;

    @Column(name = "task_no", nullable = true, length = 10)
    private String taskNumber;

    @Column(name = "task_value", nullable = true, length = 6)
    private String taskValue;

    @OneToOne
    @JoinColumn(name = "paired_mwd", nullable = true)
    private MWD pairedMWDId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public UnitRank getRank() {
        return rank;
    }

    public void setRank(UnitRank rank) {
        this.rank = rank;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public boolean isMedic() {
        return isMedic;
    }

    public void setMedic(boolean medic) {
        isMedic = medic;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }

    public Date getDateRecruited() {
        return dateRecruited;
    }

    public void setDateRecruited(Date dateRecruited) {
        this.dateRecruited = dateRecruited;
    }

    public Date getLastTrainingDate() {
        return lastTrainingDate;
    }

    public void setLastTrainingDate(Date lastTrainingDate) {
        this.lastTrainingDate = lastTrainingDate;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskValue() {
        return taskValue;
    }

    public void setTaskValue(String taskValue) {
        this.taskValue = taskValue;
    }

    public MWD getPairedMWDId() {
        return pairedMWDId;
    }

    public void setPairedMWDId(MWD pairedMWDId) {
        this.pairedMWDId = pairedMWDId;
    }
}
