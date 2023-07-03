package misskey4j.api;

import misskey4j.api.request.AnnouncementsRequest;
import misskey4j.api.response.AnnouncementsResponse;
import misskey4j.entity.share.Response;

/**
 * Announcements APIs.
 */
public interface AnnouncementsResource {

    /**
     * サーバーからのお知らせを取得します。
     *
     * https://misskey.io/api-doc#tag/meta/operation/announcements
     */
    Response<AnnouncementsResponse[]> announcements(AnnouncementsRequest request);

    /**
     * お知らせを既読にします。
     *
     * https://misskey.io/api-doc#tag/account/operation/i/read-announcement
     */
    Response<Void> readAnnouncement(String announcementId);

}
