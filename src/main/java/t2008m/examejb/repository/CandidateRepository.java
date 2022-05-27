package t2008m.examejb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t2008m.examejb.candidate.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}
