package useful.controller;
//Imports everything
import java.util.List;
import java.util.ArrayList;
//imports Donut to this class
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController 
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ListController()
	{
		//donutlist is a new array list
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		//makes a new donut
		Donut temp = new Donut();
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("this is a word sequence");
		tempList.add("DonutTestszip");
		tempList.add("");
		tempList.add("idk");
		
		display.displayText("The longest string in the tempListt is); " + maxLength(tempList) + " longest");
		display.displayText("it is " + getLongestString(tempList));
		//donutList
				
		
		
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
	
	public int maxLength(ArrayList<String> myList)
	{
		int max = 0;
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (max < myList.get(index).length())
            {
            	   max = myList.get(index).length();
            }
		}
	    return max;
	}
	
	public String getLongestString(ArrayList <String> myList)
	{
		String longest = "";
		int max = 0;
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (myList.get(index).length()> max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
	}
	
	private void practiceList()

	{
		Donut andMilk = new Donut("DonutandMilk");
		Donut andChocolateMilk = new Donut("DonutandChocolateMilk");
		
		donutList.add(andMilk);
		donutList.add(andChocolateMilk);
		
		display.displayText("There are" + donutList.size() + "drink options");
		
		donutList.remove(andMilk);
		display.displayText("Drink option" + andMilk + "has been removed");
	}


	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}


