package misskey4j.internal.api;

import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import misskey4j.MisskeyAPI;
import misskey4j.api.MetaResource;
import misskey4j.api.request.meta.EmojisRequest;
import misskey4j.api.request.meta.MetaRequest;
import misskey4j.api.response.meta.EmojisResponse;
import misskey4j.api.response.meta.GetOnlineUsersCountResponse;
import misskey4j.api.response.meta.MetaResponse;
import misskey4j.entity.share.Response;

public class MetaResourceImpl extends AbstractResourceImpl implements MetaResource {

    public MetaResourceImpl(String uri) {
        super(uri, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<MetaResponse> meta(
            MetaRequest request) {
        return post(MetaResponse.class,
                MisskeyAPI.Meta.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<EmojisResponse> emojis(
            EmojisRequest request) {
        return post(EmojisResponse.class,
                MisskeyAPI.Emojis.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GetOnlineUsersCountResponse> getOnlineUsersCount() {

        // simple get request
        return proceed(GetOnlineUsersCountResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(uri).path(MisskeyAPI.GetOnlineUsersCount.code())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .get();
        });
    }
}
