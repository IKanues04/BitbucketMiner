package aiss.bitbucketminer.model.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class projectHTML {

    @JsonProperty("html")
    private ProjectLink html;

    @JsonProperty("html")
    public ProjectLink getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(ProjectLink html) {
        this.html = html;
    }

}
