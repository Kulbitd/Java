package mypac;

public class Sort {
	public static Points[] pointsortincrease(Points[] mas,int numberpoint){
		boolean swapped = true;
		while(swapped)
		{	
			numberpoint --;
			swapped = false;
			
			for(int i = 0; i < numberpoint; i++)
			{
				if(mas[i].coordinate_x > mas[i + 1].coordinate_x)
				{
					Points buff = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buff;
					swapped = true;
				}
			}
			
			if(swapped == false)
				break;
		}
		return mas;
		
	}
	public static Points[] pointsort(Points[] mas,int numberpoint){
		boolean swapped = true;
		while(swapped)
		{	
			numberpoint --;
			swapped = false;
			
			for(int i = 0; i < numberpoint; i++)
			{
				if(mas[i].coordinate_x < mas[i + 1].coordinate_x)
				{
					Points buff = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buff;
					swapped = true;
				}
			}
			
			if(swapped == false)
				break;
		}
		return mas;
		
	}
	public static Circles[] circlessortincrease(Circles[] mas,int numberpoint){
		boolean swapped = true;
		while(swapped)
		{	
			numberpoint --;
			swapped = false;
			
			for(int i = 0; i < numberpoint; i++)
			{	
				if(mas[i].center_coordinate_x > mas[i + 1].center_coordinate_x)
				{
					Circles buff = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buff;
					swapped = true;
				}
				
				if(mas[i].center_coordinate_x == mas[i + 1].center_coordinate_x)
				{	if(mas[i].center_coordinate_y > mas[i + 1].center_coordinate_y)
					{
						Circles buff = mas[i];
						mas[i] = mas[i + 1];
						mas[i + 1] = buff;
						swapped = true;
					}
				}
			}
			
			if(swapped == false)
				break;
		}
		return mas;
		
	}
	public static Circles[] circlessort(Circles[] mas,int numberpoint){
		boolean swapped = true;
		while(swapped)
		{	
			numberpoint --;
			swapped = false;
			
			for(int i = 0; i < numberpoint; i++)
			{	
				if(mas[i].center_coordinate_x < mas[i + 1].center_coordinate_x)
				{
					Circles buff = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buff;
					swapped = true;
				}
				
				if(mas[i].center_coordinate_x == mas[i + 1].center_coordinate_x)
				{	if(mas[i].center_coordinate_y < mas[i + 1].center_coordinate_y)
					{
						Circles buff = mas[i];
						mas[i] = mas[i + 1];
						mas[i + 1] = buff;
						swapped = true;
					}
				}
			}
			
			if(swapped == false)
				break;
		}
		return mas;
		
	}
}
