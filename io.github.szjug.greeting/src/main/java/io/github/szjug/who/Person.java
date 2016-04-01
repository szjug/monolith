package io.github.szjug.who;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * just copied from .who module, 
 * but field made non final as jackson requires constructor without parameter, then sets fields via setters
 * @author Paul Verest
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    private long id;
    private String name;

	public Person(){
    }
    
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
		this.id = id;
	}

    public String getName() {
        return name;
    }
	public void setName(String name) {
		this.name = name;
	}
}
