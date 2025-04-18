
package aiss.bitbucketminer.model.commit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class commitHTML {

    @JsonProperty("html")
    private CommitLink commitLink;

    @JsonProperty("html")
    public CommitLink getCommitLink() {
        return commitLink;
    }

    @JsonProperty("html")
    public void setCommitLink(CommitLink commitLink) {
        this.commitLink = commitLink;
    }

}
