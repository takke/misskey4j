package misskey4j.api.request.files;

import java.io.File;
import java.io.InputStream;

import misskey4j.api.model.TokenRequest;

public class FilesCreateRequest extends TokenRequest {

    public static FilesCreateRequestBuilder builder() {
        return new FilesCreateRequestBuilder();
    }

    private String folderId;
    private String name;
    private String comment;
    private Boolean isSensitive;
    private Boolean force;

    // File
    private File file;
    // or
    private InputStream stream;

    // region
    public String getFolderId() {
        return folderId;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getSensitive() {
        return isSensitive;
    }

    public Boolean getForce() {
        return force;
    }

    public File getFile() {
        return file;
    }

    public InputStream getStream() {
        return stream;
    }

    public static final class FilesCreateRequestBuilder {
        private String folderId;
        private String name;
        private String comment;
        private Boolean isSensitive;
        private Boolean force;

        // File
        private File file;
        // or
        private InputStream stream;

        private FilesCreateRequestBuilder() {
        }

        public FilesCreateRequestBuilder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        public FilesCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FilesCreateRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public FilesCreateRequestBuilder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            return this;
        }

        public FilesCreateRequestBuilder force(Boolean force) {
            this.force = force;
            return this;
        }

        public FilesCreateRequestBuilder file(File file) {
            this.file = file;
            return this;
        }

        public FilesCreateRequestBuilder stream(InputStream stream) {
            this.stream = stream;
            return this;
        }

        public FilesCreateRequest build() {
            FilesCreateRequest filesCreateRequest = new FilesCreateRequest();
            filesCreateRequest.name = this.name;
            filesCreateRequest.comment = this.comment;
            filesCreateRequest.force = this.force;
            filesCreateRequest.stream = this.stream;
            filesCreateRequest.folderId = this.folderId;
            filesCreateRequest.file = this.file;
            filesCreateRequest.isSensitive = this.isSensitive;
            return filesCreateRequest;
        }
    }
    // region
}

