package com.madhu.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madhu.eventmanagement.controller.exception.AlreadyCheckedInException;
import com.madhu.eventmanagement.entities.Participant;
import com.madhu.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class ParticipantCheckInController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler) {
		Participant participant = participantRepository.findOne(id);
		
		if (participant != null) {
			if (participant.isCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
			participant.setCheckedIn(true);
			participantRepository.save(participant);
		}
		return ResponseEntity.ok(assembler.toResource(participant));
	}

}
