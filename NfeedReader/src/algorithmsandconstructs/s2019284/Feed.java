package algorithmsandconstructs.s2019284;

import java.util.ArrayList;
import java.util.Scanner;

public class Feed implements FeedInterface {
	
	protected ArrayList<FeedItem> listFeeds = new ArrayList<FeedItem>();
	protected boolean empty;
	
	public Feed(){		
		this.empty = true;
	}

	@Override
	public void loadFeedItems(Integer cant) {
		
		Integer i=1;
		Scanner input = new Scanner(System.in);
		String title,content,link;
		
		while(i <= cant) {
			System.out.println("..........Item "+ i +"................");			
			System.out.print("Please enter title: ");
			title = input.nextLine();
			System.out.print("Please enter link: ");
			link = input.nextLine();
			System.out.print("Please enter content: ");
			content = input.nextLine();
			this.listFeeds.add(new FeedItem(title,link,content));
			i++;
		}
		
		if(this.listFeeds.size() != 0)
			this.empty = false;
		
	}

	@Override
	public void printFeedItems() {
		
		 for (FeedItem elem: this.listFeeds){
             System.out.println(elem);
         }
		
	}

	@Override
	public boolean isEmpty() {
		if(this.empty) 
			return true;
		else			
			return false;
	}
	

	
	
	
}
