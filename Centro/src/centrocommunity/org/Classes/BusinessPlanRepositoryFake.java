package centrocommunity.org.Classes;
import java.util.ArrayList;
import centrocommunity.org.Interfaces.*;
import centrocommunity.org.Models.BusinessStep;
import centrocommunity.org.Models.Card;
import centrocommunity.org.Models.CardType;

public class BusinessPlanRepositoryFake implements IBusinessPlanRepository {

	ArrayList<BusinessStep> steps = new ArrayList<BusinessStep>();
	ArrayList<Card> cards = new ArrayList<Card>();

	public BusinessPlanRepositoryFake()
	{
		steps.add(new BusinessStep(1,0,"Mission & Vision",false,100));
		steps.add(new BusinessStep(2,1,"Personal Finance",false,35));
		steps.add(new BusinessStep(3,2,"Market Analysis",true,0));
		steps.add(new BusinessStep(4,3,"Value Proposition",true,0));
		
		cards.add(new Card(1,1,0, CardType.CHOISE_TEXT_BOX, "Choise text box", "A"));
		cards.add(new Card(1,2,1, CardType.CHOISE_HORISONTAL, "Choise horisontal", "A"));
		cards.add(new Card(1,3,2, CardType.CHOISE_VERTICAL, "Choise vertical", "B"));
		cards.add(new Card(2,1,0, CardType.CHOISE_TEXT_BOX, "Choise text box", "B"));
		cards.add(new Card(2,2,1, CardType.CHOISE_HORISONTAL, "Choise horisontal", ""));
		cards.add(new Card(2,3,2, CardType.CHOISE_VERTICAL, "Choise vertical", ""));
		
	}
	
	@Override
	public ArrayList<BusinessStep> getBusinessSteps() {
		
		return steps;
	}

	@Override
	public BusinessStep getBusinessStepById(int id) {
		
		BusinessStep res=null;
		for (BusinessStep bs : steps) {
			if(bs.getId()==id)
			{
				res = bs;
				break;
			}
		}
		return res;
	}

	@Override
	public ArrayList<Card> getCardsOfBusinessStep(int id) {
		ArrayList<Card> res = new ArrayList<Card>();
		for(Card c : cards)
		{
			if(c.getStepId()==id)
				res.add(c);
		}
		return res;
	}

	
	
	
}
