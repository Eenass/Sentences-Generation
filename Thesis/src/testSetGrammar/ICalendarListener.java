// Generated from ICalendar.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICalendarParser}.
 */
public interface ICalendarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICalendarParser#summary}.
	 * @param ctx the parse tree
	 */
	void enterSummary(@NotNull ICalendarParser.SummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#summary}.
	 * @param ctx the parse tree
	 */
	void exitSummary(@NotNull ICalendarParser.SummaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 */
	void enterRangeparam(@NotNull ICalendarParser.RangeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 */
	void exitRangeparam(@NotNull ICalendarParser.RangeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_location}.
	 * @param ctx the parse tree
	 */
	void enterK_location(@NotNull ICalendarParser.K_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_location}.
	 * @param ctx the parse tree
	 */
	void exitK_location(@NotNull ICalendarParser.K_locationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 */
	void enterK_monthly(@NotNull ICalendarParser.K_monthlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 */
	void exitK_monthly(@NotNull ICalendarParser.K_monthlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#attendee}.
	 * @param ctx the parse tree
	 */
	void enterAttendee(@NotNull ICalendarParser.AttendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#attendee}.
	 * @param ctx the parse tree
	 */
	void exitAttendee(@NotNull ICalendarParser.AttendeeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#freq}.
	 * @param ctx the parse tree
	 */
	void enterFreq(@NotNull ICalendarParser.FreqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#freq}.
	 * @param ctx the parse tree
	 */
	void exitFreq(@NotNull ICalendarParser.FreqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 */
	void enterK_bysecond(@NotNull ICalendarParser.K_bysecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 */
	void exitK_bysecond(@NotNull ICalendarParser.K_bysecondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_status}.
	 * @param ctx the parse tree
	 */
	void enterK_status(@NotNull ICalendarParser.K_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_status}.
	 * @param ctx the parse tree
	 */
	void exitK_status(@NotNull ICalendarParser.K_statusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_public}.
	 * @param ctx the parse tree
	 */
	void enterK_public(@NotNull ICalendarParser.K_publicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_public}.
	 * @param ctx the parse tree
	 */
	void exitK_public(@NotNull ICalendarParser.K_publicContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 */
	void enterEventprop(@NotNull ICalendarParser.EventpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 */
	void exitEventprop(@NotNull ICalendarParser.EventpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void enterK_interval(@NotNull ICalendarParser.K_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void exitK_interval(@NotNull ICalendarParser.K_intervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_due}.
	 * @param ctx the parse tree
	 */
	void enterK_due(@NotNull ICalendarParser.K_dueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_due}.
	 * @param ctx the parse tree
	 */
	void exitK_due(@NotNull ICalendarParser.K_dueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_start}.
	 * @param ctx the parse tree
	 */
	void enterK_start(@NotNull ICalendarParser.K_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_start}.
	 * @param ctx the parse tree
	 */
	void exitK_start(@NotNull ICalendarParser.K_startContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_free}.
	 * @param ctx the parse tree
	 */
	void enterK_free(@NotNull ICalendarParser.K_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_free}.
	 * @param ctx the parse tree
	 */
	void exitK_free(@NotNull ICalendarParser.K_freeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rdate}.
	 * @param ctx the parse tree
	 */
	void enterRdate(@NotNull ICalendarParser.RdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rdate}.
	 * @param ctx the parse tree
	 */
	void exitRdate(@NotNull ICalendarParser.RdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_date(@NotNull ICalendarParser.Date_time_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_date(@NotNull ICalendarParser.Date_time_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 */
	void enterK_contact(@NotNull ICalendarParser.K_contactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 */
	void exitK_contact(@NotNull ICalendarParser.K_contactContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull ICalendarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull ICalendarParser.TimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 */
	void enterTime_minute(@NotNull ICalendarParser.Time_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 */
	void exitTime_minute(@NotNull ICalendarParser.Time_minuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#created}.
	 * @param ctx the parse tree
	 */
	void enterCreated(@NotNull ICalendarParser.CreatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#created}.
	 * @param ctx the parse tree
	 */
	void exitCreated(@NotNull ICalendarParser.CreatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 */
	void enterK_altrep(@NotNull ICalendarParser.K_altrepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 */
	void exitK_altrep(@NotNull ICalendarParser.K_altrepContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 */
	void enterDtstparam(@NotNull ICalendarParser.DtstparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 */
	void exitDtstparam(@NotNull ICalendarParser.DtstparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 */
	void enterAlarmc(@NotNull ICalendarParser.AlarmcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 */
	void exitAlarmc(@NotNull ICalendarParser.AlarmcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 */
	void enterK_freq(@NotNull ICalendarParser.K_freqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 */
	void exitK_freq(@NotNull ICalendarParser.K_freqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(@NotNull ICalendarParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(@NotNull ICalendarParser.Date_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 */
	void enterK_freebusy(@NotNull ICalendarParser.K_freebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 */
	void exitK_freebusy(@NotNull ICalendarParser.K_freebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 */
	void enterResrcparam(@NotNull ICalendarParser.ResrcparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 */
	void exitResrcparam(@NotNull ICalendarParser.ResrcparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 */
	void enterParamtext(@NotNull ICalendarParser.ParamtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 */
	void exitParamtext(@NotNull ICalendarParser.ParamtextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue(@NotNull ICalendarParser.StatvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue(@NotNull ICalendarParser.StatvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#organizer}.
	 * @param ctx the parse tree
	 */
	void enterOrganizer(@NotNull ICalendarParser.OrganizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#organizer}.
	 * @param ctx the parse tree
	 */
	void exitOrganizer(@NotNull ICalendarParser.OrganizerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 */
	void enterDelfromparam(@NotNull ICalendarParser.DelfromparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 */
	void exitDelfromparam(@NotNull ICalendarParser.DelfromparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_method}.
	 * @param ctx the parse tree
	 */
	void enterK_method(@NotNull ICalendarParser.K_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_method}.
	 * @param ctx the parse tree
	 */
	void exitK_method(@NotNull ICalendarParser.K_methodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#period_start}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_start(@NotNull ICalendarParser.Period_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#period_start}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_start(@NotNull ICalendarParser.Period_startContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 */
	void enterPriovalue(@NotNull ICalendarParser.PriovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 */
	void exitPriovalue(@NotNull ICalendarParser.PriovalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 */
	void enterK_uid(@NotNull ICalendarParser.K_uidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 */
	void exitK_uid(@NotNull ICalendarParser.K_uidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull ICalendarParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull ICalendarParser.DigitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 */
	void enterK_vevent(@NotNull ICalendarParser.K_veventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 */
	void exitK_vevent(@NotNull ICalendarParser.K_veventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 */
	void enterRdtparam(@NotNull ICalendarParser.RdtparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 */
	void exitRdtparam(@NotNull ICalendarParser.RdtparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ICalendarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ICalendarParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#enddate}.
	 * @param ctx the parse tree
	 */
	void enterEnddate(@NotNull ICalendarParser.EnddateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#enddate}.
	 * @param ctx the parse tree
	 */
	void exitEnddate(@NotNull ICalendarParser.EnddateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#calprop}.
	 * @param ctx the parse tree
	 */
	void enterCalprop(@NotNull ICalendarParser.CalpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#calprop}.
	 * @param ctx the parse tree
	 */
	void exitCalprop(@NotNull ICalendarParser.CalpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_member}.
	 * @param ctx the parse tree
	 */
	void enterK_member(@NotNull ICalendarParser.K_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_member}.
	 * @param ctx the parse tree
	 */
	void exitK_member(@NotNull ICalendarParser.K_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#value_char}.
	 * @param ctx the parse tree
	 */
	void enterValue_char(@NotNull ICalendarParser.Value_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#value_char}.
	 * @param ctx the parse tree
	 */
	void exitValue_char(@NotNull ICalendarParser.Value_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_version}.
	 * @param ctx the parse tree
	 */
	void enterK_version(@NotNull ICalendarParser.K_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_version}.
	 * @param ctx the parse tree
	 */
	void exitK_version(@NotNull ICalendarParser.K_versionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 */
	void enterK_utc_offset(@NotNull ICalendarParser.K_utc_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 */
	void exitK_utc_offset(@NotNull ICalendarParser.K_utc_offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 */
	void enterTsafe_char(@NotNull ICalendarParser.Tsafe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 */
	void exitTsafe_char(@NotNull ICalendarParser.Tsafe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 */
	void enterRstatparam(@NotNull ICalendarParser.RstatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 */
	void exitRstatparam(@NotNull ICalendarParser.RstatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 */
	void enterCal_address(@NotNull ICalendarParser.Cal_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 */
	void exitCal_address(@NotNull ICalendarParser.Cal_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 */
	void enterGeovalue(@NotNull ICalendarParser.GeovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 */
	void exitGeovalue(@NotNull ICalendarParser.GeovalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 */
	void enterK_in_progress(@NotNull ICalendarParser.K_in_progressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 */
	void exitK_in_progress(@NotNull ICalendarParser.K_in_progressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull ICalendarParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull ICalendarParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzname}.
	 * @param ctx the parse tree
	 */
	void enterTzname(@NotNull ICalendarParser.TznameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzname}.
	 * @param ctx the parse tree
	 */
	void exitTzname(@NotNull ICalendarParser.TznameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 */
	void enterK_transparent(@NotNull ICalendarParser.K_transparentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 */
	void exitK_transparent(@NotNull ICalendarParser.K_transparentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 */
	void enterK_recurrence_id(@NotNull ICalendarParser.K_recurrence_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 */
	void exitK_recurrence_id(@NotNull ICalendarParser.K_recurrence_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 */
	void enterK_confidential(@NotNull ICalendarParser.K_confidentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 */
	void exitK_confidential(@NotNull ICalendarParser.K_confidentialContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 */
	void enterDtendparam(@NotNull ICalendarParser.DtendparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 */
	void exitDtendparam(@NotNull ICalendarParser.DtendparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 */
	void enterK_parent(@NotNull ICalendarParser.K_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 */
	void exitK_parent(@NotNull ICalendarParser.K_parentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#eventc}.
	 * @param ctx the parse tree
	 */
	void enterEventc(@NotNull ICalendarParser.EventcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#eventc}.
	 * @param ctx the parse tree
	 */
	void exitEventc(@NotNull ICalendarParser.EventcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 */
	void enterK_cancelled(@NotNull ICalendarParser.K_cancelledContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 */
	void exitK_cancelled(@NotNull ICalendarParser.K_cancelledContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 */
	void enterK_bymonth(@NotNull ICalendarParser.K_bymonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 */
	void exitK_bymonth(@NotNull ICalendarParser.K_bymonthContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 */
	void enterLanguageparam(@NotNull ICalendarParser.LanguageparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 */
	void exitLanguageparam(@NotNull ICalendarParser.LanguageparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 */
	void enterK_prodid(@NotNull ICalendarParser.K_prodidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 */
	void exitK_prodid(@NotNull ICalendarParser.K_prodidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ICalendarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ICalendarParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 */
	void enterActionvalue(@NotNull ICalendarParser.ActionvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 */
	void exitActionvalue(@NotNull ICalendarParser.ActionvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#standardc}.
	 * @param ctx the parse tree
	 */
	void enterStandardc(@NotNull ICalendarParser.StandardcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#standardc}.
	 * @param ctx the parse tree
	 */
	void exitStandardc(@NotNull ICalendarParser.StandardcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 */
	void enterK_dir(@NotNull ICalendarParser.K_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 */
	void exitK_dir(@NotNull ICalendarParser.K_dirContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull ICalendarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull ICalendarParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 */
	void enterK_rsvp(@NotNull ICalendarParser.K_rsvpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 */
	void exitK_rsvp(@NotNull ICalendarParser.K_rsvpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 */
	void enterK_dtstamp(@NotNull ICalendarParser.K_dtstampContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 */
	void exitK_dtstamp(@NotNull ICalendarParser.K_dtstampContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 */
	void enterTrigabs(@NotNull ICalendarParser.TrigabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 */
	void exitTrigabs(@NotNull ICalendarParser.TrigabsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#language_char}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_char(@NotNull ICalendarParser.Language_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#language_char}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_char(@NotNull ICalendarParser.Language_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 */
	void enterK_sent_by(@NotNull ICalendarParser.K_sent_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 */
	void exitK_sent_by(@NotNull ICalendarParser.K_sent_byContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 */
	void enterRsvpparam(@NotNull ICalendarParser.RsvpparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 */
	void exitRsvpparam(@NotNull ICalendarParser.RsvpparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 */
	void enterBymolist(@NotNull ICalendarParser.BymolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 */
	void exitBymolist(@NotNull ICalendarParser.BymolistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 */
	void enterTzidparam(@NotNull ICalendarParser.TzidparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 */
	void exitTzidparam(@NotNull ICalendarParser.TzidparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 */
	void enterUtc_offset(@NotNull ICalendarParser.Utc_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 */
	void exitUtc_offset(@NotNull ICalendarParser.Utc_offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_base}.
	 * @param ctx the parse tree
	 */
	void enterK_base(@NotNull ICalendarParser.K_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_base}.
	 * @param ctx the parse tree
	 */
	void exitK_base(@NotNull ICalendarParser.K_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 */
	void enterTime_numzone(@NotNull ICalendarParser.Time_numzoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 */
	void exitTime_numzone(@NotNull ICalendarParser.Time_numzoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 */
	void enterK_tentative(@NotNull ICalendarParser.K_tentativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 */
	void exitK_tentative(@NotNull ICalendarParser.K_tentativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 */
	void enterK_sequence(@NotNull ICalendarParser.K_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 */
	void exitK_sequence(@NotNull ICalendarParser.K_sequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_action}.
	 * @param ctx the parse tree
	 */
	void enterK_action(@NotNull ICalendarParser.K_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_action}.
	 * @param ctx the parse tree
	 */
	void exitK_action(@NotNull ICalendarParser.K_actionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_name(@NotNull ICalendarParser.Subtype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_name(@NotNull ICalendarParser.Subtype_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 */
	void enterRdtval(@NotNull ICalendarParser.RdtvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 */
	void exitRdtval(@NotNull ICalendarParser.RdtvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 */
	void enterTzprop(@NotNull ICalendarParser.TzpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 */
	void exitTzprop(@NotNull ICalendarParser.TzpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#exdate}.
	 * @param ctx the parse tree
	 */
	void enterExdate(@NotNull ICalendarParser.ExdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#exdate}.
	 * @param ctx the parse tree
	 */
	void exitExdate(@NotNull ICalendarParser.ExdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 */
	void enterDur_value(@NotNull ICalendarParser.Dur_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 */
	void exitDur_value(@NotNull ICalendarParser.Dur_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#param_value}.
	 * @param ctx the parse tree
	 */
	void enterParam_value(@NotNull ICalendarParser.Param_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#param_value}.
	 * @param ctx the parse tree
	 */
	void exitParam_value(@NotNull ICalendarParser.Param_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull ICalendarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull ICalendarParser.ResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 */
	void enterK_tu(@NotNull ICalendarParser.K_tuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 */
	void exitK_tu(@NotNull ICalendarParser.K_tuContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull ICalendarParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull ICalendarParser.PercentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void enterDate_fullyear(@NotNull ICalendarParser.Date_fullyearContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void exitDate_fullyear(@NotNull ICalendarParser.Date_fullyearContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 */
	void enterK_valarm(@NotNull ICalendarParser.K_valarmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 */
	void exitK_valarm(@NotNull ICalendarParser.K_valarmContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_true}.
	 * @param ctx the parse tree
	 */
	void enterK_true(@NotNull ICalendarParser.K_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_true}.
	 * @param ctx the parse tree
	 */
	void exitK_true(@NotNull ICalendarParser.K_trueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#descparam}.
	 * @param ctx the parse tree
	 */
	void enterDescparam(@NotNull ICalendarParser.DescparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#descparam}.
	 * @param ctx the parse tree
	 */
	void exitDescparam(@NotNull ICalendarParser.DescparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 */
	void enterReltypeparam(@NotNull ICalendarParser.ReltypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 */
	void exitReltypeparam(@NotNull ICalendarParser.ReltypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 */
	void enterK_date_time(@NotNull ICalendarParser.K_date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 */
	void exitK_date_time(@NotNull ICalendarParser.K_date_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_email}.
	 * @param ctx the parse tree
	 */
	void enterK_email(@NotNull ICalendarParser.K_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_email}.
	 * @param ctx the parse tree
	 */
	void exitK_email(@NotNull ICalendarParser.K_emailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 */
	void enterK_binary(@NotNull ICalendarParser.K_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 */
	void exitK_binary(@NotNull ICalendarParser.K_binaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(@NotNull ICalendarParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(@NotNull ICalendarParser.Quoted_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull ICalendarParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull ICalendarParser.ComponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(@NotNull ICalendarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(@NotNull ICalendarParser.DescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(@NotNull ICalendarParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(@NotNull ICalendarParser.PriorityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 */
	void enterDigits_2(@NotNull ICalendarParser.Digits_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 */
	void exitDigits_2(@NotNull ICalendarParser.Digits_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 */
	void enterFreebusy(@NotNull ICalendarParser.FreebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 */
	void exitFreebusy(@NotNull ICalendarParser.FreebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_event(@NotNull ICalendarParser.Partstat_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_event(@NotNull ICalendarParser.Partstat_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_participant(@NotNull ICalendarParser.K_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_participant(@NotNull ICalendarParser.K_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#summparam}.
	 * @param ctx the parse tree
	 */
	void enterSummparam(@NotNull ICalendarParser.SummparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#summparam}.
	 * @param ctx the parse tree
	 */
	void exitSummparam(@NotNull ICalendarParser.SummparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_th}.
	 * @param ctx the parse tree
	 */
	void enterK_th(@NotNull ICalendarParser.K_thContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_th}.
	 * @param ctx the parse tree
	 */
	void exitK_th(@NotNull ICalendarParser.K_thContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 */
	void enterEncodingparam(@NotNull ICalendarParser.EncodingparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 */
	void exitEncodingparam(@NotNull ICalendarParser.EncodingparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 */
	void enterK_opaque(@NotNull ICalendarParser.K_opaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 */
	void exitK_opaque(@NotNull ICalendarParser.K_opaqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull ICalendarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull ICalendarParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_process}.
	 * @param ctx the parse tree
	 */
	void enterK_process(@NotNull ICalendarParser.K_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_process}.
	 * @param ctx the parse tree
	 */
	void exitK_process(@NotNull ICalendarParser.K_processContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#geo}.
	 * @param ctx the parse tree
	 */
	void enterGeo(@NotNull ICalendarParser.GeoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#geo}.
	 * @param ctx the parse tree
	 */
	void exitGeo(@NotNull ICalendarParser.GeoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 */
	void enterExdtparam(@NotNull ICalendarParser.ExdtparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 */
	void exitExdtparam(@NotNull ICalendarParser.ExdtparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_class}.
	 * @param ctx the parse tree
	 */
	void enterK_class(@NotNull ICalendarParser.K_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_class}.
	 * @param ctx the parse tree
	 */
	void exitK_class(@NotNull ICalendarParser.K_classContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 */
	void enterK_resources(@NotNull ICalendarParser.K_resourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 */
	void exitK_resources(@NotNull ICalendarParser.K_resourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 */
	void enterK_transp(@NotNull ICalendarParser.K_transpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 */
	void exitK_transp(@NotNull ICalendarParser.K_transpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void enterReg_name(@NotNull ICalendarParser.Reg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void exitReg_name(@NotNull ICalendarParser.Reg_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_period}.
	 * @param ctx the parse tree
	 */
	void enterK_period(@NotNull ICalendarParser.K_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_period}.
	 * @param ctx the parse tree
	 */
	void exitK_period(@NotNull ICalendarParser.K_periodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(@NotNull ICalendarParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(@NotNull ICalendarParser.PeriodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(@NotNull ICalendarParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(@NotNull ICalendarParser.UriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull ICalendarParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull ICalendarParser.UrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void enterK_tzoffsetfrom(@NotNull ICalendarParser.K_tzoffsetfromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void exitK_tzoffsetfrom(@NotNull ICalendarParser.K_tzoffsetfromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 */
	void enterK_fmttype(@NotNull ICalendarParser.K_fmttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 */
	void exitK_fmttype(@NotNull ICalendarParser.K_fmttypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 */
	void enterByseclist(@NotNull ICalendarParser.ByseclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 */
	void exitByseclist(@NotNull ICalendarParser.ByseclistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 */
	void enterK_individual(@NotNull ICalendarParser.K_individualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 */
	void exitK_individual(@NotNull ICalendarParser.K_individualContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#due}.
	 * @param ctx the parse tree
	 */
	void enterDue(@NotNull ICalendarParser.DueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#due}.
	 * @param ctx the parse tree
	 */
	void exitDue(@NotNull ICalendarParser.DueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 */
	void enterDirparam(@NotNull ICalendarParser.DirparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 */
	void exitDirparam(@NotNull ICalendarParser.DirparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 */
	void enterBywknolist(@NotNull ICalendarParser.BywknolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 */
	void exitBywknolist(@NotNull ICalendarParser.BywknolistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_date}.
	 * @param ctx the parse tree
	 */
	void enterK_date(@NotNull ICalendarParser.K_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_date}.
	 * @param ctx the parse tree
	 */
	void exitK_date(@NotNull ICalendarParser.K_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_num(@NotNull ICalendarParser.Alpha_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_num(@NotNull ICalendarParser.Alpha_numContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(@NotNull ICalendarParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(@NotNull ICalendarParser.ClazzContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_non_participant(@NotNull ICalendarParser.K_non_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_non_participant(@NotNull ICalendarParser.K_non_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#locparam}.
	 * @param ctx the parse tree
	 */
	void enterLocparam(@NotNull ICalendarParser.LocparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#locparam}.
	 * @param ctx the parse tree
	 */
	void exitLocparam(@NotNull ICalendarParser.LocparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 */
	void enterK_integer(@NotNull ICalendarParser.K_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 */
	void exitK_integer(@NotNull ICalendarParser.K_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 */
	void enterK_dtstart(@NotNull ICalendarParser.K_dtstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 */
	void exitK_dtstart(@NotNull ICalendarParser.K_dtstartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 */
	void enterTrigrel(@NotNull ICalendarParser.TrigrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 */
	void exitTrigrel(@NotNull ICalendarParser.TrigrelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated_from(@NotNull ICalendarParser.K_delegated_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated_from(@NotNull ICalendarParser.K_delegated_fromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 */
	void enterK_daylight(@NotNull ICalendarParser.K_daylightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 */
	void exitK_daylight(@NotNull ICalendarParser.K_daylightContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 */
	void enterFbvalue(@NotNull ICalendarParser.FbvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 */
	void exitFbvalue(@NotNull ICalendarParser.FbvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_todo(@NotNull ICalendarParser.Partstat_todoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_todo(@NotNull ICalendarParser.Partstat_todoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 */
	void enterK_encoding(@NotNull ICalendarParser.K_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 */
	void exitK_encoding(@NotNull ICalendarParser.K_encodingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_req_participant(@NotNull ICalendarParser.K_req_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_req_participant(@NotNull ICalendarParser.K_req_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 */
	void enterIcalstream(@NotNull ICalendarParser.IcalstreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 */
	void exitIcalstream(@NotNull ICalendarParser.IcalstreamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#statcode}.
	 * @param ctx the parse tree
	 */
	void enterStatcode(@NotNull ICalendarParser.StatcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#statcode}.
	 * @param ctx the parse tree
	 */
	void exitStatcode(@NotNull ICalendarParser.StatcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 */
	void enterK_organizer(@NotNull ICalendarParser.K_organizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 */
	void exitK_organizer(@NotNull ICalendarParser.K_organizerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 */
	void enterK_cn(@NotNull ICalendarParser.K_cnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 */
	void exitK_cn(@NotNull ICalendarParser.K_cnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull ICalendarParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull ICalendarParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 */
	void enterTznparam(@NotNull ICalendarParser.TznparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 */
	void exitTznparam(@NotNull ICalendarParser.TznparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#todoc}.
	 * @param ctx the parse tree
	 */
	void enterTodoc(@NotNull ICalendarParser.TodocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#todoc}.
	 * @param ctx the parse tree
	 */
	void exitTodoc(@NotNull ICalendarParser.TodocContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 */
	void enterK_vcalendar(@NotNull ICalendarParser.K_vcalendarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 */
	void exitK_vcalendar(@NotNull ICalendarParser.K_vcalendarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 */
	void enterK_byday(@NotNull ICalendarParser.K_bydayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 */
	void exitK_byday(@NotNull ICalendarParser.K_bydayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 */
	void enterDur_hour(@NotNull ICalendarParser.Dur_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 */
	void exitDur_hour(@NotNull ICalendarParser.Dur_hourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_false}.
	 * @param ctx the parse tree
	 */
	void enterK_false(@NotNull ICalendarParser.K_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_false}.
	 * @param ctx the parse tree
	 */
	void exitK_false(@NotNull ICalendarParser.K_falseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(@NotNull ICalendarParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(@NotNull ICalendarParser.AlphaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ICalendarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ICalendarParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 */
	void enterK_repeat(@NotNull ICalendarParser.K_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 */
	void exitK_repeat(@NotNull ICalendarParser.K_repeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 */
	void enterTransvalue(@NotNull ICalendarParser.TransvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 */
	void exitTransvalue(@NotNull ICalendarParser.TransvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_range}.
	 * @param ctx the parse tree
	 */
	void enterK_range(@NotNull ICalendarParser.K_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_range}.
	 * @param ctx the parse tree
	 */
	void exitK_range(@NotNull ICalendarParser.K_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 */
	void enterK_byminute(@NotNull ICalendarParser.K_byminuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 */
	void exitK_byminute(@NotNull ICalendarParser.K_byminuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_jour(@NotNull ICalendarParser.Partstat_jourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_jour(@NotNull ICalendarParser.Partstat_jourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 */
	void enterK_begin(@NotNull ICalendarParser.K_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 */
	void exitK_begin(@NotNull ICalendarParser.K_beginContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_until}.
	 * @param ctx the parse tree
	 */
	void enterK_until(@NotNull ICalendarParser.K_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_until}.
	 * @param ctx the parse tree
	 */
	void exitK_until(@NotNull ICalendarParser.K_untilContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 */
	void enterTimezonec(@NotNull ICalendarParser.TimezonecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 */
	void exitTimezonec(@NotNull ICalendarParser.TimezonecContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_su}.
	 * @param ctx the parse tree
	 */
	void enterK_su(@NotNull ICalendarParser.K_suContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_su}.
	 * @param ctx the parse tree
	 */
	void exitK_su(@NotNull ICalendarParser.K_suContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 */
	void enterK_busy_unavailable(@NotNull ICalendarParser.K_busy_unavailableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 */
	void exitK_busy_unavailable(@NotNull ICalendarParser.K_busy_unavailableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 */
	void enterFbprop(@NotNull ICalendarParser.FbpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 */
	void exitFbprop(@NotNull ICalendarParser.FbpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 */
	void enterK_last_modified(@NotNull ICalendarParser.K_last_modifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 */
	void exitK_last_modified(@NotNull ICalendarParser.K_last_modifiedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 */
	void enterK_duration(@NotNull ICalendarParser.K_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 */
	void exitK_duration(@NotNull ICalendarParser.K_durationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#catparam}.
	 * @param ctx the parse tree
	 */
	void enterCatparam(@NotNull ICalendarParser.CatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#catparam}.
	 * @param ctx the parse tree
	 */
	void exitCatparam(@NotNull ICalendarParser.CatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_role}.
	 * @param ctx the parse tree
	 */
	void enterK_role(@NotNull ICalendarParser.K_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_role}.
	 * @param ctx the parse tree
	 */
	void exitK_role(@NotNull ICalendarParser.K_roleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 */
	void enterK_resource(@NotNull ICalendarParser.K_resourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 */
	void exitK_resource(@NotNull ICalendarParser.K_resourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_description}.
	 * @param ctx the parse tree
	 */
	void enterK_description(@NotNull ICalendarParser.K_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_description}.
	 * @param ctx the parse tree
	 */
	void exitK_description(@NotNull ICalendarParser.K_descriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 */
	void enterK_standard(@NotNull ICalendarParser.K_standardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 */
	void exitK_standard(@NotNull ICalendarParser.K_standardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 */
	void enterFbtypeparam(@NotNull ICalendarParser.FbtypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 */
	void exitFbtypeparam(@NotNull ICalendarParser.FbtypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 */
	void enterK_sa(@NotNull ICalendarParser.K_saContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 */
	void exitK_sa(@NotNull ICalendarParser.K_saContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 */
	void enterK_needs_action(@NotNull ICalendarParser.K_needs_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 */
	void exitK_needs_action(@NotNull ICalendarParser.K_needs_actionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 */
	void enterK_secondly(@NotNull ICalendarParser.K_secondlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 */
	void exitK_secondly(@NotNull ICalendarParser.K_secondlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 */
	void enterK_geo(@NotNull ICalendarParser.K_geoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 */
	void exitK_geo(@NotNull ICalendarParser.K_geoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(@NotNull ICalendarParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(@NotNull ICalendarParser.SeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#other_param}.
	 * @param ctx the parse tree
	 */
	void enterOther_param(@NotNull ICalendarParser.Other_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#other_param}.
	 * @param ctx the parse tree
	 */
	void exitOther_param(@NotNull ICalendarParser.Other_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_time}.
	 * @param ctx the parse tree
	 */
	void enterK_time(@NotNull ICalendarParser.K_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_time}.
	 * @param ctx the parse tree
	 */
	void exitK_time(@NotNull ICalendarParser.K_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#categories}.
	 * @param ctx the parse tree
	 */
	void enterCategories(@NotNull ICalendarParser.CategoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#categories}.
	 * @param ctx the parse tree
	 */
	void exitCategories(@NotNull ICalendarParser.CategoriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 */
	void enterK_declined(@NotNull ICalendarParser.K_declinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 */
	void exitK_declined(@NotNull ICalendarParser.K_declinedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 */
	void enterK_recur(@NotNull ICalendarParser.K_recurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 */
	void exitK_recur(@NotNull ICalendarParser.K_recurContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 */
	void enterIana_comp(@NotNull ICalendarParser.Iana_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 */
	void exitIana_comp(@NotNull ICalendarParser.Iana_compContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 */
	void enterDigits_1_2(@NotNull ICalendarParser.Digits_1_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 */
	void exitDigits_1_2(@NotNull ICalendarParser.Digits_1_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 */
	void enterRecur_rule_part(@NotNull ICalendarParser.Recur_rule_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 */
	void exitRecur_rule_part(@NotNull ICalendarParser.Recur_rule_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 */
	void enterDur_minute(@NotNull ICalendarParser.Dur_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 */
	void exitDur_minute(@NotNull ICalendarParser.Dur_minuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#b_end}.
	 * @param ctx the parse tree
	 */
	void enterB_end(@NotNull ICalendarParser.B_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#b_end}.
	 * @param ctx the parse tree
	 */
	void exitB_end(@NotNull ICalendarParser.B_endContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated(@NotNull ICalendarParser.K_delegatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated(@NotNull ICalendarParser.K_delegatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 */
	void enterDate_mday(@NotNull ICalendarParser.Date_mdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 */
	void exitDate_mday(@NotNull ICalendarParser.Date_mdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 */
	void enterByminlist(@NotNull ICalendarParser.ByminlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 */
	void exitByminlist(@NotNull ICalendarParser.ByminlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 */
	void enterFmttypeparam(@NotNull ICalendarParser.FmttypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 */
	void exitFmttypeparam(@NotNull ICalendarParser.FmttypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 */
	void enterIcalobject(@NotNull ICalendarParser.IcalobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 */
	void exitIcalobject(@NotNull ICalendarParser.IcalobjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 */
	void enterClassvalue(@NotNull ICalendarParser.ClassvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 */
	void exitClassvalue(@NotNull ICalendarParser.ClassvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 */
	void enterIana_param(@NotNull ICalendarParser.Iana_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 */
	void exitIana_param(@NotNull ICalendarParser.Iana_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 */
	void enterK_tzurl(@NotNull ICalendarParser.K_tzurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 */
	void exitK_tzurl(@NotNull ICalendarParser.K_tzurlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(@NotNull ICalendarParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(@NotNull ICalendarParser.Float_numContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 */
	void enterDur_time(@NotNull ICalendarParser.Dur_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 */
	void exitDur_time(@NotNull ICalendarParser.Dur_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 */
	void enterK_tzid(@NotNull ICalendarParser.K_tzidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 */
	void exitK_tzid(@NotNull ICalendarParser.K_tzidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_private}.
	 * @param ctx the parse tree
	 */
	void enterK_private(@NotNull ICalendarParser.K_privateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_private}.
	 * @param ctx the parse tree
	 */
	void exitK_private(@NotNull ICalendarParser.K_privateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#contparam}.
	 * @param ctx the parse tree
	 */
	void enterContparam(@NotNull ICalendarParser.ContparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#contparam}.
	 * @param ctx the parse tree
	 */
	void exitContparam(@NotNull ICalendarParser.ContparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated_to(@NotNull ICalendarParser.K_delegated_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated_to(@NotNull ICalendarParser.K_delegated_toContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 */
	void enterK_chair(@NotNull ICalendarParser.K_chairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 */
	void exitK_chair(@NotNull ICalendarParser.K_chairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_end}.
	 * @param ctx the parse tree
	 */
	void enterK_end(@NotNull ICalendarParser.K_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_end}.
	 * @param ctx the parse tree
	 */
	void exitK_end(@NotNull ICalendarParser.K_endContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_value(@NotNull ICalendarParser.Date_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_value(@NotNull ICalendarParser.Date_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 */
	void enterTrigrelparam(@NotNull ICalendarParser.TrigrelparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 */
	void exitTrigrelparam(@NotNull ICalendarParser.TrigrelparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 */
	void enterCutypeparam(@NotNull ICalendarParser.CutypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 */
	void exitCutypeparam(@NotNull ICalendarParser.CutypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 */
	void enterK_calscale(@NotNull ICalendarParser.K_calscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 */
	void exitK_calscale(@NotNull ICalendarParser.K_calscaleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 */
	void enterDueparam(@NotNull ICalendarParser.DueparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 */
	void exitDueparam(@NotNull ICalendarParser.DueparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 */
	void enterAltrepparam(@NotNull ICalendarParser.AltrepparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 */
	void exitAltrepparam(@NotNull ICalendarParser.AltrepparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 */
	void enterK_fbtype(@NotNull ICalendarParser.K_fbtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 */
	void exitK_fbtype(@NotNull ICalendarParser.K_fbtypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 */
	void enterDur_second(@NotNull ICalendarParser.Dur_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 */
	void exitDur_second(@NotNull ICalendarParser.Dur_secondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 */
	void enterK_related_to(@NotNull ICalendarParser.K_related_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 */
	void exitK_related_to(@NotNull ICalendarParser.K_related_toContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 */
	void enterK_dtend(@NotNull ICalendarParser.K_dtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 */
	void exitK_dtend(@NotNull ICalendarParser.K_dtendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 */
	void enterK_comment(@NotNull ICalendarParser.K_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 */
	void exitK_comment(@NotNull ICalendarParser.K_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 */
	void enterJourprop(@NotNull ICalendarParser.JourpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 */
	void exitJourprop(@NotNull ICalendarParser.JourpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#commparam}.
	 * @param ctx the parse tree
	 */
	void enterCommparam(@NotNull ICalendarParser.CommparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#commparam}.
	 * @param ctx the parse tree
	 */
	void exitCommparam(@NotNull ICalendarParser.CommparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void enterWeekdaynum(@NotNull ICalendarParser.WeekdaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void exitWeekdaynum(@NotNull ICalendarParser.WeekdaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#journalc}.
	 * @param ctx the parse tree
	 */
	void enterJournalc(@NotNull ICalendarParser.JournalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#journalc}.
	 * @param ctx the parse tree
	 */
	void exitJournalc(@NotNull ICalendarParser.JournalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 */
	void enterBymodaylist(@NotNull ICalendarParser.BymodaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 */
	void exitBymodaylist(@NotNull ICalendarParser.BymodaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 */
	void enterK_cutype(@NotNull ICalendarParser.K_cutypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 */
	void exitK_cutype(@NotNull ICalendarParser.K_cutypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#attparam}.
	 * @param ctx the parse tree
	 */
	void enterAttparam(@NotNull ICalendarParser.AttparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#attparam}.
	 * @param ctx the parse tree
	 */
	void exitAttparam(@NotNull ICalendarParser.AttparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 */
	void enterB_chars(@NotNull ICalendarParser.B_charsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 */
	void exitB_chars(@NotNull ICalendarParser.B_charsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(@NotNull ICalendarParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(@NotNull ICalendarParser.LanguageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull ICalendarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull ICalendarParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 */
	void enterValuetypeparam(@NotNull ICalendarParser.ValuetypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 */
	void exitValuetypeparam(@NotNull ICalendarParser.ValuetypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 */
	void enterK_hourly(@NotNull ICalendarParser.K_hourlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 */
	void exitK_hourly(@NotNull ICalendarParser.K_hourlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 */
	void enterVervalue(@NotNull ICalendarParser.VervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 */
	void exitVervalue(@NotNull ICalendarParser.VervalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ICalendarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ICalendarParser.BinaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 */
	void enterK_rrule(@NotNull ICalendarParser.K_rruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 */
	void exitK_rrule(@NotNull ICalendarParser.K_rruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull ICalendarParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull ICalendarParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 */
	void enterRidparam(@NotNull ICalendarParser.RidparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 */
	void exitRidparam(@NotNull ICalendarParser.RidparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 */
	void enterFbparam(@NotNull ICalendarParser.FbparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 */
	void exitFbparam(@NotNull ICalendarParser.FbparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_related}.
	 * @param ctx the parse tree
	 */
	void enterK_related(@NotNull ICalendarParser.K_relatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_related}.
	 * @param ctx the parse tree
	 */
	void exitK_related(@NotNull ICalendarParser.K_relatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 */
	void enterPartstatparam(@NotNull ICalendarParser.PartstatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 */
	void exitPartstatparam(@NotNull ICalendarParser.PartstatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(@NotNull ICalendarParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(@NotNull ICalendarParser.Param_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 */
	void enterK_draft(@NotNull ICalendarParser.K_draftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 */
	void exitK_draft(@NotNull ICalendarParser.K_draftContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#contact}.
	 * @param ctx the parse tree
	 */
	void enterContact(@NotNull ICalendarParser.ContactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#contact}.
	 * @param ctx the parse tree
	 */
	void exitContact(@NotNull ICalendarParser.ContactContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#calscale}.
	 * @param ctx the parse tree
	 */
	void enterCalscale(@NotNull ICalendarParser.CalscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#calscale}.
	 * @param ctx the parse tree
	 */
	void exitCalscale(@NotNull ICalendarParser.CalscaleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 */
	void enterK_summary(@NotNull ICalendarParser.K_summaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 */
	void exitK_summary(@NotNull ICalendarParser.K_summaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 */
	void enterK_fr(@NotNull ICalendarParser.K_frContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 */
	void exitK_fr(@NotNull ICalendarParser.K_frContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 */
	void enterK_busy_tentative(@NotNull ICalendarParser.K_busy_tentativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 */
	void exitK_busy_tentative(@NotNull ICalendarParser.K_busy_tentativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(@NotNull ICalendarParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(@NotNull ICalendarParser.VersionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void enterValuetype(@NotNull ICalendarParser.ValuetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void exitValuetype(@NotNull ICalendarParser.ValuetypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 */
	void enterDaylightc(@NotNull ICalendarParser.DaylightcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 */
	void exitDaylightc(@NotNull ICalendarParser.DaylightcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 */
	void enterRstatus(@NotNull ICalendarParser.RstatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 */
	void exitRstatus(@NotNull ICalendarParser.RstatusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 */
	void enterK_busy(@NotNull ICalendarParser.K_busyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 */
	void exitK_busy(@NotNull ICalendarParser.K_busyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 */
	void enterK_reltype(@NotNull ICalendarParser.K_reltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 */
	void exitK_reltype(@NotNull ICalendarParser.K_reltypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void enterK_boolean(@NotNull ICalendarParser.K_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void exitK_boolean(@NotNull ICalendarParser.K_booleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 */
	void enterK_yearly(@NotNull ICalendarParser.K_yearlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 */
	void exitK_yearly(@NotNull ICalendarParser.K_yearlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 */
	void enterK_cal_address(@NotNull ICalendarParser.K_cal_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 */
	void exitK_cal_address(@NotNull ICalendarParser.K_cal_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#recur}.
	 * @param ctx the parse tree
	 */
	void enterRecur(@NotNull ICalendarParser.RecurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#recur}.
	 * @param ctx the parse tree
	 */
	void exitRecur(@NotNull ICalendarParser.RecurContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 */
	void enterK_percent_complete(@NotNull ICalendarParser.K_percent_completeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 */
	void exitK_percent_complete(@NotNull ICalendarParser.K_percent_completeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 */
	void enterK_attach(@NotNull ICalendarParser.K_attachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 */
	void exitK_attach(@NotNull ICalendarParser.K_attachContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#completed}.
	 * @param ctx the parse tree
	 */
	void enterCompleted(@NotNull ICalendarParser.CompletedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#completed}.
	 * @param ctx the parse tree
	 */
	void exitCompleted(@NotNull ICalendarParser.CompletedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 */
	void enterK_request_status(@NotNull ICalendarParser.K_request_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 */
	void exitK_request_status(@NotNull ICalendarParser.K_request_statusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 */
	void enterTzurl(@NotNull ICalendarParser.TzurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 */
	void exitTzurl(@NotNull ICalendarParser.TzurlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 */
	void enterK_vjournal(@NotNull ICalendarParser.K_vjournalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 */
	void exitK_vjournal(@NotNull ICalendarParser.K_vjournalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 */
	void enterK_daily(@NotNull ICalendarParser.K_dailyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 */
	void exitK_daily(@NotNull ICalendarParser.K_dailyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(@NotNull ICalendarParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(@NotNull ICalendarParser.TriggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_room}.
	 * @param ctx the parse tree
	 */
	void enterK_room(@NotNull ICalendarParser.K_roomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_room}.
	 * @param ctx the parse tree
	 */
	void exitK_room(@NotNull ICalendarParser.K_roomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_todo(@NotNull ICalendarParser.Statvalue_todoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_todo(@NotNull ICalendarParser.Statvalue_todoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_child}.
	 * @param ctx the parse tree
	 */
	void enterK_child(@NotNull ICalendarParser.K_childContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_child}.
	 * @param ctx the parse tree
	 */
	void exitK_child(@NotNull ICalendarParser.K_childContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 */
	void enterK_relat(@NotNull ICalendarParser.K_relatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 */
	void exitK_relat(@NotNull ICalendarParser.K_relatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_we}.
	 * @param ctx the parse tree
	 */
	void enterK_we(@NotNull ICalendarParser.K_weContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_we}.
	 * @param ctx the parse tree
	 */
	void exitK_we(@NotNull ICalendarParser.K_weContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 */
	void enterK_priority(@NotNull ICalendarParser.K_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 */
	void exitK_priority(@NotNull ICalendarParser.K_priorityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 */
	void enterK_minutely(@NotNull ICalendarParser.K_minutelyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 */
	void exitK_minutely(@NotNull ICalendarParser.K_minutelyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 */
	void enterK_bymonthday(@NotNull ICalendarParser.K_bymonthdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 */
	void exitK_bymonthday(@NotNull ICalendarParser.K_bymonthdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 */
	void enterQsafe_char(@NotNull ICalendarParser.Qsafe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 */
	void exitQsafe_char(@NotNull ICalendarParser.Qsafe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#recurid}.
	 * @param ctx the parse tree
	 */
	void enterRecurid(@NotNull ICalendarParser.RecuridContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#recurid}.
	 * @param ctx the parse tree
	 */
	void exitRecurid(@NotNull ICalendarParser.RecuridContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 */
	void enterAlarmprop(@NotNull ICalendarParser.AlarmpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 */
	void exitAlarmprop(@NotNull ICalendarParser.AlarmpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_value}.
	 * @param ctx the parse tree
	 */
	void enterK_value(@NotNull ICalendarParser.K_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_value}.
	 * @param ctx the parse tree
	 */
	void exitK_value(@NotNull ICalendarParser.K_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 */
	void enterK_sibling(@NotNull ICalendarParser.K_siblingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 */
	void exitK_sibling(@NotNull ICalendarParser.K_siblingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 */
	void enterK_weekly(@NotNull ICalendarParser.K_weeklyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 */
	void exitK_weekly(@NotNull ICalendarParser.K_weeklyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_address}.
	 * @param ctx the parse tree
	 */
	void enterK_address(@NotNull ICalendarParser.K_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_address}.
	 * @param ctx the parse tree
	 */
	void exitK_address(@NotNull ICalendarParser.K_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 */
	void enterK_completed(@NotNull ICalendarParser.K_completedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 */
	void exitK_completed(@NotNull ICalendarParser.K_completedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#attach}.
	 * @param ctx the parse tree
	 */
	void enterAttach(@NotNull ICalendarParser.AttachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#attach}.
	 * @param ctx the parse tree
	 */
	void exitAttach(@NotNull ICalendarParser.AttachContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#x_param}.
	 * @param ctx the parse tree
	 */
	void enterX_param(@NotNull ICalendarParser.X_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#x_param}.
	 * @param ctx the parse tree
	 */
	void exitX_param(@NotNull ICalendarParser.X_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 */
	void enterK_vfreebusy(@NotNull ICalendarParser.K_vfreebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 */
	void exitK_vfreebusy(@NotNull ICalendarParser.K_vfreebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull ICalendarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull ICalendarParser.MethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 */
	void enterDtstamp(@NotNull ICalendarParser.DtstampContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 */
	void exitDtstamp(@NotNull ICalendarParser.DtstampContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzid}.
	 * @param ctx the parse tree
	 */
	void enterTzid(@NotNull ICalendarParser.TzidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzid}.
	 * @param ctx the parse tree
	 */
	void exitTzid(@NotNull ICalendarParser.TzidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 */
	void enterK_byhour(@NotNull ICalendarParser.K_byhourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 */
	void exitK_byhour(@NotNull ICalendarParser.K_byhourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(@NotNull ICalendarParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(@NotNull ICalendarParser.UidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 */
	void enterIana_token(@NotNull ICalendarParser.Iana_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 */
	void exitIana_token(@NotNull ICalendarParser.Iana_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 */
	void enterDur_week(@NotNull ICalendarParser.Dur_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 */
	void exitDur_week(@NotNull ICalendarParser.Dur_weekContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_jour(@NotNull ICalendarParser.Statvalue_jourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_jour(@NotNull ICalendarParser.Statvalue_jourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(@NotNull ICalendarParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(@NotNull ICalendarParser.CountContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 */
	void enterK_audio(@NotNull ICalendarParser.K_audioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 */
	void exitK_audio(@NotNull ICalendarParser.K_audioContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull ICalendarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull ICalendarParser.LocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 */
	void enterK_bit(@NotNull ICalendarParser.K_bitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 */
	void exitK_bit(@NotNull ICalendarParser.K_bitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void enterRrule(@NotNull ICalendarParser.RruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void exitRrule(@NotNull ICalendarParser.RruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 */
	void enterK_vtodo(@NotNull ICalendarParser.K_vtodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 */
	void exitK_vtodo(@NotNull ICalendarParser.K_vtodoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#prodid}.
	 * @param ctx the parse tree
	 */
	void enterProdid(@NotNull ICalendarParser.ProdidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#prodid}.
	 * @param ctx the parse tree
	 */
	void exitProdid(@NotNull ICalendarParser.ProdidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 */
	void enterCnparam(@NotNull ICalendarParser.CnparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 */
	void exitCnparam(@NotNull ICalendarParser.CnparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 */
	void enterMonthdaynum(@NotNull ICalendarParser.MonthdaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 */
	void exitMonthdaynum(@NotNull ICalendarParser.MonthdaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 */
	void enterK_confirmed(@NotNull ICalendarParser.K_confirmedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 */
	void exitK_confirmed(@NotNull ICalendarParser.K_confirmedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#date_month}.
	 * @param ctx the parse tree
	 */
	void enterDate_month(@NotNull ICalendarParser.Date_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#date_month}.
	 * @param ctx the parse tree
	 */
	void exitDate_month(@NotNull ICalendarParser.Date_monthContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_text}.
	 * @param ctx the parse tree
	 */
	void enterK_text(@NotNull ICalendarParser.K_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_text}.
	 * @param ctx the parse tree
	 */
	void exitK_text(@NotNull ICalendarParser.K_textContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 */
	void enterFreebusyc(@NotNull ICalendarParser.FreebusycContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 */
	void exitFreebusyc(@NotNull ICalendarParser.FreebusycContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 */
	void enterK_byweekno(@NotNull ICalendarParser.K_byweeknoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 */
	void exitK_byweekno(@NotNull ICalendarParser.K_byweeknoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#related}.
	 * @param ctx the parse tree
	 */
	void enterRelated(@NotNull ICalendarParser.RelatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#related}.
	 * @param ctx the parse tree
	 */
	void exitRelated(@NotNull ICalendarParser.RelatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 */
	void enterReg_name_char(@NotNull ICalendarParser.Reg_name_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 */
	void exitReg_name_char(@NotNull ICalendarParser.Reg_name_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 */
	void enterTime_hour(@NotNull ICalendarParser.Time_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 */
	void exitTime_hour(@NotNull ICalendarParser.Time_hourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 */
	void enterDur_day(@NotNull ICalendarParser.Dur_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 */
	void exitDur_day(@NotNull ICalendarParser.Dur_dayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 */
	void enterWeeknum(@NotNull ICalendarParser.WeeknumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 */
	void exitWeeknum(@NotNull ICalendarParser.WeeknumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 */
	void enterDtstart(@NotNull ICalendarParser.DtstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 */
	void exitDtstart(@NotNull ICalendarParser.DtstartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 */
	void enterK_mo(@NotNull ICalendarParser.K_moContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 */
	void exitK_mo(@NotNull ICalendarParser.K_moContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void enterK_tzoffsetto(@NotNull ICalendarParser.K_tzoffsettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void exitK_tzoffsetto(@NotNull ICalendarParser.K_tzoffsettoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_final}.
	 * @param ctx the parse tree
	 */
	void enterK_final(@NotNull ICalendarParser.K_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_final}.
	 * @param ctx the parse tree
	 */
	void exitK_final(@NotNull ICalendarParser.K_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull ICalendarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull ICalendarParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ICalendarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ICalendarParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void enterTzoffsetto(@NotNull ICalendarParser.TzoffsettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void exitTzoffsetto(@NotNull ICalendarParser.TzoffsettoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(@NotNull ICalendarParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(@NotNull ICalendarParser.DigitsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_language}.
	 * @param ctx the parse tree
	 */
	void enterK_language(@NotNull ICalendarParser.K_languageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_language}.
	 * @param ctx the parse tree
	 */
	void exitK_language(@NotNull ICalendarParser.K_languageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 */
	void enterYeardaynum(@NotNull ICalendarParser.YeardaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 */
	void exitYeardaynum(@NotNull ICalendarParser.YeardaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 */
	void enterIana_prop(@NotNull ICalendarParser.Iana_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 */
	void exitIana_prop(@NotNull ICalendarParser.Iana_propContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dtend}.
	 * @param ctx the parse tree
	 */
	void enterDtend(@NotNull ICalendarParser.DtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dtend}.
	 * @param ctx the parse tree
	 */
	void exitDtend(@NotNull ICalendarParser.DtendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(@NotNull ICalendarParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(@NotNull ICalendarParser.StatusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 */
	void enterK_wkst(@NotNull ICalendarParser.K_wkstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 */
	void exitK_wkst(@NotNull ICalendarParser.K_wkstContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 */
	void enterK_accepted(@NotNull ICalendarParser.K_acceptedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 */
	void exitK_accepted(@NotNull ICalendarParser.K_acceptedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 */
	void enterK_tzname(@NotNull ICalendarParser.K_tznameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 */
	void exitK_tzname(@NotNull ICalendarParser.K_tznameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 */
	void enterK_gregorian(@NotNull ICalendarParser.K_gregorianContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 */
	void exitK_gregorian(@NotNull ICalendarParser.K_gregorianContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 */
	void enterSentbyparam(@NotNull ICalendarParser.SentbyparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 */
	void exitSentbyparam(@NotNull ICalendarParser.SentbyparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_display}.
	 * @param ctx the parse tree
	 */
	void enterK_display(@NotNull ICalendarParser.K_displayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_display}.
	 * @param ctx the parse tree
	 */
	void exitK_display(@NotNull ICalendarParser.K_displayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_opt_participant(@NotNull ICalendarParser.K_opt_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_opt_participant(@NotNull ICalendarParser.K_opt_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 */
	void enterK_bysetpos(@NotNull ICalendarParser.K_bysetposContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 */
	void exitK_bysetpos(@NotNull ICalendarParser.K_bysetposContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 */
	void enterIcalparameter(@NotNull ICalendarParser.IcalparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 */
	void exitIcalparameter(@NotNull ICalendarParser.IcalparameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 */
	void enterK_rdate(@NotNull ICalendarParser.K_rdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 */
	void exitK_rdate(@NotNull ICalendarParser.K_rdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 */
	void enterK_categories(@NotNull ICalendarParser.K_categoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 */
	void exitK_categories(@NotNull ICalendarParser.K_categoriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 */
	void enterByyrdaylist(@NotNull ICalendarParser.ByyrdaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 */
	void exitByyrdaylist(@NotNull ICalendarParser.ByyrdaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 */
	void enterX_prop(@NotNull ICalendarParser.X_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 */
	void exitX_prop(@NotNull ICalendarParser.X_propContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 */
	void enterOrdyrday(@NotNull ICalendarParser.OrdyrdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 */
	void exitOrdyrday(@NotNull ICalendarParser.OrdyrdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#transp}.
	 * @param ctx the parse tree
	 */
	void enterTransp(@NotNull ICalendarParser.TranspContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#transp}.
	 * @param ctx the parse tree
	 */
	void exitTransp(@NotNull ICalendarParser.TranspContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 */
	void enterK_trigger(@NotNull ICalendarParser.K_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 */
	void exitK_trigger(@NotNull ICalendarParser.K_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 */
	void enterOrgparam(@NotNull ICalendarParser.OrgparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 */
	void exitOrgparam(@NotNull ICalendarParser.OrgparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 */
	void enterK_attendee(@NotNull ICalendarParser.K_attendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 */
	void exitK_attendee(@NotNull ICalendarParser.K_attendeeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 */
	void enterTodoprop(@NotNull ICalendarParser.TodopropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 */
	void exitTodoprop(@NotNull ICalendarParser.TodopropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_float}.
	 * @param ctx the parse tree
	 */
	void enterK_float(@NotNull ICalendarParser.K_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_float}.
	 * @param ctx the parse tree
	 */
	void exitK_float(@NotNull ICalendarParser.K_floatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_count}.
	 * @param ctx the parse tree
	 */
	void enterK_count(@NotNull ICalendarParser.K_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_count}.
	 * @param ctx the parse tree
	 */
	void exitK_count(@NotNull ICalendarParser.K_countContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 */
	void enterK_byyearday(@NotNull ICalendarParser.K_byyeardayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 */
	void exitK_byyearday(@NotNull ICalendarParser.K_byyeardayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_url}.
	 * @param ctx the parse tree
	 */
	void enterK_url(@NotNull ICalendarParser.K_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_url}.
	 * @param ctx the parse tree
	 */
	void exitK_url(@NotNull ICalendarParser.K_urlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#weekday}.
	 * @param ctx the parse tree
	 */
	void enterWeekday(@NotNull ICalendarParser.WeekdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#weekday}.
	 * @param ctx the parse tree
	 */
	void exitWeekday(@NotNull ICalendarParser.WeekdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_event(@NotNull ICalendarParser.Statvalue_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_event(@NotNull ICalendarParser.Statvalue_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#time_second}.
	 * @param ctx the parse tree
	 */
	void enterTime_second(@NotNull ICalendarParser.Time_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#time_second}.
	 * @param ctx the parse tree
	 */
	void exitTime_second(@NotNull ICalendarParser.Time_secondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 */
	void enterK_uri(@NotNull ICalendarParser.K_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 */
	void exitK_uri(@NotNull ICalendarParser.K_uriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#contentline}.
	 * @param ctx the parse tree
	 */
	void enterContentline(@NotNull ICalendarParser.ContentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#contentline}.
	 * @param ctx the parse tree
	 */
	void exitContentline(@NotNull ICalendarParser.ContentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 */
	void enterLast_mod(@NotNull ICalendarParser.Last_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 */
	void exitLast_mod(@NotNull ICalendarParser.Last_modContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#relparam}.
	 * @param ctx the parse tree
	 */
	void enterRelparam(@NotNull ICalendarParser.RelparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#relparam}.
	 * @param ctx the parse tree
	 */
	void exitRelparam(@NotNull ICalendarParser.RelparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 */
	void enterTimezoneprop(@NotNull ICalendarParser.TimezonepropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 */
	void exitTimezoneprop(@NotNull ICalendarParser.TimezonepropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 */
	void enterByhrlist(@NotNull ICalendarParser.ByhrlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 */
	void exitByhrlist(@NotNull ICalendarParser.ByhrlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 */
	void enterX_comp(@NotNull ICalendarParser.X_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 */
	void exitX_comp(@NotNull ICalendarParser.X_compContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 */
	void enterDeltoparam(@NotNull ICalendarParser.DeltoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 */
	void exitDeltoparam(@NotNull ICalendarParser.DeltoparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 */
	void enterSafe_char(@NotNull ICalendarParser.Safe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 */
	void exitSafe_char(@NotNull ICalendarParser.Safe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 */
	void enterRoleparam(@NotNull ICalendarParser.RoleparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 */
	void exitRoleparam(@NotNull ICalendarParser.RoleparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 */
	void enterK_unknown(@NotNull ICalendarParser.K_unknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 */
	void exitK_unknown(@NotNull ICalendarParser.K_unknownContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void enterTzoffsetfrom(@NotNull ICalendarParser.TzoffsetfromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void exitTzoffsetfrom(@NotNull ICalendarParser.TzoffsetfromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 */
	void enterMemberparam(@NotNull ICalendarParser.MemberparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 */
	void exitMemberparam(@NotNull ICalendarParser.MemberparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 */
	void enterBywdaylist(@NotNull ICalendarParser.BywdaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 */
	void exitBywdaylist(@NotNull ICalendarParser.BywdaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_group}.
	 * @param ctx the parse tree
	 */
	void enterK_group(@NotNull ICalendarParser.K_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_group}.
	 * @param ctx the parse tree
	 */
	void exitK_group(@NotNull ICalendarParser.K_groupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 */
	void enterDur_date(@NotNull ICalendarParser.Dur_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 */
	void exitDur_date(@NotNull ICalendarParser.Dur_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 */
	void enterAttachparam(@NotNull ICalendarParser.AttachparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 */
	void exitAttachparam(@NotNull ICalendarParser.AttachparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#b_char}.
	 * @param ctx the parse tree
	 */
	void enterB_char(@NotNull ICalendarParser.B_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#b_char}.
	 * @param ctx the parse tree
	 */
	void exitB_char(@NotNull ICalendarParser.B_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_created}.
	 * @param ctx the parse tree
	 */
	void enterK_created(@NotNull ICalendarParser.K_createdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_created}.
	 * @param ctx the parse tree
	 */
	void exitK_created(@NotNull ICalendarParser.K_createdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 */
	void enterK_vtimezone(@NotNull ICalendarParser.K_vtimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 */
	void exitK_vtimezone(@NotNull ICalendarParser.K_vtimezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 */
	void enterK_exdate(@NotNull ICalendarParser.K_exdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 */
	void exitK_exdate(@NotNull ICalendarParser.K_exdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(@NotNull ICalendarParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(@NotNull ICalendarParser.DurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#x_name}.
	 * @param ctx the parse tree
	 */
	void enterX_name(@NotNull ICalendarParser.X_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#x_name}.
	 * @param ctx the parse tree
	 */
	void exitX_name(@NotNull ICalendarParser.X_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_explicit(@NotNull ICalendarParser.Period_explicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_explicit(@NotNull ICalendarParser.Period_explicitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 */
	void enterK_partstat(@NotNull ICalendarParser.K_partstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 */
	void exitK_partstat(@NotNull ICalendarParser.K_partstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 */
	void enterBysplist(@NotNull ICalendarParser.BysplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 */
	void exitBysplist(@NotNull ICalendarParser.BysplistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 */
	void enterK_thisandfuture(@NotNull ICalendarParser.K_thisandfutureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 */
	void exitK_thisandfuture(@NotNull ICalendarParser.K_thisandfutureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ICalendarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull ICalendarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICalendarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull ICalendarParser.BoolContext ctx);
}