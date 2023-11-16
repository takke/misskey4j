package misskey4j.entity;

public class Policies {

    private Boolean gtlAvailable;
    private Boolean ltlAvailable;
    private Boolean canPublicNote;
    private Boolean canInvite;

    // region

    public Boolean getGtlAvailable() {
        return gtlAvailable;
    }

    public void setGtlAvailable(Boolean gtlAvailable) {
        this.gtlAvailable = gtlAvailable;
    }

    public Boolean getLtlAvailable() {
        return ltlAvailable;
    }

    public void setLtlAvailable(Boolean ltlAvailable) {
        this.ltlAvailable = ltlAvailable;
    }

    public Boolean getCanPublicNote() {
        return canPublicNote;
    }

    public void setCanPublicNote(Boolean canPublicNote) {
        this.canPublicNote = canPublicNote;
    }

    public Boolean getCanInvite() {
        return canInvite;
    }

    public void setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
    }

    // endregion
}
