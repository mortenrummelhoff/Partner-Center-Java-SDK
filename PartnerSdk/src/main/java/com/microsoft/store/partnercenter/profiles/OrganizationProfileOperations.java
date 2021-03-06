// -----------------------------------------------------------------------
// <copyright file="OrganizationProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.OrganizationProfile;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * The organization profile operations implementation.
 */
public class OrganizationProfileOperations
    extends BasePartnerComponentString
    implements IOrganizationProfile
{
    /**
     * Initializes a new instance of the {@link #OrganizationProfileOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public OrganizationProfileOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the organization profile.
     * 
     * @return The organization profile.
     */
    @Override
    public OrganizationProfile get()
    {
        IPartnerServiceProxy<OrganizationProfile, OrganizationProfile> partnerServiceProxy =
            new PartnerServiceProxy<OrganizationProfile, OrganizationProfile>( new TypeReference<OrganizationProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetOrganizationProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.get();
    }

    /**
     * Updates the Organization Profile
     * 
     * @param updatePayload Payload of the update request
     * @return Updated Organization Profile
     */
    @Override
    public OrganizationProfile update( OrganizationProfile updatePayload )
    {
        IPartnerServiceProxy<OrganizationProfile, OrganizationProfile> partnerServiceProxy =
            new PartnerServiceProxy<OrganizationProfile, OrganizationProfile>( new TypeReference<OrganizationProfile>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetOrganizationProfile" ).getPath(),
                                                        Locale.US ) );

        return partnerServiceProxy.put( updatePayload );
    }

}
