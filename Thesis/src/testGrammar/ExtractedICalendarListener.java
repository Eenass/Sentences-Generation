// Generated from ExtractedICalendar.g4 by ANTLR 4.1
package testGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtractedICalendarParser}.
 */
public interface ExtractedICalendarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#summary}.
	 * @param ctx the parse tree
	 */
	void enterSummary(@NotNull ExtractedICalendarParser.SummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#summary}.
	 * @param ctx the parse tree
	 */
	void exitSummary(@NotNull ExtractedICalendarParser.SummaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 */
	void enterRangeparam(@NotNull ExtractedICalendarParser.RangeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 */
	void exitRangeparam(@NotNull ExtractedICalendarParser.RangeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_location}.
	 * @param ctx the parse tree
	 */
	void enterK_location(@NotNull ExtractedICalendarParser.K_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_location}.
	 * @param ctx the parse tree
	 */
	void exitK_location(@NotNull ExtractedICalendarParser.K_locationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 */
	void enterK_monthly(@NotNull ExtractedICalendarParser.K_monthlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 */
	void exitK_monthly(@NotNull ExtractedICalendarParser.K_monthlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#attendee}.
	 * @param ctx the parse tree
	 */
	void enterAttendee(@NotNull ExtractedICalendarParser.AttendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#attendee}.
	 * @param ctx the parse tree
	 */
	void exitAttendee(@NotNull ExtractedICalendarParser.AttendeeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#freq}.
	 * @param ctx the parse tree
	 */
	void enterFreq(@NotNull ExtractedICalendarParser.FreqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#freq}.
	 * @param ctx the parse tree
	 */
	void exitFreq(@NotNull ExtractedICalendarParser.FreqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 */
	void enterK_bysecond(@NotNull ExtractedICalendarParser.K_bysecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 */
	void exitK_bysecond(@NotNull ExtractedICalendarParser.K_bysecondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_status}.
	 * @param ctx the parse tree
	 */
	void enterK_status(@NotNull ExtractedICalendarParser.K_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_status}.
	 * @param ctx the parse tree
	 */
	void exitK_status(@NotNull ExtractedICalendarParser.K_statusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_public}.
	 * @param ctx the parse tree
	 */
	void enterK_public(@NotNull ExtractedICalendarParser.K_publicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_public}.
	 * @param ctx the parse tree
	 */
	void exitK_public(@NotNull ExtractedICalendarParser.K_publicContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 */
	void enterEventprop(@NotNull ExtractedICalendarParser.EventpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 */
	void exitEventprop(@NotNull ExtractedICalendarParser.EventpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void enterK_interval(@NotNull ExtractedICalendarParser.K_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void exitK_interval(@NotNull ExtractedICalendarParser.K_intervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_due}.
	 * @param ctx the parse tree
	 */
	void enterK_due(@NotNull ExtractedICalendarParser.K_dueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_due}.
	 * @param ctx the parse tree
	 */
	void exitK_due(@NotNull ExtractedICalendarParser.K_dueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_start}.
	 * @param ctx the parse tree
	 */
	void enterK_start(@NotNull ExtractedICalendarParser.K_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_start}.
	 * @param ctx the parse tree
	 */
	void exitK_start(@NotNull ExtractedICalendarParser.K_startContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_free}.
	 * @param ctx the parse tree
	 */
	void enterK_free(@NotNull ExtractedICalendarParser.K_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_free}.
	 * @param ctx the parse tree
	 */
	void exitK_free(@NotNull ExtractedICalendarParser.K_freeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rdate}.
	 * @param ctx the parse tree
	 */
	void enterRdate(@NotNull ExtractedICalendarParser.RdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rdate}.
	 * @param ctx the parse tree
	 */
	void exitRdate(@NotNull ExtractedICalendarParser.RdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_date(@NotNull ExtractedICalendarParser.Date_time_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_date(@NotNull ExtractedICalendarParser.Date_time_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 */
	void enterK_contact(@NotNull ExtractedICalendarParser.K_contactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 */
	void exitK_contact(@NotNull ExtractedICalendarParser.K_contactContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull ExtractedICalendarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull ExtractedICalendarParser.TimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 */
	void enterTime_minute(@NotNull ExtractedICalendarParser.Time_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 */
	void exitTime_minute(@NotNull ExtractedICalendarParser.Time_minuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#created}.
	 * @param ctx the parse tree
	 */
	void enterCreated(@NotNull ExtractedICalendarParser.CreatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#created}.
	 * @param ctx the parse tree
	 */
	void exitCreated(@NotNull ExtractedICalendarParser.CreatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 */
	void enterK_altrep(@NotNull ExtractedICalendarParser.K_altrepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 */
	void exitK_altrep(@NotNull ExtractedICalendarParser.K_altrepContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 */
	void enterDtstparam(@NotNull ExtractedICalendarParser.DtstparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 */
	void exitDtstparam(@NotNull ExtractedICalendarParser.DtstparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 */
	void enterAlarmc(@NotNull ExtractedICalendarParser.AlarmcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 */
	void exitAlarmc(@NotNull ExtractedICalendarParser.AlarmcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 */
	void enterK_freq(@NotNull ExtractedICalendarParser.K_freqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 */
	void exitK_freq(@NotNull ExtractedICalendarParser.K_freqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(@NotNull ExtractedICalendarParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(@NotNull ExtractedICalendarParser.Date_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 */
	void enterK_freebusy(@NotNull ExtractedICalendarParser.K_freebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 */
	void exitK_freebusy(@NotNull ExtractedICalendarParser.K_freebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 */
	void enterResrcparam(@NotNull ExtractedICalendarParser.ResrcparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 */
	void exitResrcparam(@NotNull ExtractedICalendarParser.ResrcparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 */
	void enterParamtext(@NotNull ExtractedICalendarParser.ParamtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 */
	void exitParamtext(@NotNull ExtractedICalendarParser.ParamtextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue(@NotNull ExtractedICalendarParser.StatvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue(@NotNull ExtractedICalendarParser.StatvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#organizer}.
	 * @param ctx the parse tree
	 */
	void enterOrganizer(@NotNull ExtractedICalendarParser.OrganizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#organizer}.
	 * @param ctx the parse tree
	 */
	void exitOrganizer(@NotNull ExtractedICalendarParser.OrganizerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 */
	void enterDelfromparam(@NotNull ExtractedICalendarParser.DelfromparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 */
	void exitDelfromparam(@NotNull ExtractedICalendarParser.DelfromparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_method}.
	 * @param ctx the parse tree
	 */
	void enterK_method(@NotNull ExtractedICalendarParser.K_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_method}.
	 * @param ctx the parse tree
	 */
	void exitK_method(@NotNull ExtractedICalendarParser.K_methodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#period_start}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_start(@NotNull ExtractedICalendarParser.Period_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#period_start}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_start(@NotNull ExtractedICalendarParser.Period_startContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 */
	void enterPriovalue(@NotNull ExtractedICalendarParser.PriovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 */
	void exitPriovalue(@NotNull ExtractedICalendarParser.PriovalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 */
	void enterK_uid(@NotNull ExtractedICalendarParser.K_uidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 */
	void exitK_uid(@NotNull ExtractedICalendarParser.K_uidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull ExtractedICalendarParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull ExtractedICalendarParser.DigitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 */
	void enterK_vevent(@NotNull ExtractedICalendarParser.K_veventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 */
	void exitK_vevent(@NotNull ExtractedICalendarParser.K_veventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 */
	void enterRdtparam(@NotNull ExtractedICalendarParser.RdtparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 */
	void exitRdtparam(@NotNull ExtractedICalendarParser.RdtparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ExtractedICalendarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ExtractedICalendarParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#enddate}.
	 * @param ctx the parse tree
	 */
	void enterEnddate(@NotNull ExtractedICalendarParser.EnddateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#enddate}.
	 * @param ctx the parse tree
	 */
	void exitEnddate(@NotNull ExtractedICalendarParser.EnddateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#calprop}.
	 * @param ctx the parse tree
	 */
	void enterCalprop(@NotNull ExtractedICalendarParser.CalpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#calprop}.
	 * @param ctx the parse tree
	 */
	void exitCalprop(@NotNull ExtractedICalendarParser.CalpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_member}.
	 * @param ctx the parse tree
	 */
	void enterK_member(@NotNull ExtractedICalendarParser.K_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_member}.
	 * @param ctx the parse tree
	 */
	void exitK_member(@NotNull ExtractedICalendarParser.K_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#value_char}.
	 * @param ctx the parse tree
	 */
	void enterValue_char(@NotNull ExtractedICalendarParser.Value_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#value_char}.
	 * @param ctx the parse tree
	 */
	void exitValue_char(@NotNull ExtractedICalendarParser.Value_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_version}.
	 * @param ctx the parse tree
	 */
	void enterK_version(@NotNull ExtractedICalendarParser.K_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_version}.
	 * @param ctx the parse tree
	 */
	void exitK_version(@NotNull ExtractedICalendarParser.K_versionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 */
	void enterK_utc_offset(@NotNull ExtractedICalendarParser.K_utc_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 */
	void exitK_utc_offset(@NotNull ExtractedICalendarParser.K_utc_offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 */
	void enterTsafe_char(@NotNull ExtractedICalendarParser.Tsafe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 */
	void exitTsafe_char(@NotNull ExtractedICalendarParser.Tsafe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 */
	void enterRstatparam(@NotNull ExtractedICalendarParser.RstatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 */
	void exitRstatparam(@NotNull ExtractedICalendarParser.RstatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 */
	void enterCal_address(@NotNull ExtractedICalendarParser.Cal_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 */
	void exitCal_address(@NotNull ExtractedICalendarParser.Cal_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 */
	void enterGeovalue(@NotNull ExtractedICalendarParser.GeovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 */
	void exitGeovalue(@NotNull ExtractedICalendarParser.GeovalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 */
	void enterK_in_progress(@NotNull ExtractedICalendarParser.K_in_progressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 */
	void exitK_in_progress(@NotNull ExtractedICalendarParser.K_in_progressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull ExtractedICalendarParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull ExtractedICalendarParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzname}.
	 * @param ctx the parse tree
	 */
	void enterTzname(@NotNull ExtractedICalendarParser.TznameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzname}.
	 * @param ctx the parse tree
	 */
	void exitTzname(@NotNull ExtractedICalendarParser.TznameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 */
	void enterK_transparent(@NotNull ExtractedICalendarParser.K_transparentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 */
	void exitK_transparent(@NotNull ExtractedICalendarParser.K_transparentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 */
	void enterK_recurrence_id(@NotNull ExtractedICalendarParser.K_recurrence_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 */
	void exitK_recurrence_id(@NotNull ExtractedICalendarParser.K_recurrence_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 */
	void enterK_confidential(@NotNull ExtractedICalendarParser.K_confidentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 */
	void exitK_confidential(@NotNull ExtractedICalendarParser.K_confidentialContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 */
	void enterDtendparam(@NotNull ExtractedICalendarParser.DtendparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 */
	void exitDtendparam(@NotNull ExtractedICalendarParser.DtendparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 */
	void enterK_parent(@NotNull ExtractedICalendarParser.K_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 */
	void exitK_parent(@NotNull ExtractedICalendarParser.K_parentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#eventc}.
	 * @param ctx the parse tree
	 */
	void enterEventc(@NotNull ExtractedICalendarParser.EventcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#eventc}.
	 * @param ctx the parse tree
	 */
	void exitEventc(@NotNull ExtractedICalendarParser.EventcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 */
	void enterK_cancelled(@NotNull ExtractedICalendarParser.K_cancelledContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 */
	void exitK_cancelled(@NotNull ExtractedICalendarParser.K_cancelledContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 */
	void enterK_bymonth(@NotNull ExtractedICalendarParser.K_bymonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 */
	void exitK_bymonth(@NotNull ExtractedICalendarParser.K_bymonthContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 */
	void enterLanguageparam(@NotNull ExtractedICalendarParser.LanguageparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 */
	void exitLanguageparam(@NotNull ExtractedICalendarParser.LanguageparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 */
	void enterK_prodid(@NotNull ExtractedICalendarParser.K_prodidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 */
	void exitK_prodid(@NotNull ExtractedICalendarParser.K_prodidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ExtractedICalendarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ExtractedICalendarParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 */
	void enterActionvalue(@NotNull ExtractedICalendarParser.ActionvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 */
	void exitActionvalue(@NotNull ExtractedICalendarParser.ActionvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#standardc}.
	 * @param ctx the parse tree
	 */
	void enterStandardc(@NotNull ExtractedICalendarParser.StandardcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#standardc}.
	 * @param ctx the parse tree
	 */
	void exitStandardc(@NotNull ExtractedICalendarParser.StandardcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 */
	void enterK_dir(@NotNull ExtractedICalendarParser.K_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 */
	void exitK_dir(@NotNull ExtractedICalendarParser.K_dirContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull ExtractedICalendarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull ExtractedICalendarParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 */
	void enterK_rsvp(@NotNull ExtractedICalendarParser.K_rsvpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 */
	void exitK_rsvp(@NotNull ExtractedICalendarParser.K_rsvpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 */
	void enterK_dtstamp(@NotNull ExtractedICalendarParser.K_dtstampContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 */
	void exitK_dtstamp(@NotNull ExtractedICalendarParser.K_dtstampContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 */
	void enterTrigabs(@NotNull ExtractedICalendarParser.TrigabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 */
	void exitTrigabs(@NotNull ExtractedICalendarParser.TrigabsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#language_char}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_char(@NotNull ExtractedICalendarParser.Language_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#language_char}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_char(@NotNull ExtractedICalendarParser.Language_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 */
	void enterK_sent_by(@NotNull ExtractedICalendarParser.K_sent_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 */
	void exitK_sent_by(@NotNull ExtractedICalendarParser.K_sent_byContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 */
	void enterRsvpparam(@NotNull ExtractedICalendarParser.RsvpparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 */
	void exitRsvpparam(@NotNull ExtractedICalendarParser.RsvpparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 */
	void enterBymolist(@NotNull ExtractedICalendarParser.BymolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 */
	void exitBymolist(@NotNull ExtractedICalendarParser.BymolistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 */
	void enterTzidparam(@NotNull ExtractedICalendarParser.TzidparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 */
	void exitTzidparam(@NotNull ExtractedICalendarParser.TzidparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 */
	void enterUtc_offset(@NotNull ExtractedICalendarParser.Utc_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 */
	void exitUtc_offset(@NotNull ExtractedICalendarParser.Utc_offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_base}.
	 * @param ctx the parse tree
	 */
	void enterK_base(@NotNull ExtractedICalendarParser.K_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_base}.
	 * @param ctx the parse tree
	 */
	void exitK_base(@NotNull ExtractedICalendarParser.K_baseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 */
	void enterTime_numzone(@NotNull ExtractedICalendarParser.Time_numzoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 */
	void exitTime_numzone(@NotNull ExtractedICalendarParser.Time_numzoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 */
	void enterK_tentative(@NotNull ExtractedICalendarParser.K_tentativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 */
	void exitK_tentative(@NotNull ExtractedICalendarParser.K_tentativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 */
	void enterK_sequence(@NotNull ExtractedICalendarParser.K_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 */
	void exitK_sequence(@NotNull ExtractedICalendarParser.K_sequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_action}.
	 * @param ctx the parse tree
	 */
	void enterK_action(@NotNull ExtractedICalendarParser.K_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_action}.
	 * @param ctx the parse tree
	 */
	void exitK_action(@NotNull ExtractedICalendarParser.K_actionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_name(@NotNull ExtractedICalendarParser.Subtype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_name(@NotNull ExtractedICalendarParser.Subtype_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 */
	void enterRdtval(@NotNull ExtractedICalendarParser.RdtvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 */
	void exitRdtval(@NotNull ExtractedICalendarParser.RdtvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 */
	void enterTzprop(@NotNull ExtractedICalendarParser.TzpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 */
	void exitTzprop(@NotNull ExtractedICalendarParser.TzpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#exdate}.
	 * @param ctx the parse tree
	 */
	void enterExdate(@NotNull ExtractedICalendarParser.ExdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#exdate}.
	 * @param ctx the parse tree
	 */
	void exitExdate(@NotNull ExtractedICalendarParser.ExdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 */
	void enterDur_value(@NotNull ExtractedICalendarParser.Dur_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 */
	void exitDur_value(@NotNull ExtractedICalendarParser.Dur_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#param_value}.
	 * @param ctx the parse tree
	 */
	void enterParam_value(@NotNull ExtractedICalendarParser.Param_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#param_value}.
	 * @param ctx the parse tree
	 */
	void exitParam_value(@NotNull ExtractedICalendarParser.Param_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull ExtractedICalendarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull ExtractedICalendarParser.ResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 */
	void enterK_tu(@NotNull ExtractedICalendarParser.K_tuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 */
	void exitK_tu(@NotNull ExtractedICalendarParser.K_tuContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull ExtractedICalendarParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull ExtractedICalendarParser.PercentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void enterDate_fullyear(@NotNull ExtractedICalendarParser.Date_fullyearContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void exitDate_fullyear(@NotNull ExtractedICalendarParser.Date_fullyearContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 */
	void enterK_valarm(@NotNull ExtractedICalendarParser.K_valarmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 */
	void exitK_valarm(@NotNull ExtractedICalendarParser.K_valarmContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_true}.
	 * @param ctx the parse tree
	 */
	void enterK_true(@NotNull ExtractedICalendarParser.K_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_true}.
	 * @param ctx the parse tree
	 */
	void exitK_true(@NotNull ExtractedICalendarParser.K_trueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#descparam}.
	 * @param ctx the parse tree
	 */
	void enterDescparam(@NotNull ExtractedICalendarParser.DescparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#descparam}.
	 * @param ctx the parse tree
	 */
	void exitDescparam(@NotNull ExtractedICalendarParser.DescparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 */
	void enterReltypeparam(@NotNull ExtractedICalendarParser.ReltypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 */
	void exitReltypeparam(@NotNull ExtractedICalendarParser.ReltypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 */
	void enterK_date_time(@NotNull ExtractedICalendarParser.K_date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 */
	void exitK_date_time(@NotNull ExtractedICalendarParser.K_date_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_email}.
	 * @param ctx the parse tree
	 */
	void enterK_email(@NotNull ExtractedICalendarParser.K_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_email}.
	 * @param ctx the parse tree
	 */
	void exitK_email(@NotNull ExtractedICalendarParser.K_emailContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 */
	void enterK_binary(@NotNull ExtractedICalendarParser.K_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 */
	void exitK_binary(@NotNull ExtractedICalendarParser.K_binaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(@NotNull ExtractedICalendarParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(@NotNull ExtractedICalendarParser.Quoted_stringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull ExtractedICalendarParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull ExtractedICalendarParser.ComponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(@NotNull ExtractedICalendarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(@NotNull ExtractedICalendarParser.DescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#priority}.
	 * @param ctx the parse tree
	 */
	void enterPriority(@NotNull ExtractedICalendarParser.PriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#priority}.
	 * @param ctx the parse tree
	 */
	void exitPriority(@NotNull ExtractedICalendarParser.PriorityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 */
	void enterDigits_2(@NotNull ExtractedICalendarParser.Digits_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 */
	void exitDigits_2(@NotNull ExtractedICalendarParser.Digits_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 */
	void enterFreebusy(@NotNull ExtractedICalendarParser.FreebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 */
	void exitFreebusy(@NotNull ExtractedICalendarParser.FreebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_event(@NotNull ExtractedICalendarParser.Partstat_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_event(@NotNull ExtractedICalendarParser.Partstat_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_participant(@NotNull ExtractedICalendarParser.K_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_participant(@NotNull ExtractedICalendarParser.K_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#summparam}.
	 * @param ctx the parse tree
	 */
	void enterSummparam(@NotNull ExtractedICalendarParser.SummparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#summparam}.
	 * @param ctx the parse tree
	 */
	void exitSummparam(@NotNull ExtractedICalendarParser.SummparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_th}.
	 * @param ctx the parse tree
	 */
	void enterK_th(@NotNull ExtractedICalendarParser.K_thContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_th}.
	 * @param ctx the parse tree
	 */
	void exitK_th(@NotNull ExtractedICalendarParser.K_thContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 */
	void enterEncodingparam(@NotNull ExtractedICalendarParser.EncodingparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 */
	void exitEncodingparam(@NotNull ExtractedICalendarParser.EncodingparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 */
	void enterK_opaque(@NotNull ExtractedICalendarParser.K_opaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 */
	void exitK_opaque(@NotNull ExtractedICalendarParser.K_opaqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull ExtractedICalendarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull ExtractedICalendarParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_process}.
	 * @param ctx the parse tree
	 */
	void enterK_process(@NotNull ExtractedICalendarParser.K_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_process}.
	 * @param ctx the parse tree
	 */
	void exitK_process(@NotNull ExtractedICalendarParser.K_processContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#geo}.
	 * @param ctx the parse tree
	 */
	void enterGeo(@NotNull ExtractedICalendarParser.GeoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#geo}.
	 * @param ctx the parse tree
	 */
	void exitGeo(@NotNull ExtractedICalendarParser.GeoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 */
	void enterExdtparam(@NotNull ExtractedICalendarParser.ExdtparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 */
	void exitExdtparam(@NotNull ExtractedICalendarParser.ExdtparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_class}.
	 * @param ctx the parse tree
	 */
	void enterK_class(@NotNull ExtractedICalendarParser.K_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_class}.
	 * @param ctx the parse tree
	 */
	void exitK_class(@NotNull ExtractedICalendarParser.K_classContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 */
	void enterK_resources(@NotNull ExtractedICalendarParser.K_resourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 */
	void exitK_resources(@NotNull ExtractedICalendarParser.K_resourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 */
	void enterK_transp(@NotNull ExtractedICalendarParser.K_transpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 */
	void exitK_transp(@NotNull ExtractedICalendarParser.K_transpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void enterReg_name(@NotNull ExtractedICalendarParser.Reg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void exitReg_name(@NotNull ExtractedICalendarParser.Reg_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_period}.
	 * @param ctx the parse tree
	 */
	void enterK_period(@NotNull ExtractedICalendarParser.K_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_period}.
	 * @param ctx the parse tree
	 */
	void exitK_period(@NotNull ExtractedICalendarParser.K_periodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(@NotNull ExtractedICalendarParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(@NotNull ExtractedICalendarParser.PeriodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(@NotNull ExtractedICalendarParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(@NotNull ExtractedICalendarParser.UriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull ExtractedICalendarParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull ExtractedICalendarParser.UrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void enterK_tzoffsetfrom(@NotNull ExtractedICalendarParser.K_tzoffsetfromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void exitK_tzoffsetfrom(@NotNull ExtractedICalendarParser.K_tzoffsetfromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 */
	void enterK_fmttype(@NotNull ExtractedICalendarParser.K_fmttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 */
	void exitK_fmttype(@NotNull ExtractedICalendarParser.K_fmttypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 */
	void enterByseclist(@NotNull ExtractedICalendarParser.ByseclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 */
	void exitByseclist(@NotNull ExtractedICalendarParser.ByseclistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 */
	void enterK_individual(@NotNull ExtractedICalendarParser.K_individualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 */
	void exitK_individual(@NotNull ExtractedICalendarParser.K_individualContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#due}.
	 * @param ctx the parse tree
	 */
	void enterDue(@NotNull ExtractedICalendarParser.DueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#due}.
	 * @param ctx the parse tree
	 */
	void exitDue(@NotNull ExtractedICalendarParser.DueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 */
	void enterDirparam(@NotNull ExtractedICalendarParser.DirparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 */
	void exitDirparam(@NotNull ExtractedICalendarParser.DirparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 */
	void enterBywknolist(@NotNull ExtractedICalendarParser.BywknolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 */
	void exitBywknolist(@NotNull ExtractedICalendarParser.BywknolistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_date}.
	 * @param ctx the parse tree
	 */
	void enterK_date(@NotNull ExtractedICalendarParser.K_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_date}.
	 * @param ctx the parse tree
	 */
	void exitK_date(@NotNull ExtractedICalendarParser.K_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_num(@NotNull ExtractedICalendarParser.Alpha_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_num(@NotNull ExtractedICalendarParser.Alpha_numContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(@NotNull ExtractedICalendarParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(@NotNull ExtractedICalendarParser.ClazzContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_non_participant(@NotNull ExtractedICalendarParser.K_non_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_non_participant(@NotNull ExtractedICalendarParser.K_non_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#locparam}.
	 * @param ctx the parse tree
	 */
	void enterLocparam(@NotNull ExtractedICalendarParser.LocparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#locparam}.
	 * @param ctx the parse tree
	 */
	void exitLocparam(@NotNull ExtractedICalendarParser.LocparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 */
	void enterK_integer(@NotNull ExtractedICalendarParser.K_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 */
	void exitK_integer(@NotNull ExtractedICalendarParser.K_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 */
	void enterK_dtstart(@NotNull ExtractedICalendarParser.K_dtstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 */
	void exitK_dtstart(@NotNull ExtractedICalendarParser.K_dtstartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 */
	void enterTrigrel(@NotNull ExtractedICalendarParser.TrigrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 */
	void exitTrigrel(@NotNull ExtractedICalendarParser.TrigrelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated_from(@NotNull ExtractedICalendarParser.K_delegated_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated_from(@NotNull ExtractedICalendarParser.K_delegated_fromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 */
	void enterK_daylight(@NotNull ExtractedICalendarParser.K_daylightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 */
	void exitK_daylight(@NotNull ExtractedICalendarParser.K_daylightContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 */
	void enterFbvalue(@NotNull ExtractedICalendarParser.FbvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 */
	void exitFbvalue(@NotNull ExtractedICalendarParser.FbvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_todo(@NotNull ExtractedICalendarParser.Partstat_todoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_todo(@NotNull ExtractedICalendarParser.Partstat_todoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 */
	void enterK_encoding(@NotNull ExtractedICalendarParser.K_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 */
	void exitK_encoding(@NotNull ExtractedICalendarParser.K_encodingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_req_participant(@NotNull ExtractedICalendarParser.K_req_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_req_participant(@NotNull ExtractedICalendarParser.K_req_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 */
	void enterIcalstream(@NotNull ExtractedICalendarParser.IcalstreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 */
	void exitIcalstream(@NotNull ExtractedICalendarParser.IcalstreamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#statcode}.
	 * @param ctx the parse tree
	 */
	void enterStatcode(@NotNull ExtractedICalendarParser.StatcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#statcode}.
	 * @param ctx the parse tree
	 */
	void exitStatcode(@NotNull ExtractedICalendarParser.StatcodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 */
	void enterK_organizer(@NotNull ExtractedICalendarParser.K_organizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 */
	void exitK_organizer(@NotNull ExtractedICalendarParser.K_organizerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 */
	void enterK_cn(@NotNull ExtractedICalendarParser.K_cnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 */
	void exitK_cn(@NotNull ExtractedICalendarParser.K_cnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull ExtractedICalendarParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull ExtractedICalendarParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 */
	void enterTznparam(@NotNull ExtractedICalendarParser.TznparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 */
	void exitTznparam(@NotNull ExtractedICalendarParser.TznparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#todoc}.
	 * @param ctx the parse tree
	 */
	void enterTodoc(@NotNull ExtractedICalendarParser.TodocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#todoc}.
	 * @param ctx the parse tree
	 */
	void exitTodoc(@NotNull ExtractedICalendarParser.TodocContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 */
	void enterK_vcalendar(@NotNull ExtractedICalendarParser.K_vcalendarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 */
	void exitK_vcalendar(@NotNull ExtractedICalendarParser.K_vcalendarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 */
	void enterK_byday(@NotNull ExtractedICalendarParser.K_bydayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 */
	void exitK_byday(@NotNull ExtractedICalendarParser.K_bydayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 */
	void enterDur_hour(@NotNull ExtractedICalendarParser.Dur_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 */
	void exitDur_hour(@NotNull ExtractedICalendarParser.Dur_hourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_false}.
	 * @param ctx the parse tree
	 */
	void enterK_false(@NotNull ExtractedICalendarParser.K_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_false}.
	 * @param ctx the parse tree
	 */
	void exitK_false(@NotNull ExtractedICalendarParser.K_falseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(@NotNull ExtractedICalendarParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(@NotNull ExtractedICalendarParser.AlphaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ExtractedICalendarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ExtractedICalendarParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 */
	void enterK_repeat(@NotNull ExtractedICalendarParser.K_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 */
	void exitK_repeat(@NotNull ExtractedICalendarParser.K_repeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 */
	void enterTransvalue(@NotNull ExtractedICalendarParser.TransvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 */
	void exitTransvalue(@NotNull ExtractedICalendarParser.TransvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_range}.
	 * @param ctx the parse tree
	 */
	void enterK_range(@NotNull ExtractedICalendarParser.K_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_range}.
	 * @param ctx the parse tree
	 */
	void exitK_range(@NotNull ExtractedICalendarParser.K_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 */
	void enterK_byminute(@NotNull ExtractedICalendarParser.K_byminuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 */
	void exitK_byminute(@NotNull ExtractedICalendarParser.K_byminuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 */
	void enterPartstat_jour(@NotNull ExtractedICalendarParser.Partstat_jourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 */
	void exitPartstat_jour(@NotNull ExtractedICalendarParser.Partstat_jourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 */
	void enterK_begin(@NotNull ExtractedICalendarParser.K_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 */
	void exitK_begin(@NotNull ExtractedICalendarParser.K_beginContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_until}.
	 * @param ctx the parse tree
	 */
	void enterK_until(@NotNull ExtractedICalendarParser.K_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_until}.
	 * @param ctx the parse tree
	 */
	void exitK_until(@NotNull ExtractedICalendarParser.K_untilContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 */
	void enterTimezonec(@NotNull ExtractedICalendarParser.TimezonecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 */
	void exitTimezonec(@NotNull ExtractedICalendarParser.TimezonecContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_su}.
	 * @param ctx the parse tree
	 */
	void enterK_su(@NotNull ExtractedICalendarParser.K_suContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_su}.
	 * @param ctx the parse tree
	 */
	void exitK_su(@NotNull ExtractedICalendarParser.K_suContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 */
	void enterK_busy_unavailable(@NotNull ExtractedICalendarParser.K_busy_unavailableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 */
	void exitK_busy_unavailable(@NotNull ExtractedICalendarParser.K_busy_unavailableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 */
	void enterFbprop(@NotNull ExtractedICalendarParser.FbpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 */
	void exitFbprop(@NotNull ExtractedICalendarParser.FbpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 */
	void enterK_last_modified(@NotNull ExtractedICalendarParser.K_last_modifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 */
	void exitK_last_modified(@NotNull ExtractedICalendarParser.K_last_modifiedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 */
	void enterK_duration(@NotNull ExtractedICalendarParser.K_durationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 */
	void exitK_duration(@NotNull ExtractedICalendarParser.K_durationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#catparam}.
	 * @param ctx the parse tree
	 */
	void enterCatparam(@NotNull ExtractedICalendarParser.CatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#catparam}.
	 * @param ctx the parse tree
	 */
	void exitCatparam(@NotNull ExtractedICalendarParser.CatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_role}.
	 * @param ctx the parse tree
	 */
	void enterK_role(@NotNull ExtractedICalendarParser.K_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_role}.
	 * @param ctx the parse tree
	 */
	void exitK_role(@NotNull ExtractedICalendarParser.K_roleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 */
	void enterK_resource(@NotNull ExtractedICalendarParser.K_resourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 */
	void exitK_resource(@NotNull ExtractedICalendarParser.K_resourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_description}.
	 * @param ctx the parse tree
	 */
	void enterK_description(@NotNull ExtractedICalendarParser.K_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_description}.
	 * @param ctx the parse tree
	 */
	void exitK_description(@NotNull ExtractedICalendarParser.K_descriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 */
	void enterK_standard(@NotNull ExtractedICalendarParser.K_standardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 */
	void exitK_standard(@NotNull ExtractedICalendarParser.K_standardContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 */
	void enterFbtypeparam(@NotNull ExtractedICalendarParser.FbtypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 */
	void exitFbtypeparam(@NotNull ExtractedICalendarParser.FbtypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 */
	void enterK_sa(@NotNull ExtractedICalendarParser.K_saContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 */
	void exitK_sa(@NotNull ExtractedICalendarParser.K_saContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 */
	void enterK_needs_action(@NotNull ExtractedICalendarParser.K_needs_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 */
	void exitK_needs_action(@NotNull ExtractedICalendarParser.K_needs_actionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 */
	void enterK_secondly(@NotNull ExtractedICalendarParser.K_secondlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 */
	void exitK_secondly(@NotNull ExtractedICalendarParser.K_secondlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 */
	void enterK_geo(@NotNull ExtractedICalendarParser.K_geoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 */
	void exitK_geo(@NotNull ExtractedICalendarParser.K_geoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(@NotNull ExtractedICalendarParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(@NotNull ExtractedICalendarParser.SeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#other_param}.
	 * @param ctx the parse tree
	 */
	void enterOther_param(@NotNull ExtractedICalendarParser.Other_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#other_param}.
	 * @param ctx the parse tree
	 */
	void exitOther_param(@NotNull ExtractedICalendarParser.Other_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_time}.
	 * @param ctx the parse tree
	 */
	void enterK_time(@NotNull ExtractedICalendarParser.K_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_time}.
	 * @param ctx the parse tree
	 */
	void exitK_time(@NotNull ExtractedICalendarParser.K_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#categories}.
	 * @param ctx the parse tree
	 */
	void enterCategories(@NotNull ExtractedICalendarParser.CategoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#categories}.
	 * @param ctx the parse tree
	 */
	void exitCategories(@NotNull ExtractedICalendarParser.CategoriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 */
	void enterK_declined(@NotNull ExtractedICalendarParser.K_declinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 */
	void exitK_declined(@NotNull ExtractedICalendarParser.K_declinedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 */
	void enterK_recur(@NotNull ExtractedICalendarParser.K_recurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 */
	void exitK_recur(@NotNull ExtractedICalendarParser.K_recurContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 */
	void enterIana_comp(@NotNull ExtractedICalendarParser.Iana_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 */
	void exitIana_comp(@NotNull ExtractedICalendarParser.Iana_compContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 */
	void enterDigits_1_2(@NotNull ExtractedICalendarParser.Digits_1_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 */
	void exitDigits_1_2(@NotNull ExtractedICalendarParser.Digits_1_2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 */
	void enterRecur_rule_part(@NotNull ExtractedICalendarParser.Recur_rule_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 */
	void exitRecur_rule_part(@NotNull ExtractedICalendarParser.Recur_rule_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 */
	void enterDur_minute(@NotNull ExtractedICalendarParser.Dur_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 */
	void exitDur_minute(@NotNull ExtractedICalendarParser.Dur_minuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#b_end}.
	 * @param ctx the parse tree
	 */
	void enterB_end(@NotNull ExtractedICalendarParser.B_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#b_end}.
	 * @param ctx the parse tree
	 */
	void exitB_end(@NotNull ExtractedICalendarParser.B_endContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated(@NotNull ExtractedICalendarParser.K_delegatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated(@NotNull ExtractedICalendarParser.K_delegatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 */
	void enterDate_mday(@NotNull ExtractedICalendarParser.Date_mdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 */
	void exitDate_mday(@NotNull ExtractedICalendarParser.Date_mdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 */
	void enterByminlist(@NotNull ExtractedICalendarParser.ByminlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 */
	void exitByminlist(@NotNull ExtractedICalendarParser.ByminlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 */
	void enterFmttypeparam(@NotNull ExtractedICalendarParser.FmttypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 */
	void exitFmttypeparam(@NotNull ExtractedICalendarParser.FmttypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 */
	void enterIcalobject(@NotNull ExtractedICalendarParser.IcalobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 */
	void exitIcalobject(@NotNull ExtractedICalendarParser.IcalobjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 */
	void enterClassvalue(@NotNull ExtractedICalendarParser.ClassvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 */
	void exitClassvalue(@NotNull ExtractedICalendarParser.ClassvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 */
	void enterIana_param(@NotNull ExtractedICalendarParser.Iana_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 */
	void exitIana_param(@NotNull ExtractedICalendarParser.Iana_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 */
	void enterK_tzurl(@NotNull ExtractedICalendarParser.K_tzurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 */
	void exitK_tzurl(@NotNull ExtractedICalendarParser.K_tzurlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(@NotNull ExtractedICalendarParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(@NotNull ExtractedICalendarParser.Float_numContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 */
	void enterDur_time(@NotNull ExtractedICalendarParser.Dur_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 */
	void exitDur_time(@NotNull ExtractedICalendarParser.Dur_timeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 */
	void enterK_tzid(@NotNull ExtractedICalendarParser.K_tzidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 */
	void exitK_tzid(@NotNull ExtractedICalendarParser.K_tzidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_private}.
	 * @param ctx the parse tree
	 */
	void enterK_private(@NotNull ExtractedICalendarParser.K_privateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_private}.
	 * @param ctx the parse tree
	 */
	void exitK_private(@NotNull ExtractedICalendarParser.K_privateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#contparam}.
	 * @param ctx the parse tree
	 */
	void enterContparam(@NotNull ExtractedICalendarParser.ContparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#contparam}.
	 * @param ctx the parse tree
	 */
	void exitContparam(@NotNull ExtractedICalendarParser.ContparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 */
	void enterK_delegated_to(@NotNull ExtractedICalendarParser.K_delegated_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 */
	void exitK_delegated_to(@NotNull ExtractedICalendarParser.K_delegated_toContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 */
	void enterK_chair(@NotNull ExtractedICalendarParser.K_chairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 */
	void exitK_chair(@NotNull ExtractedICalendarParser.K_chairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_end}.
	 * @param ctx the parse tree
	 */
	void enterK_end(@NotNull ExtractedICalendarParser.K_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_end}.
	 * @param ctx the parse tree
	 */
	void exitK_end(@NotNull ExtractedICalendarParser.K_endContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_value(@NotNull ExtractedICalendarParser.Date_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_value(@NotNull ExtractedICalendarParser.Date_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 */
	void enterTrigrelparam(@NotNull ExtractedICalendarParser.TrigrelparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 */
	void exitTrigrelparam(@NotNull ExtractedICalendarParser.TrigrelparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 */
	void enterCutypeparam(@NotNull ExtractedICalendarParser.CutypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 */
	void exitCutypeparam(@NotNull ExtractedICalendarParser.CutypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 */
	void enterK_calscale(@NotNull ExtractedICalendarParser.K_calscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 */
	void exitK_calscale(@NotNull ExtractedICalendarParser.K_calscaleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 */
	void enterDueparam(@NotNull ExtractedICalendarParser.DueparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 */
	void exitDueparam(@NotNull ExtractedICalendarParser.DueparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 */
	void enterAltrepparam(@NotNull ExtractedICalendarParser.AltrepparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 */
	void exitAltrepparam(@NotNull ExtractedICalendarParser.AltrepparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 */
	void enterK_fbtype(@NotNull ExtractedICalendarParser.K_fbtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 */
	void exitK_fbtype(@NotNull ExtractedICalendarParser.K_fbtypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 */
	void enterDur_second(@NotNull ExtractedICalendarParser.Dur_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 */
	void exitDur_second(@NotNull ExtractedICalendarParser.Dur_secondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 */
	void enterK_related_to(@NotNull ExtractedICalendarParser.K_related_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 */
	void exitK_related_to(@NotNull ExtractedICalendarParser.K_related_toContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 */
	void enterK_dtend(@NotNull ExtractedICalendarParser.K_dtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 */
	void exitK_dtend(@NotNull ExtractedICalendarParser.K_dtendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 */
	void enterK_comment(@NotNull ExtractedICalendarParser.K_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 */
	void exitK_comment(@NotNull ExtractedICalendarParser.K_commentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 */
	void enterJourprop(@NotNull ExtractedICalendarParser.JourpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 */
	void exitJourprop(@NotNull ExtractedICalendarParser.JourpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#commparam}.
	 * @param ctx the parse tree
	 */
	void enterCommparam(@NotNull ExtractedICalendarParser.CommparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#commparam}.
	 * @param ctx the parse tree
	 */
	void exitCommparam(@NotNull ExtractedICalendarParser.CommparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void enterWeekdaynum(@NotNull ExtractedICalendarParser.WeekdaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 */
	void exitWeekdaynum(@NotNull ExtractedICalendarParser.WeekdaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#journalc}.
	 * @param ctx the parse tree
	 */
	void enterJournalc(@NotNull ExtractedICalendarParser.JournalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#journalc}.
	 * @param ctx the parse tree
	 */
	void exitJournalc(@NotNull ExtractedICalendarParser.JournalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 */
	void enterBymodaylist(@NotNull ExtractedICalendarParser.BymodaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 */
	void exitBymodaylist(@NotNull ExtractedICalendarParser.BymodaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 */
	void enterK_cutype(@NotNull ExtractedICalendarParser.K_cutypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 */
	void exitK_cutype(@NotNull ExtractedICalendarParser.K_cutypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#attparam}.
	 * @param ctx the parse tree
	 */
	void enterAttparam(@NotNull ExtractedICalendarParser.AttparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#attparam}.
	 * @param ctx the parse tree
	 */
	void exitAttparam(@NotNull ExtractedICalendarParser.AttparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 */
	void enterB_chars(@NotNull ExtractedICalendarParser.B_charsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 */
	void exitB_chars(@NotNull ExtractedICalendarParser.B_charsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(@NotNull ExtractedICalendarParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(@NotNull ExtractedICalendarParser.LanguageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull ExtractedICalendarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull ExtractedICalendarParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 */
	void enterValuetypeparam(@NotNull ExtractedICalendarParser.ValuetypeparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 */
	void exitValuetypeparam(@NotNull ExtractedICalendarParser.ValuetypeparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 */
	void enterK_hourly(@NotNull ExtractedICalendarParser.K_hourlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 */
	void exitK_hourly(@NotNull ExtractedICalendarParser.K_hourlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 */
	void enterVervalue(@NotNull ExtractedICalendarParser.VervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 */
	void exitVervalue(@NotNull ExtractedICalendarParser.VervalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ExtractedICalendarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ExtractedICalendarParser.BinaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 */
	void enterK_rrule(@NotNull ExtractedICalendarParser.K_rruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 */
	void exitK_rrule(@NotNull ExtractedICalendarParser.K_rruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull ExtractedICalendarParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull ExtractedICalendarParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 */
	void enterRidparam(@NotNull ExtractedICalendarParser.RidparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 */
	void exitRidparam(@NotNull ExtractedICalendarParser.RidparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 */
	void enterFbparam(@NotNull ExtractedICalendarParser.FbparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 */
	void exitFbparam(@NotNull ExtractedICalendarParser.FbparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_related}.
	 * @param ctx the parse tree
	 */
	void enterK_related(@NotNull ExtractedICalendarParser.K_relatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_related}.
	 * @param ctx the parse tree
	 */
	void exitK_related(@NotNull ExtractedICalendarParser.K_relatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 */
	void enterPartstatparam(@NotNull ExtractedICalendarParser.PartstatparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 */
	void exitPartstatparam(@NotNull ExtractedICalendarParser.PartstatparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(@NotNull ExtractedICalendarParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(@NotNull ExtractedICalendarParser.Param_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 */
	void enterK_draft(@NotNull ExtractedICalendarParser.K_draftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 */
	void exitK_draft(@NotNull ExtractedICalendarParser.K_draftContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#contact}.
	 * @param ctx the parse tree
	 */
	void enterContact(@NotNull ExtractedICalendarParser.ContactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#contact}.
	 * @param ctx the parse tree
	 */
	void exitContact(@NotNull ExtractedICalendarParser.ContactContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#calscale}.
	 * @param ctx the parse tree
	 */
	void enterCalscale(@NotNull ExtractedICalendarParser.CalscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#calscale}.
	 * @param ctx the parse tree
	 */
	void exitCalscale(@NotNull ExtractedICalendarParser.CalscaleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 */
	void enterK_summary(@NotNull ExtractedICalendarParser.K_summaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 */
	void exitK_summary(@NotNull ExtractedICalendarParser.K_summaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 */
	void enterK_fr(@NotNull ExtractedICalendarParser.K_frContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 */
	void exitK_fr(@NotNull ExtractedICalendarParser.K_frContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 */
	void enterK_busy_tentative(@NotNull ExtractedICalendarParser.K_busy_tentativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 */
	void exitK_busy_tentative(@NotNull ExtractedICalendarParser.K_busy_tentativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(@NotNull ExtractedICalendarParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(@NotNull ExtractedICalendarParser.VersionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void enterValuetype(@NotNull ExtractedICalendarParser.ValuetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void exitValuetype(@NotNull ExtractedICalendarParser.ValuetypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 */
	void enterDaylightc(@NotNull ExtractedICalendarParser.DaylightcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 */
	void exitDaylightc(@NotNull ExtractedICalendarParser.DaylightcContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 */
	void enterRstatus(@NotNull ExtractedICalendarParser.RstatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 */
	void exitRstatus(@NotNull ExtractedICalendarParser.RstatusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 */
	void enterK_busy(@NotNull ExtractedICalendarParser.K_busyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 */
	void exitK_busy(@NotNull ExtractedICalendarParser.K_busyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 */
	void enterK_reltype(@NotNull ExtractedICalendarParser.K_reltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 */
	void exitK_reltype(@NotNull ExtractedICalendarParser.K_reltypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void enterK_boolean(@NotNull ExtractedICalendarParser.K_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void exitK_boolean(@NotNull ExtractedICalendarParser.K_booleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 */
	void enterK_yearly(@NotNull ExtractedICalendarParser.K_yearlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 */
	void exitK_yearly(@NotNull ExtractedICalendarParser.K_yearlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 */
	void enterK_cal_address(@NotNull ExtractedICalendarParser.K_cal_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 */
	void exitK_cal_address(@NotNull ExtractedICalendarParser.K_cal_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#recur}.
	 * @param ctx the parse tree
	 */
	void enterRecur(@NotNull ExtractedICalendarParser.RecurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#recur}.
	 * @param ctx the parse tree
	 */
	void exitRecur(@NotNull ExtractedICalendarParser.RecurContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 */
	void enterK_percent_complete(@NotNull ExtractedICalendarParser.K_percent_completeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 */
	void exitK_percent_complete(@NotNull ExtractedICalendarParser.K_percent_completeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 */
	void enterK_attach(@NotNull ExtractedICalendarParser.K_attachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 */
	void exitK_attach(@NotNull ExtractedICalendarParser.K_attachContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#completed}.
	 * @param ctx the parse tree
	 */
	void enterCompleted(@NotNull ExtractedICalendarParser.CompletedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#completed}.
	 * @param ctx the parse tree
	 */
	void exitCompleted(@NotNull ExtractedICalendarParser.CompletedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 */
	void enterK_request_status(@NotNull ExtractedICalendarParser.K_request_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 */
	void exitK_request_status(@NotNull ExtractedICalendarParser.K_request_statusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 */
	void enterTzurl(@NotNull ExtractedICalendarParser.TzurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 */
	void exitTzurl(@NotNull ExtractedICalendarParser.TzurlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 */
	void enterK_vjournal(@NotNull ExtractedICalendarParser.K_vjournalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 */
	void exitK_vjournal(@NotNull ExtractedICalendarParser.K_vjournalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 */
	void enterK_daily(@NotNull ExtractedICalendarParser.K_dailyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 */
	void exitK_daily(@NotNull ExtractedICalendarParser.K_dailyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(@NotNull ExtractedICalendarParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(@NotNull ExtractedICalendarParser.TriggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_room}.
	 * @param ctx the parse tree
	 */
	void enterK_room(@NotNull ExtractedICalendarParser.K_roomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_room}.
	 * @param ctx the parse tree
	 */
	void exitK_room(@NotNull ExtractedICalendarParser.K_roomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_todo(@NotNull ExtractedICalendarParser.Statvalue_todoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_todo(@NotNull ExtractedICalendarParser.Statvalue_todoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_child}.
	 * @param ctx the parse tree
	 */
	void enterK_child(@NotNull ExtractedICalendarParser.K_childContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_child}.
	 * @param ctx the parse tree
	 */
	void exitK_child(@NotNull ExtractedICalendarParser.K_childContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 */
	void enterK_relat(@NotNull ExtractedICalendarParser.K_relatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 */
	void exitK_relat(@NotNull ExtractedICalendarParser.K_relatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_we}.
	 * @param ctx the parse tree
	 */
	void enterK_we(@NotNull ExtractedICalendarParser.K_weContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_we}.
	 * @param ctx the parse tree
	 */
	void exitK_we(@NotNull ExtractedICalendarParser.K_weContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 */
	void enterK_priority(@NotNull ExtractedICalendarParser.K_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 */
	void exitK_priority(@NotNull ExtractedICalendarParser.K_priorityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 */
	void enterK_minutely(@NotNull ExtractedICalendarParser.K_minutelyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 */
	void exitK_minutely(@NotNull ExtractedICalendarParser.K_minutelyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 */
	void enterK_bymonthday(@NotNull ExtractedICalendarParser.K_bymonthdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 */
	void exitK_bymonthday(@NotNull ExtractedICalendarParser.K_bymonthdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 */
	void enterQsafe_char(@NotNull ExtractedICalendarParser.Qsafe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 */
	void exitQsafe_char(@NotNull ExtractedICalendarParser.Qsafe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#recurid}.
	 * @param ctx the parse tree
	 */
	void enterRecurid(@NotNull ExtractedICalendarParser.RecuridContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#recurid}.
	 * @param ctx the parse tree
	 */
	void exitRecurid(@NotNull ExtractedICalendarParser.RecuridContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 */
	void enterAlarmprop(@NotNull ExtractedICalendarParser.AlarmpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 */
	void exitAlarmprop(@NotNull ExtractedICalendarParser.AlarmpropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_value}.
	 * @param ctx the parse tree
	 */
	void enterK_value(@NotNull ExtractedICalendarParser.K_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_value}.
	 * @param ctx the parse tree
	 */
	void exitK_value(@NotNull ExtractedICalendarParser.K_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 */
	void enterK_sibling(@NotNull ExtractedICalendarParser.K_siblingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 */
	void exitK_sibling(@NotNull ExtractedICalendarParser.K_siblingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 */
	void enterK_weekly(@NotNull ExtractedICalendarParser.K_weeklyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 */
	void exitK_weekly(@NotNull ExtractedICalendarParser.K_weeklyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_address}.
	 * @param ctx the parse tree
	 */
	void enterK_address(@NotNull ExtractedICalendarParser.K_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_address}.
	 * @param ctx the parse tree
	 */
	void exitK_address(@NotNull ExtractedICalendarParser.K_addressContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 */
	void enterK_completed(@NotNull ExtractedICalendarParser.K_completedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 */
	void exitK_completed(@NotNull ExtractedICalendarParser.K_completedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#attach}.
	 * @param ctx the parse tree
	 */
	void enterAttach(@NotNull ExtractedICalendarParser.AttachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#attach}.
	 * @param ctx the parse tree
	 */
	void exitAttach(@NotNull ExtractedICalendarParser.AttachContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#x_param}.
	 * @param ctx the parse tree
	 */
	void enterX_param(@NotNull ExtractedICalendarParser.X_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#x_param}.
	 * @param ctx the parse tree
	 */
	void exitX_param(@NotNull ExtractedICalendarParser.X_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 */
	void enterK_vfreebusy(@NotNull ExtractedICalendarParser.K_vfreebusyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 */
	void exitK_vfreebusy(@NotNull ExtractedICalendarParser.K_vfreebusyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull ExtractedICalendarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull ExtractedICalendarParser.MethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 */
	void enterDtstamp(@NotNull ExtractedICalendarParser.DtstampContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 */
	void exitDtstamp(@NotNull ExtractedICalendarParser.DtstampContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzid}.
	 * @param ctx the parse tree
	 */
	void enterTzid(@NotNull ExtractedICalendarParser.TzidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzid}.
	 * @param ctx the parse tree
	 */
	void exitTzid(@NotNull ExtractedICalendarParser.TzidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 */
	void enterK_byhour(@NotNull ExtractedICalendarParser.K_byhourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 */
	void exitK_byhour(@NotNull ExtractedICalendarParser.K_byhourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(@NotNull ExtractedICalendarParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(@NotNull ExtractedICalendarParser.UidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 */
	void enterIana_token(@NotNull ExtractedICalendarParser.Iana_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 */
	void exitIana_token(@NotNull ExtractedICalendarParser.Iana_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 */
	void enterDur_week(@NotNull ExtractedICalendarParser.Dur_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 */
	void exitDur_week(@NotNull ExtractedICalendarParser.Dur_weekContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_jour(@NotNull ExtractedICalendarParser.Statvalue_jourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_jour(@NotNull ExtractedICalendarParser.Statvalue_jourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(@NotNull ExtractedICalendarParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(@NotNull ExtractedICalendarParser.CountContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 */
	void enterK_audio(@NotNull ExtractedICalendarParser.K_audioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 */
	void exitK_audio(@NotNull ExtractedICalendarParser.K_audioContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull ExtractedICalendarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull ExtractedICalendarParser.LocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 */
	void enterK_bit(@NotNull ExtractedICalendarParser.K_bitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 */
	void exitK_bit(@NotNull ExtractedICalendarParser.K_bitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void enterRrule(@NotNull ExtractedICalendarParser.RruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void exitRrule(@NotNull ExtractedICalendarParser.RruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 */
	void enterK_vtodo(@NotNull ExtractedICalendarParser.K_vtodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 */
	void exitK_vtodo(@NotNull ExtractedICalendarParser.K_vtodoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#prodid}.
	 * @param ctx the parse tree
	 */
	void enterProdid(@NotNull ExtractedICalendarParser.ProdidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#prodid}.
	 * @param ctx the parse tree
	 */
	void exitProdid(@NotNull ExtractedICalendarParser.ProdidContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 */
	void enterCnparam(@NotNull ExtractedICalendarParser.CnparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 */
	void exitCnparam(@NotNull ExtractedICalendarParser.CnparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 */
	void enterMonthdaynum(@NotNull ExtractedICalendarParser.MonthdaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 */
	void exitMonthdaynum(@NotNull ExtractedICalendarParser.MonthdaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 */
	void enterK_confirmed(@NotNull ExtractedICalendarParser.K_confirmedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 */
	void exitK_confirmed(@NotNull ExtractedICalendarParser.K_confirmedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#date_month}.
	 * @param ctx the parse tree
	 */
	void enterDate_month(@NotNull ExtractedICalendarParser.Date_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#date_month}.
	 * @param ctx the parse tree
	 */
	void exitDate_month(@NotNull ExtractedICalendarParser.Date_monthContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_text}.
	 * @param ctx the parse tree
	 */
	void enterK_text(@NotNull ExtractedICalendarParser.K_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_text}.
	 * @param ctx the parse tree
	 */
	void exitK_text(@NotNull ExtractedICalendarParser.K_textContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 */
	void enterFreebusyc(@NotNull ExtractedICalendarParser.FreebusycContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 */
	void exitFreebusyc(@NotNull ExtractedICalendarParser.FreebusycContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 */
	void enterK_byweekno(@NotNull ExtractedICalendarParser.K_byweeknoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 */
	void exitK_byweekno(@NotNull ExtractedICalendarParser.K_byweeknoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#related}.
	 * @param ctx the parse tree
	 */
	void enterRelated(@NotNull ExtractedICalendarParser.RelatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#related}.
	 * @param ctx the parse tree
	 */
	void exitRelated(@NotNull ExtractedICalendarParser.RelatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 */
	void enterReg_name_char(@NotNull ExtractedICalendarParser.Reg_name_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 */
	void exitReg_name_char(@NotNull ExtractedICalendarParser.Reg_name_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 */
	void enterTime_hour(@NotNull ExtractedICalendarParser.Time_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 */
	void exitTime_hour(@NotNull ExtractedICalendarParser.Time_hourContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 */
	void enterDur_day(@NotNull ExtractedICalendarParser.Dur_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 */
	void exitDur_day(@NotNull ExtractedICalendarParser.Dur_dayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 */
	void enterWeeknum(@NotNull ExtractedICalendarParser.WeeknumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 */
	void exitWeeknum(@NotNull ExtractedICalendarParser.WeeknumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 */
	void enterDtstart(@NotNull ExtractedICalendarParser.DtstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 */
	void exitDtstart(@NotNull ExtractedICalendarParser.DtstartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 */
	void enterK_mo(@NotNull ExtractedICalendarParser.K_moContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 */
	void exitK_mo(@NotNull ExtractedICalendarParser.K_moContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void enterK_tzoffsetto(@NotNull ExtractedICalendarParser.K_tzoffsettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void exitK_tzoffsetto(@NotNull ExtractedICalendarParser.K_tzoffsettoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_final}.
	 * @param ctx the parse tree
	 */
	void enterK_final(@NotNull ExtractedICalendarParser.K_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_final}.
	 * @param ctx the parse tree
	 */
	void exitK_final(@NotNull ExtractedICalendarParser.K_finalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull ExtractedICalendarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull ExtractedICalendarParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ExtractedICalendarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ExtractedICalendarParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void enterTzoffsetto(@NotNull ExtractedICalendarParser.TzoffsettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 */
	void exitTzoffsetto(@NotNull ExtractedICalendarParser.TzoffsettoContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(@NotNull ExtractedICalendarParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(@NotNull ExtractedICalendarParser.DigitsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_language}.
	 * @param ctx the parse tree
	 */
	void enterK_language(@NotNull ExtractedICalendarParser.K_languageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_language}.
	 * @param ctx the parse tree
	 */
	void exitK_language(@NotNull ExtractedICalendarParser.K_languageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 */
	void enterYeardaynum(@NotNull ExtractedICalendarParser.YeardaynumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 */
	void exitYeardaynum(@NotNull ExtractedICalendarParser.YeardaynumContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 */
	void enterIana_prop(@NotNull ExtractedICalendarParser.Iana_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 */
	void exitIana_prop(@NotNull ExtractedICalendarParser.Iana_propContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dtend}.
	 * @param ctx the parse tree
	 */
	void enterDtend(@NotNull ExtractedICalendarParser.DtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dtend}.
	 * @param ctx the parse tree
	 */
	void exitDtend(@NotNull ExtractedICalendarParser.DtendContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(@NotNull ExtractedICalendarParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(@NotNull ExtractedICalendarParser.StatusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 */
	void enterK_wkst(@NotNull ExtractedICalendarParser.K_wkstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 */
	void exitK_wkst(@NotNull ExtractedICalendarParser.K_wkstContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 */
	void enterK_accepted(@NotNull ExtractedICalendarParser.K_acceptedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 */
	void exitK_accepted(@NotNull ExtractedICalendarParser.K_acceptedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 */
	void enterK_tzname(@NotNull ExtractedICalendarParser.K_tznameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 */
	void exitK_tzname(@NotNull ExtractedICalendarParser.K_tznameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 */
	void enterK_gregorian(@NotNull ExtractedICalendarParser.K_gregorianContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 */
	void exitK_gregorian(@NotNull ExtractedICalendarParser.K_gregorianContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 */
	void enterSentbyparam(@NotNull ExtractedICalendarParser.SentbyparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 */
	void exitSentbyparam(@NotNull ExtractedICalendarParser.SentbyparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_display}.
	 * @param ctx the parse tree
	 */
	void enterK_display(@NotNull ExtractedICalendarParser.K_displayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_display}.
	 * @param ctx the parse tree
	 */
	void exitK_display(@NotNull ExtractedICalendarParser.K_displayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 */
	void enterK_opt_participant(@NotNull ExtractedICalendarParser.K_opt_participantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 */
	void exitK_opt_participant(@NotNull ExtractedICalendarParser.K_opt_participantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 */
	void enterK_bysetpos(@NotNull ExtractedICalendarParser.K_bysetposContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 */
	void exitK_bysetpos(@NotNull ExtractedICalendarParser.K_bysetposContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 */
	void enterIcalparameter(@NotNull ExtractedICalendarParser.IcalparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 */
	void exitIcalparameter(@NotNull ExtractedICalendarParser.IcalparameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 */
	void enterK_rdate(@NotNull ExtractedICalendarParser.K_rdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 */
	void exitK_rdate(@NotNull ExtractedICalendarParser.K_rdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 */
	void enterK_categories(@NotNull ExtractedICalendarParser.K_categoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 */
	void exitK_categories(@NotNull ExtractedICalendarParser.K_categoriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 */
	void enterByyrdaylist(@NotNull ExtractedICalendarParser.ByyrdaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 */
	void exitByyrdaylist(@NotNull ExtractedICalendarParser.ByyrdaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 */
	void enterX_prop(@NotNull ExtractedICalendarParser.X_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 */
	void exitX_prop(@NotNull ExtractedICalendarParser.X_propContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 */
	void enterOrdyrday(@NotNull ExtractedICalendarParser.OrdyrdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 */
	void exitOrdyrday(@NotNull ExtractedICalendarParser.OrdyrdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#transp}.
	 * @param ctx the parse tree
	 */
	void enterTransp(@NotNull ExtractedICalendarParser.TranspContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#transp}.
	 * @param ctx the parse tree
	 */
	void exitTransp(@NotNull ExtractedICalendarParser.TranspContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 */
	void enterK_trigger(@NotNull ExtractedICalendarParser.K_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 */
	void exitK_trigger(@NotNull ExtractedICalendarParser.K_triggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 */
	void enterOrgparam(@NotNull ExtractedICalendarParser.OrgparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 */
	void exitOrgparam(@NotNull ExtractedICalendarParser.OrgparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 */
	void enterK_attendee(@NotNull ExtractedICalendarParser.K_attendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 */
	void exitK_attendee(@NotNull ExtractedICalendarParser.K_attendeeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 */
	void enterTodoprop(@NotNull ExtractedICalendarParser.TodopropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 */
	void exitTodoprop(@NotNull ExtractedICalendarParser.TodopropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_float}.
	 * @param ctx the parse tree
	 */
	void enterK_float(@NotNull ExtractedICalendarParser.K_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_float}.
	 * @param ctx the parse tree
	 */
	void exitK_float(@NotNull ExtractedICalendarParser.K_floatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_count}.
	 * @param ctx the parse tree
	 */
	void enterK_count(@NotNull ExtractedICalendarParser.K_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_count}.
	 * @param ctx the parse tree
	 */
	void exitK_count(@NotNull ExtractedICalendarParser.K_countContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 */
	void enterK_byyearday(@NotNull ExtractedICalendarParser.K_byyeardayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 */
	void exitK_byyearday(@NotNull ExtractedICalendarParser.K_byyeardayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_url}.
	 * @param ctx the parse tree
	 */
	void enterK_url(@NotNull ExtractedICalendarParser.K_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_url}.
	 * @param ctx the parse tree
	 */
	void exitK_url(@NotNull ExtractedICalendarParser.K_urlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#weekday}.
	 * @param ctx the parse tree
	 */
	void enterWeekday(@NotNull ExtractedICalendarParser.WeekdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#weekday}.
	 * @param ctx the parse tree
	 */
	void exitWeekday(@NotNull ExtractedICalendarParser.WeekdayContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 */
	void enterStatvalue_event(@NotNull ExtractedICalendarParser.Statvalue_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 */
	void exitStatvalue_event(@NotNull ExtractedICalendarParser.Statvalue_eventContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#time_second}.
	 * @param ctx the parse tree
	 */
	void enterTime_second(@NotNull ExtractedICalendarParser.Time_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#time_second}.
	 * @param ctx the parse tree
	 */
	void exitTime_second(@NotNull ExtractedICalendarParser.Time_secondContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 */
	void enterK_uri(@NotNull ExtractedICalendarParser.K_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 */
	void exitK_uri(@NotNull ExtractedICalendarParser.K_uriContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#contentline}.
	 * @param ctx the parse tree
	 */
	void enterContentline(@NotNull ExtractedICalendarParser.ContentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#contentline}.
	 * @param ctx the parse tree
	 */
	void exitContentline(@NotNull ExtractedICalendarParser.ContentlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 */
	void enterLast_mod(@NotNull ExtractedICalendarParser.Last_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 */
	void exitLast_mod(@NotNull ExtractedICalendarParser.Last_modContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#relparam}.
	 * @param ctx the parse tree
	 */
	void enterRelparam(@NotNull ExtractedICalendarParser.RelparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#relparam}.
	 * @param ctx the parse tree
	 */
	void exitRelparam(@NotNull ExtractedICalendarParser.RelparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 */
	void enterTimezoneprop(@NotNull ExtractedICalendarParser.TimezonepropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 */
	void exitTimezoneprop(@NotNull ExtractedICalendarParser.TimezonepropContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 */
	void enterByhrlist(@NotNull ExtractedICalendarParser.ByhrlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 */
	void exitByhrlist(@NotNull ExtractedICalendarParser.ByhrlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 */
	void enterX_comp(@NotNull ExtractedICalendarParser.X_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 */
	void exitX_comp(@NotNull ExtractedICalendarParser.X_compContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 */
	void enterDeltoparam(@NotNull ExtractedICalendarParser.DeltoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 */
	void exitDeltoparam(@NotNull ExtractedICalendarParser.DeltoparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 */
	void enterSafe_char(@NotNull ExtractedICalendarParser.Safe_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 */
	void exitSafe_char(@NotNull ExtractedICalendarParser.Safe_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 */
	void enterRoleparam(@NotNull ExtractedICalendarParser.RoleparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 */
	void exitRoleparam(@NotNull ExtractedICalendarParser.RoleparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 */
	void enterK_unknown(@NotNull ExtractedICalendarParser.K_unknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 */
	void exitK_unknown(@NotNull ExtractedICalendarParser.K_unknownContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void enterTzoffsetfrom(@NotNull ExtractedICalendarParser.TzoffsetfromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 */
	void exitTzoffsetfrom(@NotNull ExtractedICalendarParser.TzoffsetfromContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 */
	void enterMemberparam(@NotNull ExtractedICalendarParser.MemberparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 */
	void exitMemberparam(@NotNull ExtractedICalendarParser.MemberparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 */
	void enterBywdaylist(@NotNull ExtractedICalendarParser.BywdaylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 */
	void exitBywdaylist(@NotNull ExtractedICalendarParser.BywdaylistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_group}.
	 * @param ctx the parse tree
	 */
	void enterK_group(@NotNull ExtractedICalendarParser.K_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_group}.
	 * @param ctx the parse tree
	 */
	void exitK_group(@NotNull ExtractedICalendarParser.K_groupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 */
	void enterDur_date(@NotNull ExtractedICalendarParser.Dur_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 */
	void exitDur_date(@NotNull ExtractedICalendarParser.Dur_dateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 */
	void enterAttachparam(@NotNull ExtractedICalendarParser.AttachparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 */
	void exitAttachparam(@NotNull ExtractedICalendarParser.AttachparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#b_char}.
	 * @param ctx the parse tree
	 */
	void enterB_char(@NotNull ExtractedICalendarParser.B_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#b_char}.
	 * @param ctx the parse tree
	 */
	void exitB_char(@NotNull ExtractedICalendarParser.B_charContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_created}.
	 * @param ctx the parse tree
	 */
	void enterK_created(@NotNull ExtractedICalendarParser.K_createdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_created}.
	 * @param ctx the parse tree
	 */
	void exitK_created(@NotNull ExtractedICalendarParser.K_createdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 */
	void enterK_vtimezone(@NotNull ExtractedICalendarParser.K_vtimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 */
	void exitK_vtimezone(@NotNull ExtractedICalendarParser.K_vtimezoneContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 */
	void enterK_exdate(@NotNull ExtractedICalendarParser.K_exdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 */
	void exitK_exdate(@NotNull ExtractedICalendarParser.K_exdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(@NotNull ExtractedICalendarParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(@NotNull ExtractedICalendarParser.DurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#x_name}.
	 * @param ctx the parse tree
	 */
	void enterX_name(@NotNull ExtractedICalendarParser.X_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#x_name}.
	 * @param ctx the parse tree
	 */
	void exitX_name(@NotNull ExtractedICalendarParser.X_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_explicit(@NotNull ExtractedICalendarParser.Period_explicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_explicit(@NotNull ExtractedICalendarParser.Period_explicitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 */
	void enterK_partstat(@NotNull ExtractedICalendarParser.K_partstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 */
	void exitK_partstat(@NotNull ExtractedICalendarParser.K_partstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 */
	void enterBysplist(@NotNull ExtractedICalendarParser.BysplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 */
	void exitBysplist(@NotNull ExtractedICalendarParser.BysplistContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 */
	void enterK_thisandfuture(@NotNull ExtractedICalendarParser.K_thisandfutureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 */
	void exitK_thisandfuture(@NotNull ExtractedICalendarParser.K_thisandfutureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExtractedICalendarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull ExtractedICalendarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtractedICalendarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull ExtractedICalendarParser.BoolContext ctx);
}