package misskey4j.api.request.clips;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class ClipsNotesRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private String clipId;

    private Long limit;

    private String sinceId;
    private String untilId;

    // region
    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static final class Builder
            implements PagingBuilder<Builder> {

        private String clipId;
        private Long limit;
        private String sinceId;
        private String untilId;

        private Builder() {
        }

        public Builder clipId(String clipId) {
            this.clipId = clipId;
            return this;
        }

        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public Builder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public Builder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public ClipsNotesRequest build() {
            ClipsNotesRequest request = new ClipsNotesRequest();

            request.clipId = this.clipId;
            request.limit = this.limit;
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            return request;
        }
    }
    // endregion
}
