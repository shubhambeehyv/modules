package org.motechproject.hub.mds.service;

import org.motechproject.hub.mds.HubSubscriptionStatus;
import org.motechproject.mds.annotations.Lookup;
import org.motechproject.mds.annotations.LookupField;
import org.motechproject.mds.service.MotechDataService;

import java.util.List;

/**
 * Data Service interface for {@link org.motechproject.hub.mds.HubSubscriptionStatus}.
 * The implementation is generated by the Motech Data Services module at runtime.
 */
public interface HubSubscriptionStatusMDSService extends
        MotechDataService<HubSubscriptionStatus> {

    /**
     * Finds all <code>HubSubscriptionStatus</code>es with given subscription status id.
     *
     * @param subscriptionStatusId the subscription status id
     * @return list of the matching subscription statuses
     */
    @Lookup(name = "By subscriptionStatusId")
    List<HubSubscriptionStatus> findBySubStatus(
            @LookupField(name = "subscriptionStatusId") Integer subscriptionStatusId);

}
