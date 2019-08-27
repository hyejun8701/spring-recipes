package com.apress.springrecipes.shop.config;

import com.apress.springrecipes.shop.BannerLoader;
import com.apress.springrecipes.shop.Cashier2_8;
import com.apress.springrecipes.shop.DiscountFactoryBean;
import com.apress.springrecipes.shop.ProductCreator;
import com.apress.springrecipes.shop.domain.Battery;
import com.apress.springrecipes.shop.domain.Disc;
import com.apress.springrecipes.shop.domain.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;

import java.util.HashMap;
import java.util.Map;

@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan("com.apress.springrecipes.shop")
public class ShopConfiguration {
//    @Value("${endofyear.discount:0}")
//    private double specialEndofyearDiscountField;
//
//    @Value("classpath:banner.txt")
//    private Resource banner;
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Bean
//    public ReloadableResourceBundleMessageSource messageSource() {
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasenames("classpath:messages");
//        messageSource.setCacheSeconds(1);
//        return messageSource;
//    }
//
//    @Bean
//    public BannerLoader bannerLoader() {
//        BannerLoader bl = new BannerLoader();
//        bl.setBanner(banner);
//        return bl;
//    }

    /*@Bean
    public ProductCreator productCreatorFactory() {
        ProductCreator factory = new ProductCreator();
        Map<String, Product> products = new HashMap<>();
        products.put("aaa", new Battery("AAA", 2.5));
        products.put("cdrw", new Disc("CD-RW", 1.5));
        products.put("dvdrw", new Disc("DVD-RW", 3.0));
        factory.setProducts(products);
        return factory;
    }

    @Bean
    public Product aaa() {
        return productCreatorFactory().createProduct("aaa");
    }

    @Bean
    public Product cdrw() {
        return productCreatorFactory().createProduct("cdrw");
    }

    @Bean
    public Product dvdrw() {
        return productCreatorFactory().createProduct("dvdrw");
    }*/

//    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
//    public Cashier2_8 cashier() {
//        String path = System.getProperty("java.io.tmpdir") + "/cashier";
//        Cashier2_8 c1 = new Cashier2_8();
//        c1.setFileName("checkout");
//        c1.setPath(path);
//        return c1;
//    }

    @Bean
    public Product aaa() {
        Battery aaa = new Battery("AAA", 2.5);
        return aaa;
    }

    @Bean
    public Product cdrw() {
        Disc cdrw = new Disc("CD-RW", 1.5);
        return cdrw;
    }

    @Bean
    public Product dvdrw() {
        Disc dvdrw = new Disc("DVD-RW", 3.0);
        return dvdrw;
    }

    @Bean
    public DiscountFactoryBean discountFactoryBeanAAA() {
        DiscountFactoryBean factory = new DiscountFactoryBean();
        factory.setProduct(aaa());
        factory.setDiscount(0.2);
        return factory;
    }

    @Bean
    public DiscountFactoryBean discountFactoryBeanCDRW() {
        DiscountFactoryBean factory = new DiscountFactoryBean();
        factory.setProduct(cdrw());
        factory.setDiscount(0.1);
        return factory;
    }

    @Bean
    public DiscountFactoryBean discountFactoryBeanDVDRW() {
        DiscountFactoryBean factory = new DiscountFactoryBean();
        factory.setProduct(dvdrw());
        factory.setDiscount(0.1);
        return factory;
    }
}
