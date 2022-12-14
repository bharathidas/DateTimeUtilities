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
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Get Number of days in a month from Month and Year
 * 
 * Example:
 * Year:2021
 * Month:2(Feburary)
 */
public class NoOfDaysinMonth extends CustomJavaAction<java.lang.Long>
{
	private java.lang.Long Year;
	private java.lang.Long Month;

	public NoOfDaysinMonth(IContext context, java.lang.Long Year, java.lang.Long Month)
	{
		super(context);
		this.Year = Year;
		this.Month = Month;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE

		int mon = Month.intValue();
		int yr = Year.intValue();
		Calendar calendar = Calendar.getInstance();
		calendar.set(yr, mon - 1, 1);
		long value = calendar.getActualMaximum(Calendar.DATE);
		return value;
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "NoOfDaysinMonth";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
