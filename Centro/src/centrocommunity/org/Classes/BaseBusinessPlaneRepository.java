package centrocommunity.org.Classes;

import java.util.ArrayList;

import android.content.Context;

import centrocommunity.org.Interfaces.IBusinessPlanRepository;
import centrocommunity.org.Models.BusinessStep;
import centrocommunity.org.Models.Card;

public class BaseBusinessPlaneRepository implements IBusinessPlanRepository {

	private IBusinessPlanRepository repository;
	public BaseBusinessPlaneRepository(Context context)
	{
		repository = new BusinessPlanRepositoryFake();
	}
	
	@Override
	public ArrayList<BusinessStep> getBusinessSteps() {
		return repository.getBusinessSteps();
	}

	@Override
	public BusinessStep getBusinessStepById(int id) {
		return repository.getBusinessStepById(id);
	}

	@Override
	public ArrayList<Card> getCardsOfBusinessStep(int id) {
		// TODO Auto-generated method stub
		return repository.getCardsOfBusinessStep(id);
	}

}
