package practiceJPA.JPAPractice.Model.Entity;

import jakarta.persistence.*;
import practiceJPA.JPAPractice.Model.Entity.softDelete.softDeleteEntity;

@Entity
@Table(name="UserInfo")
//public class User extends BaseEntity{
public class User extends softDeleteEntity<Long> {

    @Column(name="Name", length = 30, nullable = false)
    private String name;
    @Column(name="Age", nullable = false)
    private Integer age;
    @Column(name="Grade", length = 30, nullable = false)
    private String grade;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
