package n9mo.webcrawlerexample.rest.model;

import java.util.List;

/**
 * Class for response REST object
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
public class ResponseDTO {

    private final String id;
    private final String searchKeyword;
    private final List<Item> items;

    public ResponseDTO(String id, String searchKeyword, List<Item> items) {
        this.id = id;
        this.searchKeyword = searchKeyword;
        this.items = items;
    }
}
