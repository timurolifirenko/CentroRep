package centrocommunity.org.Models;

import java.util.ArrayList;

/**
 * Model that represent main step of business plan
 * @author belko
 *
 */
public class BusinessStep {
	private int id;
	
	private String caption;
	private boolean isLocked;
	private int progress;
	private int pos;
	

	private ArrayList<Card> cards;
	
	

	/**
	 * Constructor
	 */
	public BusinessStep()
	{
		cards = new ArrayList<Card>();
	}
	
	/**
	 * Constructor with init params
	 * @param caption
	 * @param lock
	 * @param progress
	 */
	public BusinessStep(int id,int pos,String caption,boolean lock,int progress)
	{
		cards = new ArrayList<Card>();
		setId(id);
		setPos(pos);
		setCaption(caption);
		setIsLocked(lock);
		setProgress(progress);
	}
	
	/**
	 * identificator in db
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Step is locked
	 * @return lock status
	 */
	public boolean getIsLocked()
	{
		return isLocked;
	}
	
	public void setIsLocked(boolean value)
	{
		isLocked = value;
	}
	
	/**
	 * Caption of step
	 * @return caption
	 */
	public String getCaption()
	{
		return caption;
	}
	
	public void setCaption(String value)
	{
		caption = value;
	}
	
	/**
	 * Progress of executing current step
	 * @return 0..100
	 */
	public int getProgress()
	{
		return progress;
	}
	
	public void setProgress(int value)
	{
		if(value>100)
			progress = 100;
		else if(value<0)
			progress = 0;
		else
			progress = value;
	}
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
}
