// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace ediri.Port.Inputs
{

    public sealed class BlueprintChangelogDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("url")]
        public Input<string>? Url { get; set; }

        public BlueprintChangelogDestinationGetArgs()
        {
        }
        public static new BlueprintChangelogDestinationGetArgs Empty => new BlueprintChangelogDestinationGetArgs();
    }
}
