package misskey4j.api;

import javax.annotation.Nonnull;

import misskey4j.api.request.clips.ClipsCreateRequest;
import misskey4j.api.request.clips.ClipsNotesRequest;
import misskey4j.api.request.clips.ClipsUpdateRequest;
import misskey4j.api.response.clips.ClipsCreateResponse;
import misskey4j.api.response.clips.ClipsListResponse;
import misskey4j.api.response.clips.ClipsNotesResponse;
import misskey4j.api.response.clips.ClipsShowResponse;
import misskey4j.api.response.clips.ClipsUpdateResponse;
import misskey4j.entity.share.Response;

public interface ClipsResource {

    /**
     * ログイン中のユーザーが作成したクリップの一覧を取得します。
     *
     * @see "https://misskey.io/api-doc#tag/clips/operation/clips/list"
     */
    Response<ClipsListResponse[]> list();

    /**
     * クリップに含まれるノートを取得します。
     */
    Response<ClipsNotesResponse[]> notes(ClipsNotesRequest request);

    /**
     * ノートをクリップから削除します。
     *
     * @see "https://misskey.io/api-doc#tag/account/operation/clips/remove-note"
     */
    Response<Void> removeNote(@Nonnull String clipId, @Nonnull String noteId);

    /**
     * ノートをクリップに追加します。
     *
     * @see "https://misskey.io/api-doc#tag/account/operation/clips/add-note"
     */
    Response<Void> addNote(@Nonnull String clipId, @Nonnull String noteId);

    /**
     * クリップを削除します。
     *
     * @see "https://misskey.io/api-doc#tag/clips/operation/clips/delete"
     */
    Response<Void> deleteClip(@Nonnull String clipId);

    /**
     * クリップを作成します。
     *
     * @see "https://misskey.io/api-doc#tag/clips/operation/clips/create"
     */
    Response<ClipsCreateResponse> create(ClipsCreateRequest request);

    /**
     * クリップを取得します。
     *
     * @see "https://misskey.io/api-doc#tag/clips/operation/clips/show"
     */
    Response<ClipsShowResponse> show(@Nonnull String clipId);

    /**
     * クリップの情報を更新します。
     *
     * @see "https://misskey.io/api-doc#tag/clips/operation/clips/update"
     */
    Response<ClipsUpdateResponse> update(ClipsUpdateRequest request);
}
