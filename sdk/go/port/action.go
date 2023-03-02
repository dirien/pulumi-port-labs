// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package port

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Action struct {
	pulumi.CustomResourceState

	// The identifier of the blueprint
	BlueprintIdentifier pulumi.StringOutput `pulumi:"blueprintIdentifier"`
	// The description of the action
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The icon of the action
	Icon pulumi.StringPtrOutput `pulumi:"icon"`
	// The identifier of the action
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
	InvocationMethod ActionInvocationMethodOutput `pulumi:"invocationMethod"`
	// The display name of the action
	Title pulumi.StringOutput `pulumi:"title"`
	// The type of the action, one of CREATE, DAY-2, DELETE
	Trigger pulumi.StringOutput `pulumi:"trigger"`
	// The input properties of the action
	UserProperties ActionUserPropertyArrayOutput `pulumi:"userProperties"`
}

// NewAction registers a new resource with the given unique name, arguments, and options.
func NewAction(ctx *pulumi.Context,
	name string, args *ActionArgs, opts ...pulumi.ResourceOption) (*Action, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BlueprintIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'BlueprintIdentifier'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.InvocationMethod == nil {
		return nil, errors.New("invalid value for required argument 'InvocationMethod'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	if args.Trigger == nil {
		return nil, errors.New("invalid value for required argument 'Trigger'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Action
	err := ctx.RegisterResource("port:index/action:Action", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAction gets an existing Action resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionState, opts ...pulumi.ResourceOption) (*Action, error) {
	var resource Action
	err := ctx.ReadResource("port:index/action:Action", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Action resources.
type actionState struct {
	// The identifier of the blueprint
	BlueprintIdentifier *string `pulumi:"blueprintIdentifier"`
	// The description of the action
	Description *string `pulumi:"description"`
	// The icon of the action
	Icon *string `pulumi:"icon"`
	// The identifier of the action
	Identifier *string `pulumi:"identifier"`
	// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
	InvocationMethod *ActionInvocationMethod `pulumi:"invocationMethod"`
	// The display name of the action
	Title *string `pulumi:"title"`
	// The type of the action, one of CREATE, DAY-2, DELETE
	Trigger *string `pulumi:"trigger"`
	// The input properties of the action
	UserProperties []ActionUserProperty `pulumi:"userProperties"`
}

type ActionState struct {
	// The identifier of the blueprint
	BlueprintIdentifier pulumi.StringPtrInput
	// The description of the action
	Description pulumi.StringPtrInput
	// The icon of the action
	Icon pulumi.StringPtrInput
	// The identifier of the action
	Identifier pulumi.StringPtrInput
	// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
	InvocationMethod ActionInvocationMethodPtrInput
	// The display name of the action
	Title pulumi.StringPtrInput
	// The type of the action, one of CREATE, DAY-2, DELETE
	Trigger pulumi.StringPtrInput
	// The input properties of the action
	UserProperties ActionUserPropertyArrayInput
}

func (ActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionState)(nil)).Elem()
}

type actionArgs struct {
	// The identifier of the blueprint
	BlueprintIdentifier string `pulumi:"blueprintIdentifier"`
	// The description of the action
	Description *string `pulumi:"description"`
	// The icon of the action
	Icon *string `pulumi:"icon"`
	// The identifier of the action
	Identifier string `pulumi:"identifier"`
	// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
	InvocationMethod ActionInvocationMethod `pulumi:"invocationMethod"`
	// The display name of the action
	Title string `pulumi:"title"`
	// The type of the action, one of CREATE, DAY-2, DELETE
	Trigger string `pulumi:"trigger"`
	// The input properties of the action
	UserProperties []ActionUserProperty `pulumi:"userProperties"`
}

// The set of arguments for constructing a Action resource.
type ActionArgs struct {
	// The identifier of the blueprint
	BlueprintIdentifier pulumi.StringInput
	// The description of the action
	Description pulumi.StringPtrInput
	// The icon of the action
	Icon pulumi.StringPtrInput
	// The identifier of the action
	Identifier pulumi.StringInput
	// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
	InvocationMethod ActionInvocationMethodInput
	// The display name of the action
	Title pulumi.StringInput
	// The type of the action, one of CREATE, DAY-2, DELETE
	Trigger pulumi.StringInput
	// The input properties of the action
	UserProperties ActionUserPropertyArrayInput
}

func (ActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionArgs)(nil)).Elem()
}

type ActionInput interface {
	pulumi.Input

	ToActionOutput() ActionOutput
	ToActionOutputWithContext(ctx context.Context) ActionOutput
}

func (*Action) ElementType() reflect.Type {
	return reflect.TypeOf((**Action)(nil)).Elem()
}

func (i *Action) ToActionOutput() ActionOutput {
	return i.ToActionOutputWithContext(context.Background())
}

func (i *Action) ToActionOutputWithContext(ctx context.Context) ActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionOutput)
}

// ActionArrayInput is an input type that accepts ActionArray and ActionArrayOutput values.
// You can construct a concrete instance of `ActionArrayInput` via:
//
//	ActionArray{ ActionArgs{...} }
type ActionArrayInput interface {
	pulumi.Input

	ToActionArrayOutput() ActionArrayOutput
	ToActionArrayOutputWithContext(context.Context) ActionArrayOutput
}

type ActionArray []ActionInput

func (ActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Action)(nil)).Elem()
}

func (i ActionArray) ToActionArrayOutput() ActionArrayOutput {
	return i.ToActionArrayOutputWithContext(context.Background())
}

func (i ActionArray) ToActionArrayOutputWithContext(ctx context.Context) ActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionArrayOutput)
}

// ActionMapInput is an input type that accepts ActionMap and ActionMapOutput values.
// You can construct a concrete instance of `ActionMapInput` via:
//
//	ActionMap{ "key": ActionArgs{...} }
type ActionMapInput interface {
	pulumi.Input

	ToActionMapOutput() ActionMapOutput
	ToActionMapOutputWithContext(context.Context) ActionMapOutput
}

type ActionMap map[string]ActionInput

func (ActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Action)(nil)).Elem()
}

func (i ActionMap) ToActionMapOutput() ActionMapOutput {
	return i.ToActionMapOutputWithContext(context.Background())
}

func (i ActionMap) ToActionMapOutputWithContext(ctx context.Context) ActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionMapOutput)
}

type ActionOutput struct{ *pulumi.OutputState }

func (ActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Action)(nil)).Elem()
}

func (o ActionOutput) ToActionOutput() ActionOutput {
	return o
}

func (o ActionOutput) ToActionOutputWithContext(ctx context.Context) ActionOutput {
	return o
}

// The identifier of the blueprint
func (o ActionOutput) BlueprintIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.BlueprintIdentifier }).(pulumi.StringOutput)
}

// The description of the action
func (o ActionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Action) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The icon of the action
func (o ActionOutput) Icon() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Action) pulumi.StringPtrOutput { return v.Icon }).(pulumi.StringPtrOutput)
}

// The identifier of the action
func (o ActionOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// The methods the action is dispatched in. Supports WEBHOOK, KAFKA and GITHUB
func (o ActionOutput) InvocationMethod() ActionInvocationMethodOutput {
	return o.ApplyT(func(v *Action) ActionInvocationMethodOutput { return v.InvocationMethod }).(ActionInvocationMethodOutput)
}

// The display name of the action
func (o ActionOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

// The type of the action, one of CREATE, DAY-2, DELETE
func (o ActionOutput) Trigger() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Trigger }).(pulumi.StringOutput)
}

// The input properties of the action
func (o ActionOutput) UserProperties() ActionUserPropertyArrayOutput {
	return o.ApplyT(func(v *Action) ActionUserPropertyArrayOutput { return v.UserProperties }).(ActionUserPropertyArrayOutput)
}

type ActionArrayOutput struct{ *pulumi.OutputState }

func (ActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Action)(nil)).Elem()
}

func (o ActionArrayOutput) ToActionArrayOutput() ActionArrayOutput {
	return o
}

func (o ActionArrayOutput) ToActionArrayOutputWithContext(ctx context.Context) ActionArrayOutput {
	return o
}

func (o ActionArrayOutput) Index(i pulumi.IntInput) ActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Action {
		return vs[0].([]*Action)[vs[1].(int)]
	}).(ActionOutput)
}

type ActionMapOutput struct{ *pulumi.OutputState }

func (ActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Action)(nil)).Elem()
}

func (o ActionMapOutput) ToActionMapOutput() ActionMapOutput {
	return o
}

func (o ActionMapOutput) ToActionMapOutputWithContext(ctx context.Context) ActionMapOutput {
	return o
}

func (o ActionMapOutput) MapIndex(k pulumi.StringInput) ActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Action {
		return vs[0].(map[string]*Action)[vs[1].(string)]
	}).(ActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionInput)(nil)).Elem(), &Action{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionArrayInput)(nil)).Elem(), ActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionMapInput)(nil)).Elem(), ActionMap{})
	pulumi.RegisterOutputType(ActionOutput{})
	pulumi.RegisterOutputType(ActionArrayOutput{})
	pulumi.RegisterOutputType(ActionMapOutput{})
}