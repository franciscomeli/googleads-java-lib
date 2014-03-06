// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201403.audiencesegmentservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201403.StatementBuilder;
import com.google.api.ads.dfp.axis.v201403.AudienceSegment;
import com.google.api.ads.dfp.axis.v201403.AudienceSegmentServiceInterface;
import com.google.api.ads.dfp.axis.v201403.FirstPartyAudienceSegment;
import com.google.api.ads.dfp.axis.v201403.RuleBasedFirstPartyAudienceSegment;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a first party audience segment's member expiration days.
 * To determine which first party audience segments exist, run
 * GetFirstPartyAudienceSegments.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AudienceSegmentService.getAudienceSegmentsByStatement
 * Tags: AudienceSegmentService.updateAudienceSegments
 *
 * @author Adam Rogal
 */
public class UpdateAudienceSegments {

  // Set the ID of the first party audience segment to update.
  private static final String AUDIENCE_SEGMENT_ID = "INSERT_AUDIENCE_SEGMENT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long audienceSegmentId) throws Exception {
    // Get the AudienceSegmentService.
    AudienceSegmentServiceInterface audienceSegmentService =
        dfpServices.get(session, AudienceSegmentServiceInterface.class);

    // Create a statement to only select a specified first party audience
    // segment.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :audienceSegmentId and type = :type")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("audienceSegmentId", audienceSegmentId)
        .withBindVariableValue("type", "FIRST_PARTY");

    // Get the audience segment.
    RuleBasedFirstPartyAudienceSegment audienceSegment =
        (RuleBasedFirstPartyAudienceSegment) audienceSegmentService
            .getAudienceSegmentsByStatement(statementBuilder.toStatement()).getResults()[0];

    // Update the member expiration days.
    audienceSegment.setMembershipExpirationDays(180);

    // Update the audience segment on the server.
    AudienceSegment[] audienceSegments = audienceSegmentService.updateAudienceSegments(
        new FirstPartyAudienceSegment[] {audienceSegment});

    for (AudienceSegment updatedAudienceSegment : audienceSegments) {
      System.out.printf(
          "Audience segment with ID \"%d\" and name \"%s\" was updated.\n",
          updatedAudienceSegment.getId(), updatedAudienceSegment.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(AUDIENCE_SEGMENT_ID));
  }
}
