package guru.springframework.sfgdi.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

// Constructor binding was 2.2 and few year ago we were on a 2.4 so new feature.
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcurl;

    public SfgConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }


    // Remember no setter as they would fail because they are final properties see above.
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
