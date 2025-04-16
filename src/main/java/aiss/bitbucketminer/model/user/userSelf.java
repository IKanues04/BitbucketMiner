package aiss.bitbucketminer.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class userSelf {

    @JsonProperty("avatar")
    private Avatar avatar;

    @JsonProperty("self")
    private UserLink userlink;

    @JsonProperty("self")
    public UserLink getSelf() {
        return userlink;
    }

    @JsonProperty("self")
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
