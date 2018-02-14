package com.madhu.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.madhu.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
