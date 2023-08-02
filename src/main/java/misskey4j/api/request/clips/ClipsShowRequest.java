package misskey4j.api.request.clips;

import misskey4j.api.model.TokenRequest;

public class ClipsShowRequest extends TokenRequest {

    private final String clipId;

    public ClipsShowRequest(String clipId) {
        this.clipId = clipId;
    }

    // region

    public String getClipId() {
        return clipId;
    }

    // endregion
}
