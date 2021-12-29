import com.sparta.repository.HibernateSpeakerRepositoryImpl;
import com.sparta.repository.SpeakerRepository;
import com.sparta.service.SpeakerService;
import com.sparta.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.sparta"})
public class AppConfig {

//    @Bean(name = "speakerService") // @Bean method level only
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
////        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
////        service.setRepository(getSpeakerRepository());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;
//    }
//
//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
