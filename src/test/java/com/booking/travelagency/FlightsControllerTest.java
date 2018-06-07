package com.booking.travelagency;

import com.booking.travelagency.bean.SearchFlights;
import com.booking.travelagency.controller.FlightsController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by MACHUNAGENDRADURGP on 04/06/2018.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class FlightsControllerTest {

    SearchFlights sf = null;
    SearchFlights sf1 = null;

    @Before
    public void setup(){
        sf = new SearchFlights();
        sf.setFrom("Bangalore");
        sf.setTo("Cochin");
        sf.setDepart("21.04.2018");
        sf.setPassengerclass("Economy");

    }
    @Test
    public void testlistFlights() throws Exception{
        FlightsController fc = new FlightsController();
        Assert.assertNotNull(fc.listFlights(sf));

    }

//    @Test
//    public void testlistFlightsEmpty() throws Exception{
//        FlightsController fc = new FlightsController();
//        Assert.assertNull(fc.listFlights(sf1));
//    }

    @Test
    public void testlistFlightsSize() throws Exception{
        FlightsController fc = new FlightsController();
        Assert.assertThat(2,is(fc.listFlights(sf).size()));
    }
}
