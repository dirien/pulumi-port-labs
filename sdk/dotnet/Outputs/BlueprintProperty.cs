// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace ediri.Port.Outputs
{

    [OutputType]
    public sealed class BlueprintProperty
    {
        public readonly string? Default;
        public readonly ImmutableArray<string> DefaultItems;
        public readonly string? Description;
        public readonly ImmutableDictionary<string, string>? EnumColors;
        public readonly ImmutableArray<string> Enums;
        public readonly string? Format;
        public readonly string? Icon;
        public readonly string Identifier;
        public readonly bool? Required;
        public readonly string? Spec;
        public readonly string Title;
        public readonly string Type;

        [OutputConstructor]
        private BlueprintProperty(
            string? @default,

            ImmutableArray<string> defaultItems,

            string? description,

            ImmutableDictionary<string, string>? enumColors,

            ImmutableArray<string> enums,

            string? format,

            string? icon,

            string identifier,

            bool? required,

            string? spec,

            string title,

            string type)
        {
            Default = @default;
            DefaultItems = defaultItems;
            Description = description;
            EnumColors = enumColors;
            Enums = enums;
            Format = format;
            Icon = icon;
            Identifier = identifier;
            Required = required;
            Spec = spec;
            Title = title;
            Type = type;
        }
    }
}