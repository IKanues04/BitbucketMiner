package aiss.bitbucketminer.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class userHTML {

    @JsonProperty("avatar")
    private Avatar avatar;

    @JsonProperty("html")
    private UserLink userlink;

    @JsonProperty("html")
    public UserLink getSelf() {
        return userlink;
    }

    @JsonProperty("html")
    public void setSelf(UserLink userlink) {
        this.userlink = userlink;
    }

    @JsonProperty("avatar")
    public Avatar getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
