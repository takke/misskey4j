package misskey4j.api.request.clips;

import misskey4j.api.model.TokenRequest;

public class ClipsCreateRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private String name;

    private Boolean isPublic;

    private String description;

    // region

    public String getName() {
        return name;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public String getDescription() {
        return description;
    }

    public static final class Builder {

        private String name;

        private Boolean isPublic;

        private String description;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public ClipsCreateRequest build() {
            ClipsCreateRequest request = new ClipsCreateRequest();

            request.name = this.name;
            request.isPublic = this.isPublic;
            request.description = this.description;
            return request;
        }
    }
    // endregion
}
