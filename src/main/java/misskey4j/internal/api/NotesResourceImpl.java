package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.NotesResource;
import misskey4j.api.request.notes.NoteUnrenoteRequest;
import misskey4j.api.request.notes.NotesChildrenRequest;
import misskey4j.api.request.notes.NotesConversationRequest;
import misskey4j.api.request.notes.NotesCreateRequest;
import misskey4j.api.request.notes.NotesDeleteRequest;
import misskey4j.api.request.notes.NotesFeaturedRequest;
import misskey4j.api.request.notes.NotesGlobalTimelineRequest;
import misskey4j.api.request.notes.NotesHybridTimelineRequest;
import misskey4j.api.request.notes.NotesLocalTimelineRequest;
import misskey4j.api.request.notes.NotesMentionsRequest;
import misskey4j.api.request.notes.NotesReactionsRequest;
import misskey4j.api.request.notes.NotesRenotesRequest;
import misskey4j.api.request.notes.NotesRequest;
import misskey4j.api.request.notes.NotesSearchRequest;
import misskey4j.api.request.notes.NotesShowRequest;
import misskey4j.api.request.notes.NotesTimelineRequest;
import misskey4j.api.request.notes.NotesUserListTimelineRequest;
import misskey4j.api.request.notes.UsersNotesRequest;
import misskey4j.api.response.notes.NotesChildrenResponse;
import misskey4j.api.response.notes.NotesConversationResponse;
import misskey4j.api.response.notes.NotesCreateResponse;
import misskey4j.api.response.notes.NotesFeaturedResponse;
import misskey4j.api.response.notes.NotesGlobalTimelineResponse;
import misskey4j.api.response.notes.NotesHybridTimelineResponse;
import misskey4j.api.response.notes.NotesLocalTimelineResponse;
import misskey4j.api.response.notes.NotesMentionsResponse;
import misskey4j.api.response.notes.NotesReactionsResponse;
import misskey4j.api.response.notes.NotesRenotesResponse;
import misskey4j.api.response.notes.NotesResponse;
import misskey4j.api.response.notes.NotesSearchResponse;
import misskey4j.api.response.notes.NotesShowResponse;
import misskey4j.api.response.notes.NotesTimelineResponse;
import misskey4j.api.response.notes.NotesUserListTimelineResponse;
import misskey4j.api.response.notes.UsersNotesResponse;
import misskey4j.entity.share.Response;

public class NotesResourceImpl extends AbstractResourceImpl implements NotesResource {

    public NotesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<UsersNotesResponse[]> users(
            UsersNotesRequest request) {
        return post(UsersNotesResponse[].class,
                MisskeyAPI.UsersNotes.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesResponse[]> notes(
            NotesRequest request) {
        return post(NotesResponse[].class,
                MisskeyAPI.Notes.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesChildrenResponse[]> children(
            NotesChildrenRequest request) {
        return post(NotesChildrenResponse[].class,
                MisskeyAPI.NotesChildren.code(), request);
    }

    @Override
    public Response<NotesConversationResponse[]> conversation(
            NotesConversationRequest request) {
        return post(NotesConversationResponse[].class,
                MisskeyAPI.NotesConversation.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesCreateResponse> create(
            NotesCreateRequest request) {
        return post(NotesCreateResponse.class,
                MisskeyAPI.NotesCreate.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> delete(
            NotesDeleteRequest request) {
        return post(MisskeyAPI.NotesDelete.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesMentionsResponse[]> mentions(
            NotesMentionsRequest request) {
        return post(NotesMentionsResponse[].class,
                MisskeyAPI.NotesMentions.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesFeaturedResponse[]> featured(
            NotesFeaturedRequest request) {
        return post(NotesFeaturedResponse[].class,
                MisskeyAPI.NotesFeatured.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesGlobalTimelineResponse[]> globalTimeline(
            NotesGlobalTimelineRequest request) {
        return post(NotesGlobalTimelineResponse[].class,
                MisskeyAPI.NotesGlobalTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesHybridTimelineResponse[]> hybridTimeline(
            NotesHybridTimelineRequest request) {
        return post(NotesHybridTimelineResponse[].class,
                MisskeyAPI.NotesHybridTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesLocalTimelineResponse[]> localTimeline(
            NotesLocalTimelineRequest request) {
        return post(NotesLocalTimelineResponse[].class,
                MisskeyAPI.NotesLocalTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesReactionsResponse[]> reactions(
            NotesReactionsRequest request) {
        return post(NotesReactionsResponse[].class,
                MisskeyAPI.NotesReactions.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesTimelineResponse[]> timeline(
            NotesTimelineRequest request) {
        return post(NotesTimelineResponse[].class,
                MisskeyAPI.NotesTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesShowResponse> show(
            NotesShowRequest request) {
        return post(NotesShowResponse.class,
                MisskeyAPI.NotesShow.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesSearchResponse[]> search(
            NotesSearchRequest request) {
        return post(NotesSearchResponse[].class,
                MisskeyAPI.NotesSearch.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<NotesUserListTimelineResponse[]> userListTimeline(
            NotesUserListTimelineRequest request) {
        return post(NotesUserListTimelineResponse[].class,
                MisskeyAPI.NotesUserListTimeline.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> unrenote(
            NoteUnrenoteRequest request) {
        return post(MisskeyAPI.NotesUnrenote.code(), request);
    }

    @Override
    public Response<NotesRenotesResponse[]> renotes(NotesRenotesRequest request) {
        return post(NotesRenotesResponse[].class, MisskeyAPI.NotesRenotes.code(), request);
    }
}
