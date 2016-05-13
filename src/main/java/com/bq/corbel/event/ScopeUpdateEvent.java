package com.bq.corbel.event;

import com.bq.corbel.eventbus.EventWithSpecificDomain;

/**
 * @author Alberto J. Rubio
 */
public class ScopeUpdateEvent extends EventWithSpecificDomain {

    public enum Action {
        CREATE, UPDATE, DELETE
    }

    private String scopeId;
    private Action action;

    private ScopeUpdateEvent() {}

    private ScopeUpdateEvent(String scopeId, String domain, Action action) {
        super(domain);
        this.scopeId = scopeId;
        this.action = action;
    }

    public static ScopeUpdateEvent createScopeEvent(String scopeId, String domain) {
        return new ScopeUpdateEvent(scopeId, domain, Action.CREATE);
    }

    public static ScopeUpdateEvent updateScopeEvent(String scopeId, String domain) {
        return new ScopeUpdateEvent(scopeId, domain, Action.UPDATE);
    }

    public static ScopeUpdateEvent deleteScopeEvent(String scopeId, String domain) {
        return new ScopeUpdateEvent(scopeId, domain, Action.DELETE);
    }


    public String getScopeId() {
        return scopeId;
    }

    public ScopeUpdateEvent setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public ScopeUpdateEvent setAction(Action action) {
        this.action = action;
        return this;
    }

}
