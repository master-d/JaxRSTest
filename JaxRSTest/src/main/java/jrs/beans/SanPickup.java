package jrs.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SanPickup{
	private String route;
	private String routeType;
	private String schedule;
	private String scheduleType;
	private Date pickupDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
	private static final Map<String, String> pickupFrequencies;
	static{
		pickupFrequencies = new HashMap<String, String>();
		pickupFrequencies.put("1W", "once a week");
		pickupFrequencies.put("2W", "once every 2 weeks");
		pickupFrequencies.put("3W", "once every 3 weeks");
		pickupFrequencies.put("20D", "once every 20 days");
		pickupFrequencies.put("TM", "twice monthly");
	}
	public SanPickup(){
	}
	public String getRoute(){
		return route;
	}
	public void setRoute(String route){
		this.route = route;
	}
	public String getRouteType(){
		return routeType;
	}
	public void setRouteType(String routeType){
		this.routeType = routeType;
	}
	public String getSchedule(){
		return schedule;
	}
	public void setSchedule(String schedule){
		this.schedule = schedule;
	}
	public String getScheduleType(){
		return scheduleType;
	}
	public void setScheduleType(String scheduleType){
		this.scheduleType = scheduleType;
	}
	public Date getPickupDate(){
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate){
		this.pickupDate = pickupDate;
	}
	public String getPickupFrequency(){
		return pickupFrequencies.get(scheduleType);
	}
	public String getPickupDateString(){
		return pickupDate == null ? "unknown" : sdf.format(pickupDate);
	}
}