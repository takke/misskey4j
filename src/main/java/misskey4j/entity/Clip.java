package misskey4j.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Clip {

    @Nonnull
    private String id = "";

    @Nonnull
    private String createdAt = "";

    @Nullable
    private String lastClippedAt = null;

    @Nonnull
    private String userId = "";

    private User user;

    @Nonnull
    private String name = "";

    @Nullable
    private String description = "";

    private boolean isPublic = false;

    private Boolean isFavorited = null;

    private int favoritedCount = 0;


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

    @Nullable
    public String getLastClippedAt() {
        return lastClippedAt;
    }

    public void setLastClippedAt(@Nullable String lastClippedAt) {
        this.lastClippedAt = lastClippedAt;
    }

    @Nonnull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@Nonnull String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getFavorited() {
        return isFavorited;
    }

    public void setFavorited(Boolean favorited) {
        isFavorited = favorited;
    }

    public int getFavoritedCount() {
        return favoritedCount;
    }

    public void setFavoritedCount(int favoritedCount) {
        this.favoritedCount = favoritedCount;
    }

    // endregion
}
