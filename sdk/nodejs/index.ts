// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { ActionArgs, ActionState } from "./action";
export type Action = import("./action").Action;
export const Action: typeof import("./action").Action = null as any;
utilities.lazyLoad(exports, ["Action"], () => require("./action"));

export { BlueprintArgs, BlueprintState } from "./blueprint";
export type Blueprint = import("./blueprint").Blueprint;
export const Blueprint: typeof import("./blueprint").Blueprint = null as any;
utilities.lazyLoad(exports, ["Blueprint"], () => require("./blueprint"));

export { EntityArgs, EntityState } from "./entity";
export type Entity = import("./entity").Entity;
export const Entity: typeof import("./entity").Entity = null as any;
utilities.lazyLoad(exports, ["Entity"], () => require("./entity"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "port:index/action:Action":
                return new Action(name, <any>undefined, { urn })
            case "port:index/blueprint:Blueprint":
                return new Blueprint(name, <any>undefined, { urn })
            case "port:index/entity:Entity":
                return new Entity(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("port", "index/action", _module)
pulumi.runtime.registerResourceModule("port", "index/blueprint", _module)
pulumi.runtime.registerResourceModule("port", "index/entity", _module)
pulumi.runtime.registerResourcePackage("port", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:port") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
