package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class BuddyInfoController {
    @Autowired
    BuddyInfoRepository repository;

    @GetMapping("/buddyinfo")
    public String buddyinfoForm(Model model) {
        model.addAttribute("buddyinfo", new BuddyInfo());
        return "buddyinfo";
    }

    @PostMapping("/buddyinfo")
    public String buddyinfoSubmit(@ModelAttribute BuddyInfo buddyinfo , Model model) {
        System.out.println("Received: " + buddyinfo.toString()); //     input received
        BuddyInfo buddyInfo = new BuddyInfo(buddyinfo.getName(), buddyinfo.getAddress());
        repository.save(buddyInfo);
        model.addAttribute("newbuddyinfo", buddyInfo);
        return "buddyinfoResult";
    }
}