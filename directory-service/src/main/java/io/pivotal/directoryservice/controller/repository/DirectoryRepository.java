package io.pivotal.directoryservice.controller.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.directoryservice.controller.domain.Directory;

public interface DirectoryRepository extends CrudRepository<Directory, Long> {

}