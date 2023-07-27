package misskey4j.api;

import misskey4j.api.request.following.FollowingCreateRequest;
import misskey4j.api.request.following.FollowingDeleteRequest;
import misskey4j.api.request.following.FollowingRequestsAcceptRequest;
import misskey4j.api.request.following.FollowingRequestsListRequest;
import misskey4j.api.request.following.FollowingRequestsRejectRequest;
import misskey4j.api.response.following.FollowingRequestsListResponse;
import misskey4j.entity.share.Response;

public interface FollowingResource {

    /**
     * 指定したユーザーをフォローします。
     * https://misskey.io/api-doc#operation/following/create
     */
    Response<Void> create(FollowingCreateRequest request);

    /**
     * 指定したユーザーのフォローを解除します。
     * https://misskey.io/api-doc#operation/following/delete
     */
    Response<Void> delete(FollowingDeleteRequest request);

    /**
     * フォローリクエストの一覧を取得します。
     * https://misskey.io/api-doc#tag/following/operation/following/requests/list
     */
    Response<FollowingRequestsListResponse[]> requestsList(FollowingRequestsListRequest request);

    /**
     * フォローを許可します。
     * https://misskey.io/api-doc#tag/following/operation/following/requests/accept
     */
    Response<Void> acceptRequest(FollowingRequestsAcceptRequest request);

    /**
     * フォローを拒否します。
     * https://misskey.io/api-doc#tag/following/operation/following/requests/reject
     */
    Response<Void> rejectRequest(FollowingRequestsRejectRequest request);
}
