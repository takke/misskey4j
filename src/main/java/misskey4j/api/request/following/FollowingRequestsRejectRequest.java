package misskey4j.api.request.following;

import misskey4j.api.model.TokenRequest;

public class FollowingRequestsRejectRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private String userId;

    // region
    public String getUserId() {
        return userId;
    }

    public static final class Builder {
        private String userId;

        private Builder() {
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public FollowingRequestsRejectRequest build() {
            FollowingRequestsRejectRequest request = new FollowingRequestsRejectRequest();
            request.userId = this.userId;
            return request;
        }
    }

    // endregion
}
