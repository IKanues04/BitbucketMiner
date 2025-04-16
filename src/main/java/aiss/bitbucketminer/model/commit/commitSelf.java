
package aiss.bitbucketminer.model.commit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class commitSelf {

    @JsonProperty("self")
    private CommitLink commitLink;

    @JsonProperty("self")
    public CommitLink getCommitLink() {
        return commitLink;
    }

    @JsonProperty("self")
    public void setCommitLink(CommitLink commitLink) {
        this.commitLink = commitLink;
    }

}
