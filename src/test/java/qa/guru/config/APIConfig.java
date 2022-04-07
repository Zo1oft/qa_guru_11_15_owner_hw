package qa.guru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties",
        "classpath:api.properties"
})
public interface APIConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("username")
    String username();

    @Key("password")
    String password();

}
