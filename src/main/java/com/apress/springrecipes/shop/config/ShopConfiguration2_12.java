package com.apress.springrecipes.shop.config;

import com.apress.springrecipes.shop.Cashier2_12;
import com.apress.springrecipes.shop.Cashier2_8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.apress.springrecipes.shop")
public class ShopConfiguration2_12 {
    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier2_12 cashier() {
        final String path = System.getProperty("java.io.tmpdir") + "/cashier";
        Cashier2_12 c1 = new Cashier2_12();
        c1.setPath(path);
        return c1;
    }
}
