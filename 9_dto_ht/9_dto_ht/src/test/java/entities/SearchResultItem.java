package entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SearchResultItem {

    private final String title;

    private final String hrefValue;

    public SearchResultItem(String title, String hrefValue) {
        this.title = title;
        this.hrefValue = hrefValue;
    }

    public String getTitle() {
        return title;
    }

    public String getHrefValue() {
        return hrefValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SearchResultItem that = (SearchResultItem) o;

        return new EqualsBuilder()
                .append(title, that.title)
                .append(hrefValue, that.hrefValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(title)
                .append(hrefValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("title", title)
                .append("hrefValue", hrefValue)
                .toString();
    }
}
