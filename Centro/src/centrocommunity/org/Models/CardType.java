package centrocommunity.org.Models;
/**
 * 
 * @author belko
 *
 */
public enum CardType {

	CHOISE_TEXT_BOX("choise_text_box"),
	CHOISE_HORISONTAL("choise_horisontal"),
	CHOISE_VERTICAL("choise_vartical");
	
	
	private final String value;       

    private CardType(String value) {
        this.value = value;
    }

	public boolean isEqualsTo(String value)
	{
		return value.equalsIgnoreCase(this.value);
	}

	@Override
	public String toString()
	{
		return value;
	}
	
}
