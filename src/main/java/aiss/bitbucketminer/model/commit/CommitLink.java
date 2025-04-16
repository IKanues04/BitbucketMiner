
package aiss.bitbucketminer.model.commit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommitLink {

    @JsonProperty("href")
    private String referencia;

    @JsonProperty("href")
    public String getReferencia() {
        return referencia;
    }

    @JsonProperty("href")
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
