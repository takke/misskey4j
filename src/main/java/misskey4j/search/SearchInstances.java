package misskey4j.search;

import com.google.gson.Gson;
import misskey4j.MisskeyException;
import misskey4j.entity.collection.Instances;
import misskey4j.internal.api.AbstractResourceImpl;
import net.socialhub.http.HttpRequestBuilder;
import net.socialhub.http.HttpResponse;

import static net.socialhub.http.HttpMediaType.APPLICATION_JSON;

/**
 * Get Instance lists.
 */
public class SearchInstances {

    private String apiPath;

    public SearchInstances(String apiPath) {
        this.apiPath = apiPath;
    }

    public Instances getMisskeyInstanceList() {
        try {
            HttpResponse response = new HttpRequestBuilder()
                    .target(apiPath).request(APPLICATION_JSON).get();

            Gson gson = AbstractResourceImpl.getGsonInstance();
            return gson.fromJson(response.asString(), Instances.class);

        } catch (Exception e) {
            throw new MisskeyException(e);
        }
    }
}
