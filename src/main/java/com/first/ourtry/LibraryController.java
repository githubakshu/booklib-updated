package com.first.ourtry;
import java.util.List;
import java.awt.peer.ListPeer;
import javax.persistence.criteria.ListJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Listener;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/events") 
public class LibraryController{
     @Autowired
    private LibraryService libraryService;
@GetMapping("/get")
 public @ResponseBody ResponseEntity<List<Library>> all() {
        return new ResponseEntity<>(libraryService.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Library library, UriComponentsBuilder ucBuilder) {
        libraryService.save(library);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{libid}").buildAndExpand(library.getlibid()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
         @GetMapping("/get/{libid}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable int libId) {

        Library library = libraryService.find(libId);
        return new ResponseEntity<>(library, HttpStatus.OK);
    }
     @PutMapping("/put/{libid}")
    public ResponseEntity<?> put(@PathVariable Long libId, @RequestBody Library library) {
libraryService.save(library);
        return new ResponseEntity<>(library, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{libid}")
    public ResponseEntity<?> delete(@PathVariable int libId) {
        //Event currentevent = eventService.find(eventId);
        libraryService.delete(libId);
        return new ResponseEntity<>(HttpStatus.OK);
    
    }
  
}















