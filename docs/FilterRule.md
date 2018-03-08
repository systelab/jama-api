
# FilterRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FilterField**](FilterField.md) |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) |  | 
**values** | **List&lt;String&gt;** |  | 
**itemType** | **Integer** | ID of an item type | 
**subQuery** | [**FilterQuery**](FilterQuery.md) |  | 
**rules** | [**List&lt;FilterRule&gt;**](FilterRule.md) |  | 


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
GROUP_OR | &quot;GROUP_OR&quot;
GROUP_AND | &quot;GROUP_AND&quot;
OR | &quot;OR&quot;
AND | &quot;AND&quot;
EQUALS | &quot;EQUALS&quot;
EQUALS_DATE | &quot;EQUALS_DATE&quot;
EQUALS_MULTI | &quot;EQUALS_MULTI&quot;
NOT_EQUALS | &quot;NOT_EQUALS&quot;
NOT_EQUALS_DATE | &quot;NOT_EQUALS_DATE&quot;
NOT_EQUALS_MULTI | &quot;NOT_EQUALS_MULTI&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;
GREATER_THAN_DATE | &quot;GREATER_THAN_DATE&quot;
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_DATE | &quot;LESS_THAN_DATE&quot;
IN | &quot;IN&quot;
IS_TRUE | &quot;IS_TRUE&quot;
IS_FALSE | &quot;IS_FALSE&quot;
CONTAINS | &quot;CONTAINS&quot;
CONTAINS_WORD | &quot;CONTAINS_WORD&quot;
NOT_CONTAINS | &quot;NOT_CONTAINS&quot;
NOT_CONTAINS_WORD | &quot;NOT_CONTAINS_WORD&quot;
IS_ASSOCIATED_ITEM | &quot;IS_ASSOCIATED_ITEM&quot;
IS_ASSOCIATED_SUSPECT_ITEM | &quot;IS_ASSOCIATED_SUSPECT_ITEM&quot;
IS_ASSOCIATED_NOT_SUSPECT_ITEM | &quot;IS_ASSOCIATED_NOT_SUSPECT_ITEM&quot;
IS_BETWEEN | &quot;IS_BETWEEN&quot;
HAS_ALL | &quot;HAS_ALL&quot;
HAS_NONE | &quot;HAS_NONE&quot;
IS_DIRECTLY_UNDER | &quot;IS_DIRECTLY_UNDER&quot;
IS_UNDER | &quot;IS_UNDER&quot;
IS_CURRENT_USER | &quot;IS_CURRENT_USER&quot;
IS_EMPTY | &quot;IS_EMPTY&quot;
IS_NOT_EMPTY | &quot;IS_NOT_EMPTY&quot;
IS_NOT_DIRECTLY_UNDER | &quot;IS_NOT_DIRECTLY_UNDER&quot;
IS_UNDER_OR_EQUAL | &quot;IS_UNDER_OR_EQUAL&quot;
IS_NOT_UNDER | &quot;IS_NOT_UNDER&quot;
LOCATION_IS | &quot;LOCATION_IS&quot;
TEST_CENTER_RELATE | &quot;TEST_CENTER_RELATE&quot;
SHARED_WITH | &quot;SHARED_WITH&quot;
NOT_SHARED_WITH | &quot;NOT_SHARED_WITH&quot;
IS_WITHIN_LAST | &quot;IS_WITHIN_LAST&quot;



