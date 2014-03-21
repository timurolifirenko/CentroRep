package centrocommunity.org.Classes;

import java.util.ArrayList;

import centrocommunity.org.R;
import centrocommunity.org.R.id;
import centrocommunity.org.Models.BusinessStep;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author belko
 * Adapter for displaying list of main business steps
 */
public class AdapterBSMenu extends ArrayAdapter<BusinessStep> {

	private ArrayList<BusinessStep> _steps;
	Context _context;
	
	
	/**
	 * Constructor
	 * @param context
	 * @param steps
	 */
	public AdapterBSMenu(Context context,ArrayList<BusinessStep> steps)
	{
		super(context, 0,steps);
		_context = context;
		_steps = steps;
	}
	@Override
	public int getCount() {
		return _steps.size();
	}
	
	@Override
	public BusinessStep getItem(int position) {
		return _steps.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		View row = view; 
		if(row==null){
			LayoutInflater inflater = ((Activity)_context).getLayoutInflater();
			row = inflater.inflate(R.layout.item_business_plan_step, parent, false);
			TextView caption = (TextView)row.findViewById(id.tvCaption);
			TextView number = (TextView)row.findViewById(id.tvStepNumber);
			TextView percentage = (TextView)row.findViewById(id.tvPercentage);
			ImageView imgOk = (ImageView)row.findViewById(id.imgOk);
			ImageView imgLock = (ImageView)row.findViewById(id.imgLock);
			BusinessStep cur = _steps.get(position);
			number.setText(String.valueOf(position+1));
			caption.setText(cur.getCaption());
			if(cur.getIsLocked()==true)
			{
				percentage.setVisibility(View.GONE);
				imgOk.setVisibility(View.GONE);
				imgLock.setVisibility(View.VISIBLE);
			}else
			{
				if(cur.getProgress()==100)
				{
					percentage.setVisibility(View.GONE);
					imgLock.setVisibility(View.GONE);
					imgOk.setVisibility(View.VISIBLE);
				}else
				{
					percentage.setText(String.valueOf(cur.getProgress())+"%");
					percentage.setVisibility(View.VISIBLE);
					imgLock.setVisibility(View.GONE);
					imgOk.setVisibility(View.GONE);
				}
			}
		}
		
		return row;
	}

}
