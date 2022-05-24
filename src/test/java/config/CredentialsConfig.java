package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("app")
    String app();

    @Key("url")
    String url();

}
