package useful.controller;
//Imports everything
import java.util.List;
import java.util.ArrayList;
//imports Donut to this class
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController 
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		//donutlist is a new array list
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		//makes a new donut
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
	}
	
	private void showTheList()
	{
		for (int index = 0; index < donutList.size(); index ++)
		{
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut Chocolate = new Donut("Chocolate");
		Donut bearClaw = new Donut("bearClaw");
		Donut fruitySprinkle = new Donut("fruitySprinkle");
		Donut Glazed = new Donut("Glazed");
		
		donutList.add(Chocolate);
		donutList.add(bearClaw);
		donutList.add(fruitySprinkle);
		donutList.add(Glazed);
		donutList.add(jellyFilled);
	}
}
