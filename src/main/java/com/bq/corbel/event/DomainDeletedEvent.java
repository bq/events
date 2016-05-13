package com.bq.corbel.event;

import com.bq.corbel.eventbus.EventWithSpecificDomain;

public class DomainDeletedEvent extends EventWithSpecificDomain {

    public DomainDeletedEvent() {}

    public DomainDeletedEvent(String domain) {
        super(domain);
    }

}
