package XMLandSecurity.backend1.controller;

import XMLandSecurity.backend1.domain.City;
import XMLandSecurity.backend1.domain.Lodging;
import XMLandSecurity.backend1.service.LodgingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import XMLandSecurity.backend1.service.CityService;
import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/lodging")
public class LodgingController {

    @Autowired
    private LodgingService lodgingService;
    @Autowired
    private CityService cityService;


    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Lodging> getUser (@PathVariable("id") Long id) {
        Lodging listaAdminaFanZone = lodgingService.findOne(id) ; //findOne(user);
        return new ResponseEntity<>(listaAdminaFanZone, HttpStatus.OK);     // "200 OK"
    }

    // ===


    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Lodging> CreateCity (@RequestBody Lodging country) {
        Lodging userNew = lodgingService.save(country);
        return new ResponseEntity(userNew, HttpStatus.OK);
    }


    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Lodging> updateUsers (@PathVariable("id") Long id) {
        Lodging listaAdminaFanZone = lodgingService.findOne(id);
        return new ResponseEntity(listaAdminaFanZone, HttpStatus.OK);     // "200 OK"
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE
    )
    public ResponseEntity<Lodging> izbrisi(@PathVariable("id") Long id){
        lodgingService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(
            value = "/getLodgings",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Lodging>> getLodgings(){
        List<Lodging> lodgings = lodgingService.findAll();
        return new ResponseEntity(lodgings, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/search/{cityName}/{personsNbr}/{dateStart}/{dateEnd}/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search(@PathVariable("cityName") String cityName,@PathVariable("personsNbr") String personsNbr,
                                    @PathVariable("dateStart") String dateStart,@PathVariable("dateEnd") String dateEnd){
        List<Lodging> lodgings = lodgingService.findAll();
        List<Lodging> retLodgings = new ArrayList<Lodging>();
        retLodgings= null;
        int broj;

        if(dateStart.equals("undefined") || dateStart.equals("")) {
            dateStart ="1995-09-16" ;

        }
        if(dateEnd.equals("undefined") || dateEnd.equals("")) {
            dateEnd ="1995-09-16";
        }

        //konvertovanje datuma iz string u Date format
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateS = null,dateE = null;
        try {
            dateS = format.parse(dateStart);
            dateE = format.parse(dateEnd);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("\n POCETNI DATUM : " + dateS +
                "\n KRAJNJI DATUM" + dateE) ;

        if(cityName.equals("undefined") || cityName.equals("null")) {
            cityName = "";
        }
        if(personsNbr.equals("undefined") || personsNbr.equals("") || personsNbr.equals("null")) {
            retLodgings = lodgingService.findByCityName(cityName,dateS,dateE);
            System.out.println("\n NA PRAVOM : " + retLodgings.size());


        }else {
            broj = Integer.parseInt(personsNbr);
            retLodgings = lodgingService.findByCityAndPersons_number(cityName, broj);
        }

        return new ResponseEntity(retLodgings, HttpStatus.OK);
    }
}
