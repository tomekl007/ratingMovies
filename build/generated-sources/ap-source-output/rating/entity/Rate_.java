package rating.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rating.entity.Movie;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-09-17T07:08:57")
@StaticMetamodel(Rate.class)
public class Rate_ { 

    public static volatile SingularAttribute<Rate, Integer> id;
    public static volatile SingularAttribute<Rate, Integer> idOfRatingUser;
    public static volatile SingularAttribute<Rate, Integer> rate;
    public static volatile SingularAttribute<Rate, Movie> movie;

}