package practiceJPA.JPAPractice.Model.Entity;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

// use it for configure with createdAt and updatedAt
@Configuration
@EnableJpaAuditing
public class PersistanceConfig {

    // use this bean and inner class for createdBy and updatedBy
    private static class AuditorAwareIpml implements AuditorAware<String>{

        @Override
        public Optional<String> getCurrentAuditor() {
            return Optional.of("Guest");
        }
    }
    @Bean
    public AuditorAware<String> auditorAware(){
       return new AuditorAwareIpml();
     }

}
