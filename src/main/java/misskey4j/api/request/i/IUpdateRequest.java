package misskey4j.api.request.i;

import java.util.List;

import javax.annotation.Nullable;

import misskey4j.api.model.TokenRequest;
import misskey4j.entity.Field;

public class IUpdateRequest extends TokenRequest {

    public static IUpdateRequestBuilder builder() {
        return new IUpdateRequestBuilder();
    }

    @Nullable private String name;
    @Nullable private String description;
    @Nullable private String location;
    @Nullable private String birthday;
    @Nullable private String lang;
    @Nullable private String avatarId;
    @Nullable private String bannerId;
    @Nullable private List<Field> fields;
    @Nullable private Boolean isLocked;
    @Nullable private Boolean isExplorable;
    @Nullable private Boolean hideOnlineStatus;
    @Nullable private Boolean publicReactions;
    @Nullable private Boolean carefulBot;
    @Nullable private Boolean autoAcceptFollowed;
    @Nullable private Boolean noCrawle;
    @Nullable private Boolean preventAiLearning;
    @Nullable private Boolean isBot;
    @Nullable private Boolean isCat;
    @Nullable private Boolean injectFeaturedNote;
    @Nullable private Boolean receiveAnnouncementEmail;
    @Nullable private Boolean alwaysMarkNsfw;
    @Nullable private Boolean autoSensitive;
    @Nullable private String ffVisibility;
    @Nullable private String pinnedPageId;
    @Nullable private List<List<String>> mutedWords;
    @Nullable private List<String> mutedInstances;
    @Nullable private List<String> mutingNotificationTypes;
    @Nullable private List<String> emailNotificationTypes;
    @Nullable private List<String> alsoKnownAs;

    // region
    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    @Nullable
    public String getLocation() {
        return location;
    }

    @Nullable
    public String getBirthday() {
        return birthday;
    }

    @Nullable
    public String getLang() {
        return lang;
    }

    @Nullable
    public String getAvatarId() {
        return avatarId;
    }

    @Nullable
    public String getBannerId() {
        return bannerId;
    }

    @Nullable
    public List<Field> getFields() {
        return fields;
    }

    @Nullable
    public Boolean getLocked() {
        return isLocked;
    }

    @Nullable
    public Boolean getExplorable() {
        return isExplorable;
    }

    @Nullable
    public Boolean getHideOnlineStatus() {
        return hideOnlineStatus;
    }

    @Nullable
    public Boolean getPublicReactions() {
        return publicReactions;
    }

    @Nullable
    public Boolean getCarefulBot() {
        return carefulBot;
    }

    @Nullable
    public Boolean getAutoAcceptFollowed() {
        return autoAcceptFollowed;
    }

    @Nullable
    public Boolean getNoCrawle() {
        return noCrawle;
    }

    @Nullable
    public Boolean getPreventAiLearning() {
        return preventAiLearning;
    }

    @Nullable
    public Boolean getBot() {
        return isBot;
    }

    @Nullable
    public Boolean getCat() {
        return isCat;
    }

    @Nullable
    public Boolean getInjectFeaturedNote() {
        return injectFeaturedNote;
    }

    @Nullable
    public Boolean getReceiveAnnouncementEmail() {
        return receiveAnnouncementEmail;
    }

    @Nullable
    public Boolean getAlwaysMarkNsfw() {
        return alwaysMarkNsfw;
    }

    @Nullable
    public Boolean getAutoSensitive() {
        return autoSensitive;
    }

    @Nullable
    public String getFfVisibility() {
        return ffVisibility;
    }

    @Nullable
    public String getPinnedPageId() {
        return pinnedPageId;
    }

    @Nullable
    public List<List<String>> getMutedWords() {
        return mutedWords;
    }

    @Nullable
    public List<String> getMutedInstances() {
        return mutedInstances;
    }

    @Nullable
    public List<String> getMutingNotificationTypes() {
        return mutingNotificationTypes;
    }

    @Nullable
    public List<String> getEmailNotificationTypes() {
        return emailNotificationTypes;
    }

    @Nullable
    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public static final class IUpdateRequestBuilder {

        @Nullable private String name;
        @Nullable private String description;
        @Nullable private String location;
        @Nullable private String birthday;
        @Nullable private String lang;
        @Nullable private String avatarId;
        @Nullable private String bannerId;
        @Nullable private List<Field> fields;
        @Nullable private Boolean isLocked;
        @Nullable private Boolean isExplorable;
        @Nullable private Boolean hideOnlineStatus;
        @Nullable private Boolean publicReactions;
        @Nullable private Boolean carefulBot;
        @Nullable private Boolean autoAcceptFollowed;
        @Nullable private Boolean noCrawle;
        @Nullable private Boolean preventAiLearning;
        @Nullable private Boolean isBot;
        @Nullable private Boolean isCat;
        @Nullable private Boolean injectFeaturedNote;
        @Nullable private Boolean receiveAnnouncementEmail;
        @Nullable private Boolean alwaysMarkNsfw;
        @Nullable private Boolean autoSensitive;
        @Nullable private String ffVisibility;
        @Nullable private String pinnedPageId;
        @Nullable private List<List<String>> mutedWords;
        @Nullable private List<String> mutedInstances;
        @Nullable private List<String> mutingNotificationTypes;
        @Nullable private List<String> emailNotificationTypes;
        @Nullable private List<String> alsoKnownAs;

        private IUpdateRequestBuilder() {
        }

        public IUpdateRequestBuilder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public IUpdateRequestBuilder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public IUpdateRequestBuilder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public IUpdateRequestBuilder birthday(@Nullable String birthday) {
            this.birthday = birthday;
            return this;
        }

        public IUpdateRequestBuilder lang(@Nullable String lang) {
            this.lang = lang;
            return this;
        }

        public IUpdateRequestBuilder avatarId(@Nullable String avatarId) {
            this.avatarId = avatarId;
            return this;
        }

        public IUpdateRequestBuilder bannerId(@Nullable String bannerId) {
            this.bannerId = bannerId;
            return this;
        }

        public IUpdateRequestBuilder fields(@Nullable List<Field> fields) {
            this.fields = fields;
            return this;
        }

        public IUpdateRequestBuilder isLocked(@Nullable Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        public IUpdateRequestBuilder isExplorable(@Nullable Boolean isExplorable) {
            this.isExplorable = isExplorable;
            return this;
        }

        public IUpdateRequestBuilder hideOnlineStatus(@Nullable Boolean hideOnlineStatus) {
            this.hideOnlineStatus = hideOnlineStatus;
            return this;
        }

        public IUpdateRequestBuilder publicReactions(@Nullable Boolean publicReactions) {
            this.publicReactions = publicReactions;
            return this;
        }

        public IUpdateRequestBuilder carefulBot(@Nullable Boolean carefulBot) {
            this.carefulBot = carefulBot;
            return this;
        }

        public IUpdateRequestBuilder autoAcceptFollowed(@Nullable Boolean autoAcceptFollowed) {
            this.autoAcceptFollowed = autoAcceptFollowed;
            return this;
        }

        public IUpdateRequestBuilder noCrawle(@Nullable Boolean noCrawle) {
            this.noCrawle = noCrawle;
            return this;
        }

        public IUpdateRequestBuilder preventAiLearning(@Nullable Boolean preventAiLearning) {
            this.preventAiLearning = preventAiLearning;
            return this;
        }

        public IUpdateRequestBuilder isBot(@Nullable Boolean isBot) {
            this.isBot = isBot;
            return this;
        }

        public IUpdateRequestBuilder isCat(@Nullable Boolean isCat) {
            this.isCat = isCat;
            return this;
        }

        public IUpdateRequestBuilder injectFeaturedNote(@Nullable Boolean injectFeaturedNote) {
            this.injectFeaturedNote = injectFeaturedNote;
            return this;
        }

        public IUpdateRequestBuilder receiveAnnouncementEmail(@Nullable Boolean receiveAnnouncementEmail) {
            this.receiveAnnouncementEmail = receiveAnnouncementEmail;
            return this;
        }

        public IUpdateRequestBuilder alwaysMarkNsfw(@Nullable Boolean alwaysMarkNsfw) {
            this.alwaysMarkNsfw = alwaysMarkNsfw;
            return this;
        }

        public IUpdateRequestBuilder autoSensitive(@Nullable Boolean autoSensitive) {
            this.autoSensitive = autoSensitive;
            return this;
        }

        public IUpdateRequestBuilder ffVisibility(@Nullable String ffVisibility) {
            this.ffVisibility = ffVisibility;
            return this;
        }

        public IUpdateRequestBuilder pinnedPageId(@Nullable String pinnedPageId) {
            this.pinnedPageId = pinnedPageId;
            return this;
        }

        public IUpdateRequestBuilder mutedWords(@Nullable List<List<String>> mutedWords) {
            this.mutedWords = mutedWords;
            return this;
        }

        public IUpdateRequestBuilder mutedInstances(@Nullable List<String> mutedInstances) {
            this.mutedInstances = mutedInstances;
            return this;
        }

        public IUpdateRequestBuilder mutingNotificationTypes(@Nullable List<String> mutingNotificationTypes) {
            this.mutingNotificationTypes = mutingNotificationTypes;
            return this;
        }

        public IUpdateRequestBuilder emailNotificationTypes(@Nullable List<String> emailNotificationTypes) {
            this.emailNotificationTypes = emailNotificationTypes;
            return this;
        }

        public IUpdateRequestBuilder alsoKnownAs(@Nullable List<String> alsoKnownAs) {
            this.alsoKnownAs = alsoKnownAs;
            return this;
        }

        public IUpdateRequest build() {
            IUpdateRequest request = new IUpdateRequest();
            request.name = this.name;
            request.description = this.description;
            request.location = this.location;
            request.birthday = this.birthday;
            request.lang = this.lang;
            request.avatarId = this.avatarId;
            request.bannerId = this.bannerId;
            request.fields = this.fields;
            request.isLocked = this.isLocked;
            request.isExplorable = this.isExplorable;
            request.hideOnlineStatus = this.hideOnlineStatus;
            request.publicReactions = this.publicReactions;
            request.carefulBot = this.carefulBot;
            request.autoAcceptFollowed = this.autoAcceptFollowed;
            request.noCrawle = this.noCrawle;
            request.preventAiLearning = this.preventAiLearning;
            request.isBot = this.isBot;
            request.isCat = this.isCat;
            request.injectFeaturedNote = this.injectFeaturedNote;
            request.receiveAnnouncementEmail = this.receiveAnnouncementEmail;
            request.alwaysMarkNsfw = this.alwaysMarkNsfw;
            request.autoSensitive = this.autoSensitive;
            request.ffVisibility = this.ffVisibility;
            request.pinnedPageId = this.pinnedPageId;
            request.mutedWords = this.mutedWords;
            request.mutedInstances = this.mutedInstances;
            request.mutingNotificationTypes = this.mutingNotificationTypes;
            request.emailNotificationTypes = this.emailNotificationTypes;
            request.alsoKnownAs = this.alsoKnownAs;
            return request;
        }
    }
    // endregion
}