package com.madhu.eventmanagement.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.madhu.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
