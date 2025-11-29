package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.binding.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
