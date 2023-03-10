// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlueprintMirrorProperty {
    private String identifier;
    private String path;
    private @Nullable String title;

    private BlueprintMirrorProperty() {}
    public String identifier() {
        return this.identifier;
    }
    public String path() {
        return this.path;
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlueprintMirrorProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifier;
        private String path;
        private @Nullable String title;
        public Builder() {}
        public Builder(BlueprintMirrorProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.path = defaults.path;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public BlueprintMirrorProperty build() {
            final var o = new BlueprintMirrorProperty();
            o.identifier = identifier;
            o.path = path;
            o.title = title;
            return o;
        }
    }
}
