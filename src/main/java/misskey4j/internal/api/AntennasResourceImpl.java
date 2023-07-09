package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AntennasResource;
import misskey4j.api.request.AntennasListRequest;
import misskey4j.api.request.AntennasNotesRequest;
import misskey4j.api.response.AntennasListResponse;
import misskey4j.api.response.AntennasNotesResponse;
import misskey4j.entity.share.Response;

public class AntennasResourceImpl extends AbstractResourceImpl implements AntennasResource {

    public AntennasResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<AntennasListResponse[]> list() {
        return post(AntennasListResponse[].class, MisskeyAPI.AntennasList.code(), new AntennasListRequest());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<AntennasNotesResponse[]> notes(AntennasNotesRequest request) {
        return post(AntennasNotesResponse[].class, MisskeyAPI.AntennasNotes.code(), request);
    }

}
