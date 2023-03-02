// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="baseUrl")
    private @Nullable Output<String> baseUrl;

    public Optional<Output<String>> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }

    @Import(name="clientId", required=true)
    private Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    @Import(name="token")
    private @Nullable Output<String> token;

    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.baseUrl = $.baseUrl;
        this.clientId = $.clientId;
        this.secret = $.secret;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseUrl(@Nullable Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}