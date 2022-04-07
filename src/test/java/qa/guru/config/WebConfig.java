package qa.guru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:/${typeProperties}.properties"
})

public interface WebConfig extends Config {

    @Key("browser")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Key("timeout")
    int timeout();
}
