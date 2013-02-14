/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rating.entity;

import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Tomek
 */
@IdClass(rating.entity.RateKey.class)
@Entity
@NamedQueries({
@NamedQuery(name = "findAllRates", query = "SELECT r FROM Rate r "
+ "ORDER BY r.id"), @NamedQuery(name = "findRateByMovieId", query = "SELECT r FROM Rate r "
    + "WHERE r.movie.id = :movieId " + "ORDER BY r.id")})
//query ktory zwraca srednia ocene dla filmu o podanym id:
//query = "SELECT AVG(r.rate) FROM Rate r "
   // + "WHERE r.movie.id = :movieId ")

@Table(name = "RATING_RATE")
public class Rate implements java.io.Serializable{
    @Id
    @ManyToOne
   // @JoinColumn(name = "ID")
    private Movie movie;
    private int rate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private int idOfRatingUser;
   // @ManyToOne
    //private Movie movie;
     private static Logger logger = Logger.getLogger("rating.ejb.entity.Rate");
    
    public Rate(){
        logger.info("constructor Rate");
    }
    
    public Rate(int r, int idOfUser){
        this.idOfRatingUser = idOfUser;
        this.rate = r;
        logger.info("constructor Rate(int,int)");
       // this.movie = new Movie();
    }
    public Rate(int r, int idOfUser,Movie m ){
        this.idOfRatingUser = idOfUser;
        this.rate = r;
        this.movie = m;
        logger.info("constructor Rate(int,int,Movie)");
       
    }
    //public Rate(int rate, int userId){
      // this.id  = 1;
       //this.rate = rate;
       //this.idOfRatingUser = userId;
    //}
    
   /* @TableGenerator(name = "rateGen", 
            table = "PERSISTENCE_ORDER_SEQUENCE_GENERATOR", 
            pkColumnName = "GEN_KEY", 
            valueColumnName = "GEN_VALUE", 
            pkColumnValue = "RATE_ID", 
            allocationSize = 10)*/
   // @Id
   // @GeneratedValue(strategy = GenerationType.TABLE, generator = "rateGen")
    public int getId() {
        return id;
    }

    public void setId(int rateId) {
        this.id = rateId;
    }
    
    public int getIdOfRatingUser(){
        return idOfRatingUser;
    }
    public void setIdOfRatingUser(int uid){
        this.idOfRatingUser = uid;
        
    }
    
    public void setRate(int r){
        this.rate = r;
    }
    public int getRate(){
        return rate;
    }
        public Movie getMovie(){
        return movie;
    }
    
    public void setMovie(Movie m){
        this.movie = m;
    }
    
    @Override
    public String toString(){
        return new Integer(rate).toString() + " id " + id;
    }
    
}
