package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class AnnouncementsRequest extends TokenRequest {

    public static AnnouncementsRequestBuilder builder() {
        return new AnnouncementsRequestBuilder();
    }

    private Long limit;
    private Boolean withUnreads;
    private String sinceId;
    private String untilId;

    // region
    public Long getLimit() {
        return limit;
    }

    public Boolean getWithUnreads() {
        return withUnreads;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public static final class AnnouncementsRequestBuilder implements PagingBuilder<AnnouncementsRequestBuilder> {

        private Long limit;
        private Boolean withUnreads;
        private String sinceId;
        private String untilId;

        private AnnouncementsRequestBuilder() {
        }

        @Override
        public AnnouncementsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public AnnouncementsRequestBuilder withUnreads(Boolean withUnreads) {
            this.withUnreads = withUnreads;
            return this;
        }

        @Override
        public AnnouncementsRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        @Override
        public AnnouncementsRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public AnnouncementsRequest build() {
            AnnouncementsRequest request = new AnnouncementsRequest();
            request.limit = this.limit;
            request.withUnreads = this.withUnreads;
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            return request;
        }
    }
    // endregion
}
