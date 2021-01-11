package org.alex.hw17.domain;


import javax.persistence.*;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column(name = "accreditation_level")
    private String accreditationLevel;

    @Column(name = "institute_number")
    private Integer institutesNumber;

    @Column(name = "stdents_number")
    private Integer studentsNumber;
    @Column
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccreditationLevel() {
        return accreditationLevel;
    }

    public void setAccreditationLevel(String accreditationLevel) {
        this.accreditationLevel = accreditationLevel;
    }

    public Integer getInstitutesNumber() {
        return institutesNumber;
    }

    public void setInstitutesNumber(Integer institutesNumber) {
        this.institutesNumber = institutesNumber;
    }

    public Integer getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(Integer studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accreditationLevel='" + accreditationLevel + '\'' +
                ", institutesNumber=" + institutesNumber +
                ", studentsNumber=" + studentsNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
