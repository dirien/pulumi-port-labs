// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlueprintChangelogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlueprintChangelogDestinationArgs Empty = new BlueprintChangelogDestinationArgs();

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private BlueprintChangelogDestinationArgs() {}

    private BlueprintChangelogDestinationArgs(BlueprintChangelogDestinationArgs $) {
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlueprintChangelogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueprintChangelogDestinationArgs $;

        public Builder() {
            $ = new BlueprintChangelogDestinationArgs();
        }

        public Builder(BlueprintChangelogDestinationArgs defaults) {
            $ = new BlueprintChangelogDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public BlueprintChangelogDestinationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}