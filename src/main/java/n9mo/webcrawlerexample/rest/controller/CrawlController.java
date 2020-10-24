package n9mo.webcrawlerexample.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * REST controller for crawl operation and application management
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
@RestController
@RequestMapping("/crawler/api")
public class CrawlController {

    Logger logger = LoggerFactory.getLogger(CrawlController.class);

    /**
     * Starts simple crawl
     *
     * @param requestBody
     */
    @PostMapping("/crawl")
    public static void startCrawl(@RequestBody Map<String, Object> requestBody)
    {
        //TODO start manager/crawler function, add tests
//        Crawler.crawl(requestBody);
        System.out.println(requestBody.toString());
    }

    /**
     * Starts parametrized crawl
     *
     * @param requestBody
     */
    @PostMapping("/crawl:p")
    public static void startParametrizedCrawl(@RequestBody Map<String, Object> requestBody)
    {
        //TODO start manager/crawler function, add tests
//        Crawler.crawlParametrized(requestBody);
        System.out.println(requestBody.toString());
    }

    /**
     * Shutdowns application
     */
    @PostMapping("/shutdown")
    public void shutdown() {
        String message = " ---> Got REST API shutdown hook";
        logger.info(message);

        shutdown();
    }

    /**
     * Restarts application
     */
    @PostMapping("/restart")
    public void restart() {
        String message = " ---> Got REST API restart hook";
        logger.info(message);

        restart();
    }

    //TODO scheduler endpoint?
}
