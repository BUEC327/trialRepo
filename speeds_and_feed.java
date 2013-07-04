//Speeds and feeds

import static java.lang.System.out;

public class speeds_and_feed
{

	int d;//diameter in inches

	public static void main(String[] args) 
	{
		
		out.println(decimals_to_fractions(.875));
		out.println(Drill_and_tap("#8-36"));

		

	}

	
	public static double fractions_to_decimals(double numerator, double denominator)
	{
		
		return numerator/denominator;
	}

	public static String decimals_to_fractions(double decimal)
	{
		String fraction="";
		double counter=1;

		while (decimal<0)
		{
			decimal=decimal*10;
			counter=counter*10;
		}
		
		double g_factor=GCD(decimal,counter);
		
		fraction=(int)(decimal/g_factor)+"/"+(int)(counter/g_factor);

		return fraction;		
//		return numerator/denominator;
	}

	public static double rpm(double d, double sfm)//RPM
	{
				
		double rmp=(3.82*sfm)/d;

		return rmp;
	}

	public static double sfm(double d, double rpm)//SFM
	{
				
		double sfm=rpm*d/3.82;

		return sfm;
	}

	
	public static String Drill_and_tap(String h_size)
	{
		String drill_number="";

		if (h_size=="1/4-28")
		{
			drill_number="#3";
		}

		else if (h_size=="1/4-20")
		{
			drill_number="#9";
		}
		
		else if (h_size=="#10-32")
		{
			drill_number="#21";
		}		
		else if (h_size=="#10-24")
		{
			drill_number="#25";
		}				
		else if (h_size=="#8-36")
		{
			drill_number="#29";
		}		
		else if (h_size=="#8-32")
		{
			drill_number="#29";
		}		

		else if (h_size=="#6-40")
		{
			drill_number="#33";
		}		

		else if (h_size=="#6-32")
		{
			drill_number="#36";
		}		
		else if (h_size=="#5-44")
		{
			drill_number="#37";
		}	
		else if (h_size=="#5-40")
		{
			drill_number="#39";
		}	
		else if (h_size=="#-48")
		{
			drill_number="#42";
		}
		else if (h_size=="#4-40")
		{
			drill_number="#43";
		}

		return(drill_number);
	}

	public static double GCD(double a, double b) 
	{
  		if (b==0) 
		return a;
  	 	return GCD(b,a%b);
	}
	
}
