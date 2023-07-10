package misskey4j.entity;

public class UserPolicies {

    private Boolean gtlAvailable;

    private Boolean ltlAvailable;

    private Boolean canPublicNote;

    private Boolean canInvite;

    private Boolean canManageCustomEmojis;

    private Boolean canSearchNotes;

    private Boolean canHideAds;

    private Long driveCapacityMb;

    private Boolean alwaysMarkNsfw;

    private Long pinLimit;

    private Long antennaLimit;

    private Long wordMuteLimit;

    private Long webhookLimit;

    private Long clipLimit;

    private Long noteEachClipsLimit;

    private Long userListLimit;

    private Long userEachUserListsLimit;

    private Double rateLimitFactor;

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

    public Boolean getCanManageCustomEmojis() {
        return canManageCustomEmojis;
    }

    public void setCanManageCustomEmojis(Boolean canManageCustomEmojis) {
        this.canManageCustomEmojis = canManageCustomEmojis;
    }

    public Boolean getCanSearchNotes() {
        return canSearchNotes;
    }

    public void setCanSearchNotes(Boolean canSearchNotes) {
        this.canSearchNotes = canSearchNotes;
    }

    public Boolean getCanHideAds() {
        return canHideAds;
    }

    public void setCanHideAds(Boolean canHideAds) {
        this.canHideAds = canHideAds;
    }

    public Long getDriveCapacityMb() {
        return driveCapacityMb;
    }

    public void setDriveCapacityMb(Long driveCapacityMb) {
        this.driveCapacityMb = driveCapacityMb;
    }

    public Boolean getAlwaysMarkNsfw() {
        return alwaysMarkNsfw;
    }

    public void setAlwaysMarkNsfw(Boolean alwaysMarkNsfw) {
        this.alwaysMarkNsfw = alwaysMarkNsfw;
    }

    public Long getPinLimit() {
        return pinLimit;
    }

    public void setPinLimit(Long pinLimit) {
        this.pinLimit = pinLimit;
    }

    public Long getAntennaLimit() {
        return antennaLimit;
    }

    public void setAntennaLimit(Long antennaLimit) {
        this.antennaLimit = antennaLimit;
    }

    public Long getWordMuteLimit() {
        return wordMuteLimit;
    }

    public void setWordMuteLimit(Long wordMuteLimit) {
        this.wordMuteLimit = wordMuteLimit;
    }

    public Long getWebhookLimit() {
        return webhookLimit;
    }

    public void setWebhookLimit(Long webhookLimit) {
        this.webhookLimit = webhookLimit;
    }

    public Long getClipLimit() {
        return clipLimit;
    }

    public void setClipLimit(Long clipLimit) {
        this.clipLimit = clipLimit;
    }

    public Long getNoteEachClipsLimit() {
        return noteEachClipsLimit;
    }

    public void setNoteEachClipsLimit(Long noteEachClipsLimit) {
        this.noteEachClipsLimit = noteEachClipsLimit;
    }

    public Long getUserListLimit() {
        return userListLimit;
    }

    public void setUserListLimit(Long userListLimit) {
        this.userListLimit = userListLimit;
    }

    public Long getUserEachUserListsLimit() {
        return userEachUserListsLimit;
    }

    public void setUserEachUserListsLimit(Long userEachUserListsLimit) {
        this.userEachUserListsLimit = userEachUserListsLimit;
    }

    public Double getRateLimitFactor() {
        return rateLimitFactor;
    }

    public void setRateLimitFactor(Double rateLimitFactor) {
        this.rateLimitFactor = rateLimitFactor;
    }
    // endregion
}
