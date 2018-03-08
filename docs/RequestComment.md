
# RequestComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inReplyTo** | **Integer** | ID of a comment |  [optional]
**body** | [**RequestCommentBody**](RequestCommentBody.md) |  | 
**commentType** | [**CommentTypeEnum**](#CommentTypeEnum) |  |  [optional]
**location** | [**RequestCommentLocation**](RequestCommentLocation.md) |  |  [optional]


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



