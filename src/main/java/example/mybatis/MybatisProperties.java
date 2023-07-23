package example.mybatis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author bacon
 * @date 2023/7/23 18:14
 */
@Component
@PropertySource("/Proper/mybatis.properties")
public class MybatisProperties {
    @Value("${mybatis.driverClassName}")
    private String driverClassName;
    @Value("${mybatis.url}")
    private String url;
    @Value("${mybatis.username}")
    private String username;
    @Value("${mybatis.password}")
    private String password;
    @Value("${mybatis.TypeAliasesPackage}")
    private String TypeAliasesPackage;
    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeAliasesPackage() {
        return TypeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        TypeAliasesPackage = typeAliasesPackage;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }
}
