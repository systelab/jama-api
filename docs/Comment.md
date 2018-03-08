
# Comment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**inReplyTo** | **Integer** | ID of a comment | 
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdBy** | **Integer** | ID of a user | 
**modifiedBy** | **Integer** | ID of a user | 
**deleted** | **Boolean** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**body** | [**CommentBody**](CommentBody.md) |  | 
**commentType** | [**CommentTypeEnum**](#CommentTypeEnum) |  | 
**location** | [**CommentLocation**](CommentLocation.md) |  | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;OPEN&quot;
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;


<a name="CommentTypeEnum"></a>
## Enum: CommentTypeEnum
Name | Value
---- | -----
GENERAL | &quot;GENERAL&quot;
QUESTION | &quot;QUESTION&quot;
PROPOSED_CHANGE | &quot;PROPOSED_CHANGE&quot;
ACCEPTED_COMMENT | &quot;ACCEPTED_COMMENT&quot;
REJECTED_COMMENT | &quot;REJECTED_COMMENT&quot;
ISSUE | &quot;ISSUE&quot;
DECISION | &quot;DECISION&quot;
DECISION_REQUEST | &quot;DECISION_REQUEST&quot;



