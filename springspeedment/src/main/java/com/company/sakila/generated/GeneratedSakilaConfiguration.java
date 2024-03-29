package com.company.sakila.generated;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.company.sakila.sakila.sakila.actor.ActorManager;
import com.company.sakila.sakila.sakila.actor_info.ActorInfoManager;
import com.company.sakila.sakila.sakila.address.AddressManager;
import com.company.sakila.sakila.sakila.category.CategoryManager;
import com.company.sakila.sakila.sakila.city.CityManager;
import com.company.sakila.sakila.sakila.country.CountryManager;
import com.company.sakila.sakila.sakila.customer.CustomerManager;
import com.company.sakila.sakila.sakila.customer_list.CustomerListManager;
import com.company.sakila.sakila.sakila.film.FilmManager;
import com.company.sakila.sakila.sakila.film_actor.FilmActorManager;
import com.company.sakila.sakila.sakila.film_category.FilmCategoryManager;
import com.company.sakila.sakila.sakila.film_list.FilmListManager;
import com.company.sakila.sakila.sakila.film_text.FilmTextManager;
import com.company.sakila.sakila.sakila.inventory.InventoryManager;
import com.company.sakila.sakila.sakila.language.LanguageManager;
import com.company.sakila.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmListManager;
import com.company.sakila.sakila.sakila.payment.PaymentManager;
import com.company.sakila.sakila.sakila.rental.RentalManager;
import com.company.sakila.sakila.sakila.sales_by_film_category.SalesByFilmCategoryManager;
import com.company.sakila.sakila.sakila.sales_by_store.SalesByStoreManager;
import com.company.sakila.sakila.sakila.staff.StaffManager;
import com.company.sakila.sakila.sakila.staff_list.StaffListManager;
import com.company.sakila.sakila.sakila.store.StoreManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.plugins.json.JsonBundle;
import com.speedment.enterprise.plugins.json.JsonComponent;
import com.speedment.runtime.core.ApplicationBuilder;
import com.speedment.runtime.core.component.ProjectComponent;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * The spring configuration file
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedSakilaConfiguration {
    
    protected final static String URL_PROPERTY = "spring.speedment.url";
    protected final static String HOST_PROPERTY = "spring.speedment.host";
    protected final static String PORT_PROPERTY = "spring.speedment.port";
    protected final static String USERNAME_PROPERTY = "spring.speedment.username";
    protected final static String PASSWORD_PROPERTY = "spring.speedment.password";
    protected final static String LOGGING_PROPERTY = "spring.speedment.logging";
    protected @Autowired Environment env;
    
    @Bean
    public SakilaApplication getApplication() {
        return getApplicationBuilder().build();
    }
    
    public SakilaApplicationBuilder getApplicationBuilder() {
        final SakilaApplicationBuilder builder =
            new SakilaApplicationBuilder()
                .withBundle(JsonBundle.class);
        
        if (env.containsProperty(URL_PROPERTY)) {
            builder.withConnectionUrl(env.getProperty(URL_PROPERTY));
        }
        
        if (env.containsProperty(HOST_PROPERTY)) {
            builder.withIpAddress(env.getProperty(HOST_PROPERTY));
        }
        
        if (env.containsProperty(PORT_PROPERTY)) {
            builder.withPort(Integer.parseInt(env.getProperty(PORT_PROPERTY)));
        }
        
        if (env.containsProperty(USERNAME_PROPERTY)) {
            builder.withUsername(env.getProperty(USERNAME_PROPERTY));
        }
        
        if (env.containsProperty(PASSWORD_PROPERTY)) {
            builder.withPassword(env.getProperty(PASSWORD_PROPERTY));
        }
        
        if (env.containsProperty(LOGGING_PROPERTY)
        &&  Boolean.valueOf(env.getProperty(LOGGING_PROPERTY))) {
            builder
                .withLogging(ApplicationBuilder.LogType.STREAM)
                .withLogging(ApplicationBuilder.LogType.APPLICATION_BUILDER)
                .withLogging(ApplicationBuilder.LogType.CONNECTION)
                .withLogging(ApplicationBuilder.LogType.STREAM_OPTIMIZER);
        }
        
        return builder;
    }
    
    @Bean
    public ProjectComponent getProjectComponent(SakilaApplication app) {
        return app.getOrThrow(ProjectComponent.class);
    }
    
    @Bean
    public JsonComponent getJsonComponent(SakilaApplication app) {
        return app.getOrThrow(JsonComponent.class);
    }
    
    @Bean
    public JoinComponent getJoinComponent(SakilaApplication app) {
        return app.getOrThrow(JoinComponent.class);
    }
    
    @Bean
    public ActorManager getActorManager(SakilaApplication app) {
        return app.getOrThrow(ActorManager.class);
    }
    
    @Bean
    public AddressManager getAddressManager(SakilaApplication app) {
        return app.getOrThrow(AddressManager.class);
    }
    
    @Bean
    public CategoryManager getCategoryManager(SakilaApplication app) {
        return app.getOrThrow(CategoryManager.class);
    }
    
    @Bean
    public CityManager getCityManager(SakilaApplication app) {
        return app.getOrThrow(CityManager.class);
    }
    
    @Bean
    public CountryManager getCountryManager(SakilaApplication app) {
        return app.getOrThrow(CountryManager.class);
    }
    
    @Bean
    public CustomerManager getCustomerManager(SakilaApplication app) {
        return app.getOrThrow(CustomerManager.class);
    }
    
    @Bean
    public FilmManager getFilmManager(SakilaApplication app) {
        return app.getOrThrow(FilmManager.class);
    }
    
    @Bean
    public FilmActorManager getFilmActorManager(SakilaApplication app) {
        return app.getOrThrow(FilmActorManager.class);
    }
    
    @Bean
    public FilmCategoryManager getFilmCategoryManager(SakilaApplication app) {
        return app.getOrThrow(FilmCategoryManager.class);
    }
    
    @Bean
    public FilmTextManager getFilmTextManager(SakilaApplication app) {
        return app.getOrThrow(FilmTextManager.class);
    }
    
    @Bean
    public InventoryManager getInventoryManager(SakilaApplication app) {
        return app.getOrThrow(InventoryManager.class);
    }
    
    @Bean
    public LanguageManager getLanguageManager(SakilaApplication app) {
        return app.getOrThrow(LanguageManager.class);
    }
    
    @Bean
    public PaymentManager getPaymentManager(SakilaApplication app) {
        return app.getOrThrow(PaymentManager.class);
    }
    
    @Bean
    public RentalManager getRentalManager(SakilaApplication app) {
        return app.getOrThrow(RentalManager.class);
    }
    
    @Bean
    public StaffManager getStaffManager(SakilaApplication app) {
        return app.getOrThrow(StaffManager.class);
    }
    
    @Bean
    public StoreManager getStoreManager(SakilaApplication app) {
        return app.getOrThrow(StoreManager.class);
    }
    
    @Bean
    public ActorInfoManager getActorInfoManager(SakilaApplication app) {
        return app.getOrThrow(ActorInfoManager.class);
    }
    
    @Bean
    public CustomerListManager getCustomerListManager(SakilaApplication app) {
        return app.getOrThrow(CustomerListManager.class);
    }
    
    @Bean
    public FilmListManager getFilmListManager(SakilaApplication app) {
        return app.getOrThrow(FilmListManager.class);
    }
    
    @Bean
    public NicerButSlowerFilmListManager getNicerButSlowerFilmListManager(SakilaApplication app) {
        return app.getOrThrow(NicerButSlowerFilmListManager.class);
    }
    
    @Bean
    public SalesByFilmCategoryManager getSalesByFilmCategoryManager(SakilaApplication app) {
        return app.getOrThrow(SalesByFilmCategoryManager.class);
    }
    
    @Bean
    public SalesByStoreManager getSalesByStoreManager(SakilaApplication app) {
        return app.getOrThrow(SalesByStoreManager.class);
    }
    
    @Bean
    public StaffListManager getStaffListManager(SakilaApplication app) {
        return app.getOrThrow(StaffListManager.class);
    }
}