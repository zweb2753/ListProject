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
		changeTheList();
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

	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + "was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("the list is still: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
		
		
	}
	
	private void practiceList()
	{
		Donut andMilk = new Donut("DonutandMilk");
		Donut andChocolateMilk = new Donut("DonutandChocolateMilk");
		
		donutList.add(andMilk);
		donutList.add(andChocolateMilk);
		
		display.displayText("There are" + donutList.size() + "Drink options");
		
	}
}
