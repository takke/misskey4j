package misskey4j.api.request.notes;

import javax.annotation.Nonnull;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.PagingBuilder;

public class NotesSearchByTagRequest extends TokenRequest {

    public NotesSearchByTagRequest(@Nonnull String tag) {
        this.tag = tag;
    }

    public static NotesSearchByTagRequestBuilder builder() {
        return new NotesSearchByTagRequestBuilder();
    }

    private Boolean reply;
    private Boolean renote;
    private Boolean withFiles;
    private Boolean poll;
    private String sinceId;
    private String untilId;
    private Long limit;

    @Nonnull
    private final String tag;

    // TODO support query
    // The outer arrays are chained with OR, the inner arrays are chained with AND.
//    private String[][] query;

    // region
    public Boolean getReply() {
        return reply;
    }

    public Boolean getRenote() {
        return renote;
    }

    public Boolean getWithFiles() {
        return withFiles;
    }

    public Boolean getPoll() {
        return poll;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getLimit() {
        return limit;
    }

    @Nonnull
    public String getTag() {
        return tag;
    }

    public static final class NotesSearchByTagRequestBuilder
            implements PagingBuilder<NotesSearchByTagRequestBuilder> {

        private Boolean reply;
        private Boolean renote;
        private Boolean withFiles;
        private Boolean poll;
        private String sinceId;
        private String untilId;
        private Long limit;

        @Nonnull
        private String tag = "";

        private NotesSearchByTagRequestBuilder() {
        }

        public NotesSearchByTagRequestBuilder reply(Boolean reply) {
            this.reply = reply;
            return this;
        }

        public NotesSearchByTagRequestBuilder renote(Boolean renote) {
            this.renote = renote;
            return this;
        }

        public NotesSearchByTagRequestBuilder withFiles(Boolean withFiles) {
            this.withFiles = withFiles;
            return this;
        }

        public NotesSearchByTagRequestBuilder poll(Boolean poll) {
            this.poll = poll;
            return this;
        }

        public NotesSearchByTagRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public NotesSearchByTagRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public NotesSearchByTagRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public NotesSearchByTagRequestBuilder tag(@Nonnull String tag) {
            this.tag = tag;
            return this;
        }

        public NotesSearchByTagRequest build() {
            NotesSearchByTagRequest request = new NotesSearchByTagRequest(this.tag);

            request.reply = this.reply;
            request.renote = this.renote;
            request.withFiles = this.withFiles;
            request.poll = this.poll;
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            request.limit = this.limit;
            return request;
        }
    }
    // endregion
}
