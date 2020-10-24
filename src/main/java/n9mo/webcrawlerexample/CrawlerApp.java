package n9mo.webcrawlerexample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot sample web crawler app
 *
 * @author Yury Zuzansky
 * @since 2020-10-24
 */
@SpringBootApplication
public class CrawlerApp {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(CrawlerApp.class, args);

    }

    /**
     * Restarts application
     */
    public static void restart() {
        ApplicationArguments args = context.getBean(ApplicationArguments.class);
        Thread thread = new Thread(() -> {
            context.close();
            context = SpringApplication.run(CrawlerApp.class, args.getSourceArgs());
        });
        thread.setDaemon(false);
        thread.start();
    }

    /**
     * Shutdowns application
     */
    public static void shutdown() {
        int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
        System.exit(exitCode);
    }
}
