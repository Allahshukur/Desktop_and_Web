package az.Charming.Student_web_Server.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class StudentEntity {

    @Id
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private BigDecimal scholarsip;

    public String getName() {
        return name;
    }

    public StudentEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentEntity setAge(Integer age) {
        this.age = age;
        return this;
    }

    public BigDecimal getScholarsip() {
        return scholarsip;
    }

    public StudentEntity setScholarsip(BigDecimal scholarsip) {
        this.scholarsip = scholarsip;
        return this;
    }

}
