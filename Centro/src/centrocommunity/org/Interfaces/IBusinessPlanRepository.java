package centrocommunity.org.Interfaces;

import java.util.ArrayList;

import centrocommunity.org.Models.BusinessStep;
import centrocommunity.org.Models.Card;

public interface IBusinessPlanRepository {

	ArrayList<BusinessStep> getBusinessSteps();
	
	BusinessStep getBusinessStepById(int id);
	
	ArrayList<Card> getCardsOfBusinessStep(int id);
	
	
}
