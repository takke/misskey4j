package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.AnnouncementsResource;
import misskey4j.api.request.AnnouncementsRequest;
import misskey4j.api.response.AnnouncementsResponse;
import misskey4j.entity.share.Response;

public class AnnouncementsResourceImpl extends AbstractResourceImpl implements AnnouncementsResource {

    public AnnouncementsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<AnnouncementsResponse[]> announcements(AnnouncementsRequest request) {
        return post(AnnouncementsResponse[].class, MisskeyAPI.Announcements.code(), request);
    }
}
