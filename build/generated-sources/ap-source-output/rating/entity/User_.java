package rating.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rating.entity.Movie;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-09-17T07:08:57")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> id;
    public static volatile CollectionAttribute<User, Movie> movies;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> password;

}