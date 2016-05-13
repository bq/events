package com.bq.corbel.event;

import com.bq.corbel.eventbus.EventWithSpecificDomain;

/**
 * @author Alberto J. Rubio
 */
public class DomainPublicScopesNotPublishedEvent extends EventWithSpecificDomain {

    public DomainPublicScopesNotPublishedEvent() {}

    public DomainPublicScopesNotPublishedEvent(String domain) { super(domain); }

}
