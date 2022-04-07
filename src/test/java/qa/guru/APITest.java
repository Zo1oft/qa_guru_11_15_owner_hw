package qa.guru;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qa.guru.config.APIConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITest {


    @BeforeEach

    @Test
    public void apiTest() {
        APIConfig config = ConfigFactory.create(APIConfig.class, System.getProperties());

        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.username()).isEqualTo("maxzhurkin");
        assertThat(config.password()).isEqualTo("maximka");
    }
}
