package misskey4j.api.request.i;

import misskey4j.api.model.TokenRequest;

public class IUnpinRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private String noteId;

    // region
    public String getNoteId() {
        return noteId;
    }

    public static final class Builder {

        private String noteId;

        private Builder() {
        }

        public Builder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public IUnpinRequest build() {
            IUnpinRequest request = new IUnpinRequest();
            request.noteId = this.noteId;
            return request;
        }
    }
    // endregion
}