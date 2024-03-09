package practiceJPA.JPAPractice.Model.Response;

import practiceJPA.JPAPractice.Model.Entity.User;

public class userResponse {

    private Long id;
    private String name;
    private Integer age;
    private String grade;

    public userResponse(Long id, String name, Integer age, String grade) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static userResponse  methodResponse(User stu) {
        return new userResponse(
                stu.getId(),
                stu.getName(),
                stu.getAge(),
                stu.getGrade()
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
