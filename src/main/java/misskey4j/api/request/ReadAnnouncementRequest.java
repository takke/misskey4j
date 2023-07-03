package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;

public class ReadAnnouncementRequest extends TokenRequest {

    private final String announcementId;

    public ReadAnnouncementRequest(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementId() {
        return announcementId;
    }
}
