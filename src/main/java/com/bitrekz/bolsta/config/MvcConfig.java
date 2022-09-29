package com.bitrekz.bolsta.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer, ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/news").setViewName("news");
        registry.addViewController("/").setViewName("index");
    }



    public void setApplicationContext(final ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("APP CONTEXT CLASS: " + applicationContext.getClass());
    }


    /* ******************************************************************* */
    /*  GENERAL CONFIGURATION ARTIFACTS                                    */
    /*  Static Resources, i18n Messages, Formatters (Conversion Service)   */
    /* ******************************************************************* */

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
        /*registry.addResourceHandler("/images/**").addResourceLocations("/images/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");*/
    }


    /* **************************************************************** */
    /*  THYMELEAF-SPECIFIC ARTIFACTS                                    */
    /*  TemplateResolver <- TemplateEngine <- ViewResolver              */
    /* **************************************************************** */
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.viewResolver(viewResolver());
//    }
//    @Bean
//    public SpringResourceTemplateResolver templateResolver(){
//        // SpringResourceTemplateResolver automatically integrates with Spring's own
//        // resource resolution infrastructure, which is highly recommended.
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(this.applicationContext);
//        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setSuffix(".html");
//        // HTML is the default value, added here for the sake of clarity.
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        // Template cache is true by default. Set to false if you want
//        // templates to be automatically updated when modified.
//        templateResolver.setCacheable(false);
//        return templateResolver;
//    }
//    @Bean
//    public SpringSecurityDialect securitySecDialect() {
//        return new SpringSecurityDialect();
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine(){
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.addDialect(securitySecDialect());
//        templateEngine.setEnableSpringELCompiler(true);
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver(){
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        return viewResolver;
//    }


}
