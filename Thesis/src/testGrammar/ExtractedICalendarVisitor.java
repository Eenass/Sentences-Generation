// Generated from ExtractedICalendar.g4 by ANTLR 4.1
package testGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtractedICalendarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtractedICalendarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary(@NotNull ExtractedICalendarParser.SummaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeparam(@NotNull ExtractedICalendarParser.RangeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_location(@NotNull ExtractedICalendarParser.K_locationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_monthly(@NotNull ExtractedICalendarParser.K_monthlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#attendee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttendee(@NotNull ExtractedICalendarParser.AttendeeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreq(@NotNull ExtractedICalendarParser.FreqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bysecond(@NotNull ExtractedICalendarParser.K_bysecondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_status(@NotNull ExtractedICalendarParser.K_statusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_public}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_public(@NotNull ExtractedICalendarParser.K_publicContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventprop(@NotNull ExtractedICalendarParser.EventpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_interval(@NotNull ExtractedICalendarParser.K_intervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_due}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_due(@NotNull ExtractedICalendarParser.K_dueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_start(@NotNull ExtractedICalendarParser.K_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_free(@NotNull ExtractedICalendarParser.K_freeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdate(@NotNull ExtractedICalendarParser.RdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_date(@NotNull ExtractedICalendarParser.Date_time_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_contact(@NotNull ExtractedICalendarParser.K_contactContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull ExtractedICalendarParser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_minute(@NotNull ExtractedICalendarParser.Time_minuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#created}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreated(@NotNull ExtractedICalendarParser.CreatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_altrep(@NotNull ExtractedICalendarParser.K_altrepContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstparam(@NotNull ExtractedICalendarParser.DtstparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlarmc(@NotNull ExtractedICalendarParser.AlarmcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_freq(@NotNull ExtractedICalendarParser.K_freqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time(@NotNull ExtractedICalendarParser.Date_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_freebusy(@NotNull ExtractedICalendarParser.K_freebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResrcparam(@NotNull ExtractedICalendarParser.ResrcparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamtext(@NotNull ExtractedICalendarParser.ParamtextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue(@NotNull ExtractedICalendarParser.StatvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#organizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizer(@NotNull ExtractedICalendarParser.OrganizerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelfromparam(@NotNull ExtractedICalendarParser.DelfromparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_method(@NotNull ExtractedICalendarParser.K_methodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#period_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_start(@NotNull ExtractedICalendarParser.Period_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriovalue(@NotNull ExtractedICalendarParser.PriovalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_uid(@NotNull ExtractedICalendarParser.K_uidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(@NotNull ExtractedICalendarParser.DigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vevent(@NotNull ExtractedICalendarParser.K_veventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdtparam(@NotNull ExtractedICalendarParser.RdtparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ExtractedICalendarParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#enddate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnddate(@NotNull ExtractedICalendarParser.EnddateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#calprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalprop(@NotNull ExtractedICalendarParser.CalpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_member(@NotNull ExtractedICalendarParser.K_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#value_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_char(@NotNull ExtractedICalendarParser.Value_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_version(@NotNull ExtractedICalendarParser.K_versionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_utc_offset(@NotNull ExtractedICalendarParser.K_utc_offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsafe_char(@NotNull ExtractedICalendarParser.Tsafe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRstatparam(@NotNull ExtractedICalendarParser.RstatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal_address(@NotNull ExtractedICalendarParser.Cal_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeovalue(@NotNull ExtractedICalendarParser.GeovalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_in_progress(@NotNull ExtractedICalendarParser.K_in_progressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull ExtractedICalendarParser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzname(@NotNull ExtractedICalendarParser.TznameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_transparent(@NotNull ExtractedICalendarParser.K_transparentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_recurrence_id(@NotNull ExtractedICalendarParser.K_recurrence_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_confidential(@NotNull ExtractedICalendarParser.K_confidentialContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtendparam(@NotNull ExtractedICalendarParser.DtendparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_parent(@NotNull ExtractedICalendarParser.K_parentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#eventc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventc(@NotNull ExtractedICalendarParser.EventcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cancelled(@NotNull ExtractedICalendarParser.K_cancelledContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bymonth(@NotNull ExtractedICalendarParser.K_bymonthContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageparam(@NotNull ExtractedICalendarParser.LanguageparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_prodid(@NotNull ExtractedICalendarParser.K_prodidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull ExtractedICalendarParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionvalue(@NotNull ExtractedICalendarParser.ActionvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#standardc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardc(@NotNull ExtractedICalendarParser.StandardcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dir(@NotNull ExtractedICalendarParser.K_dirContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull ExtractedICalendarParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rsvp(@NotNull ExtractedICalendarParser.K_rsvpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtstamp(@NotNull ExtractedICalendarParser.K_dtstampContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigabs(@NotNull ExtractedICalendarParser.TrigabsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#language_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_char(@NotNull ExtractedICalendarParser.Language_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sent_by(@NotNull ExtractedICalendarParser.K_sent_byContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsvpparam(@NotNull ExtractedICalendarParser.RsvpparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymolist(@NotNull ExtractedICalendarParser.BymolistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzidparam(@NotNull ExtractedICalendarParser.TzidparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtc_offset(@NotNull ExtractedICalendarParser.Utc_offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_base(@NotNull ExtractedICalendarParser.K_baseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_numzone(@NotNull ExtractedICalendarParser.Time_numzoneContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tentative(@NotNull ExtractedICalendarParser.K_tentativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sequence(@NotNull ExtractedICalendarParser.K_sequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_action(@NotNull ExtractedICalendarParser.K_actionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_name(@NotNull ExtractedICalendarParser.Subtype_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdtval(@NotNull ExtractedICalendarParser.RdtvalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzprop(@NotNull ExtractedICalendarParser.TzpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#exdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExdate(@NotNull ExtractedICalendarParser.ExdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_value(@NotNull ExtractedICalendarParser.Dur_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#param_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_value(@NotNull ExtractedICalendarParser.Param_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull ExtractedICalendarParser.ResourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tu(@NotNull ExtractedICalendarParser.K_tuContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent(@NotNull ExtractedICalendarParser.PercentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_fullyear(@NotNull ExtractedICalendarParser.Date_fullyearContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_valarm(@NotNull ExtractedICalendarParser.K_valarmContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_true(@NotNull ExtractedICalendarParser.K_trueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#descparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescparam(@NotNull ExtractedICalendarParser.DescparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReltypeparam(@NotNull ExtractedICalendarParser.ReltypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_date_time(@NotNull ExtractedICalendarParser.K_date_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_email(@NotNull ExtractedICalendarParser.K_emailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_binary(@NotNull ExtractedICalendarParser.K_binaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(@NotNull ExtractedICalendarParser.Quoted_stringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(@NotNull ExtractedICalendarParser.ComponentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(@NotNull ExtractedICalendarParser.DescriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority(@NotNull ExtractedICalendarParser.PriorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_2(@NotNull ExtractedICalendarParser.Digits_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreebusy(@NotNull ExtractedICalendarParser.FreebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_event(@NotNull ExtractedICalendarParser.Partstat_eventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_participant(@NotNull ExtractedICalendarParser.K_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#summparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummparam(@NotNull ExtractedICalendarParser.SummparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_th}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_th(@NotNull ExtractedICalendarParser.K_thContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodingparam(@NotNull ExtractedICalendarParser.EncodingparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_opaque(@NotNull ExtractedICalendarParser.K_opaqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull ExtractedICalendarParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_process(@NotNull ExtractedICalendarParser.K_processContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#geo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeo(@NotNull ExtractedICalendarParser.GeoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExdtparam(@NotNull ExtractedICalendarParser.ExdtparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_class(@NotNull ExtractedICalendarParser.K_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_resources(@NotNull ExtractedICalendarParser.K_resourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_transp(@NotNull ExtractedICalendarParser.K_transpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_name(@NotNull ExtractedICalendarParser.Reg_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_period(@NotNull ExtractedICalendarParser.K_periodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod(@NotNull ExtractedICalendarParser.PeriodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(@NotNull ExtractedICalendarParser.UriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull ExtractedICalendarParser.UrlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzoffsetfrom(@NotNull ExtractedICalendarParser.K_tzoffsetfromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fmttype(@NotNull ExtractedICalendarParser.K_fmttypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByseclist(@NotNull ExtractedICalendarParser.ByseclistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_individual(@NotNull ExtractedICalendarParser.K_individualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#due}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDue(@NotNull ExtractedICalendarParser.DueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirparam(@NotNull ExtractedICalendarParser.DirparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBywknolist(@NotNull ExtractedICalendarParser.BywknolistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_date(@NotNull ExtractedICalendarParser.K_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_num(@NotNull ExtractedICalendarParser.Alpha_numContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#clazz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClazz(@NotNull ExtractedICalendarParser.ClazzContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_non_participant(@NotNull ExtractedICalendarParser.K_non_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#locparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocparam(@NotNull ExtractedICalendarParser.LocparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_integer(@NotNull ExtractedICalendarParser.K_integerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtstart(@NotNull ExtractedICalendarParser.K_dtstartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigrel(@NotNull ExtractedICalendarParser.TrigrelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated_from(@NotNull ExtractedICalendarParser.K_delegated_fromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_daylight(@NotNull ExtractedICalendarParser.K_daylightContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbvalue(@NotNull ExtractedICalendarParser.FbvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_todo(@NotNull ExtractedICalendarParser.Partstat_todoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_encoding(@NotNull ExtractedICalendarParser.K_encodingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_req_participant(@NotNull ExtractedICalendarParser.K_req_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalstream(@NotNull ExtractedICalendarParser.IcalstreamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#statcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatcode(@NotNull ExtractedICalendarParser.StatcodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_organizer(@NotNull ExtractedICalendarParser.K_organizerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cn(@NotNull ExtractedICalendarParser.K_cnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull ExtractedICalendarParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTznparam(@NotNull ExtractedICalendarParser.TznparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#todoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoc(@NotNull ExtractedICalendarParser.TodocContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vcalendar(@NotNull ExtractedICalendarParser.K_vcalendarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byday(@NotNull ExtractedICalendarParser.K_bydayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_hour(@NotNull ExtractedICalendarParser.Dur_hourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_false(@NotNull ExtractedICalendarParser.K_falseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(@NotNull ExtractedICalendarParser.AlphaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull ExtractedICalendarParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_repeat(@NotNull ExtractedICalendarParser.K_repeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransvalue(@NotNull ExtractedICalendarParser.TransvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_range(@NotNull ExtractedICalendarParser.K_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byminute(@NotNull ExtractedICalendarParser.K_byminuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_jour(@NotNull ExtractedICalendarParser.Partstat_jourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_begin(@NotNull ExtractedICalendarParser.K_beginContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_until(@NotNull ExtractedICalendarParser.K_untilContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezonec(@NotNull ExtractedICalendarParser.TimezonecContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_su}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_su(@NotNull ExtractedICalendarParser.K_suContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy_unavailable(@NotNull ExtractedICalendarParser.K_busy_unavailableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbprop(@NotNull ExtractedICalendarParser.FbpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_last_modified(@NotNull ExtractedICalendarParser.K_last_modifiedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_duration(@NotNull ExtractedICalendarParser.K_durationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#catparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatparam(@NotNull ExtractedICalendarParser.CatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_role(@NotNull ExtractedICalendarParser.K_roleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_resource(@NotNull ExtractedICalendarParser.K_resourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_description(@NotNull ExtractedICalendarParser.K_descriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_standard(@NotNull ExtractedICalendarParser.K_standardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbtypeparam(@NotNull ExtractedICalendarParser.FbtypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sa(@NotNull ExtractedICalendarParser.K_saContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_needs_action(@NotNull ExtractedICalendarParser.K_needs_actionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_secondly(@NotNull ExtractedICalendarParser.K_secondlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_geo(@NotNull ExtractedICalendarParser.K_geoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(@NotNull ExtractedICalendarParser.SeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#other_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_param(@NotNull ExtractedICalendarParser.Other_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_time(@NotNull ExtractedICalendarParser.K_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#categories}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategories(@NotNull ExtractedICalendarParser.CategoriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_declined(@NotNull ExtractedICalendarParser.K_declinedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_recur(@NotNull ExtractedICalendarParser.K_recurContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_comp(@NotNull ExtractedICalendarParser.Iana_compContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_1_2(@NotNull ExtractedICalendarParser.Digits_1_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecur_rule_part(@NotNull ExtractedICalendarParser.Recur_rule_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_minute(@NotNull ExtractedICalendarParser.Dur_minuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#b_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_end(@NotNull ExtractedICalendarParser.B_endContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated(@NotNull ExtractedICalendarParser.K_delegatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_mday(@NotNull ExtractedICalendarParser.Date_mdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByminlist(@NotNull ExtractedICalendarParser.ByminlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmttypeparam(@NotNull ExtractedICalendarParser.FmttypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalobject(@NotNull ExtractedICalendarParser.IcalobjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvalue(@NotNull ExtractedICalendarParser.ClassvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_param(@NotNull ExtractedICalendarParser.Iana_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzurl(@NotNull ExtractedICalendarParser.K_tzurlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#float_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_num(@NotNull ExtractedICalendarParser.Float_numContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_time(@NotNull ExtractedICalendarParser.Dur_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzid(@NotNull ExtractedICalendarParser.K_tzidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_private}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_private(@NotNull ExtractedICalendarParser.K_privateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#contparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContparam(@NotNull ExtractedICalendarParser.ContparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated_to(@NotNull ExtractedICalendarParser.K_delegated_toContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_chair(@NotNull ExtractedICalendarParser.K_chairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_end(@NotNull ExtractedICalendarParser.K_endContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_value(@NotNull ExtractedICalendarParser.Date_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigrelparam(@NotNull ExtractedICalendarParser.TrigrelparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCutypeparam(@NotNull ExtractedICalendarParser.CutypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_calscale(@NotNull ExtractedICalendarParser.K_calscaleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDueparam(@NotNull ExtractedICalendarParser.DueparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltrepparam(@NotNull ExtractedICalendarParser.AltrepparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fbtype(@NotNull ExtractedICalendarParser.K_fbtypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_second(@NotNull ExtractedICalendarParser.Dur_secondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_related_to(@NotNull ExtractedICalendarParser.K_related_toContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtend(@NotNull ExtractedICalendarParser.K_dtendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_comment(@NotNull ExtractedICalendarParser.K_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJourprop(@NotNull ExtractedICalendarParser.JourpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#commparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommparam(@NotNull ExtractedICalendarParser.CommparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekdaynum(@NotNull ExtractedICalendarParser.WeekdaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#journalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJournalc(@NotNull ExtractedICalendarParser.JournalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymodaylist(@NotNull ExtractedICalendarParser.BymodaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cutype(@NotNull ExtractedICalendarParser.K_cutypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#attparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttparam(@NotNull ExtractedICalendarParser.AttparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_chars(@NotNull ExtractedICalendarParser.B_charsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(@NotNull ExtractedICalendarParser.LanguageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull ExtractedICalendarParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuetypeparam(@NotNull ExtractedICalendarParser.ValuetypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_hourly(@NotNull ExtractedICalendarParser.K_hourlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVervalue(@NotNull ExtractedICalendarParser.VervalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull ExtractedICalendarParser.BinaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rrule(@NotNull ExtractedICalendarParser.K_rruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull ExtractedICalendarParser.IntervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRidparam(@NotNull ExtractedICalendarParser.RidparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbparam(@NotNull ExtractedICalendarParser.FbparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_related}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_related(@NotNull ExtractedICalendarParser.K_relatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstatparam(@NotNull ExtractedICalendarParser.PartstatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(@NotNull ExtractedICalendarParser.Param_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_draft(@NotNull ExtractedICalendarParser.K_draftContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact(@NotNull ExtractedICalendarParser.ContactContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#calscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalscale(@NotNull ExtractedICalendarParser.CalscaleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_summary(@NotNull ExtractedICalendarParser.K_summaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fr(@NotNull ExtractedICalendarParser.K_frContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy_tentative(@NotNull ExtractedICalendarParser.K_busy_tentativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(@NotNull ExtractedICalendarParser.VersionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuetype(@NotNull ExtractedICalendarParser.ValuetypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaylightc(@NotNull ExtractedICalendarParser.DaylightcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRstatus(@NotNull ExtractedICalendarParser.RstatusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy(@NotNull ExtractedICalendarParser.K_busyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_reltype(@NotNull ExtractedICalendarParser.K_reltypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_boolean(@NotNull ExtractedICalendarParser.K_booleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_yearly(@NotNull ExtractedICalendarParser.K_yearlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cal_address(@NotNull ExtractedICalendarParser.K_cal_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#recur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecur(@NotNull ExtractedICalendarParser.RecurContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_percent_complete(@NotNull ExtractedICalendarParser.K_percent_completeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_attach(@NotNull ExtractedICalendarParser.K_attachContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#completed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleted(@NotNull ExtractedICalendarParser.CompletedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_request_status(@NotNull ExtractedICalendarParser.K_request_statusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzurl(@NotNull ExtractedICalendarParser.TzurlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vjournal(@NotNull ExtractedICalendarParser.K_vjournalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_daily(@NotNull ExtractedICalendarParser.K_dailyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger(@NotNull ExtractedICalendarParser.TriggerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_room(@NotNull ExtractedICalendarParser.K_roomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_todo(@NotNull ExtractedICalendarParser.Statvalue_todoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_child(@NotNull ExtractedICalendarParser.K_childContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_relat(@NotNull ExtractedICalendarParser.K_relatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_we}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_we(@NotNull ExtractedICalendarParser.K_weContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_priority(@NotNull ExtractedICalendarParser.K_priorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_minutely(@NotNull ExtractedICalendarParser.K_minutelyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bymonthday(@NotNull ExtractedICalendarParser.K_bymonthdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQsafe_char(@NotNull ExtractedICalendarParser.Qsafe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#recurid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurid(@NotNull ExtractedICalendarParser.RecuridContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlarmprop(@NotNull ExtractedICalendarParser.AlarmpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_value(@NotNull ExtractedICalendarParser.K_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sibling(@NotNull ExtractedICalendarParser.K_siblingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_weekly(@NotNull ExtractedICalendarParser.K_weeklyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_address(@NotNull ExtractedICalendarParser.K_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_completed(@NotNull ExtractedICalendarParser.K_completedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#attach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach(@NotNull ExtractedICalendarParser.AttachContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#x_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_param(@NotNull ExtractedICalendarParser.X_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vfreebusy(@NotNull ExtractedICalendarParser.K_vfreebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ExtractedICalendarParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstamp(@NotNull ExtractedICalendarParser.DtstampContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzid(@NotNull ExtractedICalendarParser.TzidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byhour(@NotNull ExtractedICalendarParser.K_byhourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(@NotNull ExtractedICalendarParser.UidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_token(@NotNull ExtractedICalendarParser.Iana_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_week(@NotNull ExtractedICalendarParser.Dur_weekContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_jour(@NotNull ExtractedICalendarParser.Statvalue_jourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(@NotNull ExtractedICalendarParser.CountContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_audio(@NotNull ExtractedICalendarParser.K_audioContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(@NotNull ExtractedICalendarParser.LocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bit(@NotNull ExtractedICalendarParser.K_bitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#rrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRrule(@NotNull ExtractedICalendarParser.RruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vtodo(@NotNull ExtractedICalendarParser.K_vtodoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#prodid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdid(@NotNull ExtractedICalendarParser.ProdidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnparam(@NotNull ExtractedICalendarParser.CnparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthdaynum(@NotNull ExtractedICalendarParser.MonthdaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_confirmed(@NotNull ExtractedICalendarParser.K_confirmedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#date_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_month(@NotNull ExtractedICalendarParser.Date_monthContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_text(@NotNull ExtractedICalendarParser.K_textContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreebusyc(@NotNull ExtractedICalendarParser.FreebusycContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byweekno(@NotNull ExtractedICalendarParser.K_byweeknoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#related}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelated(@NotNull ExtractedICalendarParser.RelatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_name_char(@NotNull ExtractedICalendarParser.Reg_name_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_hour(@NotNull ExtractedICalendarParser.Time_hourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_day(@NotNull ExtractedICalendarParser.Dur_dayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeeknum(@NotNull ExtractedICalendarParser.WeeknumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstart(@NotNull ExtractedICalendarParser.DtstartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_mo(@NotNull ExtractedICalendarParser.K_moContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzoffsetto(@NotNull ExtractedICalendarParser.K_tzoffsettoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_final(@NotNull ExtractedICalendarParser.K_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull ExtractedICalendarParser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ExtractedICalendarParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzoffsetto(@NotNull ExtractedICalendarParser.TzoffsettoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(@NotNull ExtractedICalendarParser.DigitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_language(@NotNull ExtractedICalendarParser.K_languageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYeardaynum(@NotNull ExtractedICalendarParser.YeardaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_prop(@NotNull ExtractedICalendarParser.Iana_propContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtend(@NotNull ExtractedICalendarParser.DtendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(@NotNull ExtractedICalendarParser.StatusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_wkst(@NotNull ExtractedICalendarParser.K_wkstContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_accepted(@NotNull ExtractedICalendarParser.K_acceptedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzname(@NotNull ExtractedICalendarParser.K_tznameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_gregorian(@NotNull ExtractedICalendarParser.K_gregorianContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentbyparam(@NotNull ExtractedICalendarParser.SentbyparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_display(@NotNull ExtractedICalendarParser.K_displayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_opt_participant(@NotNull ExtractedICalendarParser.K_opt_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bysetpos(@NotNull ExtractedICalendarParser.K_bysetposContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalparameter(@NotNull ExtractedICalendarParser.IcalparameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rdate(@NotNull ExtractedICalendarParser.K_rdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_categories(@NotNull ExtractedICalendarParser.K_categoriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByyrdaylist(@NotNull ExtractedICalendarParser.ByyrdaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_prop(@NotNull ExtractedICalendarParser.X_propContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdyrday(@NotNull ExtractedICalendarParser.OrdyrdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#transp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransp(@NotNull ExtractedICalendarParser.TranspContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_trigger(@NotNull ExtractedICalendarParser.K_triggerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrgparam(@NotNull ExtractedICalendarParser.OrgparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_attendee(@NotNull ExtractedICalendarParser.K_attendeeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoprop(@NotNull ExtractedICalendarParser.TodopropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_float(@NotNull ExtractedICalendarParser.K_floatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_count(@NotNull ExtractedICalendarParser.K_countContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byyearday(@NotNull ExtractedICalendarParser.K_byyeardayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_url(@NotNull ExtractedICalendarParser.K_urlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#weekday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekday(@NotNull ExtractedICalendarParser.WeekdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_event(@NotNull ExtractedICalendarParser.Statvalue_eventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#time_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_second(@NotNull ExtractedICalendarParser.Time_secondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_uri(@NotNull ExtractedICalendarParser.K_uriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#contentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentline(@NotNull ExtractedICalendarParser.ContentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_mod(@NotNull ExtractedICalendarParser.Last_modContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#relparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelparam(@NotNull ExtractedICalendarParser.RelparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezoneprop(@NotNull ExtractedICalendarParser.TimezonepropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByhrlist(@NotNull ExtractedICalendarParser.ByhrlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_comp(@NotNull ExtractedICalendarParser.X_compContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeltoparam(@NotNull ExtractedICalendarParser.DeltoparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafe_char(@NotNull ExtractedICalendarParser.Safe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleparam(@NotNull ExtractedICalendarParser.RoleparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_unknown(@NotNull ExtractedICalendarParser.K_unknownContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzoffsetfrom(@NotNull ExtractedICalendarParser.TzoffsetfromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberparam(@NotNull ExtractedICalendarParser.MemberparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBywdaylist(@NotNull ExtractedICalendarParser.BywdaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_group(@NotNull ExtractedICalendarParser.K_groupContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_date(@NotNull ExtractedICalendarParser.Dur_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachparam(@NotNull ExtractedICalendarParser.AttachparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#b_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_char(@NotNull ExtractedICalendarParser.B_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_created}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_created(@NotNull ExtractedICalendarParser.K_createdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vtimezone(@NotNull ExtractedICalendarParser.K_vtimezoneContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_exdate(@NotNull ExtractedICalendarParser.K_exdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(@NotNull ExtractedICalendarParser.DurationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#x_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_name(@NotNull ExtractedICalendarParser.X_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_explicit(@NotNull ExtractedICalendarParser.Period_explicitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_partstat(@NotNull ExtractedICalendarParser.K_partstatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBysplist(@NotNull ExtractedICalendarParser.BysplistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_thisandfuture(@NotNull ExtractedICalendarParser.K_thisandfutureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExtractedICalendarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull ExtractedICalendarParser.BoolContext ctx);
}