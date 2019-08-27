package com.apress.springrecipes.shop.config;

import com.apress.springrecipes.shop.domain.Battery;
import com.apress.springrecipes.shop.domain.Disc;
import com.apress.springrecipes.shop.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"summer", "winter"})
public class ShopConfigurationSumWin {
    @Bean
    public Product aaa() {
        Battery p1 = new Battery();
        p1.setName("AAA");
        p1.setPrice(2.0);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD-RW", 1.0);
        p2.setCapacity(700);
        return p2;
    }

    @Bean
    public Product dvdrw() {
        Disc p3 = new Disc("DVD-RW", 2.5);
        p3.setCapacity(700);
        return p3;
    }
}
