package io.github.szjug.greeting;

import org.springframework.data.annotation.Id;

public class Greeting {

	@Id
    private long id;
    private String content;

    public Greeting(){}
    
	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
	
	// ----- getters and setters -----

    public long getId() {
        return id;
    }

    public void setId(long id) {
		this.id = id;
	}

    public String getContent() {
    	return content;
    }

    public void setContent(String content) {
		this.content = content;
	}

}
