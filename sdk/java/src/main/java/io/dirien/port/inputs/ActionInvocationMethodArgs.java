// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionInvocationMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionInvocationMethodArgs Empty = new ActionInvocationMethodArgs();

    @Import(name="agent")
    private @Nullable Output<Boolean> agent;

    public Optional<Output<Boolean>> agent() {
        return Optional.ofNullable(this.agent);
    }

    @Import(name="omitPayload")
    private @Nullable Output<Boolean> omitPayload;

    public Optional<Output<Boolean>> omitPayload() {
        return Optional.ofNullable(this.omitPayload);
    }

    @Import(name="omitUserInputs")
    private @Nullable Output<Boolean> omitUserInputs;

    public Optional<Output<Boolean>> omitUserInputs() {
        return Optional.ofNullable(this.omitUserInputs);
    }

    @Import(name="org")
    private @Nullable Output<String> org;

    public Optional<Output<String>> org() {
        return Optional.ofNullable(this.org);
    }

    @Import(name="repo")
    private @Nullable Output<String> repo;

    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    @Import(name="reportWorkflowStatus")
    private @Nullable Output<Boolean> reportWorkflowStatus;

    public Optional<Output<Boolean>> reportWorkflowStatus() {
        return Optional.ofNullable(this.reportWorkflowStatus);
    }

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

    @Import(name="workflow")
    private @Nullable Output<String> workflow;

    public Optional<Output<String>> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    private ActionInvocationMethodArgs() {}

    private ActionInvocationMethodArgs(ActionInvocationMethodArgs $) {
        this.agent = $.agent;
        this.omitPayload = $.omitPayload;
        this.omitUserInputs = $.omitUserInputs;
        this.org = $.org;
        this.repo = $.repo;
        this.reportWorkflowStatus = $.reportWorkflowStatus;
        this.type = $.type;
        this.url = $.url;
        this.workflow = $.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionInvocationMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionInvocationMethodArgs $;

        public Builder() {
            $ = new ActionInvocationMethodArgs();
        }

        public Builder(ActionInvocationMethodArgs defaults) {
            $ = new ActionInvocationMethodArgs(Objects.requireNonNull(defaults));
        }

        public Builder agent(@Nullable Output<Boolean> agent) {
            $.agent = agent;
            return this;
        }

        public Builder agent(Boolean agent) {
            return agent(Output.of(agent));
        }

        public Builder omitPayload(@Nullable Output<Boolean> omitPayload) {
            $.omitPayload = omitPayload;
            return this;
        }

        public Builder omitPayload(Boolean omitPayload) {
            return omitPayload(Output.of(omitPayload));
        }

        public Builder omitUserInputs(@Nullable Output<Boolean> omitUserInputs) {
            $.omitUserInputs = omitUserInputs;
            return this;
        }

        public Builder omitUserInputs(Boolean omitUserInputs) {
            return omitUserInputs(Output.of(omitUserInputs));
        }

        public Builder org(@Nullable Output<String> org) {
            $.org = org;
            return this;
        }

        public Builder org(String org) {
            return org(Output.of(org));
        }

        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public Builder reportWorkflowStatus(@Nullable Output<Boolean> reportWorkflowStatus) {
            $.reportWorkflowStatus = reportWorkflowStatus;
            return this;
        }

        public Builder reportWorkflowStatus(Boolean reportWorkflowStatus) {
            return reportWorkflowStatus(Output.of(reportWorkflowStatus));
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

        public Builder workflow(@Nullable Output<String> workflow) {
            $.workflow = workflow;
            return this;
        }

        public Builder workflow(String workflow) {
            return workflow(Output.of(workflow));
        }

        public ActionInvocationMethodArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
