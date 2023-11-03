package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.RegistryResource;
import misskey4j.api.request.registry.GetAllRegistryRequest;
import misskey4j.api.request.registry.GetRegistryRequest;
import misskey4j.api.request.registry.KeysRegistryRequest;
import misskey4j.api.request.registry.ScopesWithDomainRequest;
import misskey4j.api.request.registry.SetRegistryRequest;
import misskey4j.api.response.registry.GetAllRegistryResponse;
import misskey4j.api.response.registry.GetRegistryResponse;
import misskey4j.api.response.registry.ScopesWithDomainResponse;
import misskey4j.entity.share.Response;

public class RegistryResourceImpl extends AbstractResourceImpl implements RegistryResource {

    public RegistryResourceImpl(String uri, String i) {
        super(uri, i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GetRegistryResponse> get(GetRegistryRequest request) {
        return post(GetRegistryResponse.class, MisskeyAPI.IRegistryGet.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<GetAllRegistryResponse> getAll(GetAllRegistryRequest request) {
        return post(GetAllRegistryResponse.class, MisskeyAPI.IRegistryGetAll.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<String[]> keys(KeysRegistryRequest request) {
        return post(String[].class, MisskeyAPI.IRegistryKeys.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<Void> set(SetRegistryRequest request) {
        return post(MisskeyAPI.IRegistrySet.code(), request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response<ScopesWithDomainResponse> scopesWithDomain() {
        return post(ScopesWithDomainResponse.class, MisskeyAPI.IRegistryScopesWithDomain.code(), ScopesWithDomainRequest.builder().build());
    }
}
