package n9mo.webcrawlerexample.rest.model;

/**
 * Abstract class for crawled item (https://www.olx.ua source + cars catalog)
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
public class ItemOLXCar extends Item {

    private final String model;
    private final String year;
    private final String priceUSD;
    private final String details;
    //TODO add some needed fields

    public ItemOLXCar(String itemId, String itemName, Long crawlDate, String model, String year, String priceUSD, String details) {
        super(itemId, itemName, crawlDate);
        this.model = model;
        this.year = year;
        this.priceUSD = priceUSD;
        this.details = details;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getPriceUSD() {
        return priceUSD;
    }

    public String getDetails() {
        return details;
    }
}
