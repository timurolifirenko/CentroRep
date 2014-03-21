package centrocommunity.org.Models;

/**
 * one screen card
 * @author belko
 *
 */
public class Card {
	private int stepId;
	
	private int id;
	private int pos;
	
	private CardType cardType;
	private String caption;
	private String value;
	
	
	public Card(int id, int pos, CardType cardType, String caption, String value) {
		this.id = id;
		this.cardType = cardType;
		this.caption = caption;
		this.value = value;
	}
	public Card(int stepId, int id, int pos, CardType cardType, String caption, String value) {
		this(id,pos,cardType,caption,value);
		this.stepId = stepId;
	}
	
	
	public int getStepId() {
		return stepId;
	}
	public void setStepId(int stepId) {
		this.stepId = stepId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public String getCaption()
	{
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	


	
}
