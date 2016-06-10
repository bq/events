package com.bq.corbel.event;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bq.corbel.eventbus.EventWithSpecificDomain;

public class AssetsEvent extends EventWithSpecificDomain {
    private String userId;
    private List<EventAsset> assets;

    public AssetsEvent() {}

    public AssetsEvent(String domain, String userId, List<EventAsset> assets) {
        super(domain);
        this.userId = userId;
        this.assets = assets;
    }

    public String getUserId() {
        return userId;
    }

    public List<EventAsset> getAssets() {
        return assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AssetsEvent))
            return false;
        if (!super.equals(o))
            return false;

        AssetsEvent that = (AssetsEvent) o;

        if (assets != null ? !assets.equals(that.assets) : that.assets != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (assets != null ? assets.hashCode() : 0);
        return result;
    }

    public static class EventAsset {
        private Set<String> scopes;
        private Date expire;
        private String name;
        private String productId;
        private Map<String, Boolean> filterResults;
        private List<String> filters;
        private Map<String, Object> properties;

        public EventAsset() {}

        public EventAsset(Set<String> scopes, Date expire, String name, String productId) {
            super();
            this.scopes = scopes;
            this.expire = expire;
            this.name = name;
            this.productId = productId;
        }

        public EventAsset(Set<String> scopes, Date expire, String name, String productId, Map<String, Boolean> filterResults,
                List<String> filters, Map<String, Object> properties) {
            super();
            this.scopes = scopes;
            this.expire = expire;
            this.name = name;
            this.productId = productId;
            this.filterResults = filterResults;
            this.filters = filters;
            this.properties = properties;
        }

        public Map<String, Boolean> getFilterResults() {
            return filterResults;
        }

        public List<String> getFilters() {
            return filters;
        }

        public Map<String, Object> getProperties() {
            return properties;
        }

        public Set<String> getScopes() {
            return scopes;
        }

        public Date getExpire() {
            return expire;
        }

        public String getName() {
            return name;
        }

        public String getProductId() {
            return productId;
        }

        @Override public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            EventAsset that = (EventAsset) o;

            if (scopes != null ? !scopes.equals(that.scopes) : that.scopes != null)
                return false;
            if (expire != null ? !expire.equals(that.expire) : that.expire != null)
                return false;
            if (name != null ? !name.equals(that.name) : that.name != null)
                return false;
            if (productId != null ? !productId.equals(that.productId) : that.productId != null)
                return false;
            if (filterResults != null ? !filterResults.equals(that.filterResults) : that.filterResults != null)
                return false;
            if (filters != null ? !filters.equals(that.filters) : that.filters != null)
                return false;
            return properties != null ? properties.equals(that.properties) : that.properties == null;

        }

        @Override public int hashCode() {
            int result = scopes != null ? scopes.hashCode() : 0;
            result = 31 * result + (expire != null ? expire.hashCode() : 0);
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (productId != null ? productId.hashCode() : 0);
            result = 31 * result + (filterResults != null ? filterResults.hashCode() : 0);
            result = 31 * result + (filters != null ? filters.hashCode() : 0);
            result = 31 * result + (properties != null ? properties.hashCode() : 0);
            return result;
        }

    }

}
