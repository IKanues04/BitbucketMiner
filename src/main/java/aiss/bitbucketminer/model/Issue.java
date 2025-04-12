package aiss.bitbucketminer.model;

import java.util.List;

public class Issue {

    private String id;
    private String title;
    private String description;
    private String state;
    private String createdAT;
    private String updateAT;
    private String closedAT;
    private List<String> labels;
    private Integer votes;

    public Issue (String id, String title, String description, String state,
                  String createdAT, String updateAT, String closedAT,
                  List<String> labels, Integer votes) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.createdAT = createdAT;
        this.updateAT = updateAT;
        this.closedAT = closedAT;
        this.labels = labels;
        this.votes = votes;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }

    public String getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(String updateAT) {
        this.updateAT = updateAT;
    }

    public String getClosedAT() {
        return closedAT;
    }

    public void setClosedAT(String closedAT) {
        this.closedAT = closedAT;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }


}
