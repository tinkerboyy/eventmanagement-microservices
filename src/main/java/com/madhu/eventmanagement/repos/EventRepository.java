package com.madhu.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.madhu.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
