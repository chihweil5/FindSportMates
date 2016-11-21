package com.findsportmates.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.findsportmates.model.Event;
import com.findsportmates.service.EventService;

@Controller
public class EventController {
	private EventService eventService;

	/*
	 * @InitBinder protected void initBinder(WebDataBinder binder) {
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	 * binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,
	 * false)); }
	 */

	@Autowired(required = true)
	@Qualifier(value = "eventService")
	public void setEventService(EventService es) {
		this.eventService = es;
	}

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String listevents(ModelMap model) {
		model.addAttribute("events", this.eventService.listEvents());
		return "main-menu";
	}

	@RequestMapping(value = "/add-event", method = RequestMethod.GET)
	public String showEventPage(ModelMap model) {
		model.addAttribute("event", new Event());
		return "event";
	}

	@RequestMapping(value = "/add-event", method = RequestMethod.POST)
	public String addEvent(ModelMap model, Event event) {
		System.out.println(event.getEventType());
		this.eventService.addEvent(event);
		return "redirect:/event";

	}

	@RequestMapping("/remove/{eventId}")
	public String removeEvent(@PathVariable("eventId") int eventId) {
		this.eventService.removeEvent(eventId);
		return "redirect:/event";
	}
	/*
	@RequestMapping(value = "/edit/{eventId}", method = RequestMethod.GET)
	public String showUpdateTodoPage(ModelMap model,@PathVariable("eventId") int eventId){
		model.addAttribute("event", this.eventService.getEventById(eventId));
		return "event"; 
	}
	
	@RequestMapping("/edit/{eventId}")
	public String editEvent(@PathVariable("eventId") int eventId, Model model) {
		Event e = this.eventService.getEventById(eventId);
		this.eventService.updateEvent(e);
		return "redirect:/main-menu";
	}*/

}
