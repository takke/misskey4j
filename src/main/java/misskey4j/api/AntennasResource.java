package misskey4j.api;

import misskey4j.api.request.AntennasNotesRequest;
import misskey4j.api.response.AntennasListResponse;
import misskey4j.api.response.AntennasNotesResponse;
import misskey4j.entity.share.Response;

public interface AntennasResource {

    /**
     * ログイン中のユーザーが作成したアンテナの一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/antennas/operation/antennas/list"
     */
    Response<AntennasListResponse[]> list();

    Response<AntennasNotesResponse[]> notes(AntennasNotesRequest request);
}
