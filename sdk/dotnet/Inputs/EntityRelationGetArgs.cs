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

    public sealed class EntityRelationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public EntityRelationGetArgs()
        {
        }
        public static new EntityRelationGetArgs Empty => new EntityRelationGetArgs();
    }
}