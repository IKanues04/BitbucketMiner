package aiss.bitbucketminer.model;

public class Commit {

    private String id;
    private String title;
    private String message;
    private String nAuthor;
    private String eAuthor;
    private String date_Authored;
    private String webURL;

    public Commit (String id, String title, String message,
                   String nAuthor, String eAuthor,
                   String date_Authored, String webURL) {

        this.id = id;
        this.title = title;
        this.message = message;
        this.nAuthor = nAuthor;
        this.eAuthor = eAuthor;
        this.date_Authored = date_Authored;
        this.webURL = webURL;
    }

    // ELAVORACION DE GETTERS

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getnAuthor() {
        return nAuthor;
    }

    public String geteAuthor() {
        return eAuthor;
    }

    public String getDate_Authored() {
        return date_Authored;
    }

    public String getWebURL() {
        return webURL;
    }

    // ELAVORACION DE SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor;
    }

    public void seteAuthor(String eAuthor) {
        this.eAuthor = eAuthor;
    }

    public void setDate_Authored(String date_Authored) {
        this.date_Authored = date_Authored;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }
}
