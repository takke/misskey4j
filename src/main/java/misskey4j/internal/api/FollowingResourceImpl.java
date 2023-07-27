package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.FollowingResource;
import misskey4j.api.request.following.FollowingCreateRequest;
import misskey4j.api.request.following.FollowingDeleteRequest;
import misskey4j.api.request.following.FollowingRequestsAcceptRequest;
import misskey4j.api.request.following.FollowingRequestsListRequest;
import misskey4j.api.request.following.FollowingRequestsRejectRequest;
import misskey4j.api.response.following.FollowingRequestsListResponse;
import misskey4j.entity.share.Response;

public class FollowingResourceImpl extends AbstractResourceImpl implements FollowingResource {

    public FollowingResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> create(
            FollowingCreateRequest request) {
        return post(MisskeyAPI.FollowingCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> delete(
            FollowingDeleteRequest request) {
        return post(MisskeyAPI.FollowingDelete.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<FollowingRequestsListResponse[]> requestsList(FollowingRequestsListRequest request) {
        return post(FollowingRequestsListResponse[].class, MisskeyAPI.FollowingRequestsList.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> acceptRequest(FollowingRequestsAcceptRequest request) {
        return post(MisskeyAPI.FollowingRequestsAccept.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> rejectRequest(FollowingRequestsRejectRequest request) {
        return post(MisskeyAPI.FollowingRequestsReject.code(), request);
    }
}
