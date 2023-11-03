package misskey4j.api.request.registry;

import java.util.List;

import misskey4j.api.model.TokenRequest;

public class GetRegistryRequest extends TokenRequest {

    public static Builder builder() {
        return new Builder();
    }

    private String key;
    private List<String> scope;
    private String domain;

    // region
    public String getKey() {
        return key;
    }

    public List<String> getScope() {
        return scope;
    }

    public String getDomain() {
        return domain;
    }

    public static final class Builder {
        private String key;
        private List<String> scope;
        private String domain;

        private Builder() {
        }

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder scope(List<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        public GetRegistryRequest build() {
            GetRegistryRequest request = new GetRegistryRequest();
            request.key = this.key;
            request.scope = this.scope;
            request.domain = this.domain;
            return request;
        }
    }
    // endregion
}
