// Generated from ICalendar.g4 by ANTLR 4.1
package testSetGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ICalendarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICalendarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ICalendarParser#summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary(@NotNull ICalendarParser.SummaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rangeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeparam(@NotNull ICalendarParser.RangeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_location(@NotNull ICalendarParser.K_locationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_monthly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_monthly(@NotNull ICalendarParser.K_monthlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#attendee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttendee(@NotNull ICalendarParser.AttendeeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreq(@NotNull ICalendarParser.FreqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_bysecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bysecond(@NotNull ICalendarParser.K_bysecondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_status(@NotNull ICalendarParser.K_statusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_public}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_public(@NotNull ICalendarParser.K_publicContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#eventprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventprop(@NotNull ICalendarParser.EventpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_interval(@NotNull ICalendarParser.K_intervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_due}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_due(@NotNull ICalendarParser.K_dueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_start(@NotNull ICalendarParser.K_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_free(@NotNull ICalendarParser.K_freeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdate(@NotNull ICalendarParser.RdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_time_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_date(@NotNull ICalendarParser.Date_time_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_contact(@NotNull ICalendarParser.K_contactContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull ICalendarParser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#time_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_minute(@NotNull ICalendarParser.Time_minuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#created}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreated(@NotNull ICalendarParser.CreatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_altrep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_altrep(@NotNull ICalendarParser.K_altrepContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dtstparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstparam(@NotNull ICalendarParser.DtstparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#alarmc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlarmc(@NotNull ICalendarParser.AlarmcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_freq(@NotNull ICalendarParser.K_freqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time(@NotNull ICalendarParser.Date_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_freebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_freebusy(@NotNull ICalendarParser.K_freebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#resrcparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResrcparam(@NotNull ICalendarParser.ResrcparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#paramtext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamtext(@NotNull ICalendarParser.ParamtextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#statvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue(@NotNull ICalendarParser.StatvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#organizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizer(@NotNull ICalendarParser.OrganizerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#delfromparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelfromparam(@NotNull ICalendarParser.DelfromparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_method(@NotNull ICalendarParser.K_methodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#period_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_start(@NotNull ICalendarParser.Period_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#priovalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriovalue(@NotNull ICalendarParser.PriovalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_uid(@NotNull ICalendarParser.K_uidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(@NotNull ICalendarParser.DigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vevent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vevent(@NotNull ICalendarParser.K_veventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rdtparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdtparam(@NotNull ICalendarParser.RdtparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ICalendarParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#enddate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnddate(@NotNull ICalendarParser.EnddateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#calprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalprop(@NotNull ICalendarParser.CalpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_member(@NotNull ICalendarParser.K_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#value_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_char(@NotNull ICalendarParser.Value_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_version(@NotNull ICalendarParser.K_versionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_utc_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_utc_offset(@NotNull ICalendarParser.K_utc_offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tsafe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsafe_char(@NotNull ICalendarParser.Tsafe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rstatparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRstatparam(@NotNull ICalendarParser.RstatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#cal_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal_address(@NotNull ICalendarParser.Cal_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#geovalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeovalue(@NotNull ICalendarParser.GeovalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_in_progress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_in_progress(@NotNull ICalendarParser.K_in_progressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull ICalendarParser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzname(@NotNull ICalendarParser.TznameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_transparent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_transparent(@NotNull ICalendarParser.K_transparentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_recurrence_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_recurrence_id(@NotNull ICalendarParser.K_recurrence_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_confidential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_confidential(@NotNull ICalendarParser.K_confidentialContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dtendparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtendparam(@NotNull ICalendarParser.DtendparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_parent(@NotNull ICalendarParser.K_parentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#eventc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventc(@NotNull ICalendarParser.EventcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_cancelled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cancelled(@NotNull ICalendarParser.K_cancelledContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_bymonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bymonth(@NotNull ICalendarParser.K_bymonthContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#languageparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageparam(@NotNull ICalendarParser.LanguageparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_prodid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_prodid(@NotNull ICalendarParser.K_prodidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull ICalendarParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#actionvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionvalue(@NotNull ICalendarParser.ActionvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#standardc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardc(@NotNull ICalendarParser.StandardcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dir(@NotNull ICalendarParser.K_dirContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull ICalendarParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_rsvp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rsvp(@NotNull ICalendarParser.K_rsvpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_dtstamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtstamp(@NotNull ICalendarParser.K_dtstampContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#trigabs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigabs(@NotNull ICalendarParser.TrigabsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#language_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_char(@NotNull ICalendarParser.Language_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_sent_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sent_by(@NotNull ICalendarParser.K_sent_byContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rsvpparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsvpparam(@NotNull ICalendarParser.RsvpparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bymolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymolist(@NotNull ICalendarParser.BymolistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzidparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzidparam(@NotNull ICalendarParser.TzidparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#utc_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtc_offset(@NotNull ICalendarParser.Utc_offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_base(@NotNull ICalendarParser.K_baseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#time_numzone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_numzone(@NotNull ICalendarParser.Time_numzoneContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tentative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tentative(@NotNull ICalendarParser.K_tentativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sequence(@NotNull ICalendarParser.K_sequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_action(@NotNull ICalendarParser.K_actionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#subtype_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_name(@NotNull ICalendarParser.Subtype_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rdtval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdtval(@NotNull ICalendarParser.RdtvalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzprop(@NotNull ICalendarParser.TzpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#exdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExdate(@NotNull ICalendarParser.ExdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_value(@NotNull ICalendarParser.Dur_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#param_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_value(@NotNull ICalendarParser.Param_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull ICalendarParser.ResourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tu(@NotNull ICalendarParser.K_tuContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent(@NotNull ICalendarParser.PercentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_fullyear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_fullyear(@NotNull ICalendarParser.Date_fullyearContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_valarm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_valarm(@NotNull ICalendarParser.K_valarmContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_true(@NotNull ICalendarParser.K_trueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#descparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescparam(@NotNull ICalendarParser.DescparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#reltypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReltypeparam(@NotNull ICalendarParser.ReltypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_date_time(@NotNull ICalendarParser.K_date_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_email(@NotNull ICalendarParser.K_emailContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_binary(@NotNull ICalendarParser.K_binaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(@NotNull ICalendarParser.Quoted_stringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(@NotNull ICalendarParser.ComponentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(@NotNull ICalendarParser.DescriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority(@NotNull ICalendarParser.PriorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#digits_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_2(@NotNull ICalendarParser.Digits_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#freebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreebusy(@NotNull ICalendarParser.FreebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#partstat_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_event(@NotNull ICalendarParser.Partstat_eventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_participant(@NotNull ICalendarParser.K_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#summparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummparam(@NotNull ICalendarParser.SummparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_th}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_th(@NotNull ICalendarParser.K_thContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#encodingparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodingparam(@NotNull ICalendarParser.EncodingparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_opaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_opaque(@NotNull ICalendarParser.K_opaqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull ICalendarParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_process(@NotNull ICalendarParser.K_processContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#geo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeo(@NotNull ICalendarParser.GeoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#exdtparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExdtparam(@NotNull ICalendarParser.ExdtparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_class(@NotNull ICalendarParser.K_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_resources(@NotNull ICalendarParser.K_resourcesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_transp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_transp(@NotNull ICalendarParser.K_transpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#reg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_name(@NotNull ICalendarParser.Reg_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_period(@NotNull ICalendarParser.K_periodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod(@NotNull ICalendarParser.PeriodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(@NotNull ICalendarParser.UriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull ICalendarParser.UrlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tzoffsetfrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzoffsetfrom(@NotNull ICalendarParser.K_tzoffsetfromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_fmttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fmttype(@NotNull ICalendarParser.K_fmttypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#byseclist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByseclist(@NotNull ICalendarParser.ByseclistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_individual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_individual(@NotNull ICalendarParser.K_individualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#due}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDue(@NotNull ICalendarParser.DueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dirparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirparam(@NotNull ICalendarParser.DirparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bywknolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBywknolist(@NotNull ICalendarParser.BywknolistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_date(@NotNull ICalendarParser.K_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#alpha_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_num(@NotNull ICalendarParser.Alpha_numContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#clazz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClazz(@NotNull ICalendarParser.ClazzContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_non_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_non_participant(@NotNull ICalendarParser.K_non_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#locparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocparam(@NotNull ICalendarParser.LocparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_integer(@NotNull ICalendarParser.K_integerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_dtstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtstart(@NotNull ICalendarParser.K_dtstartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#trigrel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigrel(@NotNull ICalendarParser.TrigrelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_delegated_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated_from(@NotNull ICalendarParser.K_delegated_fromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_daylight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_daylight(@NotNull ICalendarParser.K_daylightContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#fbvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbvalue(@NotNull ICalendarParser.FbvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#partstat_todo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_todo(@NotNull ICalendarParser.Partstat_todoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_encoding(@NotNull ICalendarParser.K_encodingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_req_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_req_participant(@NotNull ICalendarParser.K_req_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#icalstream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalstream(@NotNull ICalendarParser.IcalstreamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#statcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatcode(@NotNull ICalendarParser.StatcodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_organizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_organizer(@NotNull ICalendarParser.K_organizerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_cn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cn(@NotNull ICalendarParser.K_cnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(@NotNull ICalendarParser.RepeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tznparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTznparam(@NotNull ICalendarParser.TznparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#todoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoc(@NotNull ICalendarParser.TodocContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vcalendar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vcalendar(@NotNull ICalendarParser.K_vcalendarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_byday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byday(@NotNull ICalendarParser.K_bydayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_hour(@NotNull ICalendarParser.Dur_hourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_false(@NotNull ICalendarParser.K_falseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(@NotNull ICalendarParser.AlphaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull ICalendarParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_repeat(@NotNull ICalendarParser.K_repeatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#transvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransvalue(@NotNull ICalendarParser.TransvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_range(@NotNull ICalendarParser.K_rangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_byminute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byminute(@NotNull ICalendarParser.K_byminuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#partstat_jour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstat_jour(@NotNull ICalendarParser.Partstat_jourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_begin(@NotNull ICalendarParser.K_beginContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_until(@NotNull ICalendarParser.K_untilContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#timezonec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezonec(@NotNull ICalendarParser.TimezonecContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_su}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_su(@NotNull ICalendarParser.K_suContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_busy_unavailable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy_unavailable(@NotNull ICalendarParser.K_busy_unavailableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#fbprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbprop(@NotNull ICalendarParser.FbpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_last_modified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_last_modified(@NotNull ICalendarParser.K_last_modifiedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_duration(@NotNull ICalendarParser.K_durationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#catparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatparam(@NotNull ICalendarParser.CatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_role(@NotNull ICalendarParser.K_roleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_resource(@NotNull ICalendarParser.K_resourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_description(@NotNull ICalendarParser.K_descriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_standard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_standard(@NotNull ICalendarParser.K_standardContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#fbtypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbtypeparam(@NotNull ICalendarParser.FbtypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_sa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sa(@NotNull ICalendarParser.K_saContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_needs_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_needs_action(@NotNull ICalendarParser.K_needs_actionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_secondly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_secondly(@NotNull ICalendarParser.K_secondlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_geo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_geo(@NotNull ICalendarParser.K_geoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(@NotNull ICalendarParser.SeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#other_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_param(@NotNull ICalendarParser.Other_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_time(@NotNull ICalendarParser.K_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#categories}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategories(@NotNull ICalendarParser.CategoriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_declined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_declined(@NotNull ICalendarParser.K_declinedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_recur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_recur(@NotNull ICalendarParser.K_recurContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#iana_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_comp(@NotNull ICalendarParser.Iana_compContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#digits_1_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_1_2(@NotNull ICalendarParser.Digits_1_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#recur_rule_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecur_rule_part(@NotNull ICalendarParser.Recur_rule_partContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_minute(@NotNull ICalendarParser.Dur_minuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#b_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_end(@NotNull ICalendarParser.B_endContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_delegated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated(@NotNull ICalendarParser.K_delegatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_mday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_mday(@NotNull ICalendarParser.Date_mdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#byminlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByminlist(@NotNull ICalendarParser.ByminlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#fmttypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmttypeparam(@NotNull ICalendarParser.FmttypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#icalobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalobject(@NotNull ICalendarParser.IcalobjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#classvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvalue(@NotNull ICalendarParser.ClassvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#iana_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_param(@NotNull ICalendarParser.Iana_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tzurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzurl(@NotNull ICalendarParser.K_tzurlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#float_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_num(@NotNull ICalendarParser.Float_numContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_time(@NotNull ICalendarParser.Dur_timeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tzid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzid(@NotNull ICalendarParser.K_tzidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_private}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_private(@NotNull ICalendarParser.K_privateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#contparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContparam(@NotNull ICalendarParser.ContparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_delegated_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_delegated_to(@NotNull ICalendarParser.K_delegated_toContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_chair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_chair(@NotNull ICalendarParser.K_chairContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_end(@NotNull ICalendarParser.K_endContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_value(@NotNull ICalendarParser.Date_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#trigrelparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigrelparam(@NotNull ICalendarParser.TrigrelparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#cutypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCutypeparam(@NotNull ICalendarParser.CutypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_calscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_calscale(@NotNull ICalendarParser.K_calscaleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dueparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDueparam(@NotNull ICalendarParser.DueparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#altrepparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltrepparam(@NotNull ICalendarParser.AltrepparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_fbtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fbtype(@NotNull ICalendarParser.K_fbtypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_second(@NotNull ICalendarParser.Dur_secondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_related_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_related_to(@NotNull ICalendarParser.K_related_toContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_dtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_dtend(@NotNull ICalendarParser.K_dtendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_comment(@NotNull ICalendarParser.K_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#jourprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJourprop(@NotNull ICalendarParser.JourpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#commparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommparam(@NotNull ICalendarParser.CommparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#weekdaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekdaynum(@NotNull ICalendarParser.WeekdaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#journalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJournalc(@NotNull ICalendarParser.JournalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bymodaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBymodaylist(@NotNull ICalendarParser.BymodaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_cutype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cutype(@NotNull ICalendarParser.K_cutypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#attparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttparam(@NotNull ICalendarParser.AttparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#b_chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_chars(@NotNull ICalendarParser.B_charsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(@NotNull ICalendarParser.LanguageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull ICalendarParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#valuetypeparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuetypeparam(@NotNull ICalendarParser.ValuetypeparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_hourly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_hourly(@NotNull ICalendarParser.K_hourlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#vervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVervalue(@NotNull ICalendarParser.VervalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull ICalendarParser.BinaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_rrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rrule(@NotNull ICalendarParser.K_rruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull ICalendarParser.IntervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#ridparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRidparam(@NotNull ICalendarParser.RidparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#fbparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbparam(@NotNull ICalendarParser.FbparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_related}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_related(@NotNull ICalendarParser.K_relatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#partstatparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartstatparam(@NotNull ICalendarParser.PartstatparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(@NotNull ICalendarParser.Param_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_draft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_draft(@NotNull ICalendarParser.K_draftContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact(@NotNull ICalendarParser.ContactContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#calscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalscale(@NotNull ICalendarParser.CalscaleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_summary(@NotNull ICalendarParser.K_summaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_fr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_fr(@NotNull ICalendarParser.K_frContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_busy_tentative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy_tentative(@NotNull ICalendarParser.K_busy_tentativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(@NotNull ICalendarParser.VersionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#valuetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuetype(@NotNull ICalendarParser.ValuetypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#daylightc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaylightc(@NotNull ICalendarParser.DaylightcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rstatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRstatus(@NotNull ICalendarParser.RstatusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_busy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_busy(@NotNull ICalendarParser.K_busyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_reltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_reltype(@NotNull ICalendarParser.K_reltypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_boolean(@NotNull ICalendarParser.K_booleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_yearly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_yearly(@NotNull ICalendarParser.K_yearlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_cal_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_cal_address(@NotNull ICalendarParser.K_cal_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#recur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecur(@NotNull ICalendarParser.RecurContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_percent_complete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_percent_complete(@NotNull ICalendarParser.K_percent_completeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_attach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_attach(@NotNull ICalendarParser.K_attachContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#completed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleted(@NotNull ICalendarParser.CompletedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_request_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_request_status(@NotNull ICalendarParser.K_request_statusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzurl(@NotNull ICalendarParser.TzurlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vjournal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vjournal(@NotNull ICalendarParser.K_vjournalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_daily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_daily(@NotNull ICalendarParser.K_dailyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger(@NotNull ICalendarParser.TriggerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_room(@NotNull ICalendarParser.K_roomContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#statvalue_todo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_todo(@NotNull ICalendarParser.Statvalue_todoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_child(@NotNull ICalendarParser.K_childContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_relat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_relat(@NotNull ICalendarParser.K_relatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_we}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_we(@NotNull ICalendarParser.K_weContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_priority(@NotNull ICalendarParser.K_priorityContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_minutely}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_minutely(@NotNull ICalendarParser.K_minutelyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_bymonthday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bymonthday(@NotNull ICalendarParser.K_bymonthdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#qsafe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQsafe_char(@NotNull ICalendarParser.Qsafe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#recurid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurid(@NotNull ICalendarParser.RecuridContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#alarmprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlarmprop(@NotNull ICalendarParser.AlarmpropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_value(@NotNull ICalendarParser.K_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_sibling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_sibling(@NotNull ICalendarParser.K_siblingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_weekly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_weekly(@NotNull ICalendarParser.K_weeklyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_address(@NotNull ICalendarParser.K_addressContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_completed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_completed(@NotNull ICalendarParser.K_completedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#attach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach(@NotNull ICalendarParser.AttachContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#x_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_param(@NotNull ICalendarParser.X_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vfreebusy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vfreebusy(@NotNull ICalendarParser.K_vfreebusyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ICalendarParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dtstamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstamp(@NotNull ICalendarParser.DtstampContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzid(@NotNull ICalendarParser.TzidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_byhour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byhour(@NotNull ICalendarParser.K_byhourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(@NotNull ICalendarParser.UidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#iana_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_token(@NotNull ICalendarParser.Iana_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_week(@NotNull ICalendarParser.Dur_weekContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#statvalue_jour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_jour(@NotNull ICalendarParser.Statvalue_jourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(@NotNull ICalendarParser.CountContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_audio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_audio(@NotNull ICalendarParser.K_audioContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(@NotNull ICalendarParser.LocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bit(@NotNull ICalendarParser.K_bitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#rrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRrule(@NotNull ICalendarParser.RruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vtodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vtodo(@NotNull ICalendarParser.K_vtodoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#prodid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdid(@NotNull ICalendarParser.ProdidContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#cnparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnparam(@NotNull ICalendarParser.CnparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#monthdaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthdaynum(@NotNull ICalendarParser.MonthdaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_confirmed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_confirmed(@NotNull ICalendarParser.K_confirmedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#date_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_month(@NotNull ICalendarParser.Date_monthContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_text(@NotNull ICalendarParser.K_textContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#freebusyc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreebusyc(@NotNull ICalendarParser.FreebusycContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_byweekno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byweekno(@NotNull ICalendarParser.K_byweeknoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#related}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelated(@NotNull ICalendarParser.RelatedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#reg_name_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_name_char(@NotNull ICalendarParser.Reg_name_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#time_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_hour(@NotNull ICalendarParser.Time_hourContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_day(@NotNull ICalendarParser.Dur_dayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#weeknum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeeknum(@NotNull ICalendarParser.WeeknumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dtstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtstart(@NotNull ICalendarParser.DtstartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_mo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_mo(@NotNull ICalendarParser.K_moContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tzoffsetto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzoffsetto(@NotNull ICalendarParser.K_tzoffsettoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_final(@NotNull ICalendarParser.K_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull ICalendarParser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ICalendarParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzoffsetto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzoffsetto(@NotNull ICalendarParser.TzoffsettoContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(@NotNull ICalendarParser.DigitsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_language(@NotNull ICalendarParser.K_languageContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#yeardaynum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYeardaynum(@NotNull ICalendarParser.YeardaynumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#iana_prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIana_prop(@NotNull ICalendarParser.Iana_propContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtend(@NotNull ICalendarParser.DtendContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(@NotNull ICalendarParser.StatusContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_wkst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_wkst(@NotNull ICalendarParser.K_wkstContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_accepted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_accepted(@NotNull ICalendarParser.K_acceptedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_tzname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_tzname(@NotNull ICalendarParser.K_tznameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_gregorian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_gregorian(@NotNull ICalendarParser.K_gregorianContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#sentbyparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentbyparam(@NotNull ICalendarParser.SentbyparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_display(@NotNull ICalendarParser.K_displayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_opt_participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_opt_participant(@NotNull ICalendarParser.K_opt_participantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_bysetpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_bysetpos(@NotNull ICalendarParser.K_bysetposContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#icalparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcalparameter(@NotNull ICalendarParser.IcalparameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_rdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_rdate(@NotNull ICalendarParser.K_rdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_categories}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_categories(@NotNull ICalendarParser.K_categoriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#byyrdaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByyrdaylist(@NotNull ICalendarParser.ByyrdaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#x_prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_prop(@NotNull ICalendarParser.X_propContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#ordyrday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdyrday(@NotNull ICalendarParser.OrdyrdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#transp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransp(@NotNull ICalendarParser.TranspContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_trigger(@NotNull ICalendarParser.K_triggerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#orgparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrgparam(@NotNull ICalendarParser.OrgparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_attendee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_attendee(@NotNull ICalendarParser.K_attendeeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#todoprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoprop(@NotNull ICalendarParser.TodopropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_float(@NotNull ICalendarParser.K_floatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_count(@NotNull ICalendarParser.K_countContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_byyearday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_byyearday(@NotNull ICalendarParser.K_byyeardayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_url(@NotNull ICalendarParser.K_urlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#weekday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeekday(@NotNull ICalendarParser.WeekdayContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#statvalue_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatvalue_event(@NotNull ICalendarParser.Statvalue_eventContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#time_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_second(@NotNull ICalendarParser.Time_secondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_uri(@NotNull ICalendarParser.K_uriContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#contentline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentline(@NotNull ICalendarParser.ContentlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#last_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_mod(@NotNull ICalendarParser.Last_modContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#relparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelparam(@NotNull ICalendarParser.RelparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#timezoneprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezoneprop(@NotNull ICalendarParser.TimezonepropContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#byhrlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByhrlist(@NotNull ICalendarParser.ByhrlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#x_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_comp(@NotNull ICalendarParser.X_compContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#deltoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeltoparam(@NotNull ICalendarParser.DeltoparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#safe_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafe_char(@NotNull ICalendarParser.Safe_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#roleparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleparam(@NotNull ICalendarParser.RoleparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_unknown(@NotNull ICalendarParser.K_unknownContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#tzoffsetfrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzoffsetfrom(@NotNull ICalendarParser.TzoffsetfromContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#memberparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberparam(@NotNull ICalendarParser.MemberparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bywdaylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBywdaylist(@NotNull ICalendarParser.BywdaylistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_group(@NotNull ICalendarParser.K_groupContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#dur_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDur_date(@NotNull ICalendarParser.Dur_dateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#attachparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachparam(@NotNull ICalendarParser.AttachparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#b_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_char(@NotNull ICalendarParser.B_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_created}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_created(@NotNull ICalendarParser.K_createdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_vtimezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_vtimezone(@NotNull ICalendarParser.K_vtimezoneContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_exdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_exdate(@NotNull ICalendarParser.K_exdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(@NotNull ICalendarParser.DurationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#x_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_name(@NotNull ICalendarParser.X_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#period_explicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_explicit(@NotNull ICalendarParser.Period_explicitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_partstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_partstat(@NotNull ICalendarParser.K_partstatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bysplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBysplist(@NotNull ICalendarParser.BysplistContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#k_thisandfuture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK_thisandfuture(@NotNull ICalendarParser.K_thisandfutureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ICalendarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull ICalendarParser.BoolContext ctx);
}