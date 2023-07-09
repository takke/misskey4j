package misskey4j.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Antenna {

    @Nonnull
    private String id = "";

    @Nonnull
    private String createdAt = "";

    @Nonnull
    private String name = "";

    @Nonnull
    private List<List<String>> keywords = new ArrayList<>(new ArrayList<>());

    @Nonnull
    private List<List<String>> excludeKeywords = new ArrayList<>(new ArrayList<>());

    @Nonnull
    private String src = "all";

    @Nullable
    private String userListId = "";

    @Nonnull
    private List<String> users = new ArrayList<>();

    private boolean caseSensitive;

    private boolean notify;

    private boolean withReplies;

    private boolean withFile;

    private boolean isActive;

    private boolean hasUnreadNote;


    // region

    @Nonnull
    public String getId() {
        return id;
    }

    public void setId(@Nonnull String id) {
        this.id = id;
    }

    @Nonnull
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@Nonnull String createdAt) {
        this.createdAt = createdAt;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nonnull
    public List<List<String>> getKeywords() {
        return keywords;
    }

    public void setKeywords(@Nonnull List<List<String>> keywords) {
        this.keywords = keywords;
    }

    @Nonnull
    public List<List<String>> getExcludeKeywords() {
        return excludeKeywords;
    }

    public void setExcludeKeywords(@Nonnull List<List<String>> excludeKeywords) {
        this.excludeKeywords = excludeKeywords;
    }

    @Nonnull
    public String getSrc() {
        return src;
    }

    public void setSrc(@Nonnull String src) {
        this.src = src;
    }

    @Nullable
    public String getUserListId() {
        return userListId;
    }

    public void setUserListId(@Nullable String userListId) {
        this.userListId = userListId;
    }

    @Nonnull
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(@Nonnull List<String> users) {
        this.users = users;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public boolean isWithReplies() {
        return withReplies;
    }

    public void setWithReplies(boolean withReplies) {
        this.withReplies = withReplies;
    }

    public boolean isWithFile() {
        return withFile;
    }

    public void setWithFile(boolean withFile) {
        this.withFile = withFile;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isHasUnreadNote() {
        return hasUnreadNote;
    }

    public void setHasUnreadNote(boolean hasUnreadNote) {
        this.hasUnreadNote = hasUnreadNote;
    }

    // endregion
}
