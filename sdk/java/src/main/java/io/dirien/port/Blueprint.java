// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.dirien.port.BlueprintArgs;
import io.dirien.port.Utilities;
import io.dirien.port.inputs.BlueprintState;
import io.dirien.port.outputs.BlueprintCalculationProperty;
import io.dirien.port.outputs.BlueprintChangelogDestination;
import io.dirien.port.outputs.BlueprintMirrorProperty;
import io.dirien.port.outputs.BlueprintProperty;
import io.dirien.port.outputs.BlueprintRelation;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="port:index/blueprint:Blueprint")
public class Blueprint extends com.pulumi.resources.CustomResource {
    /**
     * A set of properties that are calculated upon Entitys regular properties.
     * 
     */
    @Export(name="calculationProperties", refs={List.class,BlueprintCalculationProperty.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BlueprintCalculationProperty>> calculationProperties;

    /**
     * @return A set of properties that are calculated upon Entitys regular properties.
     * 
     */
    public Output<Optional<List<BlueprintCalculationProperty>>> calculationProperties() {
        return Codegen.optional(this.calculationProperties);
    }
    /**
     * Blueprints changelog destination, Supports WEBHOOK and KAFKA
     * 
     */
    @Export(name="changelogDestination", refs={BlueprintChangelogDestination.class}, tree="[0]")
    private Output</* @Nullable */ BlueprintChangelogDestination> changelogDestination;

    /**
     * @return Blueprints changelog destination, Supports WEBHOOK and KAFKA
     * 
     */
    public Output<Optional<BlueprintChangelogDestination>> changelogDestination() {
        return Codegen.optional(this.changelogDestination);
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * The data source for entities of this blueprint
     * 
     * @deprecated
     * Data source is ignored
     * 
     */
    @Deprecated /* Data source is ignored */
    @Export(name="dataSource", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataSource;

    /**
     * @return The data source for entities of this blueprint
     * 
     */
    public Output<Optional<String>> dataSource() {
        return Codegen.optional(this.dataSource);
    }
    /**
     * The description of the blueprint
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the blueprint
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The icon of the blueprint
     * 
     */
    @Export(name="icon", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> icon;

    /**
     * @return The icon of the blueprint
     * 
     */
    public Output<Optional<String>> icon() {
        return Codegen.optional(this.icon);
    }
    /**
     * The identifier of the blueprint
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return The identifier of the blueprint
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * When two Blueprints are connected via a Relation, a new set of properties becomes available to Entities in the source
     * Blueprint.
     * 
     */
    @Export(name="mirrorProperties", refs={List.class,BlueprintMirrorProperty.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BlueprintMirrorProperty>> mirrorProperties;

    /**
     * @return When two Blueprints are connected via a Relation, a new set of properties becomes available to Entities in the source
     * Blueprint.
     * 
     */
    public Output<Optional<List<BlueprintMirrorProperty>>> mirrorProperties() {
        return Codegen.optional(this.mirrorProperties);
    }
    /**
     * The metadata of the entity
     * 
     */
    @Export(name="properties", refs={List.class,BlueprintProperty.class}, tree="[0,1]")
    private Output<List<BlueprintProperty>> properties;

    /**
     * @return The metadata of the entity
     * 
     */
    public Output<List<BlueprintProperty>> properties() {
        return this.properties;
    }
    /**
     * The blueprints that are connected to this blueprint
     * 
     */
    @Export(name="relations", refs={List.class,BlueprintRelation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BlueprintRelation>> relations;

    /**
     * @return The blueprints that are connected to this blueprint
     * 
     */
    public Output<Optional<List<BlueprintRelation>>> relations() {
        return Codegen.optional(this.relations);
    }
    /**
     * The display name of the blueprint
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return The display name of the blueprint
     * 
     */
    public Output<String> title() {
        return this.title;
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    @Export(name="updatedBy", refs={String.class}, tree="[0]")
    private Output<String> updatedBy;

    public Output<String> updatedBy() {
        return this.updatedBy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Blueprint(String name) {
        this(name, BlueprintArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Blueprint(String name, BlueprintArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Blueprint(String name, BlueprintArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("port:index/blueprint:Blueprint", name, args == null ? BlueprintArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Blueprint(String name, Output<String> id, @Nullable BlueprintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("port:index/blueprint:Blueprint", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Blueprint get(String name, Output<String> id, @Nullable BlueprintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Blueprint(name, id, state, options);
    }
}
