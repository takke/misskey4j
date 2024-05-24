package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AccountsResource;
import misskey4j.api.request.i.IFavoritesRequest;
import misskey4j.api.request.i.INotificationsRequest;
import misskey4j.api.request.i.IRequest;
import misskey4j.api.request.i.IUpdateRequest;
import misskey4j.api.response.i.IFavoritesResponse;
import misskey4j.api.response.i.INotificationsResponse;
import misskey4j.api.response.i.IResponse;
import misskey4j.api.response.i.IUpdateResponse;
import misskey4j.entity.share.Response;

public class AccountsResourceImpl extends AbstractResourceImpl implements AccountsResource {

    public AccountsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IResponse> i(
            IRequest request) {
        return post(IResponse.class,
                MisskeyAPI.I.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IFavoritesResponse[]> iFavorites(
            IFavoritesRequest request) {
        return post(IFavoritesResponse[].class,
                MisskeyAPI.IFavorites.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<INotificationsResponse[]> iNotifications(
            INotificationsRequest request) {
        return post(INotificationsResponse[].class,
                MisskeyAPI.INotifications.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<IUpdateResponse> iUpdate(IUpdateRequest request) {
        return post(IUpdateResponse.class, MisskeyAPI.IUpdate.code(), request);
    }
}
