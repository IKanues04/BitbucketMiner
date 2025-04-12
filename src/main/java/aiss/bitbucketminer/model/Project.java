package aiss.bitbucketminer.model;

public class Project {

    private String id;
    private String name;
    private String webURL;

    public Project(String id, String name, String webURL) {
        this.id = id;
        this.name = name;
        this.webURL = webURL;
    }

    // ELAVORACION DE GETTERS

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getWebURL () {
        return  this.webURL;
    }

    // ELAVORACION DE SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }
}
