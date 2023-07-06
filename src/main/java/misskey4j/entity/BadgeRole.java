package misskey4j.entity;

import javax.annotation.Nullable;

public class BadgeRole {

    private String name;

    @Nullable
    private String iconUrl;

    private Long displayOrder;

    // region
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(@Nullable String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Long getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }
    // endregion
}
