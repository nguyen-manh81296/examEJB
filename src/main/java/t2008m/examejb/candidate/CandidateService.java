package t2008m.examejb.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import t2008m.examejb.repository.CandidateRepository;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    public Candidate save(Candidate obj){
        return candidateRepository.save(obj);
    }

}
