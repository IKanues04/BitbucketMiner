package aiss.bitbucketminer.model;

public class User {

    private String id;
    private String username;
    private String name;
    private String avatarURL;
    private String webURL;

    public User (String id, String username, String name,
                 String avatarURL, String webURL) {

        this.id = id;
        this.username = username;
        this.name = name;
        this.avatarURL = avatarURL;
        this.webURL = webURL;
    }

    // DESARROLLO DE LOS GETTERS

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public String getWebURL() {
        return webURL;
    }

    // DESARROLLO DE LOS SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }
}
