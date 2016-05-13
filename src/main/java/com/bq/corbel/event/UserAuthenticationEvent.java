package com.bq.corbel.event;

import java.util.Map;
import java.util.Set;

/**
 * @author Rubén Carrasco
 *
 */
public class UserAuthenticationEvent extends UserEvent {

    public UserAuthenticationEvent() {

    }

    public UserAuthenticationEvent(String domainId, String userId, String email, String username, String firstName, String lastName,
            String profileUrl, String phoneNumber, String country, Map<String, Object> properties, Set<String> scopes, Set<String> groups) {
        super(domainId, userId, email, username, firstName, lastName, profileUrl, phoneNumber, country, properties, scopes, groups);
    }

    @Override
    public UserEventType getType() {
        return UserEventType.AUTHENTICATION;
    }

}
