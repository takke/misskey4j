package misskey4j.api.request.following;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class FollowingRequestsListRequest extends TokenRequest {

    public static FollowingRequestsListRequestBuilder builder() {
        return new FollowingRequestsListRequestBuilder();
    }

    private String sinceId;
    private String untilId;
    private Long limit;

    // region
    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getLimit() {
        return limit;
    }

    public static final class FollowingRequestsListRequestBuilder
            implements PagingBuilder<FollowingRequestsListRequestBuilder> {

        private String sinceId;
        private String untilId;
        private Long limit;

        private FollowingRequestsListRequestBuilder() {
        }

        public FollowingRequestsListRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public FollowingRequestsListRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public FollowingRequestsListRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public FollowingRequestsListRequest build() {
            FollowingRequestsListRequest request = new FollowingRequestsListRequest();
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            request.limit = this.limit;
            return request;
        }
    }
    // endregion
}
