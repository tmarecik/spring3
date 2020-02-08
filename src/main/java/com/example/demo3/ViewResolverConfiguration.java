package com.example.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ViewResolverConfiguration {

    /*
     * W springu może być tylko jeden viewControler, tutaj on został skonfigurowany tylko na
     * wyświetlanie "jpg", czytli w tym przypadku Prefix: "/" idzie od root'a
     * a ".jpg" jest jedeynymi słusznymi danymi które wyświetla
     * !!!! UWARA w tym momencie nadpisaliśmu defoultowego viewResolvera!!! i nadpisaliśmy go kompletnie!!!!
     * */


//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/");
//        viewResolver.setSuffix(".jpg");
//        return viewResolver;
//    }



}
