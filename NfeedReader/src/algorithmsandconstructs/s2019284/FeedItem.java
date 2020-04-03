package algorithmsandconstructs.s2019284;

public class FeedItem {
	
	protected String title;
	protected String link;
	protected String content;
	

	public FeedItem(String title, String link, String content) {
		this.title = title;
		this.link = link;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

    public String toString(){ 
       
		return this.title + " " + this.link + " " + this.content; 
    } 
	
	

}
