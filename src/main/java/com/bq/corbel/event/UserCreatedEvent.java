package com.bq.corbel.event;

import java.util.Map;
import java.util.Set;


/**
 * @author Alberto J. Rubio
 */
public class UserCreatedEvent extends UserEvent {
    private boolean avoidNotification;

    public UserCreatedEvent() {}

    public UserCreatedEvent(String userId, String domainId, String email, String country, String username) {
        super(domainId, userId, email, username, null, null, null, null, null, null, null, null);
    }

    public UserCreatedEvent(String domainId, String userId, String email, String username,
            String firstName, String lastName, String profileUrl, String phoneNumber,
            String country, Map<String, Object> properties, Set<String> scopes,
            Set<String> groups, boolean avoidNotification) {
        super(domainId, userId, email, username, firstName, lastName, profileUrl, phoneNumber, country, properties, scopes, groups);
    }

    @Override
    public UserEventType getType() {
        return UserEventType.CREATION;
    }

    public boolean isAvoidNotification() {
        return avoidNotification;
    }

    public void setAvoidNotification(boolean avoidNotification) {
        this.avoidNotification = avoidNotification;
    }
}
