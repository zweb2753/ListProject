package useful.controller;
//Imports everything
import java.util.List;
import java.util.ArrayList;
//imports useful.model
import useful.model.Donut;

public class ToolController 
{
	private List<Donut> donutList;
	
	public ToolController()
	{
		//donutlist is a new array list
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		//mes a new donut
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
