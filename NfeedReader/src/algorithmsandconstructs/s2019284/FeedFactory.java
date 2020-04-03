package algorithmsandconstructs.s2019284;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeedFactory implements FeedFactoryInterface{
	
	protected List<Feed> listFeed = new ArrayList<Feed>();
	protected boolean empty;
	
	public FeedFactory() {		
		this.empty = true;
	}

	@Override
	public void loadFeeds(Integer cant) {
		
		Integer i = 1;
		Scanner input = new Scanner(System.in);
		while(i <= cant) {	
			System.out.println("=========== rss "+ i +" =================");			
			Feed mylist = new Feed();
			System.out.println(i+".- Enter number of items you want to create");
			Integer num = Integer.parseInt(input.nextLine());
			mylist.loadFeedItems(num);
			mylist.printFeedItems();
			this.listFeed.add(mylist);	
			i++;	
			System.out.println("==========================================");
		}	
		
		if(this.listFeed.size()!=0)
			this.empty = false;
	}
		

	@Override
	public void printAllFeeds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printFeed(Integer position) {
		// TODO Auto-generated method stub
		
	}

}
