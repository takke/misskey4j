package misskey4j.api.request.registry;

import java.util.List;

import misskey4j.api.model.TokenRequest;

public class GetAllRegistryRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private List<String> scope;
    private String domain;

    // region
    public List<String> getScope() {
        return scope;
    }

    public String getDomain() {
        return domain;
    }

    public static final class Builder {
        private List<String> scope;
        private String domain;

        private Builder() {
        }

        public Builder scope(List<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        public GetAllRegistryRequest build() {
            GetAllRegistryRequest request = new GetAllRegistryRequest();
            request.scope = this.scope;
            request.domain = this.domain;
            return request;
        }
    }
    // endregion
}
