package misskey4j.api.request.users;

public class UsersRecommendationRequest {

    public static UsersRecommendationRequestBuilder builder() {
        return new UsersRecommendationRequestBuilder();
    }

    private Long limit;

    private Long offset;

    // region
    public Long getLimit() {
        return limit;
    }

    public Long getOffset() {
        return offset;
    }

    public static final class UsersRecommendationRequestBuilder {

        private Long limit;

        private Long offset;

        private UsersRecommendationRequestBuilder() {
        }

        public UsersRecommendationRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public UsersRecommendationRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public UsersRecommendationRequest build() {
            UsersRecommendationRequest usersFollowingsRequest = new UsersRecommendationRequest();
            usersFollowingsRequest.limit = this.limit;
            usersFollowingsRequest.offset = this.offset;
            return usersFollowingsRequest;
        }
    }
    // endregion
}
