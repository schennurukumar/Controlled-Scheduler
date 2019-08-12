//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@Autowired
//
//public class SchedulerController {
//
//    private ScheduledTasks scheduledtask;
//
//    @RequestMapping(value = "start", method = RequestMethod.GET)
//    public void start() throws Exception {
//        scheduledtask.start();
//    }
//
//}
//
//
//package com.gap.dc.interfaces.leap.inbound.controller;
//        import com.gap.dc.interfaces.leap.inbound.model.Event;
//        import com.gap.dc.interfaces.leap.inbound.service.EventsService;
//        import lombok.extern.slf4j.Slf4j;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.web.bind.annotation.GetMapping;
//        import org.springframework.web.bind.annotation.RestController;
//
//        import java.util.List;
//
//@RestController
//@Slf4j
//public class SortingController {
//    @Autowired
//    private EventsService eventsService;
//    @GetMapping(value = "/Events")
//    public List<Event> getEvents() {
//
//        List<Event> events = eventsService.findAll();
//
//        return events;
//    }
//}
//
//
//
//
//
//
//
