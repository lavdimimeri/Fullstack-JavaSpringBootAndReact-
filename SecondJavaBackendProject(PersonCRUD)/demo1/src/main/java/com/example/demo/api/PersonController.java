package com.example.demo.api;

import com.example.demo.dao.PersonDataAccessService;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class PersonController {
   @Autowired
  private PersonDataAccessService personDataAccessService;
   @Autowired
    PersonService personService;


/*@PostMapping(path="/add")
    public @ResponseBody String addPerson(@RequestParam String name, @RequestParam Integer id){

    Person p = new Person();
    p.setId(id);
    p.setName(name);

    personDataAccessService.save(p);

    return "saved";


}

 */

    @PostMapping(path="/add")
    public void addPerson(@RequestBody Person person){
    personService.saveOrUpdate(person);
    }



    @GetMapping(path="/all")
    public @ResponseBody Iterable<Person> getAllUsers() {
        // This returns a JSON or XML with the users
        return personService.getAllPeople();
    }

}
