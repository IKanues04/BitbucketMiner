package aiss.bitbucketminer.model.project;

import aiss.bitbucketminer.model.workspace.Workspace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    @JsonProperty("type")
    private String type;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("workspace")
    private Workspace workspace;
    @JsonProperty("key")
    private String key;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("is_private")
    private Boolean isPrivate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("links")
    private projectHTML link;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("updated_on")
    private String updatedOn;
    @JsonProperty("has_publicly_visible_repos")
    private Boolean hasPubliclyVisibleRepos;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("workspace")
    public Workspace getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("is_private")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("is_private")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("links")
    public projectHTML getLinks() {
        return link;
    }

    @JsonProperty("links")
    public void setLinks(projectHTML links) {
        this.link = links;
    }

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("created_on")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("updated_on")
    public String getUpdatedOn() {
        return updatedOn;
    }

    @JsonProperty("updated_on")
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    @JsonProperty("has_publicly_visible_repos")
    public Boolean getHasPubliclyVisibleRepos() {
        return hasPubliclyVisibleRepos;
    }

    @JsonProperty("has_publicly_visible_repos")
    public void setHasPubliclyVisibleRepos(Boolean hasPubliclyVisibleRepos) {
        this.hasPubliclyVisibleRepos = hasPubliclyVisibleRepos;
    }

}
