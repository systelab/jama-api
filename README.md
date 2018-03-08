# Jama API

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.systelab</groupId>
    <artifactId>jama-api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/jama-api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AbstractitemsApi;

import java.io.File;
import java.util.*;

public class AbstractitemsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AbstractitemsApi apiInstance = new AbstractitemsApi();
        List<Integer> project = Arrays.asList(56); // List<Integer> | 
        List<Integer> itemType = Arrays.asList(56); // List<Integer> | 
        List<String> documentKey = Arrays.asList("documentKey_example"); // List<String> | 
        List<Integer> release = Arrays.asList(56); // List<Integer> | 
        List<String> createdDate = Arrays.asList("createdDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
        List<String> modifiedDate = Arrays.asList("modifiedDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
        List<String> lastActivityDate = Arrays.asList("lastActivityDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
        List<String> contains = Arrays.asList("contains_example"); // List<String> | Filter on the text contents of the item. Strings taken literally. Multiple 'contains' values will be bitwise ORed.
        List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort orders can be added with the name of the field by which to sort, followed by .asc or .desc (e.g. 'name.asc' or 'modifiedDate.desc'). If not set, this defaults to sorting by sequence.asc and then documentKey.asc
        Integer startAt = 56; // Integer | 
        Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
        List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
        try {
            ItemDataListWrapper result = apiInstance.getAbstractItems(project, itemType, documentKey, release, createdDate, modifiedDate, lastActivityDate, contains, sortBy, startAt, maxResults, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AbstractitemsApi#getAbstractItems");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractitemsApi* | [**getAbstractItems**](docs/AbstractitemsApi.md#getAbstractItems) | **GET** /abstractitems | Search for items, test plans, test cycles, test runs, or attachments
*AbstractitemsApi* | [**getItem**](docs/AbstractitemsApi.md#getItem) | **GET** /abstractitems/{id} | Get any item, test plan, test cycle, test run, or attachment with the specified ID
*AbstractitemsApi* | [**getVersionOnItem**](docs/AbstractitemsApi.md#getVersionOnItem) | **GET** /abstractitems/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*AbstractitemsApi* | [**getVersionedItem**](docs/AbstractitemsApi.md#getVersionedItem) | **GET** /abstractitems/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the item at the specified version
*AbstractitemsApi* | [**getVersionedRelationships**](docs/AbstractitemsApi.md#getVersionedRelationships) | **GET** /abstractitems/{id}/versionedrelationships | Get all versioned relationships that were associated to the item at the specified time
*AbstractitemsApi* | [**getVersionsOnItem**](docs/AbstractitemsApi.md#getVersionsOnItem) | **GET** /abstractitems/{id}/versions | Get all versions for the item with the specified ID
*ActivitiesApi* | [**getActivities**](docs/ActivitiesApi.md#getActivities) | **GET** /activities | Get all activities in the project with the specified ID
*ActivitiesApi* | [**getActivityById**](docs/ActivitiesApi.md#getActivityById) | **GET** /activities/{activityId} | Get the activity with the specified ID
*ActivitiesApi* | [**getAffectedItems**](docs/ActivitiesApi.md#getAffectedItems) | **GET** /activities/{activityId}/affecteditems | Get all items affected by the activity with the specified ID
*ActivitiesApi* | [**restoreItems**](docs/ActivitiesApi.md#restoreItems) | **POST** /activities/{activityId}/restore | Restore item(s) associated with a delete activity.
*AttachmentsApi* | [**downloadFile**](docs/AttachmentsApi.md#downloadFile) | **GET** /attachments/{attachmentId}/file | Download attachment file from the attachment with the specified ID
*AttachmentsApi* | [**getAttachmentItem**](docs/AttachmentsApi.md#getAttachmentItem) | **GET** /attachments/{attachmentId} | Get the attachment with the specified ID
*AttachmentsApi* | [**getItemComments**](docs/AttachmentsApi.md#getItemComments) | **GET** /attachments/{attachmentId}/comments | Get all comments for the item with the specified ID
*AttachmentsApi* | [**getLock**](docs/AttachmentsApi.md#getLock) | **GET** /attachments/{attachmentId}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
*AttachmentsApi* | [**getVersionOnItem1**](docs/AttachmentsApi.md#getVersionOnItem1) | **GET** /attachments/{attachmentId}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*AttachmentsApi* | [**getVersionedItem1**](docs/AttachmentsApi.md#getVersionedItem1) | **GET** /attachments/{attachmentId}/versions/{versionNum}/versioneditem | Get the  snapshot of the attachment at the specified version
*AttachmentsApi* | [**getVersionsOnItem1**](docs/AttachmentsApi.md#getVersionsOnItem1) | **GET** /attachments/{attachmentId}/versions | Get all versions for the item with the specified ID
*AttachmentsApi* | [**updateLock**](docs/AttachmentsApi.md#updateLock) | **PUT** /attachments/{attachmentId}/lock | Update the locked state of the item with the specified ID
*AttachmentsApi* | [**uploadFile**](docs/AttachmentsApi.md#uploadFile) | **PUT** /attachments/{attachmentId}/file | Upload attachment file to the attachment with the specified ID
*BaselinesApi* | [**getBaseline**](docs/BaselinesApi.md#getBaseline) | **GET** /baselines/{baselineId} | Get the baseline with the specified ID
*BaselinesApi* | [**getBaselines**](docs/BaselinesApi.md#getBaselines) | **GET** /baselines | Get all baselines in the project with the specified ID
*BaselinesApi* | [**getRelationshipsForVersion**](docs/BaselinesApi.md#getRelationshipsForVersion) | **GET** /baselines/{baselineId}/versioneditems/{itemId}/versionedrelationships | Get all versioned relationships for the item in the baseline
*BaselinesApi* | [**getVersionedItem**](docs/BaselinesApi.md#getVersionedItem) | **GET** /baselines/{baselineId}/versioneditems/{itemId} | Get the baseline item with the specified ID in a baseline with the specified ID
*BaselinesApi* | [**getVersionedItems**](docs/BaselinesApi.md#getVersionedItems) | **GET** /baselines/{baselineId}/versioneditems | Get all baseline items in a baseline with the specified ID
*CommentsApi* | [**addComment**](docs/CommentsApi.md#addComment) | **POST** /comments | Create a new comment
*CommentsApi* | [**getComment**](docs/CommentsApi.md#getComment) | **GET** /comments/{id} | Get the comment with the specified ID
*CommentsApi* | [**getComments**](docs/CommentsApi.md#getComments) | **GET** /comments | Get all comments viewable by the current user
*CommentsApi* | [**getReplies**](docs/CommentsApi.md#getReplies) | **GET** /comments/{id}/replies | Get all reply comments for the comment with the specified ID
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadFile) | **GET** /files | Download attachment file from the attachment with the specified Jama URL
*FiltersApi* | [**getFilter**](docs/FiltersApi.md#getFilter) | **GET** /filters/{id} | Get the filter with the specified ID
*FiltersApi* | [**getFilters**](docs/FiltersApi.md#getFilters) | **GET** /filters | Get all filters in the project with the specified ID viewable by the current user
*FiltersApi* | [**getResults**](docs/FiltersApi.md#getResults) | **GET** /filters/{id}/results | Get all result items for the filter with the specified ID
*ItemsApi* | [**addAttachmentToItem**](docs/ItemsApi.md#addAttachmentToItem) | **POST** /items/{id}/attachments | Add an existing attachment to the item with the specified ID
*ItemsApi* | [**addItem**](docs/ItemsApi.md#addItem) | **POST** /items | Create a new item
*ItemsApi* | [**addItemLink**](docs/ItemsApi.md#addItemLink) | **POST** /items/{id}/links | Create a new link for the item with the specified ID
*ItemsApi* | [**addTagToItem**](docs/ItemsApi.md#addTagToItem) | **POST** /items/{id}/tags | Add an existing tag to the item with the specified ID
*ItemsApi* | [**breakSyncOnItem**](docs/ItemsApi.md#breakSyncOnItem) | **DELETE** /items/{id}/synceditems/{syncedItemId} | Remove an existing item from the Global ID pool of the item with the specified ID (break sync)
*ItemsApi* | [**connectItemToGlobalIDPool**](docs/ItemsApi.md#connectItemToGlobalIDPool) | **POST** /items/{id}/synceditems | Add an existing item to the Global ID pool of the item with the specified ID
*ItemsApi* | [**deleteItem**](docs/ItemsApi.md#deleteItem) | **DELETE** /items/{id} | Delete the item with the specified ID (item becomes inactive and can be un-deleted if necessary)
*ItemsApi* | [**deleteItemLink**](docs/ItemsApi.md#deleteItemLink) | **DELETE** /items/{id}/links/{linkId} | Delete the link with the specified ID
*ItemsApi* | [**duplicateItem**](docs/ItemsApi.md#duplicateItem) | **POST** /items/{id}/duplicate | Create a duplicate of item
*ItemsApi* | [**executeTransition**](docs/ItemsApi.md#executeTransition) | **POST** /items/{id}/workflowtransitions | Executes a workflow transition for the item with the specified ID. Valid transitions can be found at /items/{id}/workflowtransitionoptions
*ItemsApi* | [**getActivities**](docs/ItemsApi.md#getActivities) | **GET** /items/{id}/activities | Get all activities for the item with the specified ID
*ItemsApi* | [**getAttachments**](docs/ItemsApi.md#getAttachments) | **GET** /items/{id}/attachments | Get all attachments for the item with the specified ID
*ItemsApi* | [**getChildItems**](docs/ItemsApi.md#getChildItems) | **GET** /items/{id}/children | Get all children items for the item with the specified ID
*ItemsApi* | [**getDownstreamRelated**](docs/ItemsApi.md#getDownstreamRelated) | **GET** /items/{id}/downstreamrelated | Get all downstream related items for the item with the specified ID
*ItemsApi* | [**getDownstreamRelationships**](docs/ItemsApi.md#getDownstreamRelationships) | **GET** /items/{id}/downstreamrelationships | Get all downstream relationships for the item with the specified ID
*ItemsApi* | [**getItem**](docs/ItemsApi.md#getItem) | **GET** /items/{id} | Get the item with the specified ID
*ItemsApi* | [**getItemComments**](docs/ItemsApi.md#getItemComments) | **GET** /items/{id}/comments | Get all comments for the item with the specified ID
*ItemsApi* | [**getItemLinks**](docs/ItemsApi.md#getItemLinks) | **GET** /items/{id}/links | Get all links for the item with the specified ID
*ItemsApi* | [**getItems**](docs/ItemsApi.md#getItems) | **GET** /items | Get all items in the project with the specified ID
*ItemsApi* | [**getLinkById**](docs/ItemsApi.md#getLinkById) | **GET** /items/{id}/links/{linkId} | Get the link with the specified ID
*ItemsApi* | [**getLocation**](docs/ItemsApi.md#getLocation) | **GET** /items/{id}/location | Get the location for the item with the specified ID
*ItemsApi* | [**getLock**](docs/ItemsApi.md#getLock) | **GET** /items/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
*ItemsApi* | [**getParentItem**](docs/ItemsApi.md#getParentItem) | **GET** /items/{id}/parent | Get the parent item for the item with the specified ID
*ItemsApi* | [**getSyncItems**](docs/ItemsApi.md#getSyncItems) | **GET** /items/{id}/synceditems | Get all synchronized items for the item with the specified ID
*ItemsApi* | [**getSyncStatus**](docs/ItemsApi.md#getSyncStatus) | **GET** /items/{id}/synceditems/{syncedItemId}/syncstatus | Get the sync status for the synced item with the specified ID
*ItemsApi* | [**getTagOnItem**](docs/ItemsApi.md#getTagOnItem) | **GET** /items/{id}/tags/{tagId} | Get the tag with the specified ID
*ItemsApi* | [**getTagsOnItem**](docs/ItemsApi.md#getTagsOnItem) | **GET** /items/{id}/tags | Get all tags for the item with the specified ID
*ItemsApi* | [**getUpstreamRelated**](docs/ItemsApi.md#getUpstreamRelated) | **GET** /items/{id}/upstreamrelated | Get all upstream related items for the item with the specified ID
*ItemsApi* | [**getUpstreamRelationships**](docs/ItemsApi.md#getUpstreamRelationships) | **GET** /items/{id}/upstreamrelationships | Get all upstream relationships for the item with the specified ID
*ItemsApi* | [**getVersionOnItem2**](docs/ItemsApi.md#getVersionOnItem2) | **GET** /items/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*ItemsApi* | [**getVersionedItem2**](docs/ItemsApi.md#getVersionedItem2) | **GET** /items/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the item at the specified version
*ItemsApi* | [**getVersionsOnItem2**](docs/ItemsApi.md#getVersionsOnItem2) | **GET** /items/{id}/versions | Get all versions for the item with the specified ID
*ItemsApi* | [**getWorkflowTransitionOptions**](docs/ItemsApi.md#getWorkflowTransitionOptions) | **GET** /items/{id}/workflowtransitionoptions | Get all valid workflow transitions that can be made on the item with the specified ID
*ItemsApi* | [**patchItem**](docs/ItemsApi.md#patchItem) | **PATCH** /items/{id} | Update the item with the specified ID
*ItemsApi* | [**putItem**](docs/ItemsApi.md#putItem) | **PUT** /items/{id} | Update the item with the specified ID
*ItemsApi* | [**removeAttachmentFromItem**](docs/ItemsApi.md#removeAttachmentFromItem) | **DELETE** /items/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
*ItemsApi* | [**removeTagFromItem**](docs/ItemsApi.md#removeTagFromItem) | **DELETE** /items/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
*ItemsApi* | [**updateItemLink**](docs/ItemsApi.md#updateItemLink) | **PUT** /items/{id}/links/{linkId} | Update the link with the specified ID
*ItemsApi* | [**updateLocation**](docs/ItemsApi.md#updateLocation) | **PUT** /items/{id}/location | Update the location for the item with the specified ID as an asynchronous request (a successful response signifies that the work was started and a work identifier is given. This identifier will be used in a future feature). Any child items are moved along with this item. Note that this currently only supports moving items between projects
*ItemsApi* | [**updateLock**](docs/ItemsApi.md#updateLock) | **PUT** /items/{id}/lock | Update the locked state of the item with the specified ID
*ItemtypesApi* | [**getItem**](docs/ItemtypesApi.md#getItem) | **GET** /itemtypes/{itemTypeId} | Get the item type with the specified ID
*ItemtypesApi* | [**getItemTypes**](docs/ItemtypesApi.md#getItemTypes) | **GET** /itemtypes | Get all item types
*PicklistoptionsApi* | [**getPicklistOption**](docs/PicklistoptionsApi.md#getPicklistOption) | **GET** /picklistoptions/{picklistOptionId} | Get the pick list option with the specified ID
*PicklistoptionsApi* | [**updatePicklistOption**](docs/PicklistoptionsApi.md#updatePicklistOption) | **PUT** /picklistoptions/{picklistOptionId} | Update the pick list option with the specified ID
*PicklistsApi* | [**addPickListOptionToPickList**](docs/PicklistsApi.md#addPickListOptionToPickList) | **POST** /picklists/{picklistId}/options | Create a new pick list option for the pick list with the specified ID
*PicklistsApi* | [**getPickList**](docs/PicklistsApi.md#getPickList) | **GET** /picklists/{picklistId} | Get the pick list with the specified ID
*PicklistsApi* | [**getPickListOptions**](docs/PicklistsApi.md#getPickListOptions) | **GET** /picklists/{picklistId}/options | Get all pick list options for the pick list with the specified ID
*PicklistsApi* | [**getPickLists**](docs/PicklistsApi.md#getPickLists) | **GET** /picklists | Get all pick lists
*ProjectsApi* | [**addProject**](docs/ProjectsApi.md#addProject) | **POST** /projects | Create a new project
*ProjectsApi* | [**getItemTypesInProject**](docs/ProjectsApi.md#getItemTypesInProject) | **GET** /projects/{projectId}/itemtypes | Get all item types for the project with the specified ID
*ProjectsApi* | [**getProject**](docs/ProjectsApi.md#getProject) | **GET** /projects/{projectId} | Get the project with the specified ID
*ProjectsApi* | [**getProjects**](docs/ProjectsApi.md#getProjects) | **GET** /projects | Get all projects
*ProjectsApi* | [**getTagsInProject**](docs/ProjectsApi.md#getTagsInProject) | **GET** /projects/{projectId}/tags | Get all tags for the project with the specified ID
*ProjectsApi* | [**postAttachment**](docs/ProjectsApi.md#postAttachment) | **POST** /projects/{projectId}/attachments | Create a new attachment in the project with the specified ID
*ProjectsApi* | [**putProject**](docs/ProjectsApi.md#putProject) | **PUT** /projects/{projectId} | Update the project with the specified ID
*RelationshipsApi* | [**clearSuspectLink**](docs/RelationshipsApi.md#clearSuspectLink) | **DELETE** /relationships/{relationshipId}/suspect | Remove an existing suspect link for the relationship with the specified ID
*RelationshipsApi* | [**createRelationship**](docs/RelationshipsApi.md#createRelationship) | **POST** /relationships | Create a new relationship
*RelationshipsApi* | [**deleteRelationship**](docs/RelationshipsApi.md#deleteRelationship) | **DELETE** /relationships/{relationshipId} | Delete the relationship with the specified ID
*RelationshipsApi* | [**getRelationship**](docs/RelationshipsApi.md#getRelationship) | **GET** /relationships/{relationshipId} | Get the relationship with the specified ID
*RelationshipsApi* | [**getRelationships**](docs/RelationshipsApi.md#getRelationships) | **GET** /relationships | Get all relationships in the project with the specified ID
*RelationshipsApi* | [**updateRelationship**](docs/RelationshipsApi.md#updateRelationship) | **PUT** /relationships/{relationshipId} | Update the relationship with the specified ID
*RelationshiptypesApi* | [**getRelationshipType**](docs/RelationshiptypesApi.md#getRelationshipType) | **GET** /relationshiptypes/{id} | Get the relationship type with the specified ID
*RelationshiptypesApi* | [**getRelationshipTypes**](docs/RelationshiptypesApi.md#getRelationshipTypes) | **GET** /relationshiptypes | Get all relationship types
*ReleasesApi* | [**addRelease**](docs/ReleasesApi.md#addRelease) | **POST** /releases | Create a new release
*ReleasesApi* | [**getRelease**](docs/ReleasesApi.md#getRelease) | **GET** /releases/{releaseId} | Get the release with the specified ID
*ReleasesApi* | [**getReleases**](docs/ReleasesApi.md#getReleases) | **GET** /releases | Get all releases in the project with the specified ID
*ReleasesApi* | [**putRelease**](docs/ReleasesApi.md#putRelease) | **PUT** /releases/{releaseId} | Update the release with the specified ID
*SystemApi* | [**getDomains**](docs/SystemApi.md#getDomains) | **GET** /system/settings/corsdomains | Get the current CORS domain whitelist
*SystemApi* | [**setDomains**](docs/SystemApi.md#setDomains) | **POST** /system/settings/corsdomains | Update CORS domain whitelist
*TagsApi* | [**addTagToProject**](docs/TagsApi.md#addTagToProject) | **POST** /tags | Create a new tag in the project with the specified ID
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /tags/{id} | Delete the tag with the specified ID
*TagsApi* | [**getItemsUsingTag**](docs/TagsApi.md#getItemsUsingTag) | **GET** /tags/{id}/items | Get all items that have the tag with the specified ID
*TagsApi* | [**getTag**](docs/TagsApi.md#getTag) | **GET** /tags/{id} | Get the tag with the specified ID
*TagsApi* | [**getTagsInProject**](docs/TagsApi.md#getTagsInProject) | **GET** /tags | Get all tags for the project with the specified ID
*TagsApi* | [**putTag**](docs/TagsApi.md#putTag) | **PUT** /tags/{id} | Update the tag with the specified ID
*TestcyclesApi* | [**deleteTestCycle**](docs/TestcyclesApi.md#deleteTestCycle) | **DELETE** /testcycles/{testCycleId} | Delete the test cycle with the specified ID, including the test runs in the test cycle
*TestcyclesApi* | [**getTestCycle**](docs/TestcyclesApi.md#getTestCycle) | **GET** /testcycles/{testCycleId} | Get the test cycle with the specified ID
*TestcyclesApi* | [**getTestCycleTestGroup**](docs/TestcyclesApi.md#getTestCycleTestGroup) | **GET** /testcycles/{testCycleId}/testgroup/{testGroupId} | Get the test cycle test group for the test cycle with the specified ID
*TestcyclesApi* | [**getTestRuns**](docs/TestcyclesApi.md#getTestRuns) | **GET** /testcycles/{testCycleId}/testruns | Get all test runs for the test cycle with the specified ID
*TestcyclesApi* | [**getVersionOnItem3**](docs/TestcyclesApi.md#getVersionOnItem3) | **GET** /testcycles/{testCycleId}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*TestcyclesApi* | [**getVersionedItem3**](docs/TestcyclesApi.md#getVersionedItem3) | **GET** /testcycles/{testCycleId}/versions/{versionNum}/versioneditem | Get the  snapshot of the test cycle at the specified version
*TestcyclesApi* | [**getVersionsOnItem3**](docs/TestcyclesApi.md#getVersionsOnItem3) | **GET** /testcycles/{testCycleId}/versions | Get all versions for the item with the specified ID
*TestcyclesApi* | [**patchTestCycle**](docs/TestcyclesApi.md#patchTestCycle) | **PATCH** /testcycles/{testCycleId} | Update the test cycle with the specified ID, including regenerating the test runs in the test cycle
*TestcyclesApi* | [**updateTestCycle**](docs/TestcyclesApi.md#updateTestCycle) | **PUT** /testcycles/{testCycleId} | Update the test cycle with the specified ID, including regenerating the test runs in the test cycle
*TestplansApi* | [**addAttachmentToItem**](docs/TestplansApi.md#addAttachmentToItem) | **POST** /testplans/{id}/attachments | Add an existing attachment to the item with the specified ID
*TestplansApi* | [**addItemLink**](docs/TestplansApi.md#addItemLink) | **POST** /testplans/{id}/links | Create a new link for the item with the specified ID
*TestplansApi* | [**addTagToItem**](docs/TestplansApi.md#addTagToItem) | **POST** /testplans/{id}/tags | Add an existing tag to the item with the specified ID
*TestplansApi* | [**addTestGroup**](docs/TestplansApi.md#addTestGroup) | **POST** /testplans/{id}/testgroups | Create a new test group to the test plan with the specified ID
*TestplansApi* | [**createTestCycle**](docs/TestplansApi.md#createTestCycle) | **POST** /testplans/{id}/testcycles | Create a new test cycle
*TestplansApi* | [**createTestPlan**](docs/TestplansApi.md#createTestPlan) | **POST** /testplans | Create a new test plan
*TestplansApi* | [**deleteItemLink**](docs/TestplansApi.md#deleteItemLink) | **DELETE** /testplans/{id}/links/{linkId} | Delete the link with the specified ID
*TestplansApi* | [**deleteTestCase**](docs/TestplansApi.md#deleteTestCase) | **DELETE** /testplans/{id}/testgroups/{testGroupId}/testcases/{testCaseId} | Remove an existing test case from the test group
*TestplansApi* | [**deleteTestGroup**](docs/TestplansApi.md#deleteTestGroup) | **DELETE** /testplans/{id}/testgroups/{testGroupId} | Delete the test group with the specified ID
*TestplansApi* | [**deleteTestPlan**](docs/TestplansApi.md#deleteTestPlan) | **DELETE** /testplans/{id} | Delete the test plan with the specified ID
*TestplansApi* | [**getActivities**](docs/TestplansApi.md#getActivities) | **GET** /testplans/{id}/activities | Get all activities for the test plan with the specified ID
*TestplansApi* | [**getAttachments**](docs/TestplansApi.md#getAttachments) | **GET** /testplans/{id}/attachments | Get all attachments for the item with the specified ID
*TestplansApi* | [**getDownstreamRelated**](docs/TestplansApi.md#getDownstreamRelated) | **GET** /testplans/{id}/downstreamrelated | Get all downstream related items for the test plan with the specified ID
*TestplansApi* | [**getDownstreamRelationships**](docs/TestplansApi.md#getDownstreamRelationships) | **GET** /testplans/{id}/downstreamrelationships | Get all downstream relationships for the test plan with the specified ID
*TestplansApi* | [**getItemComments**](docs/TestplansApi.md#getItemComments) | **GET** /testplans/{id}/comments | Get all comments for the item with the specified ID
*TestplansApi* | [**getItemLinks**](docs/TestplansApi.md#getItemLinks) | **GET** /testplans/{id}/links | Get all links for the item with the specified ID
*TestplansApi* | [**getLinkById**](docs/TestplansApi.md#getLinkById) | **GET** /testplans/{id}/links/{linkId} | Get the link with the specified ID
*TestplansApi* | [**getLock**](docs/TestplansApi.md#getLock) | **GET** /testplans/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
*TestplansApi* | [**getTagOnItem**](docs/TestplansApi.md#getTagOnItem) | **GET** /testplans/{id}/tags/{tagId} | Get the tag with the specified ID
*TestplansApi* | [**getTagsOnItem**](docs/TestplansApi.md#getTagsOnItem) | **GET** /testplans/{id}/tags | Get all tags for the item with the specified ID
*TestplansApi* | [**getTestCaseById**](docs/TestplansApi.md#getTestCaseById) | **GET** /testplans/{id}/testgroups/{testGroupId}/testcases/{testCaseId} | Get the test case with the specified ID
*TestplansApi* | [**getTestCases**](docs/TestplansApi.md#getTestCases) | **GET** /testplans/{id}/testgroups/{testGroupId}/testcases | Get all test cases associated with the test group with the specified ID
*TestplansApi* | [**getTestCycles**](docs/TestplansApi.md#getTestCycles) | **GET** /testplans/{id}/testcycles | Get all test cycles for the test plan with the specified ID
*TestplansApi* | [**getTestGroupById**](docs/TestplansApi.md#getTestGroupById) | **GET** /testplans/{id}/testgroups/{testGroupId} | Get the test group with the specified ID
*TestplansApi* | [**getTestGroups**](docs/TestplansApi.md#getTestGroups) | **GET** /testplans/{id}/testgroups | Get all test groups for the test plan with the specified ID
*TestplansApi* | [**getTestPlan**](docs/TestplansApi.md#getTestPlan) | **GET** /testplans/{id} | Get the test plan with the specified ID
*TestplansApi* | [**getTestPlans**](docs/TestplansApi.md#getTestPlans) | **GET** /testplans | Get all test plans in the project with the specified ID
*TestplansApi* | [**getUpstreamRelated**](docs/TestplansApi.md#getUpstreamRelated) | **GET** /testplans/{id}/upstreamrelated | Get all upstream related items for the test plan with the specified ID
*TestplansApi* | [**getUpstreamRelationships**](docs/TestplansApi.md#getUpstreamRelationships) | **GET** /testplans/{id}/upstreamrelationships | Get all upstream relationships for the test plan with the specified ID
*TestplansApi* | [**getVersionOnItem4**](docs/TestplansApi.md#getVersionOnItem4) | **GET** /testplans/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*TestplansApi* | [**getVersionedItem4**](docs/TestplansApi.md#getVersionedItem4) | **GET** /testplans/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the test plan at the specified version
*TestplansApi* | [**getVersionsOnItem4**](docs/TestplansApi.md#getVersionsOnItem4) | **GET** /testplans/{id}/versions | Get all versions for the item with the specified ID
*TestplansApi* | [**patchTestPlan**](docs/TestplansApi.md#patchTestPlan) | **PATCH** /testplans/{id} | Update the test plan with the specified ID
*TestplansApi* | [**postTestCase**](docs/TestplansApi.md#postTestCase) | **POST** /testplans/{id}/testgroups/{testGroupId}/testcases | Add an existing test case to the test group with the specified ID
*TestplansApi* | [**removeAttachmentFromItem**](docs/TestplansApi.md#removeAttachmentFromItem) | **DELETE** /testplans/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
*TestplansApi* | [**removeTagFromItem**](docs/TestplansApi.md#removeTagFromItem) | **DELETE** /testplans/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
*TestplansApi* | [**toggleArchivedStatus**](docs/TestplansApi.md#toggleArchivedStatus) | **PUT** /testplans/{id}/archived | Update the archived status of the test plan
*TestplansApi* | [**updateItemLink**](docs/TestplansApi.md#updateItemLink) | **PUT** /testplans/{id}/links/{linkId} | Update the link with the specified ID
*TestplansApi* | [**updateLock**](docs/TestplansApi.md#updateLock) | **PUT** /testplans/{id}/lock | Update the locked state of the item with the specified ID
*TestplansApi* | [**updateTestGroup**](docs/TestplansApi.md#updateTestGroup) | **PUT** /testplans/{id}/testgroups/{testGroupId} | Update the test group with the specified ID
*TestplansApi* | [**updateTestPlan**](docs/TestplansApi.md#updateTestPlan) | **PUT** /testplans/{id} | Update the test plan with the specified ID
*TestrunsApi* | [**addAttachmentToItem**](docs/TestrunsApi.md#addAttachmentToItem) | **POST** /testruns/{id}/attachments | Add an existing attachment to the item with the specified ID
*TestrunsApi* | [**addItemLink**](docs/TestrunsApi.md#addItemLink) | **POST** /testruns/{id}/links | Create a new link for the item with the specified ID
*TestrunsApi* | [**addTagToItem**](docs/TestrunsApi.md#addTagToItem) | **POST** /testruns/{id}/tags | Add an existing tag to the item with the specified ID
*TestrunsApi* | [**deleteItemLink**](docs/TestrunsApi.md#deleteItemLink) | **DELETE** /testruns/{id}/links/{linkId} | Delete the link with the specified ID
*TestrunsApi* | [**deleteTestRun**](docs/TestrunsApi.md#deleteTestRun) | **DELETE** /testruns/{id} | Delete the test run with the specified ID
*TestrunsApi* | [**getActivities**](docs/TestrunsApi.md#getActivities) | **GET** /testruns/{id}/activities | Get all activities for the test run with the specified ID
*TestrunsApi* | [**getAttachments**](docs/TestrunsApi.md#getAttachments) | **GET** /testruns/{id}/attachments | Get all attachments for the item with the specified ID
*TestrunsApi* | [**getDownstreamRelated**](docs/TestrunsApi.md#getDownstreamRelated) | **GET** /testruns/{id}/downstreamrelated | Get all downstream related items for the test run with the specified ID
*TestrunsApi* | [**getDownstreamRelationships**](docs/TestrunsApi.md#getDownstreamRelationships) | **GET** /testruns/{id}/downstreamrelationships | Get all downstream relationships for the test run with the specified ID
*TestrunsApi* | [**getItemComments**](docs/TestrunsApi.md#getItemComments) | **GET** /testruns/{id}/comments | Get all comments for the item with the specified ID
*TestrunsApi* | [**getItemLinks**](docs/TestrunsApi.md#getItemLinks) | **GET** /testruns/{id}/links | Get all links for the item with the specified ID
*TestrunsApi* | [**getLinkById**](docs/TestrunsApi.md#getLinkById) | **GET** /testruns/{id}/links/{linkId} | Get the link with the specified ID
*TestrunsApi* | [**getLock**](docs/TestrunsApi.md#getLock) | **GET** /testruns/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
*TestrunsApi* | [**getTagOnItem**](docs/TestrunsApi.md#getTagOnItem) | **GET** /testruns/{id}/tags/{tagId} | Get the tag with the specified ID
*TestrunsApi* | [**getTagsOnItem**](docs/TestrunsApi.md#getTagsOnItem) | **GET** /testruns/{id}/tags | Get all tags for the item with the specified ID
*TestrunsApi* | [**getTestRun**](docs/TestrunsApi.md#getTestRun) | **GET** /testruns/{id} | Get the test run with the specified ID
*TestrunsApi* | [**getTestRuns**](docs/TestrunsApi.md#getTestRuns) | **GET** /testruns | Search for test runs associated with test cases, test plans, an test cycles
*TestrunsApi* | [**getUpstreamRelated**](docs/TestrunsApi.md#getUpstreamRelated) | **GET** /testruns/{id}/upstreamrelated | Get all upstream related items for the test run with the specified ID
*TestrunsApi* | [**getUpstreamRelationships**](docs/TestrunsApi.md#getUpstreamRelationships) | **GET** /testruns/{id}/upstreamrelationships | Get all upstream relationships for the test run with the specified ID
*TestrunsApi* | [**getVersionOnItem5**](docs/TestrunsApi.md#getVersionOnItem5) | **GET** /testruns/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
*TestrunsApi* | [**getVersionedItem5**](docs/TestrunsApi.md#getVersionedItem5) | **GET** /testruns/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the test run at the specified version
*TestrunsApi* | [**getVersionsOnItem5**](docs/TestrunsApi.md#getVersionsOnItem5) | **GET** /testruns/{id}/versions | Get all versions for the item with the specified ID
*TestrunsApi* | [**makeTestRunCurrent**](docs/TestrunsApi.md#makeTestRunCurrent) | **POST** /testruns/{id}/updatedtestcase | Delete the current test run and then create a new test run based on the latest test case version.
*TestrunsApi* | [**patchTestRun**](docs/TestrunsApi.md#patchTestRun) | **PATCH** /testruns/{id} | Update the execution results for the test run with the specified ID
*TestrunsApi* | [**removeAttachmentFromItem**](docs/TestrunsApi.md#removeAttachmentFromItem) | **DELETE** /testruns/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
*TestrunsApi* | [**removeTagFromItem**](docs/TestrunsApi.md#removeTagFromItem) | **DELETE** /testruns/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
*TestrunsApi* | [**updateItemLink**](docs/TestrunsApi.md#updateItemLink) | **PUT** /testruns/{id}/links/{linkId} | Update the link with the specified ID
*TestrunsApi* | [**updateLock**](docs/TestrunsApi.md#updateLock) | **PUT** /testruns/{id}/lock | Update the locked state of the item with the specified ID
*TestrunsApi* | [**updateTestRun**](docs/TestrunsApi.md#updateTestRun) | **PUT** /testruns/{id} | Update the execution results for the test run with the specified ID
*UsergroupsApi* | [**addUserGroup**](docs/UsergroupsApi.md#addUserGroup) | **POST** /usergroups | Create a new user group
*UsergroupsApi* | [**addUserToGroup**](docs/UsergroupsApi.md#addUserToGroup) | **POST** /usergroups/{id}/users | Add an existing user to the user group with the specified ID
*UsergroupsApi* | [**deleteItem**](docs/UsergroupsApi.md#deleteItem) | **DELETE** /usergroups/{id} | Delete the user group with the specified ID
*UsergroupsApi* | [**getGroup**](docs/UsergroupsApi.md#getGroup) | **GET** /usergroups/{id} | Get the user group with the specified ID
*UsergroupsApi* | [**getGroupUsers**](docs/UsergroupsApi.md#getGroupUsers) | **GET** /usergroups/{id}/users | Get all users for the user group with the specified ID
*UsergroupsApi* | [**getUsers**](docs/UsergroupsApi.md#getUsers) | **GET** /usergroups | Get all user groups
*UsergroupsApi* | [**removeUserFromGroup**](docs/UsergroupsApi.md#removeUserFromGroup) | **DELETE** /usergroups/{id}/users/{userId} | Remove an existing user from the user group with the specified ID
*UsergroupsApi* | [**updateUserGroup**](docs/UsergroupsApi.md#updateUserGroup) | **PUT** /usergroups/{id} | Update the user group with the specified ID
*UsersApi* | [**addUser**](docs/UsersApi.md#addUser) | **POST** /users | Create a new user
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getCurrentUser) | **GET** /users/current | Gets the current user
*UsersApi* | [**getFavoriteFiltersForCurrentUser**](docs/UsersApi.md#getFavoriteFiltersForCurrentUser) | **GET** /users/current/favoritefilters | Gets the current user&#39;s favorite filters
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{userId} | Get the user with the specified ID
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | Get all users
*UsersApi* | [**putUser**](docs/UsersApi.md#putUser) | **PUT** /users/{userId} | Update the user with the specified ID
*UsersApi* | [**setActiveStatus**](docs/UsersApi.md#setActiveStatus) | **PUT** /users/{userId}/active | Update the active status for the user with the specified ID


## Documentation for Models

 - [AbstractItem](docs/AbstractItem.md)
 - [AbstractItemDataListWrapper](docs/AbstractItemDataListWrapper.md)
 - [AbstractItemDataWrapper](docs/AbstractItemDataWrapper.md)
 - [AbstractRestResponse](docs/AbstractRestResponse.md)
 - [AbstractVersionedItem](docs/AbstractVersionedItem.md)
 - [AbstractVersionedItemDataWrapper](docs/AbstractVersionedItemDataWrapper.md)
 - [Activity](docs/Activity.md)
 - [ActivityDataListWrapper](docs/ActivityDataListWrapper.md)
 - [ActivityDataWrapper](docs/ActivityDataWrapper.md)
 - [AllowedResource](docs/AllowedResource.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentDataListWrapper](docs/AttachmentDataListWrapper.md)
 - [AttachmentDataWrapper](docs/AttachmentDataWrapper.md)
 - [Baseline](docs/Baseline.md)
 - [BaselineDataListWrapper](docs/BaselineDataListWrapper.md)
 - [BaselineDataWrapper](docs/BaselineDataWrapper.md)
 - [BaselineItem](docs/BaselineItem.md)
 - [BaselineItemDataListWrapper](docs/BaselineItemDataListWrapper.md)
 - [BaselineItemDataWrapper](docs/BaselineItemDataWrapper.md)
 - [BaselineLocation](docs/BaselineLocation.md)
 - [BaselineOrigin](docs/BaselineOrigin.md)
 - [BaselineParent](docs/BaselineParent.md)
 - [BodyPart](docs/BodyPart.md)
 - [CollectionSummary](docs/CollectionSummary.md)
 - [Comment](docs/Comment.md)
 - [CommentBody](docs/CommentBody.md)
 - [CommentDataListWrapper](docs/CommentDataListWrapper.md)
 - [CommentDataWrapper](docs/CommentDataWrapper.md)
 - [CommentLocation](docs/CommentLocation.md)
 - [ContentDisposition](docs/ContentDisposition.md)
 - [CreatedResponse](docs/CreatedResponse.md)
 - [CrossOriginDomainWhiteList](docs/CrossOriginDomainWhiteList.md)
 - [DerivedDataFailure](docs/DerivedDataFailure.md)
 - [DerivedDataHealthDetailsReport](docs/DerivedDataHealthDetailsReport.md)
 - [DerivedDataHealthReport](docs/DerivedDataHealthReport.md)
 - [DerivedDataHealthReportDataWrapper](docs/DerivedDataHealthReportDataWrapper.md)
 - [DuplicateConfig](docs/DuplicateConfig.md)
 - [Filter](docs/Filter.md)
 - [FilterDataListWrapper](docs/FilterDataListWrapper.md)
 - [FilterDataWrapper](docs/FilterDataWrapper.md)
 - [FilterField](docs/FilterField.md)
 - [FilterOrderRule](docs/FilterOrderRule.md)
 - [FilterQuery](docs/FilterQuery.md)
 - [FilterRule](docs/FilterRule.md)
 - [FormDataBodyPart](docs/FormDataBodyPart.md)
 - [FormDataContentDisposition](docs/FormDataContentDisposition.md)
 - [FormDataMultiPart](docs/FormDataMultiPart.md)
 - [Item](docs/Item.md)
 - [ItemDataListWrapper](docs/ItemDataListWrapper.md)
 - [ItemDataWrapper](docs/ItemDataWrapper.md)
 - [ItemType](docs/ItemType.md)
 - [ItemTypeDataListWrapper](docs/ItemTypeDataListWrapper.md)
 - [ItemTypeDataWrapper](docs/ItemTypeDataWrapper.md)
 - [ItemTypeField](docs/ItemTypeField.md)
 - [ItemTypeWidget](docs/ItemTypeWidget.md)
 - [Link](docs/Link.md)
 - [LinkDataListWrapper](docs/LinkDataListWrapper.md)
 - [LinkDataWrapper](docs/LinkDataWrapper.md)
 - [Location](docs/Location.md)
 - [LocationDataWrapper](docs/LocationDataWrapper.md)
 - [Lock](docs/Lock.md)
 - [LockDataWrapper](docs/LockDataWrapper.md)
 - [MediaType](docs/MediaType.md)
 - [MessageBodyWorkers](docs/MessageBodyWorkers.md)
 - [MetaListWrapper](docs/MetaListWrapper.md)
 - [MetaWrapper](docs/MetaWrapper.md)
 - [MultiPart](docs/MultiPart.md)
 - [PageInfo](docs/PageInfo.md)
 - [ParameterizedHeader](docs/ParameterizedHeader.md)
 - [Parent](docs/Parent.md)
 - [PickList](docs/PickList.md)
 - [PickListDataListWrapper](docs/PickListDataListWrapper.md)
 - [PickListDataWrapper](docs/PickListDataWrapper.md)
 - [PickListOption](docs/PickListOption.md)
 - [PickListOptionDataListWrapper](docs/PickListOptionDataListWrapper.md)
 - [PickListOptionDataWrapper](docs/PickListOptionDataWrapper.md)
 - [Project](docs/Project.md)
 - [ProjectDataListWrapper](docs/ProjectDataListWrapper.md)
 - [ProjectDataWrapper](docs/ProjectDataWrapper.md)
 - [Providers](docs/Providers.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipDataListWrapper](docs/RelationshipDataListWrapper.md)
 - [RelationshipDataWrapper](docs/RelationshipDataWrapper.md)
 - [RelationshipType](docs/RelationshipType.md)
 - [RelationshipTypeDataListWrapper](docs/RelationshipTypeDataListWrapper.md)
 - [RelationshipTypeDataWrapper](docs/RelationshipTypeDataWrapper.md)
 - [Release](docs/Release.md)
 - [ReleaseDataListWrapper](docs/ReleaseDataListWrapper.md)
 - [ReleaseDataWrapper](docs/ReleaseDataWrapper.md)
 - [RequestActiveStatus](docs/RequestActiveStatus.md)
 - [RequestArchivedStatus](docs/RequestArchivedStatus.md)
 - [RequestAttachment](docs/RequestAttachment.md)
 - [RequestComment](docs/RequestComment.md)
 - [RequestCommentBody](docs/RequestCommentBody.md)
 - [RequestCommentLocation](docs/RequestCommentLocation.md)
 - [RequestDerivedDataHealthReport](docs/RequestDerivedDataHealthReport.md)
 - [RequestGroupUser](docs/RequestGroupUser.md)
 - [RequestItem](docs/RequestItem.md)
 - [RequestItemAttachment](docs/RequestItemAttachment.md)
 - [RequestItemSyncedItem](docs/RequestItemSyncedItem.md)
 - [RequestItemTag](docs/RequestItemTag.md)
 - [RequestLink](docs/RequestLink.md)
 - [RequestLocation](docs/RequestLocation.md)
 - [RequestLock](docs/RequestLock.md)
 - [RequestMoveLocation](docs/RequestMoveLocation.md)
 - [RequestMoveParent](docs/RequestMoveParent.md)
 - [RequestParent](docs/RequestParent.md)
 - [RequestPatchOperation](docs/RequestPatchOperation.md)
 - [RequestPickListOption](docs/RequestPickListOption.md)
 - [RequestProject](docs/RequestProject.md)
 - [RequestRelationship](docs/RequestRelationship.md)
 - [RequestRelease](docs/RequestRelease.md)
 - [RequestTag](docs/RequestTag.md)
 - [RequestTestCycle](docs/RequestTestCycle.md)
 - [RequestTestGroup](docs/RequestTestGroup.md)
 - [RequestTestGroupTestCase](docs/RequestTestGroupTestCase.md)
 - [RequestTestPlan](docs/RequestTestPlan.md)
 - [RequestTestRun](docs/RequestTestRun.md)
 - [RequestTransition](docs/RequestTransition.md)
 - [RequestUser](docs/RequestUser.md)
 - [RequestUserGroup](docs/RequestUserGroup.md)
 - [SyncStatus](docs/SyncStatus.md)
 - [SyncStatusDataWrapper](docs/SyncStatusDataWrapper.md)
 - [Tag](docs/Tag.md)
 - [TagDataListWrapper](docs/TagDataListWrapper.md)
 - [TagDataWrapper](docs/TagDataWrapper.md)
 - [TestCycle](docs/TestCycle.md)
 - [TestCycleDataListWrapper](docs/TestCycleDataListWrapper.md)
 - [TestCycleDataWrapper](docs/TestCycleDataWrapper.md)
 - [TestCycleTestGroup](docs/TestCycleTestGroup.md)
 - [TestCycleTestGroupDataWrapper](docs/TestCycleTestGroupDataWrapper.md)
 - [TestGroup](docs/TestGroup.md)
 - [TestGroupDataListWrapper](docs/TestGroupDataListWrapper.md)
 - [TestGroupDataWrapper](docs/TestGroupDataWrapper.md)
 - [TestPlan](docs/TestPlan.md)
 - [TestPlanDataListWrapper](docs/TestPlanDataListWrapper.md)
 - [TestPlanDataWrapper](docs/TestPlanDataWrapper.md)
 - [TestRun](docs/TestRun.md)
 - [TestRunDataListWrapper](docs/TestRunDataListWrapper.md)
 - [TestRunDataWrapper](docs/TestRunDataWrapper.md)
 - [TestRunGenerationConfig](docs/TestRunGenerationConfig.md)
 - [User](docs/User.md)
 - [UserDataListWrapper](docs/UserDataListWrapper.md)
 - [UserDataWrapper](docs/UserDataWrapper.md)
 - [UserGroup](docs/UserGroup.md)
 - [UserGroupDataListWrapper](docs/UserGroupDataListWrapper.md)
 - [UserGroupDataWrapper](docs/UserGroupDataWrapper.md)
 - [Version](docs/Version.md)
 - [VersionDataListWrapper](docs/VersionDataListWrapper.md)
 - [VersionDataWrapper](docs/VersionDataWrapper.md)
 - [VersionedAttachment](docs/VersionedAttachment.md)
 - [VersionedAttachmentDataWrapper](docs/VersionedAttachmentDataWrapper.md)
 - [VersionedItem](docs/VersionedItem.md)
 - [VersionedItemDataWrapper](docs/VersionedItemDataWrapper.md)
 - [VersionedRelationship](docs/VersionedRelationship.md)
 - [VersionedRelationshipDataListWrapper](docs/VersionedRelationshipDataListWrapper.md)
 - [VersionedTestCycle](docs/VersionedTestCycle.md)
 - [VersionedTestCycleDataWrapper](docs/VersionedTestCycleDataWrapper.md)
 - [VersionedTestPlan](docs/VersionedTestPlan.md)
 - [VersionedTestPlanDataWrapper](docs/VersionedTestPlanDataWrapper.md)
 - [VersionedTestRun](docs/VersionedTestRun.md)
 - [VersionedTestRunDataWrapper](docs/VersionedTestRunDataWrapper.md)
 - [WorkStatus](docs/WorkStatus.md)
 - [WorkStatusDataWrapper](docs/WorkStatusDataWrapper.md)
 - [WorkStepStatus](docs/WorkStepStatus.md)
 - [WorkflowTransition](docs/WorkflowTransition.md)
 - [WorkflowTransitionDataListWrapper](docs/WorkflowTransitionDataListWrapper.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication

### oauth2

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: 
  - token_information: main scope for using Jama REST API


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



