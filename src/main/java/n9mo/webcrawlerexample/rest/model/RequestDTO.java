package n9mo.webcrawlerexample.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * Class for request REST object
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
public class RequestDTO {

    private final String id;
    private final String searchKeyword;
    private final Map<String,Object> parameters;

    public RequestDTO(@JsonProperty("id") String id,
                      @JsonProperty("searchKeyword") String searchKeyword,
                      @JsonProperty("parameters") Map<String, Object> parameters) {
        Objects.requireNonNull(id, "id must not be null");
        Objects.requireNonNull(searchKeyword, "searchKeyword must not be null");
        this.id = id;
        this.searchKeyword = searchKeyword;
        this.parameters = parameters;
    }

    public String getId() {
        return id;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestDTO)) return false;
        RequestDTO that = (RequestDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(searchKeyword, that.searchKeyword) &&
                Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, searchKeyword, parameters);
    }
}
