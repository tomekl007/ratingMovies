/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rating.ejb;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import rating.entity.Movie;
import rating.entity.Rate;
import rating.entity.User;

/**
 *
 * @author Tomek
 */
@Singleton
@Startup
public class ConfigBean {
   @EJB
    private RequestBean request;
   
   @PostConstruct
    public void createData() {
       request.createMovie("Batman", 4,"resources/images/batman_rise.jpg");
       request.createMovie("Piraci z Karaibów", 5, "resources/images/piractes_of_carraiben.jpg");
       request.createMovie("Spider-Man", 6, "resources/images/spider_man.jpg");
       
       request.createUser("Tomek", "1111");
       request.createUser("Miecio",  "1234");
     
         
   }
}
