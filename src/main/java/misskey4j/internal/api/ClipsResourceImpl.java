package misskey4j.internal.api;

import javax.annotation.Nonnull;

import misskey4j.MisskeyAPI;
import misskey4j.api.ClipsResource;
import misskey4j.api.request.clips.ClipsAddNoteRequest;
import misskey4j.api.request.clips.ClipsCreateRequest;
import misskey4j.api.request.clips.ClipsDeleteRequest;
import misskey4j.api.request.clips.ClipsListRequest;
import misskey4j.api.request.clips.ClipsNotesRequest;
import misskey4j.api.request.clips.ClipsRemoveNoteRequest;
import misskey4j.api.request.clips.ClipsShowRequest;
import misskey4j.api.request.clips.ClipsUpdateRequest;
import misskey4j.api.response.clips.ClipsCreateResponse;
import misskey4j.api.response.clips.ClipsListResponse;
import misskey4j.api.response.clips.ClipsNotesResponse;
import misskey4j.api.response.clips.ClipsShowResponse;
import misskey4j.api.response.clips.ClipsUpdateResponse;
import misskey4j.entity.share.Response;

public class ClipsResourceImpl extends AbstractResourceImpl implements ClipsResource {

    public ClipsResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ClipsListResponse[]> list() {
        return post(ClipsListResponse[].class, MisskeyAPI.ClipsList.code(), new ClipsListRequest());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ClipsNotesResponse[]> notes(ClipsNotesRequest request) {
        return post(ClipsNotesResponse[].class, MisskeyAPI.ClipsNotes.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> removeNote(@Nonnull String clipId, @Nonnull String noteId) {
        return post(MisskeyAPI.ClipsRemoveNote.code(), new ClipsRemoveNoteRequest(noteId, clipId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> addNote(@Nonnull String clipId, @Nonnull String noteId) {
        return post(MisskeyAPI.ClipsAddNote.code(), new ClipsAddNoteRequest(noteId, clipId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> deleteClip(@Nonnull String clipId) {
        return post(MisskeyAPI.ClipsDelete.code(), new ClipsDeleteRequest(clipId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ClipsCreateResponse> create(ClipsCreateRequest request) {
        return post(ClipsCreateResponse.class, MisskeyAPI.ClipsCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ClipsShowResponse> show(@Nonnull String clipId) {
        return post(ClipsShowResponse.class, MisskeyAPI.ClipsShow.code(), new ClipsShowRequest(clipId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ClipsUpdateResponse> update(ClipsUpdateRequest request) {
        return post(ClipsUpdateResponse.class, MisskeyAPI.ClipsUpdate.code(), request);
    }

}
