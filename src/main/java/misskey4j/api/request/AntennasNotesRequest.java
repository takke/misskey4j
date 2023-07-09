package misskey4j.api.request;

import misskey4j.api.model.TokenRequest;
import misskey4j.api.request.protocol.FullPagingBuilder;

public class AntennasNotesRequest extends TokenRequest {

    public static AntennasNotesRequestBuilder builder() {
        return new AntennasNotesRequestBuilder();
    }

    private String antennaId;

    private Long limit;

    private String sinceId;
    private String untilId;
    private Long sinceDate;
    private Long untilDate;

    // region
    public Long getLimit() {
        return limit;
    }

    public String getSinceId() {
        return sinceId;
    }

    public String getUntilId() {
        return untilId;
    }

    public Long getSinceDate() {
        return sinceDate;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public static final class AntennasNotesRequestBuilder
            implements FullPagingBuilder<AntennasNotesRequestBuilder> {

        private String antennaId;
        private Long limit;
        private String sinceId;
        private String untilId;
        private Long sinceDate;
        private Long untilDate;

        private AntennasNotesRequestBuilder() {
        }

        public AntennasNotesRequestBuilder antennaId(String antennaId) {
            this.antennaId = antennaId;
            return this;
        }

        public AntennasNotesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public AntennasNotesRequestBuilder sinceId(String sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        public AntennasNotesRequestBuilder untilId(String untilId) {
            this.untilId = untilId;
            return this;
        }

        public AntennasNotesRequestBuilder sinceDate(Long sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        public AntennasNotesRequestBuilder untilDate(Long untilDate) {
            this.untilDate = untilDate;
            return this;
        }

        public AntennasNotesRequest build() {
            AntennasNotesRequest request = new AntennasNotesRequest();

            request.antennaId = this.antennaId;
            request.limit = this.limit;
            request.sinceId = this.sinceId;
            request.untilId = this.untilId;
            request.sinceDate = this.sinceDate;
            request.untilDate = this.untilDate;
            return request;
        }
    }
    // endregion
}
