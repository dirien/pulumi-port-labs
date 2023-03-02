// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntityProperty {
    private @Nullable List<String> items;
    private String name;
    /**
     * @deprecated
     * property type is not required anymore
     * 
     */
    @Deprecated /* property type is not required anymore */
    private @Nullable String type;
    private @Nullable String value;

    private EntityProperty() {}
    public List<String> items() {
        return this.items == null ? List.of() : this.items;
    }
    public String name() {
        return this.name;
    }
    /**
     * @deprecated
     * property type is not required anymore
     * 
     */
    @Deprecated /* property type is not required anymore */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> items;
        private String name;
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(EntityProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder items(@Nullable List<String> items) {
            this.items = items;
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EntityProperty build() {
            final var o = new EntityProperty();
            o.items = items;
            o.name = name;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}