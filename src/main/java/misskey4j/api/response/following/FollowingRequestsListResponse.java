package misskey4j.api.response.following;

import misskey4j.entity.User;

public class FollowingRequestsListResponse {

    private String id;

    private User follower;

    private User followee;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollowee() {
        return followee;
    }

    public void setFollowee(User followee) {
        this.followee = followee;
    }
    // endregion
}
