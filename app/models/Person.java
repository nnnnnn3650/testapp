package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class Person extends Model{
	
	@Id
	public String id;
	
	public String name;
	
}
