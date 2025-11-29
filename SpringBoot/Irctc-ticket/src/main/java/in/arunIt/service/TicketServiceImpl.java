package in.arunIt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.binding.Passenger;
import in.arunIt.binding.Ticket;
import in.arunIt.repo.TicketRepository;
@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository repo;
	
	
	@Override
	public Ticket bookTicket(Passenger passanger) {
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passanger, t);
		t.setTicketStatus("CONFIRMED");
		Ticket saveedTicket = repo.save(t);
		
		
		return saveedTicket;
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
	
		
		return repo.findById(ticketId).orElseThrow();
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return repo.findAll();
	}

}
