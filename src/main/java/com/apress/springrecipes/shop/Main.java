package com.apress.springrecipes.shop;

import com.apress.springrecipes.shop.config.ShopConfiguration;
import com.apress.springrecipes.shop.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);

        String alert = context.getMessage("alert.checkout", null, Locale.US);
        String alert_inventory = context.getMessage("alert.inventory.checkout", new Object[]{"DVD-RW 3.0", new Date()}, Locale.US);

        System.out.println("The I18N message for alert.checkout is: " + alert);
        System.out.println("The I18N message for alert.inventory.checkout is: " + alert_inventory);

        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);
        Product dvdrw = context.getBean("dvdrw", Product.class);

        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        cart1.addItem(aaa);
        cart1.addItem(cdrw);

        System.out.println("Shopping Cart 1 contains " + cart1.getItems());

        Cashier2_7 cashier2_7 = context.getBean(Cashier2_7.class);
        cashier2_7.checkout(cart1);

        Cashier2_8 cashier2_8 = context.getBean(Cashier2_8.class);
        cashier2_8.checkout(cart1);
//
//        ShoppingCart cart2 = context.getBean(ShoppingCart.class);
//        cart2.addItem(dvdrw);
//
//        System.out.println("Shopping Cart 2 contains " + cart2.getItems());
//
//        Resource resource = new ClassPathResource("discounts.properties");
//        Properties props = PropertiesLoaderUtils.loadProperties(resource);
//
//        System.out.println("And don't forgot our discounts!");
//        System.out.println(props);
    }
}
