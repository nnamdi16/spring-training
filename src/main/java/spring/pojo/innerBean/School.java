package spring.pojo.innerBean;

public class School {
    private String schoolName = "ABC School";
    private String principal;

    public School(Person person) {
        this.principal = person.getName();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getPrincipal() {
        return principal;
    }
}
