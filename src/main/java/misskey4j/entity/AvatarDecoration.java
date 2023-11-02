package misskey4j.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AvatarDecoration {

    @Nonnull
    private String id = "";

    @Nullable
    private Double angle = null;

    @Nullable
    private Boolean flipH = null;

    @Nonnull
    private String url = "";

    @Nullable
    private Double offsetX = null;

    @Nullable
    private Double offsetY = null;

    // region
    @Nonnull
    public String getId() {
        return id;
    }

    public void setId(@Nonnull String id) {
        this.id = id;
    }

    @Nullable
    public Double getAngle() {
        return angle;
    }

    public void setAngle(@Nullable Double angle) {
        this.angle = angle;
    }

    @Nullable
    public Boolean getFlipH() {
        return flipH;
    }

    public void setFlipH(@Nullable Boolean flipH) {
        this.flipH = flipH;
    }

    @Nonnull
    public String getUrl() {
        return url;
    }

    public void setUrl(@Nonnull String url) {
        this.url = url;
    }

    @Nullable
    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(@Nullable Double offsetX) {
        this.offsetX = offsetX;
    }

    @Nullable
    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(@Nullable Double offsetY) {
        this.offsetY = offsetY;
    }
    // endregion
}
