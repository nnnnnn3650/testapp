package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * Person Class
 */
@Entity
public class Person extends Model{

/*
@Id
public String id;
*/

    @Id
	public String name;

    public long height;
}
