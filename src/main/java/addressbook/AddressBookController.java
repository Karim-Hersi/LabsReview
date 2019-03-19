package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressBookController {

    //Autowire your CrudRepo of addressbook
    @Autowired
    AddressBookRepository repository;

    /**
     * GET:  requests a representation of the specified resource.
     * POST: submits data to be processed to the identified resource
     * @GetMapping is a composed annotation that acts as a shortcut for
     * @RequestMapping(method = RequestMethod.GET)
     *
     * Annotation for mapping web requests onto methods in request-handling
     * classes with flexible method signatures.
     *
     * The annotation maps requests to '/addressbook' to this method. It
     * accepts a model, adds an address book into the model and then
     * returns the view to be resolved which is 'addressbook'. More
     * specifically, when the html page 'index.html's button that
     * refers to  href="/addressbook" is clicked
     *
     */
    @GetMapping("/addressbook")
    public String addressbookForm(Model model) {
        model.addAttribute("addressbook", new AddressBook());
        return "buddyinfo";
    }

    @PostMapping("/addressbook")
    public String addressbookSubmit(@ModelAttribute AddressBook addressbook, Model model) {
        AddressBook addressBook = new AddressBook();
        repository.save(addressBook);
        model.addAttribute("newaddressbook", addressBook);
        return "addressbook";
    }

}