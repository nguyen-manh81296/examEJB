package t2008m.examejb.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/candidate")
public class CandidateApi {
    @Autowired
    CandidateService candidateService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Candidate> findAll() {
     return  candidateService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Candidate save(@RequestBody Candidate obj) {
        return candidateService.save(obj);
    }
}
