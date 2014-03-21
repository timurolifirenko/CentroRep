package centrocommunity.org;


import java.util.ArrayList;

import centrocommunity.org.R.id;
import centrocommunity.org.Classes.AdapterBSMenu;
import centrocommunity.org.Classes.BaseBusinessPlaneRepository;
import centrocommunity.org.Classes.BusinessPlanRepositoryFake;
import centrocommunity.org.Interfaces.IBusinessPlanRepository;
import centrocommunity.org.Models.BusinessStep;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ProgressBar;

/**
 * Fragment that display list of business plan steps
 * @author belko
 *
 */
public class BusinessPlanMenuFragment extends Fragment {
	
	private BaseBusinessPlaneRepository bpRepository;
	

	
	AdapterBSMenu stepAdaper;
	ArrayList<BusinessStep> steps;
	GridView gvSteps;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		bpRepository = new BaseBusinessPlaneRepository(getActivity());
		View view = inflater.inflate(R.layout.fragment_business_plan_menu, container,false);
		ProgressBar pb = (ProgressBar)view.findViewById(id.buisnessPlanProgressBar);// buisnessPlanProgressBar
		pb.setMax(100);
		pb.setProgress(45);
		
		
		steps = new ArrayList<BusinessStep>();
		steps.add(new BusinessStep(0,0,"Mission & Vision",false,100));
		steps.add(new BusinessStep(0,0,"ouhhhh!",false,100));
		steps.add(new BusinessStep(0,0,"≈ще",false,35));
		steps.add(new BusinessStep(0,0,"и да",true,0));
		steps.add(new BusinessStep(0,0,"и да",true,0));
		steps.add(new BusinessStep(0,0,"и да",true,0));
		steps.add(new BusinessStep(0,0,"и да",true,0));
		steps.addAll(bpRepository.getBusinessSteps());
		gvSteps = (GridView)view.findViewById(id.gvBuisnessPlanSteps);
		stepAdaper = new AdapterBSMenu(this.getActivity(),steps);
		gvSteps.setAdapter(stepAdaper);
		return view;
		
		
	}
}
