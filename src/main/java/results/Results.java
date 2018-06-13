package results;

import results.model.ResultQueries;
import results.presenter.ResultPresenter;
import results.view.DisplayPanel;
import results.view.ResultsView;

public class Results {
	
	public static void main(String args[]) {
		ResultQueries rs=new ResultQueries();
		ResultsView rv=new ResultsView();
		ResultPresenter rp=new ResultPresenter();
		rv.setVisible(true);
		
	}

}
	