// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("port");

export declare const baseUrl: string | undefined;
Object.defineProperty(exports, "baseUrl", {
    get() {
        return __config.get("baseUrl");
    },
    enumerable: true,
});

export declare const clientId: string | undefined;
Object.defineProperty(exports, "clientId", {
    get() {
        return __config.get("clientId");
    },
    enumerable: true,
});

export declare const secret: string | undefined;
Object.defineProperty(exports, "secret", {
    get() {
        return __config.get("secret");
    },
    enumerable: true,
});

export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});
