package io.cofinex.onchain.scanner.bnb;

import io.cofinex.onchain.scanner.bnb.CofinexOnChainScannerBnbApp;
import io.cofinex.onchain.scanner.bnb.config.AsyncSyncConfiguration;
import io.cofinex.onchain.scanner.bnb.config.EmbeddedKafka;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CofinexOnChainScannerBnbApp.class, AsyncSyncConfiguration.class })
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
