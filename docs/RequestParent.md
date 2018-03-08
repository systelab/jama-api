
# RequestParent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **Integer** | ID of an item. If this is included, the item of this payload will be located at this parent item. If this is not included, the item will be located at the root of the project. |  [optional]
**project** | **Integer** | ID of an project. If this is included, the item of this payload will be located at the root of the project, and a parent item cannot be specified. This value will be inferred by the \&quot;project\&quot; property at the root of the payload when a parent location is not specified. |  [optional]



