package n9mo.webcrawlerexample.rest.model;

/**
 * Abstract class for crawled item
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
abstract class Item {

    private final String itemId;
    private final String itemName;
    private final Long crawlDate;

    public Item(String itemId, String itemName, Long crawlDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.crawlDate = crawlDate;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public Long getCrawlDate() {
        return crawlDate;
    }
}
