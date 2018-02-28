package com.first.ourtry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("libraryrepository")
public interface Libraryrepository extends JpaRepository <Library,Long>{

}
