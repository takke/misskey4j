package misskey4j.api;

import misskey4j.api.request.i.IFavoritesRequest;
import misskey4j.api.request.i.INotificationsRequest;
import misskey4j.api.request.i.IRequest;
import misskey4j.api.request.i.IUpdateRequest;
import misskey4j.api.response.i.IFavoritesResponse;
import misskey4j.api.response.i.INotificationsResponse;
import misskey4j.api.response.i.IResponse;
import misskey4j.api.response.i.IUpdateResponse;
import misskey4j.entity.share.Response;

/**
 * Account APIs.
 */
public interface AccountsResource {

    /**
     * 自分のアカウント情報を取得します。
     * https://misskey.io/api-doc#operation/i
     */
    Response<IResponse> i(
            IRequest request);

    /**
     * お気に入りに登録した投稿一覧を取得します。
     * https://misskey.io/api-doc#operation/i/favorites
     */
    Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request);

    /**
     * 通知一覧を取得します。
     * https://misskey.io/api-doc#operation/i/notifications
     */
    Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request);

    /**
     * ログイン中のユーザーのプロフィール・設定を更新します。パラメータの値を設定しなければ、その項目は変更されません。
     *
     * https://misskey.io/api-doc#tag/account/operation/i/update
     */
    Response<IUpdateResponse> iUpdate(IUpdateRequest request);
}
