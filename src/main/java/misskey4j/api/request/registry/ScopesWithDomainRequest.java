package misskey4j.api.request.registry;

import misskey4j.api.model.TokenRequest;

public class ScopesWithDomainRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    // region

    public static final class Builder {

        private Builder() {
        }

        public ScopesWithDomainRequest build() {
            return new ScopesWithDomainRequest();
        }
    }
    // endregion
}
