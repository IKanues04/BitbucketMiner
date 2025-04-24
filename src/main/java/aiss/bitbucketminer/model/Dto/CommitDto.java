package aiss.bitbucketminer.model.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommitDto {

    // ATRIBUTOS
    private String hash;
    private String message;
    private String date;

    private Author author;
    private Summary summary;
    private Links links;

    //GETTERS Y SETTERS (COMMIT)
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }


    // SUBCLASES PARA LAS ESTRUCTURAS ANIDADAS
    // CLASE "AUTHOR"

    public static class Author {
        private String raw;
        private User user;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        // CLASE "USER"

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class User {
            @JsonProperty("display_name")
            private String displayName;

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }
        }

    }

    // CLASE "SUMMARY"

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Summary {
        private String raw;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }
    }

    // CLASE "LINKS"

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Links {
        private Link html;

        public Link getHtml() {
            return html;
        }

        public void setHtml(Link html) {
            this.html = html;
        }

        // CLASE "LINK"

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Link {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }
    }

}
