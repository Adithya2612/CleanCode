package ConstructHouse;

public class Construction {
	
	float calculateConstruction(String material,float no_of_sqft)
	{
		
		if(material.equals("standard"))
		{
			return 1200*no_of_sqft;
		}
		else if(material.equals("above standard"))
		{
			return 1500*no_of_sqft;
		}
		else if(material.equals("high standard"))
		{
			return 1800*no_of_sqft;
		}
		else if(material.equals("high standard and fully automated home"))
		{
			return 2500*no_of_sqft;
		}
		else {
		return 0;
		}
	}

}
