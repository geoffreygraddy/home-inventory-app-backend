package com.homeinventory.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.data.repository.init.UnmarshallerRepositoryPopulatorFactoryBean;

@Configuration
public class JpaPopulators {

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulator() throws Exception {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[] { new ClassPathResource("inventory-items.json") });
        return factory;
    }

}
