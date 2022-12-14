// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package datetimeutilities.actions;

import java.util.Calendar;
import java.util.Date;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Get Month End date from Month and Year
 * 
 * Example:
 * Year:2021
 * Month:2(Feburary)
 */
public class MonthEndDate extends CustomJavaAction<java.util.Date>
{
	private java.lang.Long Year;
	private java.lang.Long Month;

	public MonthEndDate(IContext context, java.lang.Long Year, java.lang.Long Month)
	{
		super(context);
		this.Year = Year;
		this.Month = Month;
	}

	@java.lang.Override
	public java.util.Date executeAction() throws Exception
	{
		// BEGIN USER CODE
		
		Calendar calendar = Calendar.getInstance();
		// passing month-1 because 0-->jan, 1-->feb... 11-->dec
		int mon = Month.intValue();
		int yr = Year.intValue();
		calendar.set(yr, mon - 1, 1);
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
		Date date = calendar.getTime();
		// DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/YYYY");
		return date;
		
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "MonthEndDate";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
