package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(datetimeutilities.actions.CurrentWeekinMonth.class);
    registrator.registerUserAction(datetimeutilities.actions.MonthEndDate.class);
    registrator.registerUserAction(datetimeutilities.actions.MonthOfYear.class);
    registrator.registerUserAction(datetimeutilities.actions.MonthStartDate.class);
    registrator.registerUserAction(datetimeutilities.actions.NextMonthEndDate.class);
    registrator.registerUserAction(datetimeutilities.actions.NextMonthStartDate.class);
    registrator.registerUserAction(datetimeutilities.actions.NoOfDaysinMonth.class);
    registrator.registerUserAction(datetimeutilities.actions.NoOfWeeksinMonth.class);
    registrator.registerUserAction(datetimeutilities.actions.PreviousMonthEndDate.class);
    registrator.registerUserAction(datetimeutilities.actions.PreviousMonthStartDate.class);
    registrator.registerUserAction(datetimeutilities.actions.TotalWeeksinYear.class);
    registrator.registerUserAction(datetimeutilities.actions.WeekOfYear.class);
    registrator.registerUserAction(datetimeutilities.actions.WorkingDaysExcludingDates.class);
    registrator.registerUserAction(datetimeutilities.actions.WorkingDaysIncludingDates.class);
    registrator.registerUserAction(mendixsso.actions.DecryptString.class);
    registrator.registerUserAction(mendixsso.actions.EncryptString.class);
    registrator.registerUserAction(mendixsso.actions.FindOrCreateUserWithUserInfo.class);
    registrator.registerUserAction(mendixsso.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(mendixsso.actions.GetTokenEndpointURI.class);
    registrator.registerUserAction(mendixsso.actions.GetUserInfoEndpointURI.class);
    registrator.registerUserAction(mendixsso.actions.GetUserProfileFromUserInfoJSON.class);
    registrator.registerUserAction(mendixsso.actions.InitializeUserMapper.class);
    registrator.registerUserAction(mendixsso.actions.LoadBooleanValueFromEnvOrDefault.class);
    registrator.registerUserAction(mendixsso.actions.LoadStringValueFromEnvOrDefault.class);
    registrator.registerUserAction(mendixsso.actions.LogOutUser.class);
    registrator.registerUserAction(mendixsso.actions.StartSignOnServlet.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
