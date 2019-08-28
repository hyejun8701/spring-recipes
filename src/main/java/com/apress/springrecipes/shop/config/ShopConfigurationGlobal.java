package com.apress.springrecipes.shop.config;

import com.apress.springrecipes.shop.Cashier2_7;
import com.apress.springrecipes.shop.Cashier2_8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("global")
@ComponentScan("com.apress.springrecipes.shop")
public class ShopConfigurationGlobal {
//    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
//    public Cashier2_8 cashier() {
//        final String path = System.getProperty("java.io.tmpdir") + "/cashier";
//        Cashier2_8 c1 = new Cashier2_8();
//        c1.setFileName("checkout");
//        c1.setPath(path);
//        return c1;
//    }
}
