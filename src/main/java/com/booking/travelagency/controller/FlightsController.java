package com.booking.travelagency.controller;

import com.booking.travelagency.bean.ListFlights;
import com.booking.travelagency.bean.SearchFlights;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MACHUNAGENDRADURGP on 01/06/2018.
 */

@Controller
public class FlightsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public ModelAndView flights() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("searchflight", new SearchFlights());
        mav.setViewName("flights");
        return mav;
    }

    @RequestMapping(value = "/searchflight", method = RequestMethod.POST)
    public ModelAndView searchflights(@Valid SearchFlights searchflight,BindingResult result) {
        logger.info("From {} To {}" , searchflight.getFrom(), searchflight.getTo());
        ModelAndView mav = new ModelAndView();
        mav.addObject("searchflight", new SearchFlights());
        mav.addObject("listflights", listFlights(searchflight));
        mav.setViewName("flights");
        return mav;
    }

    public List<ListFlights> listFlights(SearchFlights searchflight){

        List<ListFlights> list = new ArrayList<ListFlights>();

        ListFlights l1 = new ListFlights();
        l1.setFrom(searchflight.getFrom());
        l1.setTo(searchflight.getTo());
        l1.setCost("$ 89");
        l1.setRoute(searchflight.getFrom() +" International - "+searchflight.getTo() +" International");
        l1.setTravelCode("001");
        l1.setTime("1 Hr 2 Min");
        l1.setProvider("Spice Jet");
        list.add(l1);

        ListFlights l2 = new ListFlights();
        l2.setFrom(searchflight.getFrom());
        l2.setTo(searchflight.getTo());
        l2.setCost("$ 45");
        l2.setRoute(searchflight.getFrom() +" International - "+searchflight.getTo() +" International");
        l2.setTravelCode("002");
        l2.setTime(" 85 Min");
        l2.setProvider("Air Asia");
        list.add(l2);

        return  list;

    }
}
