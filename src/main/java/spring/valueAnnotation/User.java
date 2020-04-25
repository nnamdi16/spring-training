package spring.valueAnnotation;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private String userRole;
    private String userCountry;
    private Boolean userActive;
    private Integer userAge;
    private String mySystemVal;
    private List<String> userSkills;
    private Map<Integer, String> teamMates;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public Boolean getUserActive() {
        return userActive;
    }

    public void setUserActive(Boolean userActive) {
        this.userActive = userActive;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getMySystemVal() {
        return mySystemVal;
    }

    public void setMySystemVal(String mySystemVal) {
        this.mySystemVal = mySystemVal;
    }

    public List<String> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(List<String> userSkills) {
        this.userSkills = userSkills;
    }

    public Map<Integer, String> getTeamMates() {
        return teamMates;
    }

    public void setTeamMates(Map<Integer, String> teamMates) {
        this.teamMates = teamMates;
    }
}
