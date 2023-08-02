package misskey4j.api.request.clips;

import misskey4j.api.model.TokenRequest;

public class ClipsAddNoteRequest extends TokenRequest {

    private final String clipId;

    private final String noteId;

    public ClipsAddNoteRequest(String noteId, String clipId) {
        this.noteId = noteId;
        this.clipId = clipId;
    }

    // region

    public String getClipId() {
        return clipId;
    }

    public String getNoteId() {
        return noteId;
    }

    // endregion
}
