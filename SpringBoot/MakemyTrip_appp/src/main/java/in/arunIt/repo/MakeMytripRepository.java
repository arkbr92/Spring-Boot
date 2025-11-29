package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.binding.Ticket;

public interface MakeMytripRepository  extends JpaRepository<Ticket, Integer> {

}
