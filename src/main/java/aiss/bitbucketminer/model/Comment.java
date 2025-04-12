package aiss.bitbucketminer.model;

public class Comment {

    private String id;
    private String body;
    private String createdAT;
    private String updatedAT;

    public Comment (String id, String body, String createdAT, String updatedAT) {

        this.id = id;
        this.body = body;
        this.createdAT = createdAT;
        this.updatedAT = updatedAT;

    }

    // CREACION DE LOS GETTERS

    public String getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getCreatedAT() {
        return createdAT;
    }

    public String getUpdatedAT() {
        return updatedAT;
    }

    // CREACION DE LOS SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }

    public void setUpdatedAT(String updatedAT) {
        this.updatedAT = updatedAT;
    }
}
