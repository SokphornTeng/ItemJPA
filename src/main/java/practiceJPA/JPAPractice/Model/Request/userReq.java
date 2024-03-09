package practiceJPA.JPAPractice.Model.Request;

import practiceJPA.JPAPractice.Model.Entity.User;

public class userReq {

    private String name;
    private Integer age;
    private String grade;

    public userReq(String name, Integer age, String grade) {
        super();
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public User methodReq() {
        User stuInfo = new User();
        stuInfo.setName(this.name);
        stuInfo.setAge(this.age);
        stuInfo.setGrade(this.grade);
        return stuInfo;
    }
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
