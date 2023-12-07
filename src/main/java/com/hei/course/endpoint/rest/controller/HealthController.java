package com.hei.course.endpoint.rest.controller;

import static java.util.UUID.randomUUID;

import com.hei.course.PojaGenerated;
import com.hei.course.endpoint.event.EventProducer;
import com.hei.course.endpoint.event.gen.UuidCreated;
import com.hei.course.repository.DummyRepository;
import com.hei.course.repository.DummyUuidRepository;
import com.hei.course.repository.model.Dummy;
import com.hei.course.repository.model.DummyUuid;
import java.util.List;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class HealthController {

  DummyRepository dummyRepository;
  DummyUuidRepository dummyUuidRepository;
  EventProducer eventProducer;

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping("/dummy-table")
  public List<Dummy> dummyTable() {
    return dummyRepository.findAll();
  }

  @GetMapping(value = "/uuid-created")
  public String uuidCreated() throws InterruptedException {
    var randomUuid = randomUUID().toString();
    var event = new UuidCreated().toBuilder().uuid(randomUuid).build();

    eventProducer.accept(List.of(event));

    Thread.sleep(20_000);
    return dummyUuidRepository.findById(randomUuid).map(DummyUuid::getId).orElseThrow();
  }
}
