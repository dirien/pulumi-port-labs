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

    public sealed class ActionUserPropertyArgs : global::Pulumi.ResourceArgs
    {
        [Input("blueprint")]
        public Input<string>? Blueprint { get; set; }

        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("defaultItems")]
        private InputList<string>? _defaultItems;
        public InputList<string> DefaultItems
        {
            get => _defaultItems ?? (_defaultItems = new InputList<string>());
            set => _defaultItems = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enums")]
        private InputList<string>? _enums;
        public InputList<string> Enums
        {
            get => _enums ?? (_enums = new InputList<string>());
            set => _enums = value;
        }

        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ActionUserPropertyArgs()
        {
        }
        public static new ActionUserPropertyArgs Empty => new ActionUserPropertyArgs();
    }
}
