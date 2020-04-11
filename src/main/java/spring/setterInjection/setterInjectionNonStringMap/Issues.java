package spring.setterInjection.setterInjectionNonStringMap;

import java.util.Date;

public class Issues {
    private int id;
    private String issues;
    private Date postedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }


    public String toString() {
        return "Id:" + id + " Issues:" + issues + " Posted Date:" + postedDate;
    }
}
