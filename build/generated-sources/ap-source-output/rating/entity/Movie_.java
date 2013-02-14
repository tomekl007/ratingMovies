package rating.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rating.entity.Rate;
import rating.entity.User;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-09-17T07:08:57")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> id;
    public static volatile SingularAttribute<Movie, String> title;
    public static volatile CollectionAttribute<Movie, User> users;
    public static volatile CollectionAttribute<Movie, Rate> rates;
    public static volatile SingularAttribute<Movie, String> url;

}