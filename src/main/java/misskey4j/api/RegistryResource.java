package misskey4j.api;

import misskey4j.api.request.registry.GetAllRegistryRequest;
import misskey4j.api.request.registry.GetRegistryRequest;
import misskey4j.api.request.registry.KeysRegistryRequest;
import misskey4j.api.request.registry.SetRegistryRequest;
import misskey4j.api.response.registry.GetAllRegistryResponse;
import misskey4j.api.response.registry.GetRegistryResponse;
import misskey4j.api.response.registry.ScopesWithDomainResponse;
import misskey4j.entity.share.Response;

public interface RegistryResource {

    /**
     * https://misskey.io/api-doc#operation/i/registry/get
     */
    Response<GetRegistryResponse> get(GetRegistryRequest request);

    /**
     * https://misskey.io/api-doc#operation/i/registry/get-all
     */
    Response<GetAllRegistryResponse> getAll(GetAllRegistryRequest request);

    /**
     * https://misskey.io/api-doc#operation/i/registry/keys
     */
    Response<String[]> keys(KeysRegistryRequest request);

    /**
     * https://misskey.io/api-doc#operation/i/registry/set
     */
    Response<Void> set(SetRegistryRequest request);

    /**
     * i/registry/scopes-with-domain
     */
    Response<ScopesWithDomainResponse> scopesWithDomain();
}
