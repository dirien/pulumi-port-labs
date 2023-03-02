// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.dirien.port.inputs.EntityPropertyArgs;
import io.dirien.port.inputs.EntityRelationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntityArgs Empty = new EntityArgs();

    /**
     * The blueprint identifier the entity relates to
     * 
     */
    @Import(name="blueprint", required=true)
    private Output<String> blueprint;

    /**
     * @return The blueprint identifier the entity relates to
     * 
     */
    public Output<String> blueprint() {
        return this.blueprint;
    }

    /**
     * The identifier of the entity
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return The identifier of the entity
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * The metadata of the entity
     * 
     */
    @Import(name="properties", required=true)
    private Output<List<EntityPropertyArgs>> properties;

    /**
     * @return The metadata of the entity
     * 
     */
    public Output<List<EntityPropertyArgs>> properties() {
        return this.properties;
    }

    /**
     * The other entities that are connected
     * 
     */
    @Import(name="relations")
    private @Nullable Output<List<EntityRelationArgs>> relations;

    /**
     * @return The other entities that are connected
     * 
     */
    public Optional<Output<List<EntityRelationArgs>>> relations() {
        return Optional.ofNullable(this.relations);
    }

    /**
     * The runID of the action run that created the entity
     * 
     */
    @Import(name="runId")
    private @Nullable Output<String> runId;

    /**
     * @return The runID of the action run that created the entity
     * 
     */
    public Optional<Output<String>> runId() {
        return Optional.ofNullable(this.runId);
    }

    /**
     * The team related to the entity
     * 
     */
    @Import(name="team")
    private @Nullable Output<String> team;

    /**
     * @return The team related to the entity
     * 
     */
    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    /**
     * The teams related to the entity
     * 
     */
    @Import(name="teams")
    private @Nullable Output<List<String>> teams;

    /**
     * @return The teams related to the entity
     * 
     */
    public Optional<Output<List<String>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    /**
     * The display name of the entity
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The display name of the entity
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private EntityArgs() {}

    private EntityArgs(EntityArgs $) {
        this.blueprint = $.blueprint;
        this.identifier = $.identifier;
        this.properties = $.properties;
        this.relations = $.relations;
        this.runId = $.runId;
        this.team = $.team;
        this.teams = $.teams;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityArgs $;

        public Builder() {
            $ = new EntityArgs();
        }

        public Builder(EntityArgs defaults) {
            $ = new EntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprint The blueprint identifier the entity relates to
         * 
         * @return builder
         * 
         */
        public Builder blueprint(Output<String> blueprint) {
            $.blueprint = blueprint;
            return this;
        }

        /**
         * @param blueprint The blueprint identifier the entity relates to
         * 
         * @return builder
         * 
         */
        public Builder blueprint(String blueprint) {
            return blueprint(Output.of(blueprint));
        }

        /**
         * @param identifier The identifier of the entity
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The identifier of the entity
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param properties The metadata of the entity
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<List<EntityPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The metadata of the entity
         * 
         * @return builder
         * 
         */
        public Builder properties(List<EntityPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties The metadata of the entity
         * 
         * @return builder
         * 
         */
        public Builder properties(EntityPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        /**
         * @param relations The other entities that are connected
         * 
         * @return builder
         * 
         */
        public Builder relations(@Nullable Output<List<EntityRelationArgs>> relations) {
            $.relations = relations;
            return this;
        }

        /**
         * @param relations The other entities that are connected
         * 
         * @return builder
         * 
         */
        public Builder relations(List<EntityRelationArgs> relations) {
            return relations(Output.of(relations));
        }

        /**
         * @param relations The other entities that are connected
         * 
         * @return builder
         * 
         */
        public Builder relations(EntityRelationArgs... relations) {
            return relations(List.of(relations));
        }

        /**
         * @param runId The runID of the action run that created the entity
         * 
         * @return builder
         * 
         */
        public Builder runId(@Nullable Output<String> runId) {
            $.runId = runId;
            return this;
        }

        /**
         * @param runId The runID of the action run that created the entity
         * 
         * @return builder
         * 
         */
        public Builder runId(String runId) {
            return runId(Output.of(runId));
        }

        /**
         * @param team The team related to the entity
         * 
         * @return builder
         * 
         */
        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team The team related to the entity
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        /**
         * @param teams The teams related to the entity
         * 
         * @return builder
         * 
         */
        public Builder teams(@Nullable Output<List<String>> teams) {
            $.teams = teams;
            return this;
        }

        /**
         * @param teams The teams related to the entity
         * 
         * @return builder
         * 
         */
        public Builder teams(List<String> teams) {
            return teams(Output.of(teams));
        }

        /**
         * @param teams The teams related to the entity
         * 
         * @return builder
         * 
         */
        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }

        /**
         * @param title The display name of the entity
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The display name of the entity
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public EntityArgs build() {
            $.blueprint = Objects.requireNonNull($.blueprint, "expected parameter 'blueprint' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}