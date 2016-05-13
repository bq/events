package com.bq.corbel.event;

import com.bq.corbel.eventbus.EventWithSpecificDomain;

/**
 * @author Cristian del Cerro
 */
public class UserDeletedEvent extends EventWithSpecificDomain {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    public UserDeletedEvent() {}

    public UserDeletedEvent(String userId, String firstName, String lastName, String email, String domain) {
        super(domain);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof UserDeletedEvent))
            return false;
        if (!super.equals(o))
            return false;

        UserDeletedEvent that = (UserDeletedEvent) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
